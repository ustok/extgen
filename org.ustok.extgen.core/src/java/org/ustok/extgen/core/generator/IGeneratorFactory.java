/* --------------------------------------------------------------------------
 * @author Ingo Mohr
 * @created Feb 08, 2011
 * --------------------------------------------------------------------------
 */

package org.ustok.extgen.core.generator;

/**
 * Factory to create generators.
 * 
 * @author Ingo Mohr
 * @created Feb 08, 2011
 */
public interface IGeneratorFactory {

	/**
	 * Creates a new generator.
	 * 
	 * @return new generator.
	 */
	public IGenerator createGenerator();

}
