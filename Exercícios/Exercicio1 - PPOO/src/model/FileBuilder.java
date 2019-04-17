package model;

public class FileBuilder implements Builder<File> {
	private String nome, path, email, date, time, owner;
	private boolean print, copy;
	
	public FileBuilder(String name, String path) {
		this.nome = name;
		this.path = path;
	}
	
	public FileBuilder owner(String owner) {
		this.owner = owner;
		return this;
	}
	
	public FileBuilder email(String email) {
		this.email = email;
		return this;
	}
	
	public FileBuilder date (String date) {
		this.date = date;
		return this;
	}
	
	public FileBuilder time(String time) {
		this.time = time;
		return this;
	}
	
	public FileBuilder print(boolean print) {
		this.print = print;
		return this;
	}
	
	public FileBuilder copy (boolean copy) {
		this.copy = copy;
		return this;
	}
	@Override
	public File create() {
		File f = new File();
		f.setCopy(this.copy);
		f.setDate(this.date);
		f.setEmail(this.email);
		f.setNome(this.nome);
		f.setOwner(this.owner);
		f.setPath(this.path);
		f.setPrint(this.print);
		f.setTime(this.time);
		return f;
	}

}
