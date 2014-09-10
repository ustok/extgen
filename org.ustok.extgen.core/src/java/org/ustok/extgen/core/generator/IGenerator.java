/* --------------------------------------------------------------------------
 * @author Ingo Mohr
 * @created Feb 08, 2011
 * --------------------------------------------------------------------------
 */

package org.ustok.extgen.core.generator;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;

/**
 * Generator to generate extension resolver classes and corresponding beans according to given generator-configurations.
 * 
 * @author Ingo Mohr
 * @created Feb 08, 2011
 */
public interface IGenerator {

	/**
	 * Runs the generator with the given configuration.
	 * 
	 * @param pCfg the configuration to run the generator for. Cannot be <code>null</code>.
	 * @param pMonitor the progress monitor to use. Cannot be <code>null</code>.
	 * @return generator execution result status. Never <code>null</code>.
	 */
	public IStatus generate(GeneratorCfg pCfg, IProgressMonitor pMonitor);

}
