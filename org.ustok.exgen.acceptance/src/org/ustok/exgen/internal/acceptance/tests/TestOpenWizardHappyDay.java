/******************************************************
 * Copyright 2015 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.exgen.internal.acceptance.tests;

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

	private SWTWorkbenchBot bot;

	@BeforeClass
	public static void prepareClass() throws Exception {
		WorkspaceUtil.createAndOpenPluginProject(PROJECT_NAME);
		Bundle bundle = Platform.getBundle("org.ustok.exgen.acceptance");
		WorkspaceCopyUtil.copyProjectToWorkspace(bundle, "/res/" + PROJECT_NAME, PROJECT_NAME);
	}

	@Before
	public void prepare() throws Exception {
		bot = new SWTWorkbenchBot();
		WorkbenchUtil.closeViewPartIfFound_Welcome(bot);
	}

	@Test
	public void testHappyDay() {
		NewExtensionResolverDialogFirstPageBot firstPage = NewExtensionResolverDialogFirstPageBot.openDialog(bot);
		firstPage.selectProject(PROJECT_NAME);

		NewExtensionResolverDialogSecondPageBot nextPage = firstPage.nextPage();
		nextPage.checkAll();
		nextPage.setSourceFolder("src/generated");
		nextPage.finish();

		// TODO finish to check generated code
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
