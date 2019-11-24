package de.ugoe.cs.rwm.docci.ui.actions;

import java.nio.file.Paths;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import de.ugoe.cs.rwm.docci.ui.wizard.tocci.TocciWizard;

public class PlatformSpecificTransformationAction implements IObjectActionDelegate {

	private Shell shell;
	private ISelection selection;

	@Override
	public void run(IAction action) {
		IFile selectedFile = (IFile) ((IStructuredSelection) selection).getFirstElement();
		java.net.URI uri = selectedFile.getLocationURI();
		java.nio.file.Path path = Paths.get(uri);

		WizardDialog dialog = new WizardDialog(shell, new TocciWizard(path));
		dialog.open();
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