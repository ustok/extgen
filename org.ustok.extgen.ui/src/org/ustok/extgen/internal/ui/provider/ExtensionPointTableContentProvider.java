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
import org.eclipse.pde.core.plugin.IExtensions;
import org.eclipse.pde.core.plugin.IPluginExtensionPoint;
import org.eclipse.pde.core.plugin.IPluginModelBase;

/**
 * Content provider for the extension points.
 * <p>
 * Input element is an instance of {@link IPluginModelBase}.
 * </p>
 * 
 * @author thomas, ingomohr
 * @created Oct 31 2011
 */
public class ExtensionPointTableContentProvider implements IStructuredContentProvider {

	@Override
	public Object[] getElements(Object pInputElement) {
		final IPluginModelBase base = (IPluginModelBase) pInputElement;
		final IExtensions extensions = base.getExtensions();
		if (extensions != null) {
			final IPluginExtensionPoint[] extensionPoints = extensions.getExtensionPoints();
			return extensionPoints;
		}
		return null;
	}

	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer pViewer, Object pOldInput, Object pNewInput) {
	}

}
