
package model;

public class JavaBeans2 {
	
	

	private String nomeinterese;
	private String foneinterese;
	private String datacadastrointerese;
	
	public JavaBeans2() {
		super();
		
	}
	
	public JavaBeans2(String nomeinterese, String foneinterese, String datacadastrointerese) {
		super();
		this.nomeinterese = nomeinterese;
		this.foneinterese = foneinterese;
		this.datacadastrointerese = datacadastrointerese;

	}

	public String getnomeinterese() {
		return nomeinterese;
	}
	public void setnomeinterese(String nomeinterese) {
		this.nomeinterese = nomeinterese;
	}
	public String getfoneinterese() {
		return foneinterese;
	}
	public void setfoneinterese(String foneinterese) {
		this.foneinterese = foneinterese;
	}
	public String getdatacadastrointerese() {
		return datacadastrointerese;
	}
	public void setdatacadastrointerese(String datacadastrointerese) {
		this.datacadastrointerese = datacadastrointerese;
	

	}

	
}
