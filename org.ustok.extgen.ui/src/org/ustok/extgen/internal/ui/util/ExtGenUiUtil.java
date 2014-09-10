/*******************************************************************************
 * Copyright (c) 2011, 2012 www.ustok.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.ustok.extgen.internal.ui.util;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.viewers.IStructuredSelection;

/**
 * Internal UI utility class.
 * 
 * @author Ingo Mohr
 * @created Nov 10, 2011
 */
public final class ExtGenUiUtil {

	/**
	 * Constructor of ExtGenUiUtil.
	 */
	private ExtGenUiUtil() {
	}

	/**
	 * Returns the name of the Java project from the given selection.
	 * 
	 * @param pSelection
	 *            selection to take the project information from.
	 * @return name of the Java project in the given selection.
	 *         <code>null</code> if the first element in the given selection is
	 *         no Java project or name cannot be found.
	 */
	public static String fetchSelectedJavaProjectName(
			IStructuredSelection pSelection) {
		if (pSelection != null && !pSelection.isEmpty()) {
			Object rawElmt = pSelection.getFirstElement();
			if (rawElmt instanceof IJavaProject) {
				IJavaProject project = (IJavaProject) rawElmt;
				IProject actualProject = project.getProject();
				if (actualProject != null) {
					String projectName = actualProject.getName();
					return projectName;
				}
			}
		}
		return null;
	}

	/**
	 * Returns all projects from the current workspace that are Java PDE
	 * projects.
	 * 
	 * @return all Java PDE projects from current workspace. Never
	 *         <code>null</code> but possibly empty.
	 */
	public static String[] findAllPDEProjects() {
		List<String> filteredProjects = new LinkedList<String>();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject[] projects = root.getProjects();
		for (IProject project : projects) {
			String projectName = project.getName();
			if (projectName != null) {
				try {
					boolean isPDEProject = project
							.hasNature("org.eclipse.pde.PluginNature");
					boolean isJavaProject = project
							.hasNature("org.eclipse.jdt.core.javanature");
					if (isPDEProject && isJavaProject) {
						filteredProjects.add(projectName);
					}
				} catch (CoreException ex) {
					// ignore
				}
			}
		}
		return filteredProjects.toArray(new String[filteredProjects.size()]);
	}

}
