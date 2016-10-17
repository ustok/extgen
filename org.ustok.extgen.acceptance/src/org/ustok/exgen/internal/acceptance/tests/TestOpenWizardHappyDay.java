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
	private static final String EXPORTER_JAVA = "Exporter.java";
	private static final String EXPORTERS_EXTENSION_JAVA = "ExportersExtension.java";
	private static final String EXPORTERS_EXTENSION_RESOLVER_JAVA = "ExportersExtensionResolver.java";
	private static final String EXPORTERS_PROVIDER_JAVA = "ExportersProvider.java";
	private static final String EXTERNAL_TARGET_JAVA = "ExternalTarget.java";
	private static final String WORKSPACE_TARGET_JAVA = "WorkspaceTarget.java";

	private static Bundle bundle = Platform.getBundle("org.ustok.extgen.acceptance");

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
		final String expPrefix = "/res/expectedGeneratorResult/org/something/personmanager/core/extension/exporters/";
		String fileExp1 = expPrefix + EXPORTER_JAVA;
		String fileExp2 = expPrefix + EXPORTERS_EXTENSION_JAVA;
		String fileExp3 = expPrefix + EXPORTERS_EXTENSION_RESOLVER_JAVA;
		String fileExp4 = expPrefix + EXTERNAL_TARGET_JAVA;
		String fileExp5 = expPrefix + WORKSPACE_TARGET_JAVA;
		String fileExp6 = expPrefix + EXPORTERS_PROVIDER_JAVA;

		final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(PROJECT_NAME);
		final String actPrefix = "/src/generated/org/something/personmanager/core/extension/exporters/";
		IFile fileActual1 = project.getFile(new Path(actPrefix + EXPORTER_JAVA));
		IFile fileActual2 = project.getFile(new Path(actPrefix + EXPORTERS_EXTENSION_JAVA));
		IFile fileActual3 = project.getFile(new Path(actPrefix + EXPORTERS_EXTENSION_RESOLVER_JAVA));
		IFile fileActual4 = project.getFile(new Path(actPrefix + EXTERNAL_TARGET_JAVA));
		IFile fileActual5 = project.getFile(new Path(actPrefix + WORKSPACE_TARGET_JAVA));
		IFile fileActual6 = project.getFile(new Path(actPrefix + EXPORTERS_PROVIDER_JAVA));

		WorkspaceComparingAssertor.assertEquals(bundle, fileExp1, fileActual1);
		WorkspaceComparingAssertor.assertEquals(bundle, fileExp2, fileActual2);
		WorkspaceComparingAssertor.assertEquals(bundle, fileExp3, fileActual3);
		WorkspaceComparingAssertor.assertEquals(bundle, fileExp4, fileActual4);
		WorkspaceComparingAssertor.assertEquals(bundle, fileExp5, fileActual5);
		WorkspaceComparingAssertor.assertEquals(bundle, fileExp6, fileActual6);
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
