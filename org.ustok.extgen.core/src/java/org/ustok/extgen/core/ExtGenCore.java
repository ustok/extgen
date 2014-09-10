/* --------------------------------------------------------------------------
 * @author Ingo Mohr
 * @created Oct 31, 2011
 * Copyright 2011 by Trulli & IMore
 * All rights reserved.
 * --------------------------------------------------------------------------
 */

package org.ustok.extgen.core;

import org.ustok.extgen.core.generator.IGenerator;
import org.ustok.extgen.core.generator.IGeneratorFactory;
import org.ustok.extgen.internal.core.generator.GeneratorFactoryImpl;

/**
 * Core unit of the plug-in.
 * <p>
 * Provides a number of methods to grant access to the features of the plug-in.
 * </p>
 * 
 * @author Ingo Mohr
 * @created Oct 31, 2011
 */
public final class ExtGenCore {

	/** plug-in ID */
	public static final String ID = "org.ustok.extgen.core";

	/** generator factory */
	private static final IGeneratorFactory genFactory = new GeneratorFactoryImpl();

	/**
	 * Constructor of ExtGenCore.
	 */
	private ExtGenCore() {
	}

	/**
	 * Returns the Generator Factory.
	 * 
	 * @return {@link IGenerator}, never <code>null</code>.
	 */
	public static IGeneratorFactory getGeneratorFactory() {
		return ExtGenCore.genFactory;
	}

}
