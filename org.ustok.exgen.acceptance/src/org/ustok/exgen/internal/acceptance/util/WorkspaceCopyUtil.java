/******************************************************
 * Copyright 2015 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.exgen.internal.acceptance.util;

import java.net.URL;

import org.eclipse.core.internal.events.BuildCommand;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
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
	 *        the project root path. Cannot be <code>null</code>.
	 * @throws CoreException
	 *         if writing goes wrong.
	 */
	public void copyProjectToWorkspace(Bundle pSourceBundle, String pProjectRootPath) throws CoreException {
		Assert.isNotNull(pSourceBundle, "Source bundle cannot be null.");
		Assert.isNotNull(pProjectRootPath, "Project root path cannot be null.");

		String projectName = new Path(pProjectRootPath).lastSegment().toString();

		IProject project = createAndOpenProject(projectName);
		
		URL entry = pSourceBundle.getEntry(pProjectRootPath);
		

	}

	private IProject createAndOpenProject(String pProjectName) throws CoreException {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(pProjectName);
		project.create(null);
		project.open(null);

		addNaturesJDTAndPDE(project);

		addBuildCommands(project, "org.eclipse.jdt.core.javabuilder", "org.eclipse.pde.ManifestBuilder",
				"org.eclipse.pde.SchemaBuilder");

		return project;
	}

	private void addNaturesJDTAndPDE(IProject project) throws CoreException {
		IProjectDescription description = project.getDescription();
		description.setNatureIds(new String[]{"org.eclipse.pde.PluginNature", "org.eclipse.jdt.core.javanature"});
		project.setDescription(description, null);
	}

	private void addBuildCommands(IProject pProject, String... pBuilderNames) throws CoreException {
		IProjectDescription description = pProject.getDescription();

		ICommand[] commands = description.getBuildSpec();
		ICommand[] newCommands = new ICommand[commands.length + pBuilderNames.length];
		System.arraycopy(commands, 0, newCommands, 0, commands.length);

		int i = 0;
		for (String pBuilderName : pBuilderNames) {
			@SuppressWarnings("restriction")
			ICommand newCommand = new BuildCommand();
			newCommand.setBuilderName(pBuilderName);
			newCommands[commands.length + (i++)] = newCommand;
		}

		description.setBuildSpec(commands);
		pProject.setDescription(description, null);
	}

}
