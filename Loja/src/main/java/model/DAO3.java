
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;




public class DAO3 {
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
	
//**Criar o CRUD**//

	public void cadastro(JavaBeans contato) {
		String create = "insert into dbloja.tbcarros(marca,modelo,anoFabricacao,anoModelo,valor,descricao) values (?,?,?,?,?,?)";
		
		try {
			
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(create);
			
			pst.setString(1, contato.getmarca());
			pst.setString(2, contato.getmodelo());
			pst.setString(3, contato.getanoFabricacao());
			pst.setString(4, contato.getanoModelo());
			pst.setString(5, contato.getvalor());
			pst.setString(6, contato.getdescricao());

			pst.executeUpdate();
			
			con.close();
			
		}catch (Exception e){
			
			System.out.println(e);
			
			
			
		}
		
			
	}
	

/** CRUD READ 0611 **/

public ArrayList <JavaBeans4> listarcar() {
	ArrayList<JavaBeans4> contatos4 = new ArrayList<>();
	String read = "SELECT id,marca,modelo,anoFabricacao,anoModelo,valor, descricao FROM dbloja.tbcarros";
	
	try {

		Connection con = conectar();
		PreparedStatement pst = con.prepareStatement(read);
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {	
			
			String id = rs.getString(1) ;
			String marca = rs.getString(2);
			String modelo = rs.getString(3);
			String anoFabricacao = rs.getString(4);
			String anoModelo = rs.getString(5);
			String valor = rs.getString(6);
			String descricao = rs.getString(7);
			
			//Armazenando dados no ArrayList
			
			contatos4.add(new JavaBeans4(id,marca,modelo,anoFabricacao,anoModelo,valor,descricao));
			
			
			
		}	
		
		con.close();
		return contatos4;

	} catch (Exception e) {
		return null;

	}
	
	
}

//DADOS PARA A ALTERAÇÃO DOS CARROS
public void selecionarcarro(JavaBeans4 contato4) {
String read2 = "SELECT id,marca,modelo,anoFabricacao,anoModelo,valor, descricao FROM dbloja.tbcarros where id = ?";

try {

	Connection con = conectar();
	PreparedStatement pst = con.prepareStatement(read2);
	
	pst.setString(1,contato4.getid());
	ResultSet rs = pst.executeQuery();
	while (rs.next()) {	
		
		contato4.setid(rs.getString(1));
		contato4.setmarca(rs.getString(2));
		contato4.setmodelo(rs.getString(3));
		contato4.setanofabricacao(rs.getString(4));
		contato4.setanomodelo(rs.getString(5));
		contato4.setvalor(rs.getString(6));
		contato4.setdescricao(rs.getString(7));
	
	}	
	con.close();

} catch (Exception e) {

	System.out.println(e);

}

}
//alterar realmente os dados

public void UP2carros(JavaBeans4 contato4) {

String creat = "UPDATE dbloja.tbcarros SET marca = ?,modelo = ?,anoFabricacao = ?,anoModelo = ? ,valor = ?, descricao = ? where ID = ?";

try {

	Connection con = conectar();
	PreparedStatement pst = con.prepareStatement(creat);
	
	pst.setString(1,contato4.getmarca());
	pst.setString(2,contato4.getmodelo());
	pst.setString(3,contato4.getanofabricacao());
	pst.setString(4,contato4.getanomodelo());
	pst.setString(5,contato4.getvalor());
	pst.setString(6,contato4.getdescricao());
	pst.setString(6,contato4.getdescricao());
	pst.setString(7,contato4.getid());
	pst.executeUpdate();

	con.close();

} catch (Exception e) {

	System.out.println(e);

}

}


public void deletarcarro(JavaBeans4 contato4) {
	
	String delete = "DELETE FROM dbloja.tbcarros where id =?";
	
	try {

		Connection con = conectar();
		PreparedStatement pst = con.prepareStatement(delete);
		
		pst.setString(1,contato4.getid());
		pst.executeUpdate();

		con.close();

	} catch (Exception e) {

		System.out.println(e);




	}
	
}












}
	
	



	
	
	
	
	
	
	
	
	
	
	
	



	
	
	
	
	
	
	
	