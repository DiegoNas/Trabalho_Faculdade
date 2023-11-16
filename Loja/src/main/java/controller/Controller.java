package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import model.DAO;
import model.DAO2;
import model.DAO3;
import model.JavaBeans;

import model.JavaBeans2;
import model.JavaBeans3;
import model.JavaBeans4;





// TODO: Auto-generated Javadoc
/**
 * The Class Controller.
 */
@WebServlet(urlPatterns = {"/Controller","/main","/insert","/insert2","/insert3","/report","/update","/select","/visualizarusuario","/visualizarcar","/editar","/UP1","/deleteuser","/editar2","/UP2","/deletecarro"})
public class Controller extends HttpServlet {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
    /** The dao. */
    DAO dao = new DAO();
    
    /** The contato. */
    JavaBeans contato = new JavaBeans();
    
    /** The contatox. */
    JavaBeans2 contatox = new JavaBeans2();
    
    /** The contatoy. */
    JavaBeans3 contatoy = new JavaBeans3();
    
    /** The contatoz. */
    JavaBeans4 contatoz = new JavaBeans4();
    
    /** The dao 2. */
    DAO2 dao2 = new DAO2();
    
    /** The dao 3. */
    DAO3 dao3 = new DAO3();   

    
    /**
     * Instantiates a new controller.
     */
    public Controller() {
        super();
        
    }
    
    
    /**
     * Do get.
     *
     * @param request the request
     * @param response the response
     * @throws ServletException the servlet exception
     * @throws IOException Signals that an I/O exception has occurred.
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
        String action = request.getServletPath();
        //System.out.println(action);
       	if 	(action.equals("/main")){
       		contatos2(request,response);
       		
       	}  else if (action.equals("/insert")) {
       		novoContato(request, response);
       		
     	}  else if (action.equals("/insert2")) {
     		interesse(request, response);
     		
    	}  else if (action.equals("/insert3")) {
    		cadastro_carro(request, response);
     	
    	}  else if (action.equals("/report")) {
    		gerarRelatorio(request, response);
    		
    	}  else if (action.equals("/update")) {
    		alterarsenha(request, response);
    		
    	}  else if (action.equals("/visualizarusuario")) {
    		contatos3(request, response);
    		
    	}  else if (action.equals("/editar")) {
    		editar(request, response);
    		
    		
    	}  else if (action.equals("/UP1")) {
    		UP1USUARIO(request, response);
    		
    	}  else if (action.equals("/deleteuser")){
    		removercontato(request, response);
    		
    		
    	}  else if (action.equals("/visualizarcar")){
    		contatos4(request, response);
    		
    	}  else if (action.equals("/editar2")) {
    		editar2(request, response);
    		
    	}  else if (action.equals("/UP2")) {
    		UP2carros(request, response);
    		
    	}  else if (action.equals("/deletecarro")){
    		removercarro(request, response);
    			
       	
       	} else {
       		response.sendRedirect("TelaPrincipal.jsp");
       	}
       	
    }

    /**
     * Contatos 2.
     *
     * @param request the request
     * @param response the response
     * @throws ServletException the servlet exception
     * @throws IOException Signals that an I/O exception has occurred.
     */
    protected void contatos2(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException {
    		//Criando um objeto que ira receber os dados
    		ArrayList<JavaBeans2> lista = dao2.listarinteresse();
    		
    		request.setAttribute("contatos2",lista);
    		RequestDispatcher rd = request.getRequestDispatcher("loja.jsp");
    		rd.forward(request, response);
    		for (int i =0; i <lista.size(); i++){
    			
    			//System.out.println(lista.get(i).getnomeinterese());
    			//System.out.println(lista.get(i).getfoneinterese());
    			//System.out.println(lista.get(i).getdatacadastrointerese());;

    }
    }

    /**
     * Novo contato.
     *
     * @param request the request
     * @param response the response
     * @throws ServletException the servlet exception
     * @throws IOException Signals that an I/O exception has occurred.
     */
    protected void novoContato(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		//Teste
    	//System.out.println(request.getParameter("login"));
    	//System.out.println(request.getParameter("senha"));
    	//System.out.println(request.getParameter("nome"));
    	//System.out.println(request.getParameter("Datanascimento"));
    	
    	//Colocar as variaveis javabeans
    	contato.setLogin(request.getParameter("login"));
    	contato.setSenha(request.getParameter("senha"));
    	contato.setNome(request.getParameter("nome"));
    	contato.setDatanascimento(request.getParameter("Datanascimento"));
    	
    	//Invocar o metodo inserircontato passando o objeto contato
    	
    	dao.inserirContato(contato);
    	
    	//Redirecionar para agenda.jsp
    	response.sendRedirect("TelaDirecionamento.jsp");
    	
    	
  	

    }
    
    /**
     * Interesse.
     *
     * @param request the request
     * @param response the response
     * @throws ServletException the servlet exception
     * @throws IOException Signals that an I/O exception has occurred.
     */
    protected void interesse(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
    	
    	//Colocar as variaveis javabeans
    	contato.setcliente(request.getParameter("cliente"));
    	contato.setfone(request.getParameter("fone"));
    	
    	//Invocar o metodo inserircontato passando o objeto contato
    	
    	dao2.novointeresse(contato);
    	
    	//Redirecionar para agenda.jsp
    	response.sendRedirect("interesseconcluido.jsp");
    
    
    
}
    
    /**
     * Cadastro carro.
     *
     * @param request the request
     * @param response the response
     * @throws ServletException the servlet exception
     * @throws IOException Signals that an I/O exception has occurred.
     */
    protected void cadastro_carro(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException {
        	
        	//Colocar as variaveis javabeans
        	contato.setmarca(request.getParameter("marca"));
        	contato.setmodelo(request.getParameter("modelo"));
        	contato.setanoFabricacao(request.getParameter("anofabricacao"));
        	contato.setanoModelo(request.getParameter("anomodelo"));
        	contato.setvalor(request.getParameter("valor"));
        	contato.setdescricao(request.getParameter("descricao"));

        	//Invocar o metodo inserircontato passando o objeto contato
        	
        	dao3.cadastro(contato);
        	
        	//Redirecionar para agenda.jsp
        	response.sendRedirect("TelaDirecionamento.jsp");
        
   
    }
    
    

    /**
     * Gerar relatorio.
     *
     * @param request the request
     * @param response the response
     * @throws ServletException the servlet exception
     * @throws IOException Signals that an I/O exception has occurred.
     */
    protected void gerarRelatorio(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException {
    		Document documento = new Document();
    		
    		try {
				response.setContentType("apllication/pdf");
				response.addHeader("Content-Disposition","inline; filename= "+ "contatos.pdf");	
				PdfWriter.getInstance(documento,response.getOutputStream());
				
				documento.open();
				documento.add(new Paragraph("Clientes com interese em Carros:"));
				documento.add(new Paragraph(" "));
				
				//Criar uma tabela
				PdfPTable tabela = new PdfPTable(3);
				
				//Cabeçalho
				PdfPCell col1 = new PdfPCell(new Paragraph("nome"));
				PdfPCell col2 = new PdfPCell(new Paragraph("telefone"));
				PdfPCell col3 = new PdfPCell(new Paragraph("datacadastro"));
				tabela.addCell(col1);
				tabela.addCell(col2);
				tabela.addCell(col3);
				
				//Popular os dados da tabela
				ArrayList<JavaBeans2> lista = dao2.listarinteresse();	
				for (int i = 0; i <lista.size(); i++ ) {
					tabela.addCell(lista.get(i).getnomeinterese());
					tabela.addCell(lista.get(i).getfoneinterese());
					tabela.addCell(lista.get(i).getdatacadastrointerese());
					
										
				}
				documento.add(tabela);
				documento.close();
			} catch (Exception e) {
				System.out.println(e);
				documento.close();
				
			}
    		
    }
    		
    		/**
		     * Alterarsenha.
		     *
		     * @param request the request
		     * @param response the response
		     * @throws ServletException the servlet exception
		     * @throws IOException Signals that an I/O exception has occurred.
		     */
		    protected void alterarsenha(HttpServletRequest request, HttpServletResponse response) 
    	    		throws ServletException, IOException {
    	        	
    	        	//Colocar as variaveis javabeans
    	        	contato.setLogin(request.getParameter("login"));
    	        	contato.setDatanascimento(request.getParameter("datanascimento"));
    	        	contato.setSenha(request.getParameter("novasenha"));
    	        	
    	        	//System.out.println(request.getParameter("login"));
    	        	//System.out.println(request.getParameter("datanascimento"));
    	        	//System.out.println(request.getParameter("novasenha"));
    	        	

    	        	//Invocar o metodo inserircontato passando o objeto contato
    	        	
    	        	dao.alterarsenha(contato);	
    		
    	        	response.sendRedirect("login.jsp");
    		
    		
    		
    		
    } 
    		
    //CRUD listar usuarios

/**
     * Contatos 3.
     *
     * @param request the request
     * @param response the response
     * @throws ServletException the servlet exception
     * @throws IOException Signals that an I/O exception has occurred.
     */
    protected void contatos3(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		//Criando um objeto que ira receber os dados
		ArrayList<JavaBeans3> lista2 = dao2.listaruser();
		
		request.setAttribute("contatos3",lista2);
		RequestDispatcher rd = request.getRequestDispatcher("listadeusuarios.jsp");
		rd.forward(request, response);
		//for (int i =0; i <lista2.size(); i++){
			
			//System.out.println(lista.get(i).getnomeinterese());
			//System.out.println(lista.get(i).getfoneinterese());
			//System.out.println(lista.get(i).getdatacadastrointerese());;
			
			
			
		}
		



/**
 * Editar.
 *
 * @param request the request
 * @param response the response
 * @throws ServletException the servlet exception
 * @throws IOException Signals that an I/O exception has occurred.
 */
protected void editar(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		
	
		String id = request.getParameter("id");
		contatoy.setid(id);
		dao2.selecionarusuario(contatoy);
		
		//System.out.println(contatoy.getid());
		//System.out.println(contatoy.getlogin());
		//System.out.println(contatoy.getnome());
		//System.out.println(contatoy.getdatanascimento());
		request.setAttribute("id", contatoy.getid());
		request.setAttribute("login", contatoy.getlogin());
		request.setAttribute("nome", contatoy.getnome());
		request.setAttribute("datanascimento", contatoy.getdatanascimento());
		
		
		RequestDispatcher rd = request.getRequestDispatcher("alterardadosusuario.jsp");
		rd.forward(request, response);
		
	}		


	/**
	 * Up1usuario.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	protected void UP1USUARIO(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException {
        	
        	//Colocar as variaveis javabeans3
        	contatoy.setid(request.getParameter("id"));
        	contatoy.setlogin(request.getParameter("login"));
        	contatoy.setnome(request.getParameter("nome"));
        	contatoy.setdatanascimento(request.getParameter("datanascimento"));
        	
        	dao2.UP1CONTATO(contatoy);
        	
        	response.sendRedirect("visualizarusuario");

}
	
	/**
	 * Removercontato.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	protected void removercontato(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException {
        	
        	//Colocar as variaveis javabeans3
		String id = request.getParameter("id");
		//System.out.println(id);
		contatoy.setid(id);
		dao2.deletarusuario(contatoy);
		
		response.sendRedirect("visualizarusuario");
}

    //CRUD listar usuarios

/**
     * Contatos 4.
     *
     * @param request the request
     * @param response the response
     * @throws ServletException the servlet exception
     * @throws IOException Signals that an I/O exception has occurred.
     */
    protected void contatos4(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		//Criando um objeto que ira receber os dados
		ArrayList<JavaBeans4> lista3 = dao3.listarcar();
		
		request.setAttribute("contatos4",lista3);
		RequestDispatcher rd = request.getRequestDispatcher("listadecarros.jsp");
		rd.forward(request, response);
		for (int i =0; i <lista3.size(); i++){
			
;
			
			
			
		}
}		
		
		/**
		 * Editar 2.
		 *
		 * @param request the request
		 * @param response the response
		 * @throws ServletException the servlet exception
		 * @throws IOException Signals that an I/O exception has occurred.
		 */
		protected void editar2(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
				
			
				String id = request.getParameter("id");
				contatoz.setid(id);
				dao3.selecionarcarro(contatoz);
				
				//System.out.println(contatoy.getid());
				//System.out.println(contatoy.getlogin());
				//System.out.println(contatoy.getnome());
				//System.out.println(contatoy.getdatanascimento());
				request.setAttribute("id", contatoz.getid());
				request.setAttribute("marca", contatoz.getmarca());
				request.setAttribute("modelo", contatoz.getmodelo());
				request.setAttribute("anofabricacao", contatoz.getanofabricacao());
				request.setAttribute("anomodelo", contatoz.getanomodelo());
				request.setAttribute("valor", contatoz.getvalor());
				request.setAttribute("descricao", contatoz.getdescricao());
				
				
				RequestDispatcher rd = request.getRequestDispatcher("alterardadoscarros.jsp");
				rd.forward(request, response);
	
		
		
		
	
}

		/**
		 * UP 2 carros.
		 *
		 * @param request the request
		 * @param response the response
		 * @throws ServletException the servlet exception
		 * @throws IOException Signals that an I/O exception has occurred.
		 */
		protected void UP2carros(HttpServletRequest request, HttpServletResponse response) 
	    		throws ServletException, IOException {
	        	
	        	//Colocar as variaveis javabeans3
	        	contatoz.setid(request.getParameter("id"));
	        	contatoz.setmarca(request.getParameter("marca"));
	        	contatoz.setmodelo(request.getParameter("modelo"));
	        	contatoz.setanofabricacao(request.getParameter("anofabricacao"));
	        	contatoz.setanomodelo(request.getParameter("anomodelo"));
	        	contatoz.setvalor(request.getParameter("valor"));
	        	contatoz.setdescricao(request.getParameter("descricao"));

	        	
	        	dao3.UP2carros(contatoz);
	        	
	        	response.sendRedirect("visualizarcar");

	}
	
	
		/**
		 * Removercarro.
		 *
		 * @param request the request
		 * @param response the response
		 * @throws ServletException the servlet exception
		 * @throws IOException Signals that an I/O exception has occurred.
		 */
		protected void removercarro(HttpServletRequest request, HttpServletResponse response) 
	    		throws ServletException, IOException {
	        	
	        	//Colocar as variaveis javabeans3
			String id = request.getParameter("id");
			//System.out.println(id);
			contatoz.setid(id);
			dao3.deletarcarro(contatoz);
			
			response.sendRedirect("visualizarcar");
	}
	
	
	
	
	
	
	
}










    	