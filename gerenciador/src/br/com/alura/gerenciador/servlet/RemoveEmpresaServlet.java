package br.com.alura.gerenciador.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/removeEmpresa")
public class RemoveEmpresaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		
		System.out.print("Removendo empresa..." );
		
		Integer id = Integer.valueOf( request.getParameter("id") );
		
		Banco banco = new Banco();
		banco.remove(id);
		
		response.sendRedirect("listaEmpresas");
			
	}
       
   

	
	

}
