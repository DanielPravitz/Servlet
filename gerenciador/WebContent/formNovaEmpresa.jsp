<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/novaEmpresa" var="novaEmpresa" />
<c:url value="/listaEmpresas" var="listaEmpresas" />


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nova Empresa</title>
</head>
<body>



	<form action="${ novaEmpresa }">
	
		Nome: <input type="text" name="nome" method="post" /> 
		
		Data Abertura: <input type="text" name="data" method="post" /> 
		
		<input type="submit" />
		
		<br/>
		<br/>
		
	</form>
	
	
	<form action="${ listaEmpresas }">
	
		<input type="submit" value="Listar Empresas"/>
		
	</form>

</body>
</html>