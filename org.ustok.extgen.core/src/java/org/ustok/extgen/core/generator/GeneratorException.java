/* --------------------------------------------------------------------------
 * @author Ingo Mohr
 * @created Feb 08, 2011
 * --------------------------------------------------------------------------
 */
package org.ustok.extgen.core.generator;

/**
 * Exception to be thrown by the generator when it cannot generate successfully.
 * 
 * @author Ingo Mohr
 * @created Feb 08, 2011
 */
@SuppressWarnings("serial")
public class GeneratorException extends Exception {

	/**
	 * Constructor of GeneratorException.
	 */
	public GeneratorException() {
	}

	/**
	 * Constructor of GeneratorException.
	 * 
	 * @param pMessage the message to set.
	 */
	public GeneratorException(String pMessage) {
		super(pMessage);
	}

	/**
	 * Constructor of GeneratorException.
	 * 
	 * @param pCause the cause to set.
	 */
	public GeneratorException(Throwable pCause) {
		super(pCause);
	}

	/**
	 * Constructor of GeneratorException.
	 * 
	 * @param pMessage the message to set.
	 * @param pCause the cause to set.
	 */
	public GeneratorException(String pMessage, Throwable pCause) {
		super(pMessage, pCause);
	}

}
