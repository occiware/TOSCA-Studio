package de.ugoe.cs.rwm.docci.ui.wizard;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.events.SelectionEvent;

import de.ugoe.cs.rwm.cocci.Comparator;
import de.ugoe.cs.rwm.cocci.ComparatorFactory;
import de.ugoe.cs.rwm.docci.MartDeployer;
import de.ugoe.cs.rwm.docci.ModelUtility;
import de.ugoe.cs.rwm.docci.connector.Connector;
import de.ugoe.cs.rwm.docci.connector.LocalhostConnector;

public class DocciWizard extends Wizard {

	protected OCCIConnectionSettings one;
	protected Path selectedPath;
	private static final Path RUNTIMEPATH = Paths.get(System.getProperty("user.home") + "/.rwm/runtime.occic");
	private Path localRuntimePath;
	// protected MyPageTwo two;

	public DocciWizard(Path path) {
		super();
		this.selectedPath = path;
		this.localRuntimePath = Paths.get(selectedPath.getParent() + "/runtime.occic");
		setNeedsProgressMonitor(true);
        BasicConfigurator.configure();
	}

	@Override
	public String getWindowTitle() {
		return "DOCCI OCCI Orchestration Process Configuration";
	}

	@Override
	public void addPages() {
		one = new OCCIConnectionSettings();
		// two = new MyPageTwo();
		addPage(one);
		// addPage(two);
	}

	@Override
	public boolean performFinish() {
		MartDeployer deployer = new MartDeployer(getConnector());
		try {
			getContainer().run(true, true, new IRunnableWithProgress() {
			      public void run(IProgressMonitor monitor) {
			         
			    	  SubMonitor subMonitor = SubMonitor.convert(monitor, 100);
			    	  		subMonitor.setTaskName("Loading Model Instances");
			                Resource workflowModel = ModelUtility.loadOCCIintoEMFResource(selectedPath);
							
							 try {
								TimeUnit.SECONDS.sleep(2);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							subMonitor.worked(20);		
							 
							subMonitor.setTaskName("Deploying Chosen Model");
							deployer.deploy(workflowModel);
							subMonitor.worked(60);
							

							subMonitor.setTaskName("Downloading Runtime Model");
							copyRuntimeModelIntoWorkspace();
							try {
								TimeUnit.SECONDS.sleep(2);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							subMonitor.worked(80);
							updateWorkspace();
							
							 
							subMonitor.setTaskName("Comparing Chosen Model To Runtime");
							boolean success = equalsRuntime();
							 try {
									TimeUnit.SECONDS.sleep(2);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							subMonitor.worked(100);
							if(success) {
								System.out.println("Deployment Process Finished Successfully!");
							}

			      }
			      
			   });
		} catch (InvocationTargetException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		return true;
	}
	
	private boolean equalsRuntime() {
		org.eclipse.emf.ecore.resource.Resource desiredModel = ModelUtility.loadOCCIintoEMFResource(selectedPath);
		org.eclipse.emf.ecore.resource.Resource runtimeModel = ModelUtility.loadOCCIintoEMFResource(localRuntimePath);

		Comparator comp = ComparatorFactory.getComparator("Simple", desiredModel, runtimeModel);

		boolean assertion = true;
		System.out.println("MISSING ELEMENTS:");
		for (EObject obj : comp.getMissingElements()) {
			// Network check due to provider network
			if (obj.eClass().getName().equals("Network") == false) {

				System.out.println(obj);
				assertion = false;
			}

		}

		System.out.println("NEW ELEMENTS:");
		for (EObject obj : comp.getNewElements()) {
			// Network check due to provider network
			if (obj.eClass().getName().equals("Network") == false) {
				System.out.println(obj);
				assertion = false;
			}
		}
		return assertion;
	}


	private void copyRuntimeModelIntoWorkspace() {
		File run = RUNTIMEPATH.toFile();
		File tar = localRuntimePath.toFile();
		
		try {
			FileUtils.copyFile(run, tar);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void updateWorkspace() {
		for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
			try {
				project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private Connector getConnector() {
		Connector conn = new LocalhostConnector(one.getAddress(), Integer.parseInt(one.getPort()), one.getUser());
		return conn;
	}
}
