/* --------------------------------------------------------------------------
 * @author Ingo Mohr
 * @created Dec 6, 2011
 * --------------------------------------------------------------------------
 */
package org.ustok.extgen.internal.core.generator;

import org.ustok.extgen.core.generator.IGenerator;
import org.ustok.extgen.core.generator.IGeneratorFactory;

/**
 * Implementation of {@link IGeneratorFactory}
 * 
 * @author Ingo Mohr
 * @created Dec 6, 2011
 */
public class GeneratorFactoryImpl implements IGeneratorFactory {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.ustok.extgen.core.generator.IGeneratorFactory#createGenerator()
	 */
	@Override
	public IGenerator createGenerator() {
		return new TemplateBasedGenerator();
	}

}
