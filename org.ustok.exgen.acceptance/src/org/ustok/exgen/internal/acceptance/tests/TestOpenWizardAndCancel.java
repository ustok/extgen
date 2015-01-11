/******************************************************
 * Copyright 2015 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.exgen.internal.acceptance.tests;

import static org.junit.Assert.assertEquals;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.ustok.exgen.internal.acceptance.bots.NewExtensionResolverDialogFirstPageBot;
import org.ustok.exgen.internal.acceptance.bots.NewExtensionResolverDialogSecondPageBot;
import org.ustok.exgen.internal.acceptance.util.WorkspaceUtil;

/**
 * Test to open the extgen wizard and cancel.
 * 
 * @author ingomohr
 * @created Jan 11, 2015
 */
public class TestOpenWizardAndCancel {

	private SWTWorkbenchBot bot;

	@BeforeClass
	public static void prepareClass() throws Exception {
		WorkspaceUtil.createAndOpenPluginProject("sample");
	}

	@Before
	public void prepare() throws Exception {
		bot = new SWTWorkbenchBot();
	}

	@Test
	public void testCancelOnFirstPage() {
		NewExtensionResolverDialogFirstPageBot firstPage = NewExtensionResolverDialogFirstPageBot.openDialog(bot);
		firstPage.cancel();
	}

	@Test
	public void testButtonNextIsInitiallyDisabledOnFirstPage() {
		NewExtensionResolverDialogFirstPageBot firstPage = NewExtensionResolverDialogFirstPageBot.openDialog(bot);
		assertEquals(false, firstPage.buttonNext().isEnabled());
	}

	@Test
	public void testCancelOnSecondPage_noChangeToSecondPage() {
		NewExtensionResolverDialogFirstPageBot firstPage = NewExtensionResolverDialogFirstPageBot.openDialog(bot);
		firstPage.selectProject("sample");
		NewExtensionResolverDialogSecondPageBot nextPage = firstPage.nextPage();
		assertEquals(true, nextPage.buttonCancel().isEnabled());
	}

	@After
	public void cleanup() {
		bot.resetWorkbench();
	}

	@AfterClass
	public static void cleanupClass() throws Exception {
		WorkspaceUtil.deleteProject("sample");
	}

}
