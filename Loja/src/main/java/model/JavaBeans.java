
package model;

public class JavaBeans {
	
	

	private String login;
	private String senha;
	private String nome;
	private String datanascimento;
	private String cliente;
	private String fone;
	
	
	private String marca;
	private String modelo;
	private String anoFabricacao;
	private String anoModelo;
	private String valor;
	private String descricao;

	
	public JavaBeans() {
		super();
		
	}
	
	public JavaBeans(String login, String senha, String nome, String datanascimento ,String cliente , String fone,
					 String marca,	String modelo,String anoFabricacao,String anoModelo,String valor,String descricao) {
		super();
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.datanascimento = datanascimento;
		this.nome = cliente;
		this.nome = fone;
		
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.valor = valor;
		this.descricao = descricao;
			
	}

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDatanascimento() {
		return datanascimento;
	}
	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
		
	}
	public String getcliente() {
		return cliente;
	}
	public void setcliente(String cliente) {
		this.cliente = cliente;
		
		
	}
	public String getfone() {
		return fone;
	}
	public void setfone(String fone) {
		this.fone = fone;
		
		
	}
	public String getmarca() {
		return marca;
	}
	public void setmarca(String marca) {
		this.marca = marca;
		
	}
	public String getmodelo() {
		return modelo;
	}
	public void setmodelo(String modelo) {
		this.modelo = modelo;
	
	}
	public String getanoFabricacao() {
		return anoFabricacao;
	}
	public void setanoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	
	}
	public String getanoModelo() {
		return anoModelo;
	}
	public void setanoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	
	}
	public String getvalor() {
		return valor;
	}
	public void setvalor(String valor) {
		this.valor = valor;
	
	}
	public String getdescricao() {
		return descricao;
	}
	public void setdescricao(String descricao) {
		this.descricao = descricao;
		

	}

	
}
