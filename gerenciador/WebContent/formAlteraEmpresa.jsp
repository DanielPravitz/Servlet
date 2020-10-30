<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/editaEmpresa" var="editaEmpresa" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alterar Empresa</title>
</head>
<body>



	<form action="${ editaEmpresa }">
	
		Nome: <input type="text" name="nome" value="${ empresa.nome }" method="post" /> 
		
		Data Abertura: <input type="text" name="data" value=<fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/> method="post" /> 
		
		<input type="hidden" name="id" value="${ empresa.id }" method="post" /> 
		
		<input type="submit" />
	</form>

</body>
</html>