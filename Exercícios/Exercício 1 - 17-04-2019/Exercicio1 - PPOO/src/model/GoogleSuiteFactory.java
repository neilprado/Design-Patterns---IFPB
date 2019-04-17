package model;

public class GoogleSuiteFactory implements Suite {

	@Override
	public TextEditor createTextEditor() {
		return new GoogleTextEditor();
	}

	@Override
	public SheetEditor createSheetEditor() {
		return new GoogleSheetEditor();
	}

	@Override
	public PresentationEditor createPresentationEditor() {
		return new GooglePresentationEditor();
	}

}
