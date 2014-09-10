/*******************************************************************************
 * Copyright (c) 2011, 2012 www.ustok.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.ustok.extgen.ui.wizard;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.pde.core.plugin.IPluginExtensionPoint;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.osgi.framework.Bundle;
import org.ustok.extgen.core.ExtGenCore;
import org.ustok.extgen.core.generator.GeneratorCfg;
import org.ustok.extgen.core.generator.IGenerator;

/**
 * Wizard to generate Extension Resolvers.
 * 
 * @author Ingo Mohr
 * @created Nov 9, 2011
 */
public class ExtGenWizard extends Wizard implements INewWizard {

	/** wizard page to select the project */
	private WizardPageProject fPageProject;

	/** wizard page to setup the generator configuration */
	private WizardPageCfg fPageCfg;

	/**
	 * Constructor of CreateExtensResolverWizard.
	 */
	public ExtGenWizard() {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
	 *      org.eclipse.jface.viewers.IStructuredSelection)
	 */
	@Override
	public void init(IWorkbench pWorkbench, IStructuredSelection pSelection) {
		setNeedsProgressMonitor(true);

		fPageProject = new WizardPageProject(pSelection);
		addPage(fPageProject);

		fPageCfg = new WizardPageCfg();
		addPage(fPageCfg);

		setWindowTitle("New Extension Resolver");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		final GeneratorCfg cfg = createCfg();

		WorkspaceModifyOperation op = new WorkspaceModifyOperation() {
			protected void execute(IProgressMonitor pMonitor)
					throws InvocationTargetException, InterruptedException {
				try {
					IGenerator generator = ExtGenCore.getGeneratorFactory()
							.createGenerator();
					final IStatus status = generator.generate(cfg, pMonitor);
					if (status.getSeverity() != IStatus.OK) {
						Display.getDefault().syncExec(new Runnable() {
							@Override
							public void run() {
								MessageDialog
										.openError(null,
												"Create Extension Resolver",
												"Error creating extension resolver. See log.");
								Bundle bundle = Platform
										.getBundle(ExtGenCore.ID);
								Platform.getLog(bundle).log(status);
							}
						});
					}
				} finally {
					pMonitor.done();
				}
			}
		};

		try {
			getContainer().run(true, false, op);
			return true;
		} catch (Throwable ex) {
			Bundle bundle = Platform.getBundle(ExtGenCore.ID);
			Platform.getLog(bundle).log(
					new Status(IStatus.ERROR, ExtGenCore.ID,
							"Error creating extension resolver.", ex));
			MessageDialog
					.openError(
							getShell(),
							"Create Extension Resolver",
							"Detected problems creating the extension resolver.\n\nSee error log for information.");

			return true;
		}
	}

	/**
	 * Creates the generator cfg to work with.
	 * 
	 * @return new generator cfg.
	 */
	private GeneratorCfg createCfg() {
		GeneratorCfg cfg = new GeneratorCfg();

		Combo comboProject = fPageProject.getComboProject();
		String projectName = comboProject.getItem(comboProject
				.getSelectionIndex());
		IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(projectName);
		cfg.setProject(project);

		for (Object rawEp : fPageCfg.getTableViewer().getCheckedElements()) {
			IPluginExtensionPoint ep = (IPluginExtensionPoint) rawEp;
			String id = ep.getId();
			cfg.getExtensionPoints().add(id);
		}

		String srcFolder = fPageCfg.getTextSourceFolder().getText();
		cfg.setSourceFolder(srcFolder);

		String packageID = fPageCfg.getTextPackage().getText();
		cfg.setPackage(packageID);

		return cfg;
	}
}
