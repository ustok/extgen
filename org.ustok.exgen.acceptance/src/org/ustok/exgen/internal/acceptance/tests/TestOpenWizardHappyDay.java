/******************************************************
 * Copyright 2015 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.exgen.internal.acceptance.tests;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.osgi.framework.Bundle;
import org.ustok.exgen.internal.acceptance.bots.NewExtensionResolverDialogFirstPageBot;
import org.ustok.exgen.internal.acceptance.bots.NewExtensionResolverDialogSecondPageBot;
import org.ustok.exgen.internal.acceptance.util.WorkbenchUtil;
import org.ustok.exgen.internal.acceptance.util.WorkspaceComparingAssertor;
import org.ustok.exgen.internal.acceptance.util.WorkspaceCopyUtil;
import org.ustok.exgen.internal.acceptance.util.WorkspaceUtil;

/**
 * Tests the happy day scenario.
 * 
 * @author ingomohr
 * @created Jan 11, 2015
 */
public class TestOpenWizardHappyDay {

	private static final String PROJECT_NAME = "org.something.personmanager.core";

	private static Bundle bundle = Platform.getBundle("org.ustok.exgen.acceptance");

	private SWTWorkbenchBot bot;

	@BeforeClass
	public static void prepareClass() throws Exception {
		WorkspaceUtil.createAndOpenPluginProject(PROJECT_NAME);
		WorkspaceCopyUtil.copyProjectToWorkspace(bundle, "/res/" + PROJECT_NAME, PROJECT_NAME);
	}

	@Before
	public void prepare() throws Exception {
		bot = new SWTWorkbenchBot();
		WorkbenchUtil.closeViewPartIfFound_Welcome(bot);
	}

	@Test
	public void testHappyDay() throws Exception {
		NewExtensionResolverDialogFirstPageBot firstPage = NewExtensionResolverDialogFirstPageBot.openDialog(bot);
		firstPage.selectProject(PROJECT_NAME);

		NewExtensionResolverDialogSecondPageBot nextPage = firstPage.nextPage();
		nextPage.checkAll();
		nextPage.setSourceFolder("src/generated");
		nextPage.finish();

		verifyGeneratedFiles();
	}

	private void verifyGeneratedFiles() throws Exception {
		String fileExp1 = "/res/expectedGeneratorResult/org/something/personmanager/core/Exporter.java";
		String fileExp2 = "/res/expectedGeneratorResult/org/something/personmanager/core/ExportersExtension.java";
		String fileExp3 = "/res/expectedGeneratorResult/org/something/personmanager/core/ExportersExtensionResolver.java";
		String fileExp4 = "/res/expectedGeneratorResult/org/something/personmanager/core/ExternalTarget.java";
		String fileExp5 = "/res/expectedGeneratorResult/org/something/personmanager/core/WorkspaceTarget.java";

		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(PROJECT_NAME);
		IFile fileActual1 = project.getFile(new Path("/src/generated/org/something/personmanager/core/Exporter.java"));
		IFile fileActual2 = project.getFile(new Path("/src/generated/org/something/personmanager/core/ExportersExtension.java"));
		IFile fileActual3 = project.getFile(new Path(
				"/src/generated/org/something/personmanager/core/ExportersExtensionResolver.java"));
		IFile fileActual4 = project.getFile(new Path("/src/generated/org/something/personmanager/core/ExternalTarget.java"));
		IFile fileActual5 = project.getFile(new Path("/src/generated/org/something/personmanager/core/WorkspaceTarget.java"));

		WorkspaceComparingAssertor.assertEquals(bundle, fileExp1, fileActual1);
		WorkspaceComparingAssertor.assertEquals(bundle, fileExp2, fileActual2);
		WorkspaceComparingAssertor.assertEquals(bundle, fileExp3, fileActual3);
		WorkspaceComparingAssertor.assertEquals(bundle, fileExp4, fileActual4);
		WorkspaceComparingAssertor.assertEquals(bundle, fileExp5, fileActual5);
	}

	@After
	public void cleanup() {
		bot.resetWorkbench();
	}

	@AfterClass
	public static void cleanupClass() throws Exception {
		WorkspaceUtil.deleteProject(PROJECT_NAME);
	}

}
