/*******************************************************************************
 * Copyright (c) 2011, 2012 www.ustok.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.ustok.extgen.internal.core.generator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.ustok.extgen.core.ExtGenCore;
import org.ustok.extgen.core.codegen.BeanGenerator;
import org.ustok.extgen.core.codegen.ProviderGenerator;
import org.ustok.extgen.core.codegen.ResolverGenerator;
import org.ustok.extgen.core.generator.GeneratorCfg;
import org.ustok.extgen.core.generator.GeneratorException;
import org.ustok.extgen.core.generator.IGenerator;
import org.ustok.extgen.core.model.epmodel.EPElement;
import org.ustok.extgen.core.model.epmodel.EPModel;
import org.ustok.extgen.internal.core.io.ExtensionPointReader;

/**
 * Generator implementation based on templating.
 * 
 * @author Ingo Mohr
 * @created Feb 12, 2011
 */
public class TemplateBasedGenerator implements IGenerator {

	@Override
	public IStatus generate(GeneratorCfg pCfg, IProgressMonitor pMonitor) {
		pMonitor.beginTask("Generating", 100);

		try {
			// 1. Find / Create folders
			IProject project = pCfg.getProject();
			if (project == null) {
				return createError("Project is required", null);
			}
			IFolder folder = project.getFolder(pCfg.getSourceFolder());
			if (folder == null) {
				return createError("Source folder is required", null);
			}

			if (!folder.exists()) {
				folder.create(true, true, pMonitor);
			}

			// 2. Build class configurations
			List<EPModel> epModels = parseEPModels(pCfg);
			pMonitor.worked(75); // TODO performance is currently very poor
									// because the Acceleo generators take a
									// while for initialization. So we jump to
									// 75% and fill the last 25% with each of
									// the generator instances done. We should
									// speedup generation.

			// -- calculate work-units to fill the last 25 totalWork-units --
			int workToDo = 0;
			for (EPModel epModel : epModels) {
				workToDo += epModel.getElements().size() + 1;
			}
			int workUnit = Math.round(25f / workToDo);
			// --

			// 3. Write classes
			for (EPModel epModel : epModels) {
				List<Object> arguments = new ArrayList<Object>();
				IFolder targetFolder = createFolder(folder, epModel, pMonitor);
				File nativeFolder = new File(targetFolder.getLocation()
						.toOSString());

				ResolverGenerator resolverGenerator = new ResolverGenerator(
						epModel, nativeFolder, arguments);
				resolverGenerator.doGenerate(null); // TODO: pass monitor
				pMonitor.worked(workUnit);

				for (EPElement epElmt : epModel.getElements()) {
					BeanGenerator generator = new BeanGenerator(epElmt,
							nativeFolder, arguments);
					generator.doGenerate(null); // TODO: pass monitor
					pMonitor.worked(workUnit);
				}
				
				final ProviderGenerator providerGen = new ProviderGenerator(epModel, nativeFolder, arguments);
				providerGen.doGenerate(null); // TODO pass monitor
				pMonitor.worked(workUnit);

				folder.refreshLocal(IResource.DEPTH_INFINITE, null);
			}
			pMonitor.worked(1);

		} catch (IOException ex) {
			return createError("Cannot import java class template", ex);
		} catch (CoreException ex) {
			return createError("Cannot create folders and files", ex);
		} catch (GeneratorException ex) {
			return createError("Cannot create packages", ex);
		} finally {
			pMonitor.done();
		}

		return Status.OK_STATUS;
	}

	/**
	 * Creates the target folder for the given cfg.
	 * <p>
	 * If the folder already exists, that folder will be returned.
	 * </p>
	 * 
	 * @param pSrcFolder
	 *            the source folder.
	 * @param pModel
	 *            the model to create the folder for.
	 * @param pMonitor
	 *            the progress monitor.
	 * @return package folder to write the java class into.
	 * @throws GeneratorException
	 *             if folder cannot be created.
	 */
	private IFolder createFolder(IFolder pSrcFolder, EPModel pModel,
			IProgressMonitor pMonitor) throws GeneratorException {

		String rawPackage = pModel.getBasePackage() + "." + pModel.getId();
		if (rawPackage == null || rawPackage.length() < 1) {
			throw new GeneratorException("Invalid package: \"" + rawPackage
					+ "\"", null);
		}
		String packagePath = rawPackage.replaceAll("\\.", "/");

		IFolder folder = pSrcFolder;

		IPath path = new Path(packagePath);
		for (String segment : path.segments()) {
			folder = folder.getFolder(segment);
			if (!folder.exists()) {
				try {
					folder.create(true, true, pMonitor);
				} catch (CoreException ex) {
					throw new GeneratorException(
							"Error creating package folder", ex);
				}
			}
		}

		return folder;
	}

	/**
	 * Builds the class configurations to write.
	 * 
	 * @param pCfg
	 *            the generator configuration for which to build the class
	 *            configurations.
	 * @return class configurations.
	 * @throws IOException
	 *             if the extension point file cannot be read.
	 */
	private List<EPModel> parseEPModels(GeneratorCfg pCfg) throws IOException {
		IProject project = pCfg.getProject();
		if (project == null || !project.isOpen() || !project.exists()) {
			throw new IOException("Cannot access project.");
		}

		IFolder folder = project.getFolder("schema");
		if (folder == null || !folder.exists()) {
			throw new IOException(
					"Cannot access extension point schema folder \"schema\"");
		}

		List<EPModel> models = new ArrayList<EPModel>();

		List<String> pointNames = pCfg.getExtensionPoints();
		for (String pointName : pointNames) {
			String fileName = pointName + ".exsd";
			IFile file = folder.getFile(fileName);
			if (file == null || !file.exists()) {
				throw new IOException(
						"Cannot access extension point schema file \""
								+ fileName + "\"");
			}

			ExtensionPointReader reader = new ExtensionPointReader();
			EPModel model = reader.read(file);
			model.setBasePackage(pCfg.getPackage());
			models.add(model);
		}

		return models;
	}

	/**
	 * Creates an error status with the given message.
	 * 
	 * @param pMessage
	 *            the message to set.
	 * @param pCause
	 *            the cause to set.
	 * @return created error status.
	 */
	private IStatus createError(String pMessage, Throwable pCause) {
		return new Status(IStatus.ERROR, ExtGenCore.ID, pMessage, pCause);
	}

}
