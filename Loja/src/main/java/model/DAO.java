
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;





// TODO: Auto-generated Javadoc
/**
 * The Class DAO.
 */
public class DAO {
	// Parametros de conexão 
	
	/** The driver. */
	private String driver = "com.mysql.cj.jdbc.Driver";
	
	/** The url. */
	private String url = "jdbc:mysql://127.0.0.1:3306/dbloja?useTimezone=true&serverTimezone=UTC";
	
	/** The user. */
	private String user = "root";
	
	/** The password. */
	private String password ="Estudos@123";
	
	//Metodo de conexão//
	
	/**
	 * Conectar.
	 *
	 * @return the connection
	 */
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

	/**
 * Inserir contato.
 *
 * @param contato the contato
 */
public void inserirContato(JavaBeans contato) {
		String create = "insert into dbloja.tbusuarios(login,senha,nome,datanascimento) values (?,?,?,?)";
		
		try {
			
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(create);
			pst.setString(1, contato.getLogin());
			pst.setString(2, contato.getSenha());
			pst.setString(3, contato.getNome());
			pst.setString(4, contato.getDatanascimento());
			
			pst.executeUpdate();
			
			con.close();
			
		}catch (Exception e){
			
			System.out.println(e);
			
			
			
		}
	}
	
	/**
	 * Alterarsenha.
	 *
	 * @param contato the contato
	 */
	public void alterarsenha(JavaBeans contato) {
		String up = "UPDATE dbloja.tbusuarios set senha = ? where login = ? and datanascimento = ?";
		
		try {
			
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(up);
			pst.setString(3, contato.getDatanascimento());
			pst.setString(2, contato.getLogin());
			pst.setString(1, contato.getSenha());
			
			pst.executeUpdate();
			
			con.close();
			
		}catch (Exception e){
			
			System.out.println(e);
	
	
	
		}
		
	}
	
	

}



	
	
	
	
	
	
	
	
	
	
	
	



	
	
	
	
	
	
	
	