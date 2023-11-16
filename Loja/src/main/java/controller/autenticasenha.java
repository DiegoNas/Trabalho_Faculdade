package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuario;
import model.UsuarioDAO2;       

@WebServlet("/autenticadorsenha")
public class autenticasenha extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public autenticasenha() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
      

   		
    	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		    String action = request.getServletPath();
	        System.out.println(action);
		
			
			String xlogin = request.getParameter("login");
			String xsenha = request.getParameter("senha");
			
			Usuario usu = new Usuario();
			usu.setLogin(xlogin);
			usu.setSenha(xsenha);
			
			UsuarioDAO2 usuDAO2 = new UsuarioDAO2();
			Usuario usuarioAutenticado2 = usuDAO2.autenticacaosenha(usu);
		
	    	if (usuarioAutenticado2 != null) {
	    		RequestDispatcher rd = request.getRequestDispatcher("alterarsenha.jsp");
	    		rd.forward(request, response);
	    		
	    		
	    	}else {
	    		response.sendRedirect("errologin.jsp");
	}
    	
	}
	
	
}

