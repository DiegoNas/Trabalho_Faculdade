
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;




public class UsuarioDAO2 {
	// Parametros de conexão 
	
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/dbloja?useTimezone=true&serverTimezone=UTC";
	
	private String user = "root";
	private String password ="Estudos@123";
	
	//Metodo de conexão//
	
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
		/** CRUD READ **/

	public Usuario autenticacaosenha(Usuario usuario) {
		Usuario usuRetorno = null;
		String sql = "SELECT * FROM dbloja.tbusuarios where login =? and datanascimento =?";
			
		try {

			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(sql);
				
			pst.setString(1, usuario.getLogin());
			pst.setString(2, usuario.getSenha());
			
				
			ResultSet resultado = pst.executeQuery();
			
			if (resultado.next()) {
					
				usuRetorno = new Usuario();
					
				usuRetorno.setLogin(resultado.getString("login"));
				usuRetorno.setSenha(resultado.getString("senha"));
				System.out.println(usuRetorno);

			}
			System.out.println("Encontrado com sucesso!");
			
			
		} catch (Exception e) {
			
		  System.out.println("Erro na Senha ou no Usuarioxxxxxxx!"); 
		  System.out.println(usuRetorno);
	 	}	
			return usuRetorno;
			
	}	
	

}
	
	
	
	
	
	
	
	
	
	



	
	
	
	
	
	
	
	