package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;


public class NovaEmpresa {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa...");
		
		String nomeEmpresa = request.getParameter("nome");
		String dataEmpresa = request.getParameter("data");
		
		
		//Se nao possuir parametros entao apenas abre o formulario para cadastrar nova empresa
		if(nomeEmpresa ==null && dataEmpresa == null)
		{
			return "forward:formNovaEmpresa.jsp";
			
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
		
			return "redirect:entrada?acao=ListaEmpresas";
			
			
		}
	}
}
