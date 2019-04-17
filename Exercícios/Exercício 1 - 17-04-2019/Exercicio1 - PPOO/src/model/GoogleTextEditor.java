package model;

public class GoogleTextEditor implements TextEditor {

	@Override
	public void show() {
		System.out.println("Opening a Google Text Editor, hope you like it");

	}

	@Override
	public void close() {
		System.out.println("Closing a Google Text Editor, Thank you for the choice");

	}

	@Override
	public FileBuilder newFile(String name, String path) {
		return new FileBuilder(name, path);
	}

}
