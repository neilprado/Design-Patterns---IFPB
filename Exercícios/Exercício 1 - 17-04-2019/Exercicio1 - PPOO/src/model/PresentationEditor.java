package model;

public interface PresentationEditor {
	public void show();
	public void close();
	public FileBuilder newFile(String name, String path);
}
