package com.cotechnoe.ontocase.eli.exporter.importWizards;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;


public class ImportWizardPage extends WizardNewFileCreationPage {
	
	protected FileFieldEditor editor;
	private IStructuredSelection selection;

	public ImportWizardPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
		this.selection = selection;
		setTitle(pageName); //NON-NLS-1
		setDescription("Import a file from the local file system into the workspace"); //NON-NLS-1
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#createAdvancedControls(org.eclipse.swt.widgets.Composite)
	 */	
	protected void createAdvancedControls(Composite parent) {
		Composite fileSelectionArea = new Composite(parent, SWT.NONE);
		GridData fileSelectionData = new GridData(GridData.GRAB_HORIZONTAL
				| GridData.FILL_HORIZONTAL);
		fileSelectionArea.setLayoutData(fileSelectionData);

		GridLayout fileSelectionLayout = new GridLayout();
		fileSelectionLayout.numColumns = 3;
		fileSelectionLayout.makeColumnsEqualWidth = false;
		fileSelectionLayout.marginWidth = 0;
		fileSelectionLayout.marginHeight = 0;
		fileSelectionArea.setLayout(fileSelectionLayout);
		
		editor = new FileFieldEditor("fileSelect","Select File: ",fileSelectionArea); //NON-NLS-1 //NON-NLS-2
		editor.getTextControl(fileSelectionArea).addModifyListener(e -> {
			IPath path = new Path(ImportWizardPage.this.editor.getStringValue());
			setFileName(path.lastSegment());
		});
		String[] extensions = new String[] { "*.ttl;*.n3;*.rdf;*.owl" }; //NON-NLS-1
		Object resource = selection.getFirstElement();
		if (resource instanceof org.eclipse.core.internal.resources.Project) {
			File file = ((org.eclipse.core.internal.resources.Project)resource).getRawLocation().toFile();
			editor.setFilterPath((File)file);
		} else if (resource instanceof org.eclipse.core.internal.resources.File) {
			org.eclipse.core.internal.resources.File theFile = (org.eclipse.core.internal.resources.File)resource;
			File thePath = theFile.getLocation().removeLastSegments(1).toFile();
			String theFileName = theFile.getLocation().lastSegment();
			String theOutputFileName = theFile.getLocation().removeFileExtension().lastSegment();
			editor.setFilterPath( thePath);
//			editor.setStringValue(theOutputFileName+".gowl");
//			editor.set
		}

		editor.setFileExtensions(extensions);
		fileSelectionArea.moveAbove(null);

	}
	
	 /* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#createLinkTarget()
	 */
	protected void createLinkTarget() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#getInitialContents()
	 */
	protected InputStream getInitialContents() {
		try {
			return new FileInputStream(new File(editor.getStringValue()));
		} catch (FileNotFoundException e) {
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#getNewFileLabel()
	 */
	protected String getNewFileLabel() {
		return "New File Name:"; //NON-NLS-1
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#validateLinkedResource()
	 */
	protected IStatus validateLinkedResource() {
		return new Status(IStatus.OK, "com.cotechnoe.ontocase.eli.exporter", IStatus.OK, "", null); //NON-NLS-1 //NON-NLS-2
	}
}
