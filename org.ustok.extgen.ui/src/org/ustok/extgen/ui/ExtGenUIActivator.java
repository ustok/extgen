/*******************************************************************************
 * Copyright (c) 2011, 2012 www.ustok.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.ustok.extgen.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.ustok.extgen.internal.ui.ImageConstants;

/**
 * The activator class controls the plug-in life cycle
 * 
 * @created Oct 31 2011
 * @author Ingo Mohr
 */
public class ExtGenUIActivator extends AbstractUIPlugin {

	/** The plug-in ID */
	public static final String PLUGIN_ID = "org.ustok.extgen.ui";

	/** The shared instance */
	private static ExtGenUIActivator plugin;

	/**
	 * Constructor of ExtGenUIActivator.
	 */
	public ExtGenUIActivator() {
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance.
	 * 
	 * @return the shared instance.
	 */
	public static ExtGenUIActivator getDefault() {
		return plugin;
	}

	@Override
	protected void initializeImageRegistry(ImageRegistry pReg) {
		super.initializeImageRegistry(pReg);

		internalRegisterImg(pReg, ImageConstants.SOURCE_FOLDER);
		internalRegisterImg(pReg, ImageConstants.EXTENSION_POINT);
	}

	/**
	 * Puts an image to image registry.
	 * 
	 * @param pReg
	 *            image registry to register at.
	 * @param pKey
	 *            image key to register.
	 */
	private void internalRegisterImg(ImageRegistry pReg, String pKey) {
		ImageDescriptor desc = imageDescriptorFromPlugin(PLUGIN_ID, pKey);
		pReg.put(pKey, desc);
	}
}
