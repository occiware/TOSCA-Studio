package de.ugoe.cs.rwm.docci.ui.actions;

import java.nio.file.Paths;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.cmf.occi.core.util.OcciRegistry;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import de.ugoe.cs.rwm.cocci.Comparator;
import de.ugoe.cs.rwm.docci.Deployer;
import de.ugoe.cs.rwm.docci.appdeployer.MartAppDeployerMaster;
import de.ugoe.cs.rwm.docci.appdeployer.MartAppDeployerSlave;
import de.ugoe.cs.rwm.docci.connector.Connector;
import de.ugoe.cs.rwm.docci.deprovisioner.Deprovisioner;
import de.ugoe.cs.rwm.docci.executor.Executor;
import de.ugoe.cs.rwm.docci.extractor.Extractor;
import de.ugoe.cs.rwm.docci.provisioner.Provisioner;
import de.ugoe.cs.rwm.docci.ui.wizard.DocciWizard;

public class OCCI2DeploymentAction implements IObjectActionDelegate {

	private Shell shell;
	private ISelection selection;

	@Override
	public void run(IAction action) {
		loggerSettings();

		IFile selectedFile = (IFile) ((IStructuredSelection) selection).getFirstElement();
		java.net.URI uri = selectedFile.getLocationURI();
		java.nio.file.Path path = Paths.get(uri);

		WizardDialog dialog = new WizardDialog(shell, new DocciWizard(path));
		dialog.open();

	}

	private void loggerSettings() {
		org.eclipse.cmf.occi.mart.MART.initMART();
		System.out.println();
		System.out.println(OcciRegistry.getInstance().getRegisteredExtensions());
		Logger.getLogger(Executor.class.getName()).setLevel(Level.INFO);
		Logger.getLogger(Extractor.class.getName()).setLevel(Level.INFO);
		Logger.getLogger(Provisioner.class.getName()).setLevel(Level.INFO);
		Logger.getLogger(Comparator.class.getName()).setLevel(Level.INFO);
		Logger.getLogger(Deprovisioner.class.getName()).setLevel(Level.INFO);
		Logger.getLogger(Connector.class.getName()).setLevel(Level.INFO);
		Logger.getLogger(Deployer.class.getName()).setLevel(Level.INFO);
		Logger.getLogger(MartAppDeployerMaster.class.getName()).setLevel(Level.INFO);
		Logger.getLogger(MartAppDeployerSlave.class.getName()).setLevel(Level.INFO);

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;

	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.shell = targetPart.getSite().getShell();

	}

}