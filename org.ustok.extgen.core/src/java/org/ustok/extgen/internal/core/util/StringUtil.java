/* --------------------------------------------------------------------------
 * @author Ingo Mohr
 * @created Dec 14, 2011
 * --------------------------------------------------------------------------
 */

package org.ustok.extgen.internal.core.util;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/**
 * String util class.
 * 
 * @author Ingo Mohr
 * @created Dec 14, 2011
 */
public class StringUtil {

	/**
	 * Constructor of StringUtil.
	 */
	private StringUtil() {
	}

	/**
	 * Returns the given value with the first character being a capital letter.
	 * 
	 * @param pValue the value to process.
	 * @return capitalized value. <code>null</code> if parameter is <code>null</code>.
	 */
	public static String capitalize(String pValue) {
		if (pValue != null && pValue.length() > 0) {
			return pValue.substring(0, 1).toUpperCase() + pValue.substring(1);
		}
		return pValue;
	}

	/**
	 * Returns the given name in a representation which enables the name to be a java field name.
	 * 
	 * @param pName the field name to process.
	 * @return field name representation to be written out in a Java class.
	 */
	public static String toJavaFieldName(String pName) {
		if (pName != null) {
			Set<String> set = createFieldNames();
			if (set.contains(pName)) {
				return pName + "Field";
			}
		}
		return pName;
	}

	/**
	 * Creates field name set.
	 * 
	 * @return field name set.
	 */
	private static Set<String> createFieldNames() {
		Set<String> set = new HashSet<String>();
		set.add("import");
		set.add("class");
		set.add("interface");
		set.add("instanceof");
		set.add("int");
		set.add("boolean");
		set.add("float");
		set.add("double");
		set.add("long");
		set.add("byte");
		set.add("return");
		set.add("private");
		set.add("protected");
		set.add("public");
		set.add("new");
		set.add("package");
		set.add("null");
		return set;
	}

	/**
	 * Returns the current date as string represention.
	 * 
	 * @return current date.
	 */
	public static String currentDate() {
		String month = Calendar.getInstance().getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.US);
		int dayVal = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		String day = String.valueOf(dayVal);
		if (dayVal == 1) {
			day = day + "st";
		} else {
			day = day + "th";
		}

		int year = Calendar.getInstance().get(Calendar.YEAR);
		StringBuilder builderDate = new StringBuilder();
		builderDate.append(month).append(" ").append(day).append(" ").append(year);
		return builderDate.toString();
	}

}
