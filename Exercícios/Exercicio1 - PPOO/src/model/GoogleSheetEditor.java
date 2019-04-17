package model;

public class GoogleSheetEditor implements SheetEditor {

	@Override
	public void show() {
		System.out.println("Opening a Google Sheet Editor, hope you like it");

	}

	@Override
	public void close() {
		System.out.println("Closing a Google Sheet Editor, Thank you for the choice");

	}

	@Override
	public FileBuilder newFile(String name, String path) {
		return new FileBuilder(name, path);
	}

}
