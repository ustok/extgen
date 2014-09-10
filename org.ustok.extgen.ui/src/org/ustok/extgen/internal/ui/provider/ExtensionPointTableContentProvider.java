/*******************************************************************************
 * Copyright (c) 2011, 2012 www.ustok.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.ustok.extgen.internal.ui.provider;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.pde.core.plugin.IPluginModelBase;

/**
 * Content provider for the extension points.
 * <p>
 * Input element is an instance of {@link IPluginModelBase}.
 * </p>
 * 
 * @author thomas
 * @created Oct 31 2011
 */
public class ExtensionPointTableContentProvider implements
		IStructuredContentProvider {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	@Override
	public Object[] getElements(Object pInputElement) {
		IPluginModelBase base = (IPluginModelBase) pInputElement;
		if (base.getExtensions() != null) {
			return base.getExtensions().getExtensionPoints();
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	@Override
	public void dispose() {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer,
	 *      java.lang.Object, java.lang.Object)
	 */
	@Override
	public void inputChanged(Viewer pViewer, Object pOldInput, Object pNewInput) {
	}

}
