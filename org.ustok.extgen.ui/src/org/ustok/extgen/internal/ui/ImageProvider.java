/*******************************************************************************
 * Copyright (c) 2011, 2012 www.ustok.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.ustok.extgen.internal.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.ustok.extgen.ui.ExtGenUIActivator;

/**
 * Provider for internal images.
 * 
 * @author thomas
 */
public final class ImageProvider {

	private ImageProvider() {
	}

	/**
	 * Returns the image with the given key.
	 * 
	 * @param pKey
	 *            key
	 * @return image
	 */
	public static Image getImage(String pKey) {
		return ExtGenUIActivator.getDefault().getImageRegistry().get(pKey);
	}

	/**
	 * Returns the image descriptor for the given key.
	 * 
	 * @param pKey
	 *            key
	 * @return image descriptor
	 */
	public static ImageDescriptor getDescriptor(String pKey) {
		return ExtGenUIActivator.getDefault().getImageRegistry()
				.getDescriptor(pKey);

	}
}
