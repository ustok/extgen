/*******************************************************************************
 * Copyright (c) 2011, 2012 www.ustok.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.ustok.extgen.internal.ui.provider;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.pde.core.plugin.IPluginExtensionPoint;
import org.eclipse.swt.graphics.Image;
import org.ustok.extgen.internal.ui.ImageConstants;
import org.ustok.extgen.internal.ui.ImageProvider;

/**
 * Label provider for extension-points.
 * 
 * @author Ingo Mohr
 * @created Oct 31 2011
 */
public class ExtensionPointTableLabelProvider extends LabelProvider implements
		ILabelProvider {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.LabelProvider#getImage(java.lang.Object)
	 */
	@Override
	public Image getImage(Object pElement) {
		return ImageProvider.getImage(ImageConstants.EXTENSION_POINT);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object pElement) {
		IPluginExtensionPoint extensionPoint = (IPluginExtensionPoint) pElement;
		return extensionPoint.getName();
	}

}
