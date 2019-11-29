package de.ugoe.cs.rwm.docci.ui.wizard.tocci;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.jface.wizard.Wizard;

import de.ugoe.cs.rwm.docci.ModelUtility;
import de.ugoe.cs.rwm.tocci.Transformator;
import de.ugoe.cs.rwm.tocci.TransformatorFactory;
import de.ugoe.cs.rwm.tocci.occi2openstack.OCCI2OPENSTACKTransformator;

public class TocciWizard extends Wizard {

	protected OCCI2OpenstackSettings one;
	protected Path selectedPath;
	protected String manNWRuntimeId;
	protected String sshKey;
	protected String userData;
	protected String manNWid;
	protected String flavor;
	protected String image;
	protected String remoteUser;

	public TocciWizard(Path path) {
		super();
		this.selectedPath = path;
		setNeedsProgressMonitor(true);
	}

	@Override
	public String getWindowTitle() {
		return "OCCI2Openstack Transformation Configuration";
	}

	@Override
	public void addPages() {
		one = new OCCI2OpenstackSettings();
		addPage(one);
	}

	@Override
	public boolean performFinish() {
		System.out.println("Transformation process started");

		File copied = duplicateSelectedModel(selectedPath);
		System.out.println("Copied File to: " + copied);
		updateWorkspace();
		transformModel(copied);
		System.out.println("Transformation process finished");

		return true;
	}

	private void transformModel(File copied) {
		performOCCI2OCCITransformation(copied);
		performOCCI2OpenstackTransformation(copied);
	}

	private void performOCCI2OpenstackTransformation(File copied) {
		Resource model = ModelUtility.loadOCCIintoEMFResource(copied.toPath());
		try {
			System.out.println("OCCI2Openstack start");
			OCCI2OPENSTACKTransformator trans2 = new OCCI2OPENSTACKTransformator();
			trans2.setTransformationProperties(one.getManNWRuntimeId(), one.getSshKey(), one.getUserData(),
					one.getManNWid(), one.getDefaultFlavor(), one.getDefaultImage(), one.getRemoteUser());
			trans2.transform(model, copied.toPath());
			System.out.println("OCCI2Openstack finish");
		} catch (EolRuntimeException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void performOCCI2OCCITransformation(File copied) {
		Resource model = ModelUtility.loadOCCIintoEMFResource(copied.toPath());
		try {
			Transformator trans = TransformatorFactory.getTransformator("OCCI2OCCI");
			System.out.println("OCCI2OCCI start");
			trans.transform(model, copied.toPath());
			System.out.println("OCCI2OCCI finish");

		} catch (EolRuntimeException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private File duplicateSelectedModel(Path selectedPath) {
		Resource workflowModel = ModelUtility.loadOCCIintoEMFResource(selectedPath);

		System.out.println("Chosen Model: " + workflowModel.getContents());
		System.out.println("Chosen Model: " + workflowModel.getContents().get(0).eContents());

		System.out.println(selectedPath.getFileName());

		File source = new File(selectedPath.toString());

		//File copied = new File(selectedPath.toString().replaceAll(".occic", "_PSM.occic"));
		File copied = createPSMFile(selectedPath);


		try {
			copyFileUsingStream(source, copied);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return copied;
	}

	private File createPSMFile(Path selectedPath) {
		File copied = null;
		String extension = getExtension(selectedPath);
		System.out.println(extension);
		if(extension != "") {
			copied = new File(selectedPath.toString().replaceAll(extension, "_PSM" + extension));
		}
		return copied;
	}

	private String getExtension(Path path) {
		String extension = "";

		int i = path.toString().lastIndexOf('.');
		if (i > 0) {
		    extension = path.toString().substring(i);
		}
		return extension;
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

	private static void copyFileUsingStream(File source, File dest) throws IOException {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(source);
			os = new FileOutputStream(dest);
			byte[] buffer = new byte[1024];
			int length;
			while ((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}
		} finally {
			is.close();
			os.close();
		}
	}
}
