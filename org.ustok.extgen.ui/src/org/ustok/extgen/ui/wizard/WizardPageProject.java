/*******************************************************************************
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.ustok.extgen.ui.wizard;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.ustok.extgen.internal.ui.util.ExtGenUiUtil;

/**
 * Wizard page to select the project.
 * 
 * @author Ingo Mohr
 * @created Nov 9, 2011
 */
class WizardPageProject extends WizardPage {

	/** page name */
	public static final String NAME = WizardPageProject.class.getSimpleName();

	private Combo fComboProject;

	private IStructuredSelection fSelection;

	WizardPageProject(IStructuredSelection pSelection) {
		super(WizardPageProject.NAME);
		fSelection = pSelection;
	}

	@Override
	public void createControl(Composite pParent) {
		Composite comp = new Composite(pParent, SWT.NONE);
		comp.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());

		final int numColumns = 2;
		comp.setLayout(GridLayoutFactory.swtDefaults().numColumns(numColumns).create());

		Label label = new Label(comp, SWT.NONE);
		label.setText("Project:");

		fComboProject = new Combo(comp, SWT.BORDER | SWT.READ_ONLY | SWT.SINGLE);
		fComboProject.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());

		setControl(comp);
		setDescription("Select the project to create the resolver for.");
		setTitle("Select Project");

		initCombo();

		fComboProject.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent pE) {
				setPageComplete(isPageComplete());

				IWizardPage page = getWizard().getPage(WizardPageCfg.NAME);
				if (page != null) {
					((WizardPageCfg) page).initControl();
				}
			}
		});
	}

	private void initCombo() {
		String[] allProjects = ExtGenUiUtil.findAllPDEProjects();
		fComboProject.setItems(allProjects);

		int index = -1;
		String selectedProjectName = ExtGenUiUtil.fetchSelectedJavaProjectName(fSelection);
		if (selectedProjectName != null) {
			index = fComboProject.indexOf(selectedProjectName);
		}
		if (index != -1) {
			fComboProject.select(index);
		}
	}

	@Override
	public boolean isPageComplete() {
		return fComboProject != null && fComboProject.getSelectionIndex() != -1;
	}

	/**
	 * Returns the combo to select the project.
	 * 
	 * @return combo to select the project. Never <code>null</code> after the
	 *         page's control has been created.
	 */
	public Combo getComboProject() {
		return fComboProject;
	}

}
