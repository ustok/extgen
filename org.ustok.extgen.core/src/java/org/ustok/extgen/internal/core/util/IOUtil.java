/* --------------------------------------------------------------------------
 * @author Ingo Mohr
 * @created Dec 11, 2011
 * --------------------------------------------------------------------------
 */

package org.ustok.extgen.internal.core.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.ustok.extgen.core.ExtGenCore;

/**
 * I/O util class.
 * 
 * @author Ingo Mohr
 * @created Dec 11, 2011
 */
public final class IOUtil {

	/**
	 * Constructor of IOUtil.
	 */
	private IOUtil() {

	}

	/**
	 * Reads the template mapped to the given key.
	 * 
	 * @param pKey key for the template to read. See {@link TemplateDef#TEMPLATE_EXCEPTION}, {@link TemplateDef#TEMPLATE_JCLASS}.
	 * @return template as string. Cannot be <code>null</code>.
	 * @throws IOException if template cannot be imported.
	 */
	public static String readTemplate(String pKey) throws IOException {
		Assert.isNotNull(pKey);

		URL entry = Platform.getBundle(ExtGenCore.ID).getResource(pKey);
		entry = FileLocator.resolve(entry);
		File file = new File(entry.getFile());
		BufferedReader reader = new BufferedReader(new FileReader(file));

		StringBuilder builder = new StringBuilder();
		boolean addLineBreak = false;
		while (reader.ready()) {
			if (addLineBreak) {
				builder.append("\n");
			}
			addLineBreak = true;

			String line = reader.readLine();
			builder.append(line);
		}

		return builder.toString();
	}

}
