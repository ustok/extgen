package org.ustok.extgen.core.test.util;

import org.junit.Assert;
import org.junit.Test;
import org.ustok.extgen.internal.core.util.StringUtil;

/**
 * Test for {@link StringUtil}.
 * 
 * @author Ingo Mohr
 * @created 16.02.2012
 */
public class StringUtilTest {
	
	@Test
	public void testCapitalize() {
		Assert.assertEquals(null, StringUtil.capitalize(null));
		Assert.assertEquals("A", StringUtil.capitalize("a"));
		Assert.assertEquals("Abc", StringUtil.capitalize("abc"));
		Assert.assertEquals("Abc", StringUtil.capitalize("Abc"));
		Assert.assertEquals("AbC", StringUtil.capitalize("AbC"));
	}

}
