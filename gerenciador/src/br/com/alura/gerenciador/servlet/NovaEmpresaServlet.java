package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		System.out.println("Cadastrando nova empresa...");
		
		String nomeEmpresa = request.getParameter("nome");
		String dataEmpresa = request.getParameter("data");
		
		
		//Se nao possuir parametros entao apenas abre o formulario para cadastrar nova empresa
		if(nomeEmpresa ==null && dataEmpresa == null)
		{
			RequestDispatcher rd = request.getRequestDispatcher("formNovaEmpresa.jsp");
			rd.forward(request, response);
		}
		
		
		//Senao cadastra nova empresa e abre a lista de empresas cadastradas
		else
		{
			Date data = null;
			try {
				
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				data  = sdf.parse(dataEmpresa);
				
			} catch (ParseException e) {
				throw new ServletException();
			}
			
			Empresa empresa = new Empresa();
			
			empresa.setNome(nomeEmpresa);
			empresa.setDataAbertura(data);
			
			Banco banco = new Banco();
			banco.adiciona(empresa);
			
			request.setAttribute("empresa", empresa.getNome());
			response.sendRedirect("listaEmpresas");
			
		}
		
		
		
	//chamar JSP
	//	RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas");
	//	request.setAttribute("empresa", empresa.getNome());
	//	rd.forward(request, response);
		

	}

}
