/******************************************************
 * Copyright 2015 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.exgen.internal.acceptance.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.osgi.framework.Bundle;

/**
 * Util for copying files to the workspace.
 * 
 * @author ingomohr
 * @created Jan 11, 2015
 */
public class WorkspaceCopyUtil {

	private WorkspaceCopyUtil() {
	}

	/**
	 * Copies the project referenced by a source bundle and path to the workspace.
	 * 
	 * @param pSourceBundle
	 *        the source bundle to read from. Cannot be <code>null</code>.
	 * @param pProjectRootPath
	 *        the project root path. Should start with an "/". Cannot be <code>null</code>.
	 * @param pProjectName
	 *        the project name. Cannot be <code>null</code>.
	 * @throws CoreException
	 *         if writing goes wrong.
	 * @throws Exception
	 */
	public static void copyProjectToWorkspace(Bundle pSourceBundle, String pProjectRootPath, String pProjectName)
			throws Exception {
		Assert.isNotNull(pSourceBundle, "Source bundle cannot be null.");
		Assert.isNotNull(pProjectRootPath, "Project root path cannot be null.");
		Assert.isNotNull(pProjectName, "Project cannot be null.");

		File file = new File(FileLocator.toFileURL(pSourceBundle.getEntry(pProjectRootPath)).toURI());

		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(pProjectName);

		for (File child : file.listFiles()) {
			copyFileToContainer(child, project);
		}
	}

	private static void copyFileToContainer(File pChild, IContainer pContainer) throws Exception {
		if (pChild.isDirectory()) {
			internalCopyFolderToContainer(pChild, pContainer);
		} else {
			internalCopyFileToContainer(pChild, pContainer);
		}
	}

	private static void internalCopyFileToContainer(File pChild, IContainer pContainer) throws FileNotFoundException,
			CoreException {
		InputStream in = new FileInputStream(pChild);
		IFile newFile = pContainer.getFile(new Path(pChild.getName()));
		newFile.create(in, true, null);
	}

	private static void internalCopyFolderToContainer(File pChild, IContainer pContainer) throws CoreException, Exception {
		IFolder folder = pContainer.getFolder(new Path(pChild.getName()));
		folder.create(true, true, null);

		for (File child : pChild.listFiles()) {
			copyFileToContainer(child, folder);
		}
	}

}
