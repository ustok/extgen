/******************************************************
 * Copyright 2015 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.exgen.internal.acceptance.util;

import org.eclipse.core.internal.events.BuildCommand;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

/**
 * <Enter some description here>
 * 
 * @author ingomohr
 * @created Jan 11, 2015
 */
@SuppressWarnings("restriction")
public class WorkspaceUtil {

	public static IProject createAndOpenPluginProject(String pProjectName) throws CoreException {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(pProjectName);
		project.create(null);
		project.open(null);

		addNaturesJDTAndPDE(project);

		addBuildCommands(project, "org.eclipse.jdt.core.javabuilder", "org.eclipse.pde.ManifestBuilder",
				"org.eclipse.pde.SchemaBuilder");

		return project;
	}

	public static void deleteProject(String pProjectName) throws CoreException {
		ResourcesPlugin.getWorkspace().getRoot().getProject("sample").delete(false, null);
	}

	private static void addNaturesJDTAndPDE(IProject project) throws CoreException {
		IProjectDescription description = project.getDescription();
		description.setNatureIds(new String[]{"org.eclipse.pde.PluginNature", "org.eclipse.jdt.core.javanature"});
		project.setDescription(description, null);
	}

	private static void addBuildCommands(IProject pProject, String... pBuilderNames) throws CoreException {
		IProjectDescription description = pProject.getDescription();

		ICommand[] commands = description.getBuildSpec();
		ICommand[] newCommands = new ICommand[commands.length + pBuilderNames.length];
		System.arraycopy(commands, 0, newCommands, 0, commands.length);

		int i = 0;
		for (String pBuilderName : pBuilderNames) {
			ICommand newCommand = new BuildCommand();
			newCommand.setBuilderName(pBuilderName);
			newCommands[commands.length + (i++)] = newCommand;
		}

		description.setBuildSpec(commands);
		pProject.setDescription(description, null);
	}

}
