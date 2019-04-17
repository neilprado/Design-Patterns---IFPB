package model;

public interface TextEditor {
	public void show();
	public void close();
	public FileBuilder newFile(String name, String path);
}
