/*******************************************************************************
 * Copyright (c) 2011, 2012 www.ustok.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.ustok.extgen.ui.wizard;

import java.util.regex.Pattern;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.ustok.extgen.internal.ui.ImageConstants;
import org.ustok.extgen.internal.ui.ImageProvider;
import org.ustok.extgen.internal.ui.provider.ExtensionPointTableContentProvider;
import org.ustok.extgen.internal.ui.provider.ExtensionPointTableLabelProvider;

/**
 * Wizard page to select extension-points and configure target source folder and
 * package.
 * 
 * @author Ingo Mohr
 * @created Nov 9, 2011
 */
class WizardPageCfg extends WizardPage {

	/** page name */
	public static final String NAME = WizardPageCfg.class.getSimpleName();

	/** button to check/uncheck all */
	private Button fButtonCheckAll;

	/** table viewer */
	private CheckboxTableViewer fTableViewer;

	/** text widget to configure the target source folder */
	private Text fTextSourceFolder;

	/** text widget to configure the package for the generated Java classes */
	private Text fTextPackage;

	/**
	 * Constructor of WizardPageCfg.
	 */
	WizardPageCfg() {
		super(WizardPageCfg.NAME);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite pParent) {
		Composite comp = new Composite(pParent, SWT.NONE);
		comp.setLayoutData(GridDataFactory.fillDefaults().grab(true, true)
				.create());

		comp.setLayout(GridLayoutFactory.swtDefaults().create());

		Label labelEPs = new Label(comp, SWT.NONE);
		labelEPs.setText("Extension Points:");

		final int height = 100;
		Table table = new Table(comp, SWT.FULL_SELECTION | SWT.BORDER
				| SWT.CHECK);
		table.setLayoutData(GridDataFactory.swtDefaults()
				.hint(SWT.DEFAULT, height).align(SWT.FILL, SWT.BEGINNING)
				.grab(true, false).create());
		fTableViewer = new CheckboxTableViewer(table);
		fTableViewer
				.setContentProvider(new ExtensionPointTableContentProvider());
		fTableViewer.setLabelProvider(new ExtensionPointTableLabelProvider());
		fTableViewer.addCheckStateListener(new ICheckStateListener() {
			@Override
			public void checkStateChanged(CheckStateChangedEvent pEvent) {
				int itemCount = fTableViewer.getTable().getItemCount();
				int numChecked = fTableViewer.getCheckedElements().length;

				if (itemCount > 0) {
					boolean allChecked = numChecked == itemCount;
					boolean noneChecked = numChecked == 0;

					boolean grayed = !allChecked && !noneChecked;
					fButtonCheckAll.setGrayed(grayed);

					if (noneChecked) {
						fButtonCheckAll.setSelection(false);
					} else {
						fButtonCheckAll.setSelection(true);
					}
				}

				revalidate();
			}
		});

		fButtonCheckAll = new Button(comp, SWT.CHECK);
		fButtonCheckAll.setText("Check All");
		fButtonCheckAll.addSelectionListener(new SelectionAdapter() {
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent pE) {
				fTableViewer.setAllChecked(fButtonCheckAll.getSelection());
				revalidate();
			}
		});

		Label labelSeparator = new Label(comp, SWT.SEPARATOR | SWT.HORIZONTAL);
		labelSeparator.setLayoutData(GridDataFactory.fillDefaults()
				.grab(true, false).create());

		final int numColumns = 3;
		Composite compFolders = new Composite(comp, SWT.NONE);
		compFolders.setLayoutData(GridDataFactory.fillDefaults()
				.grab(true, false).create());
		compFolders.setLayout(GridLayoutFactory.fillDefaults()
				.numColumns(numColumns).create());

		Label labelImgSrcFolder = new Label(compFolders, SWT.NONE);
		labelImgSrcFolder.setImage(ImageProvider
				.getImage(ImageConstants.SOURCE_FOLDER));

		Label labelTxtSrcFolder = new Label(compFolders, SWT.NONE);
		labelTxtSrcFolder.setText("Source Folder:");

		fTextSourceFolder = new Text(compFolders, SWT.BORDER);
		fTextSourceFolder.setLayoutData(GridDataFactory.fillDefaults()
				.grab(true, false).create());
		fTextSourceFolder.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent pE) {
				revalidate();
			}
		});

		new Label(compFolders, SWT.NONE);

		Label labelTxtPackage = new Label(compFolders, SWT.NONE);
		labelTxtPackage.setText("Package:");

		fTextPackage = new Text(compFolders, SWT.BORDER);
		fTextPackage.setLayoutData(GridDataFactory.fillDefaults()
				.grab(true, false).create());
		fTextPackage.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent pE) {
				revalidate();
			}
		});

		setControl(comp);
		setDescription("Setup the extension-points, target source folder and package information.");
		setTitle("Extension Resolver Configuration");

		initControl();
	}

	/**
	 * Initializes the values of the control.
	 */
	void initControl() {
		IWizardPage rawPage = getWizard().getPage(WizardPageProject.NAME);
		WizardPageProject page = (WizardPageProject) rawPage;
		Combo combo = page.getComboProject();
		if (combo.getSelectionIndex() != -1) {
			String projectName = combo.getItem(combo.getSelectionIndex());
			if (projectName != null) {
				IProject project = ResourcesPlugin.getWorkspace().getRoot()
						.getProject(projectName);
				IPluginModelBase model = PluginRegistry.findModel(project);
				fTableViewer.setInput(model);
				fTableViewer.refresh();

				if (model != null) {
					String pluginID = model.getPluginBase().getId();
					if (pluginID != null) {
						fTextPackage.setText(pluginID + ".extension");
					}
				}
			}
		}

		fTextSourceFolder.setText("src");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.wizard.WizardPage#isPageComplete()
	 */
	@Override
	public boolean isPageComplete() {
		int numChecked = fTableViewer.getCheckedElements().length;
		boolean hasSrcFolder = fTextSourceFolder.getText().length() > 0;
		boolean hasPackage = fTextPackage.getText().length() > 0;

		return numChecked > 0 && hasSrcFolder && hasPackage;
	}

	/**
	 * Revalidates the page.
	 */
	private void revalidate() {
		setPageComplete(isPageComplete());

		boolean valid = revalidateScrFolder();
		valid = valid && revalidatePackage();

		if (valid) {
			setErrorMessage(null);
		}
	}

	/**
	 * Revalidates the package.
	 * 
	 * @return <code>true</code> if no problem could be found.
	 */
	private boolean revalidatePackage() {
		String txtPackage = getTextPackage().getText();
		if (txtPackage.trim().length() < 1) {
			setErrorMessage("Please define a package for the classes to create.");
			return false;
		}

		boolean matches = Pattern.matches("([A-z]\\w*\\.)*[A-z]\\w*",
				txtPackage);
		if (!matches) {
			setErrorMessage("The package identifier isn't valid.");
			return false;
		}

		return true;
	}

	/**
	 * Revalidates the source folder.
	 * 
	 * @return <code>true</code> if no problem could be found.
	 */
	private boolean revalidateScrFolder() {
		String txtSrc = getTextSourceFolder().getText();
		if (txtSrc.trim().length() < 1) {
			setErrorMessage("Please define a source folder to create the classes in.");
			return false;
		}

		return true;
	}

	/**
	 * Returns the buttonCheckAll.
	 * 
	 * @return the buttonCheckAll.
	 */
	public Button getButtonCheckAll() {
		return fButtonCheckAll;
	}

	/**
	 * Returns the table viewer with all checked extension-points.
	 * 
	 * @return the tableViewer.
	 */
	public CheckboxTableViewer getTableViewer() {
		return fTableViewer;
	}

	/**
	 * Returns the text widget to configure the target source folder.
	 * 
	 * @return the textSourceFolder.
	 */
	public Text getTextSourceFolder() {
		return fTextSourceFolder;
	}

	/**
	 * Returns the textPackage.
	 * 
	 * @return the widget to configure the package for the generated Java
	 *         classes.
	 */
	public Text getTextPackage() {
		return fTextPackage;
	}

}
