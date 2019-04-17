package model;

public class File implements Cloneable {
	private String nome, path, email, date, time, owner;
	private boolean print, copy = false;
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setPrint(boolean print) {
		this.print = print;
	}
	public void setCopy(boolean copy) {
		this.copy = copy;
	}
	@Override
	public String toString() {
		return "File [nome=" + nome + ", path=" + path + ", email=" + email + ", date=" + date + ", time=" + time
				+ ", owner=" + owner + ", print=" + print + ", copy=" + copy + "]";
	}
	
	public File getClone() {
		try {
			if(this.copy == true)
				return (File) super.clone();
			else
				System.out.println("You are not auth to clone");
		}catch(CloneNotSupportedException e) {
			System.out.println("Not allowed to cloning");
		}
		return this;
	}
}
