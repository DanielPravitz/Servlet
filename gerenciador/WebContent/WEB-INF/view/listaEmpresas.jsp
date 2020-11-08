<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,br.com.alura.gerenciador.modelo.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/entrada" var="entrada" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib </title>
</head>
<body>

	<c:import url="logoutParcial.jsp" />
	
	Usuario Logado: ${ usuarioLogado.login }
	
	<br />
	<br />

	<c:if test="${not empty empresa }">
		Empresa ${ empresa } cadastrada com sucesso!
	</c:if>
	
	Lista de Empresas usando JSTL: <br />
	<ul>
		<c:forEach items="${ empresas }" var="empresa" >
			
		     <li> 
		     		${empresa.id} - ${ empresa.nome } - <fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/>
		     		
		     		<a href="${ entrada }?acao=MostraEmpresa&id=${empresa.id}">Editar</a>
		     		
		     		<a href="${ entrada }?acao=RemoveEmpresa&id=${empresa.id}">Remover</a>
		     		
		      </li>
		      
		      </br>
		     
		</c:forEach>
		
	</ul>
	
	<form action="${ entrada }">
	
		<input type="hidden" name="acao" value="NovaEmpresa" />
		
		<input type="hidden" name="novaEmpresa" value="true" />
	
		<input type="submit" value="Cadastrar Empresa"/>
		
	</form>

</body>
</html>