package model;

public interface SheetEditor {
	public void show();
	public void close();
	public FileBuilder newFile(String name, String path);
}
