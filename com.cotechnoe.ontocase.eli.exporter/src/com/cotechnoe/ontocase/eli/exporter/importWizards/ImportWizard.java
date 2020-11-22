package com.cotechnoe.ontocase.eli.exporter.importWizards;

import java.io.File;
import java.io.FileOutputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;

import com.cotechnoe.ontocase.eli.gowl2owl.ImportOwlFileHelper;

public class ImportWizard extends Wizard implements IImportWizard {

	ImportWizardPage mainPage;

	public ImportWizard() {
		super();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	public boolean performFinish() {
		//		IFile file = mainPage.createNewFile();
		//       if (file == null)
		//          return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		Object resource = selection.getFirstElement();
		if (resource instanceof org.eclipse.core.internal.resources.Project) {
			File file = ((org.eclipse.core.internal.resources.Project)resource).getRawLocation().toFile();
			//			editor.setFilterPath((File)file);
		} else if (resource instanceof org.eclipse.core.internal.resources.File) {
			org.eclipse.core.internal.resources.File theFile = (org.eclipse.core.internal.resources.File)resource;
			File thePath = theFile.getLocation().removeLastSegments(1).toFile();
			String theFileName = theFile.getLocation().lastSegment();
			String theOutputFileName = theFile.getLocation().removeFileExtension().lastSegment()+".gowl";
			System.out.print("Import "+thePath+"/"+theFileName 
					+" to "+ thePath+"/"+theOutputFileName) ;

			try {
				ImportOwlFileHelper importOwlFileHelper = new ImportOwlFileHelper(thePath+"/"+theFileName, thePath+"/"+theOutputFileName);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		//		setWindowTitle("Ontology Import Wizard"); //NON-NLS-1
		//		setNeedsProgressMonitor(true);
		//		mainPage = new ImportWizardPage("Import Ontology File",selection); //NON-NLS-1
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.IWizard#addPages()
	 */
	public void addPages() {
		super.addPages(); 
		//       addPage(mainPage);        
	}

}
