package de.ugoe.cs.rwm.docci.ui.wizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class OCCIConnectionSettings extends WizardPage {
	private Text address;
	private Text port;
	private Text user;
	private Composite container;

	public OCCIConnectionSettings() {
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

		Label addressLabel = new Label(container, SWT.NONE);
		addressLabel.setText("OCCI API Address:");
		address = new Text(container, SWT.BORDER | SWT.SINGLE);
		address.setText("localhost");
		/*
		 * address.addKeyListener(new KeyListener() {
		 *
		 * @Override public void keyPressed(KeyEvent e) { }
		 *
		 * @Override public void keyReleased(KeyEvent e) { if
		 * (!address.getText().isEmpty()) { setPageComplete(true);
		 *
		 * } } });
		 */

		Label portLabel = new Label(container, SWT.NONE);
		portLabel.setText("OCCI API Port:");
		port = new Text(container, SWT.BORDER | SWT.SINGLE);
		port.setText("8080");

		Label userLabel = new Label(container, SWT.NONE);
		userLabel.setText("OCCI API User:");
		user = new Text(container, SWT.BORDER | SWT.SINGLE);
		user.setText("ubuntu");

		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		address.setLayoutData(gd);
		port.setLayoutData(gd);
		user.setLayoutData(gd);
		// required to avoid an error in the system
		setControl(container);
		setPageComplete(true);

	}

	public String getAddress() {
		return address.getText();
	}

	public String getPort() {
		return port.getText();
	}

	public String getUser() {
		return user.getText();
	}
}