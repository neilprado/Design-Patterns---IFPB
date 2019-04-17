package model;

public class GooglePresentationEditor implements PresentationEditor {

	@Override
	public void show() {
		System.out.println("Opening a Google Presentation Editor, hope you like it");
	}

	@Override
	public void close() {
		System.out.println("Closing a Google Presentation Editor, Thank you for the choice");

	}

	@Override
	public FileBuilder newFile(String name, String path) {
		return new FileBuilder(name, path);
	}

}
