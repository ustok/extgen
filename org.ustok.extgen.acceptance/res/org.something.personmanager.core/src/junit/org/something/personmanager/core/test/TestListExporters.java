package org.something.personmanager.core.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.junit.Test;
import org.something.personmanager.core.export.AbstractExporter;
import org.something.personmanager.core.extension.exporters.Exporter;
import org.something.personmanager.core.extension.exporters.ExportersExtension;
import org.something.personmanager.core.extension.exporters.ExportersExtensionResolver;

/**
 * Gathers all exporters from the extension point "exporters".
 * 
 * @author Ingo Mohr
 */
public class TestListExporters {

	@Test
	public void resolveAllExtensions() throws CoreException {
		ExportersExtensionResolver resolver = new ExportersExtensionResolver();
		List<ExportersExtension> extensions = resolver.resolveExtensions();
		System.out.println("Resolving extensions:");
		for (ExportersExtension extension : extensions) {
			String name = extension.getName();
			String contributor = extension.getContributor();
			System.out.println("-> Found extension name \"" + name
					+ "\" contributor \"" + contributor + "\"");

			System.out.println("  Listing extporters:");

			List<Exporter> exporters = extension.getExporters();
			for (Exporter exporter : exporters) {
				String ename = exporter.getName();
				String edescription = exporter.getDescription();
				boolean efavourite = exporter.getFavourite();
				String erestrictedAttribute = exporter.getRestrictedAttribute();
				AbstractExporter exporterImpl = exporter.createClass();
				String eclassName = exporterImpl.getClass().getName();

				System.out.println("    Exporter:");
				System.out.println("      name                  : " + ename);
				System.out.println("      description           : " + edescription);
				System.out.println("      favourite             : " + efavourite);
				System.out.println("      restrictedAttribute   : "
						+ erestrictedAttribute);
				System.out.println("      eclass                : " + eclassName);
				
				System.out.println("      running exporter...");
				exporterImpl.export();
			}
		}

		System.out.println("Done");
	}
	
	@Test
	public void testResolveExporters() throws CoreException {
		// perform some real testing now
		
		ExportersExtensionResolver resolver = new ExportersExtensionResolver();
		List<ExportersExtension> extensions = resolver.resolveExtensions();
		
		assertEquals("Number of extensions is expected to be 1", 1, extensions.size());
		
		ExportersExtension extension = extensions.get(0);
		assertEquals("Number of exporters is expected to be 2", 2, extension.getExporters().size());
		
	
	}

}
