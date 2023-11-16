package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuario;
import model.UsuarioDAO;


@WebServlet("/autenticador")
public class autenticador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public autenticador() {
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

		
		String xlogin = request.getParameter("login");
		String xsenha = request.getParameter("senha");
		
		Usuario usu = new Usuario();
		usu.setLogin(xlogin);
		usu.setSenha(xsenha);
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		Usuario usuarioAutenticado = usuDAO.autenticacao(usu);
	
    	if (usuarioAutenticado != null) {
    		request.getRequestDispatcher("TelaDirecionamento.jsp").forward(request, response);
    		
    		
    	}else {
    		response.sendRedirect("errologin.jsp");
		
		
	}
    	
	}
	
	
}

