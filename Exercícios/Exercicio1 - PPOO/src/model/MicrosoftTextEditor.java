package model;

public class MicrosoftTextEditor implements TextEditor {

	@Override
	public void show() {
		System.out.println("Opening a Microsoft Text Editor, hope you like it");

	}

	@Override
	public void close() {
		System.out.println("Closing a Microsoft Text Editor, Thank you for the choice");

	}

	@Override
	public FileBuilder newFile(String name, String path) {
		return new FileBuilder(name, path);
	}

}
