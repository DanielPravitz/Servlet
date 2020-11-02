package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;

public class AlteraEmpresa {
	
	public void executa (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Editando empresa...");
	
		
		String nomeEmpresa = request.getParameter("nome");
		String dataEmpresa = request.getParameter("data");
		Integer idEmpresa = Integer.valueOf(request.getParameter("id"));
		
		
		Date data = null;
		try {
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			 data  = sdf.parse(dataEmpresa);
			
		} catch (ParseException e) {
			throw new ServletException();
		}
		
		
		Banco banco = new Banco();
		banco.update(idEmpresa, nomeEmpresa, data);
		
		
		
		
		response.sendRedirect("entrada?acao=ListaEmpresas");
		
	}

}
