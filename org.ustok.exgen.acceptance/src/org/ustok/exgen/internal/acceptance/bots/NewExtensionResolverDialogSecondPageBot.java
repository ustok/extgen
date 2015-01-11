/******************************************************
 * Copyright 2015 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.exgen.internal.acceptance.bots;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.waits.DefaultCondition;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotButton;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;

/**
 * Bot: Second page.
 * 
 * @author ingomohr
 * @created Jan 11, 2015
 */
public class NewExtensionResolverDialogSecondPageBot extends SWTBotShell {

	public NewExtensionResolverDialogSecondPageBot(Shell pShell) throws WidgetNotFoundException {
		super(pShell);
	}

	public void cancel() {
		buttonCancel().click();
	}

	public SWTBotButton buttonCancel() {
		return bot().button("Cancel");
	}

	public void checkAll() {
		bot().checkBox("Check All").click();
	}

	public void setSourceFolder(String pSourceFolder) {
		bot().textWithLabel("Source Folder:").setText(pSourceFolder);
	}

	public void finish() {
		final SWTBotShell shell = bot().activeShell();
		final long timeout = 10_000;
		bot().button("Finish").click();
		bot().waitUntil(new DefaultCondition() {
			
			@Override
			public boolean test() throws Exception {
				return !shell.isOpen();
			}
			
			@Override
			public String getFailureMessage() {
				return "Wizard didn't finish within " + timeout + " millis.";
			}
		}, timeout);
	}

}
