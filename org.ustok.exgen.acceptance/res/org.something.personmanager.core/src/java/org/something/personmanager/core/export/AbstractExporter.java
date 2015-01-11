package org.something.personmanager.core.export;

import org.something.personmanager.core.model.PMModel;

public abstract class AbstractExporter {
	
	private PMModel fModel;
	
	public abstract void export();

	public PMModel getModel() {
		return fModel;
	}

	public void setModel(PMModel pModel) {
		fModel = pModel;
	}

}
