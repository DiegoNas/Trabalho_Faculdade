
package model;

public class JavaBeans3 {
	
	
	private String id;
	private String login;
	private String nome;
	private String datanascimento;
	
	public JavaBeans3() {
		super();
		
	}
	
	public JavaBeans3(String id,String login, String nome, String datanascimento) {
		super();
		
		this.id = id;
		this.login = login;
		this.nome = nome;
		this.datanascimento = datanascimento;

	}

	public String getid() {
		return id;
	}
	public void setid(String id) {
		this.id = id;
	}
	public String getlogin() {
		return login;
	}
	public void setlogin(String login) {
		this.login = login;
	}
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
		
	}
	public String getdatanascimento() {
		return datanascimento;
	}
	public void setdatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	

	}

	
}
