package de.ugoe.cs.rwm.docci.ui.wizard.tocci;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class OCCI2OpenstackSettings extends WizardPage {
	private Text manNWRuntimeId;
	private Text userData;
	private Text sshKey;
	private Text manNWid;
	private Text flavor;
	private Text image;
	private Text remoteUser;
	private Composite container;

	public OCCI2OpenstackSettings() {
		super("OCCI API Connection Settings");
		setTitle("OCCI API Connection Settings");
		setDescription("OCCI API Connection Settings");
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;

		Label manNWidLabel = new Label(container, SWT.NONE);
		manNWidLabel.setText("Management Network Id:");
		manNWid = new Text(container, SWT.BORDER | SWT.SINGLE);
		manNWid.setText("urn:uuid:29d78078-fb4c-47aa-a9af-b8aaf3339590");

		Label manNWRuntimeIdLabel = new Label(container, SWT.NONE);
		manNWRuntimeIdLabel.setText("Management Network Runtime Id:");
		manNWRuntimeId = new Text(container, SWT.BORDER | SWT.SINGLE);
		manNWRuntimeId.setText("75a4639e-9ce7-4058-b859-8a711b0e2e7b");

		Label sshKeyLabel = new Label(container, SWT.NONE);
		sshKeyLabel.setText("Default SSH Key:");
		sshKey = new Text(container, SWT.BORDER | SWT.SINGLE);
		sshKey.setText(
				"ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQC6H7Ydi45BTHid4qNppGAi5mzjbnZgt7bi6xLGmZG9CiLmhMsxOuk3Z05Nn+pmoN98qS0eY8S240PPk5VOlYqBY0vdRAwrZSHHaLdMp6I7ARNrI2KraYduweqz7ZQxPXQfwIeYx2HKQxEF2r+4//Fo4WfgdBkLuulvl/Gw3TUzJNQHvgpaiNo9+PI5CZydHnZbjUkRikS12pT+CbNKj+0QKeQztbCd41aKxDv5H0DjltVRcpPppv4dmiU/zoCAIngWLO1PPgfYWyze8Z9IoyBT7Qdg30U91TYZBuxzXR5lq7Fh64y/IZ/SjdOdSIvIuDjtmJDULRdLJzrvubrKY+YH Generated-by-Nova");

		Label userDataLabel = new Label(container, SWT.NONE);
		userDataLabel.setText("Default User Data:");
		userData = new Text(container, SWT.BORDER | SWT.SINGLE);
		userData.setText(
				"I2Nsb3VkLWNvbmZpZwoKIyBVcGdyYWRlIHRoZSBpbnN0YW5jZSBvbiBmaXJzdCBib290CiMgKGllIHJ1biBhcHQtZ2V0IHVwZ3JhZGUpCiMKIyBEZWZhdWx0OiBmYWxzZQojIEFsaWFzZXM6IGFwdF91cGdyYWRlCnBhY2thZ2VfdXBncmFkZTogdHJ1ZQoKcGFja2FnZXM6CiAtIHB5dGhvbgoKd3JpdGVfZmlsZXM6CiAgLSBwYXRoOiAvZXRjL25ldHdvcmsvaW50ZXJmYWNlcy5kLzUwLWNsb3VkLWluaXQuY2ZnCiAgICBjb250ZW50OiB8CiAgICAgIGF1dG8gbG8KICAgICAgaWZhY2UgbG8gaW5ldCBsb29wYmFjawogICAgICAKICAgICAgYXV0byBlbnMwCiAgICAgIGFsbG93LWhvdHBsdWcgZW5zMAogICAgICBpZmFjZSBlbnMwIGluZXQgZGhjcAogICAgICAKICAgICAgYXV0byBlbnMxCiAgICAgIGFsbG93LWhvdHBsdWcgZW5zMQogICAgICBpZmFjZSBlbnMxIGluZXQgZGhjcAogICAgICAKICAgICAgYXV0byBlbnMyCiAgICAgIGFsbG93LWhvdHBsdWcgZW5zMgogICAgICBpZmFjZSBlbnMyIGluZXQgZGhjcAogICAgICAKICAgICAgYXV0byBlbnMzCiAgICAgIGFsbG93LWhvdHBsdWcgZW5zMwogICAgICBpZmFjZSBlbnMzIGluZXQgZGhjcAogICAgICAKICAgICAgYXV0byBlbnM0CiAgICAgIGFsbG93LWhvdHBsdWcgZW5zNAogICAgICBpZmFjZSBlbnM0IGluZXQgZGhjcAogICAgICAKICAgICAgYXV0byBlbnM1CiAgICAgIGFsbG93LWhvdHBsdWcgZW5zNQogICAgICBpZmFjZSBlbnM1IGluZXQgZGhjcAogICAgICAKICAgICAgYXV0byBlbnM2CiAgICAgIGFsbG93LWhvdHBsdWcgZW5zNgogICAgICBpZmFjZSBlbnM2IGluZXQgZGhjcAogICAgICAKICAgICAgYXV0byBlbnM3CiAgICAgIGFsbG93LWhvdHBsdWcgZW5zNwogICAgICBpZmFjZSBlbnM3IGluZXQgZGhjcAogICAgICAKICAgICAgYXV0byBlbnM4CiAgICAgIGFsbG93LWhvdHBsdWcgZW5zOAogICAgICBpZmFjZSBlbnM4IGluZXQgZGhjcAogICAgICAKICAgICAgYXV0byBlbnM5CiAgICAgIGFsbG93LWhvdHBsdWcgZW5zOQogICAgICBpZmFjZSBlbnM5IGluZXQgZGhjcAogICAgICAKICAgICAgYXV0byBlbnMxMAogICAgICBhbGxvdy1ob3RwbHVnIGVuczEwCiAgICAgIGlmYWNlIGVuczEwIGluZXQgZGhjcAoKIyMj");

		Label flavorLabel = new Label(container, SWT.NONE);
		flavorLabel.setText("Default Flavor Id:");
		flavor = new Text(container, SWT.BORDER | SWT.SINGLE);
		flavor.setText("");

		Label imageLabel = new Label(container, SWT.NONE);
		imageLabel.setText("Default Image Id:");
		image = new Text(container, SWT.BORDER | SWT.SINGLE);
		image.setText("e7a211eb-d1dc-4e3a-8da6-f9daabdb81c8");

		Label remoteUserLabel = new Label(container, SWT.NONE);
		remoteUserLabel.setText("Default Remote User:");
		remoteUser = new Text(container, SWT.BORDER | SWT.SINGLE);
		remoteUser.setText("ubuntu");

		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		manNWid.setLayoutData(gd);
		manNWRuntimeId.setLayoutData(gd);
		sshKey.setLayoutData(gd);
		userData.setLayoutData(gd);
		flavor.setLayoutData(gd);
		image.setLayoutData(gd);
		// required to avoid an error in the system
		setControl(container);
		setPageComplete(true);

	}

	public String getManNWRuntimeId() {
		return manNWRuntimeId.getText();
	}

	public String getUserData() {
		return userData.getText();
	}

	public String getSshKey() {
		return sshKey.getText();
	}

	public String getManNWid() {
		return manNWid.getText();
	}

	public String getDefaultFlavor() {
		return flavor.getText();
	}

	public String getDefaultImage() {
		return image.getText();
	}

	public String getRemoteUser() {
		return remoteUser.getText();
	}

}