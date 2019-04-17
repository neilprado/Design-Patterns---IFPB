package model;

public class LibreSuiteFactory implements Suite {

	@Override
	public TextEditor createTextEditor() {
		return new LibreTextEditor();
	}

	@Override
	public SheetEditor createSheetEditor() {
		return new LibreSheetEditor();
	}

	@Override
	public PresentationEditor createPresentationEditor() {
		return new LibrePresentationEditor();
	}

}
