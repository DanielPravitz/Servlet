<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/novaEmpresa" var="novaEmpresa" />
<c:url value="/removeEmpresa" var="removeEmpresa" />
<c:url value="/mostraEmpresa" var="mostraEmpresa" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib </title>
</head>
<body>

	<c:if test="${not empty empresa }">
		Empresa ${ empresa } cadastrada com sucesso!
	</c:if>

	<br />
	<br />
	
	Lista de Empresas usando JSTL: <br />
	<ul>
		<c:forEach items="${ empresas }" var="empresa" >
			
		     <li> 
		     		${empresa.id} - ${ empresa.nome } - <fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/>
		     		
		     		<a href="${ mostraEmpresa }?id=${empresa.id}">Editar</a>
		     		
		     		<a href="${ removeEmpresa }?id=${empresa.id}">Remover</a>
		     		
		      </li>
		      
		      </br>
		     
		</c:forEach>
		
	</ul>
	
	<form action="${ novaEmpresa }">
	
		<input type="submit" value="Cadastrar Empresa"/>
		
	</form>

</body>
</html>