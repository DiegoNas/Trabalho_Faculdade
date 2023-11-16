
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO2 {
	// Parametros de conexão

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/dbloja?useTimezone=true&serverTimezone=UTC";

	private String user = "root";
	private String password = "Estudos@123";

	// Metodo de conexão//

	private Connection conectar() {

		Connection con = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;

		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

	}

//**Criar o CRUD**//

	public void novointeresse(JavaBeans contato) {
		String create = "insert into dbloja.tbinterese (nome,fone) values (?,?)";

		try {

			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(create);
			pst.setString(1, contato.getcliente());
			pst.setString(2, contato.getfone());

			pst.executeUpdate();

			con.close();

		} catch (Exception e) {

			System.out.println(e);

		}

	}

	/** CRUD READ **/

	public ArrayList <JavaBeans2> listarinteresse() {
		ArrayList<JavaBeans2> contatos2 = new ArrayList<>();
		String read = "Select nome,fone,cast(dataCadastro as date) as 'data cadastro' from dbloja.tbinterese";
		
		try {

			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {	
				
				String nome = rs.getString(1);
				String fone = rs.getString(2);
				String datacadastro = rs.getString(3);
				
				//Armazenando dados no ArrayList
				
				contatos2.add(new JavaBeans2(nome,fone, datacadastro));
				
			}	
			
			con.close();
			return contatos2;

		} catch (Exception e) {
			return null;
	}
			

}	



/** CRUD READ 0611 **/

public ArrayList <JavaBeans3> listaruser() {
	ArrayList<JavaBeans3> contatos3 = new ArrayList<>();
	String read = "Select id,login,nome,datanascimento as 'Data Nascimento' from dbloja.tbusuarios";
	
	try {

		Connection con = conectar();
		PreparedStatement pst = con.prepareStatement(read);
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {	
			
			String id = rs.getString(1);
			String login = rs.getString(2);
			String nome = rs.getString(3);
			String datanascimento = rs.getString(4);
			
			//Armazenando dados no ArrayList
			
			contatos3.add(new JavaBeans3(id,login,nome,datanascimento));
			
			
			
		}	
		
		con.close();
		return contatos3;

	} catch (Exception e) {
		return null;
}
		
	
	
}

	//DADOS PARA A ALTERAÇÃO DOS USUARIOS
public void selecionarusuario(JavaBeans3 contato3) {
	String read2 = "SELECT id,login,nome,datanascimento as 'Data Nascimento' FROM dbloja.tbusuarios where id = ?";

	try {

		Connection con = conectar();
		PreparedStatement pst = con.prepareStatement(read2);
		
		pst.setString(1,contato3.getid());
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {	
			
			contato3.setid(rs.getString(1));
			contato3.setlogin(rs.getString(2));
			contato3.setnome(rs.getString(3));
			contato3.setdatanascimento(rs.getString(4));
		
		}	
		con.close();

	} catch (Exception e) {

		System.out.println(e);

	}

}
		
		//alterar realmente os dados

	public void UP1CONTATO(JavaBeans3 contato3) {
		
		String creat = "UPDATE dbloja.tbusuarios SET  login = ?,nome = ?,datanascimento = ? where id =?";
		
		try {

			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(creat);
			
			pst.setString(1,contato3.getlogin());
			pst.setString(2,contato3.getnome());
			pst.setString(3,contato3.getdatanascimento());
			pst.setString(4,contato3.getid());
			pst.executeUpdate();

			con.close();

		} catch (Exception e) {

			System.out.println(e);
		
		}
		
	}

	
	public void deletarusuario(JavaBeans3 contato3) {
		
		String delete = "DELETE FROM dbloja.tbusuarios where id =?";
		
		try {

			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(delete);
			
			pst.setString(1,contato3.getid());
			pst.executeUpdate();

			con.close();

		} catch (Exception e) {

			System.out.println(e);
	
	
	
	
		}
		
	}
	
	





}
