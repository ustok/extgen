/******************************************************
 * Copyright 2015 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.exgen.internal.acceptance.util;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;

/**
 * Workbench util.
 * 
 * @author ingomohr
 * @created Jan 11, 2015
 */
public class WorkbenchUtil {

	public static void closeViewPartIfFound_Welcome(SWTWorkbenchBot pBot) {
		try {
			SWTBotView viewPartWelcome = pBot.viewByPartName("Welcome");
			viewPartWelcome.close();
		} catch (Exception ex) {
			// ignore
		}
	}

}
