package model;

public interface Suite {
	public TextEditor createTextEditor();
	public SheetEditor createSheetEditor();
	public PresentationEditor createPresentationEditor();
}
