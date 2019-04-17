package model;

public class MicrosoftSuiteFactory implements Suite {

	@Override
	public TextEditor createTextEditor() {
		return new MicrosoftTextEditor();
	}

	@Override
	public SheetEditor createSheetEditor() {
		return new MicrosoftSheetEditor();
	}

	@Override
	public PresentationEditor createPresentationEditor() {
		return new MicrosoftPresentationEditor();
	}

}
