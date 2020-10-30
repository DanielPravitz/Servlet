package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Banco {
	
	private static List <Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial  =1;
	
	static {
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("Nike");
		
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Adidas");
		
		lista.add(empresa);
		lista.add(empresa2);
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);
	
	}
	
	
	public void remove(Integer id) {
		
		for (Empresa empresa : lista) {
			
			if(empresa.getId() == id)
			{
				lista.remove(empresa);
				break;
			}
		}
		
	}
	
	
	public void update(Integer id, String nome, Date data) {
		
		for (Empresa empresa : lista) {
			
			if(empresa.getId() == id)
			{
				empresa.setNome(nome);
				empresa.setDataAbertura(data);
				break;
				
			}
		}
	}
	
	
	public Empresa buscaEmpresa(Integer id) {
		
		for (Empresa empresa : lista) {
			
			if(empresa.getId() == id)
			{
				return empresa;
			}
		}
		
		return null;
	}
	
	public List<Empresa> getEmpresas(){
		return lista;
		
	}
	

}
