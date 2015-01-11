/******************************************************
 * Copyright 2015 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.exgen.internal.acceptance.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.FileLocator;
import org.junit.Assert;
import org.osgi.framework.Bundle;

/**
 * Util class to compare files.
 * 
 * @author ingomohr
 * @created Jan 11, 2015
 */
public class WorkspaceComparingAssertor {

	public static void assertEquals(Bundle pBundle, String pPathExpectedFile, IFile pActualFile) throws Exception {
		File file = new File(FileLocator.toFileURL(pBundle.getEntry(pPathExpectedFile)).toURI());

		String msg = "File must exist: \"" + pActualFile + "\"";
		Assert.assertEquals(msg, true, pActualFile.exists());

		InputStream inExp = new FileInputStream(file);
		InputStream inActual = pActualFile.getContents();

		List<String> linesExp = readLines(inExp);
		List<String> linesActual = readLines(inActual);

		Assert.assertEquals("Expecting same line-number", linesExp.size(), linesActual.size());

		for (int i = 0; i < linesExp.size(); i++) {
			String currentLineExp = linesExp.get(i);
			String currentLineActual = linesActual.get(i);
			Assert.assertEquals("File " + pActualFile.getName() + ", line #" + i, currentLineExp, currentLineActual);
		}
	}

	private static List<String> readLines(InputStream pIn) throws Exception {
		List<String> lines = new ArrayList<>();
		BufferedReader in = new BufferedReader(new InputStreamReader(pIn));

		String line = "";
		do {
			line = in.readLine();
			if (line != null) {
				lines.add(line);
			}
		} while (line != null);

		return lines;
	}

}
