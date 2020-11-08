<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/entrada" var="entrada" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alterar Empresa</title>
</head>
<body>

	<c:import url="logoutParcial.jsp" />
	
	<form action="${ entrada }">
	
		<input type="hidden" name="acao" value="ListaEmpresas" method="post" /> 
	
		Nome: <input type="text" name="nome" value="${ empresa.nome }" method="post" /> 
		
		Data Abertura: <input type="text" name="data" value=<fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/> method="post" /> 
		
		
		<input type="hidden" name="id" value="${ empresa.id }" method="post" /> 
		
		<input type="submit" />
	</form>

</body>
</html>