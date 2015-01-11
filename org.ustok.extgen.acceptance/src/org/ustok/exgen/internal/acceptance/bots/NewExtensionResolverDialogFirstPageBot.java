/******************************************************
 * Copyright 2015 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.exgen.internal.acceptance.bots;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotButton;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;

/**
 * Bot: first page of the wizard dialog.
 * 
 * @author ingomohr
 * @created Jan 11, 2015
 */
public class NewExtensionResolverDialogFirstPageBot extends SWTBotShell {

	private static final String NEW_EXTENSION_RESOLVER = "New Extension Resolver";

	public NewExtensionResolverDialogFirstPageBot(Shell pShell) throws WidgetNotFoundException {
		super(pShell);
	}

	public static NewExtensionResolverDialogFirstPageBot openDialog(SWTWorkbenchBot pBot) {
		pBot.menu("File").menu("New").menu("Other...").click();
		SWTBotShell dialogNew = pBot.shell("New").activate();
		dialogNew.bot().tree().expandNode("Plug-in Development", "Extension Resolver").select();
		dialogNew.bot().button("Next >").click();
		SWTBotShell dialogFirstPage = pBot.shell(NEW_EXTENSION_RESOLVER).activate();
		return new NewExtensionResolverDialogFirstPageBot(dialogFirstPage.widget);
	}

	public void cancel() {
		bot().button("Cancel").click();
	}

	public NewExtensionResolverDialogSecondPageBot nextPage() {
		bot().button("Next >").click();
		SWTBotShell nextShell = bot().shell(NEW_EXTENSION_RESOLVER);
		nextShell.activate();
		return new NewExtensionResolverDialogSecondPageBot(nextShell.widget);
	}

	public SWTBotButton buttonNext() {
		return bot().button("Next >");
	}

	public void selectProject(String pProjectName) {
		bot().comboBox().setSelection(pProjectName);
	}


}
