package model;

public class LibreTextEditor implements TextEditor {

	@Override
	public void show() {
		System.out.println("Opening a Libre Text Editor, hope you like it");

	}

	@Override
	public void close() {
		System.out.println("Closing a Libre Text Editor, Thank you for the choice");

	}

	@Override
	public FileBuilder newFile(String name, String path) {
		return new FileBuilder(name, path);
	}

}
