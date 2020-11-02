<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<c:url value="/entrada" var="entrada" />


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nova Empresa</title>
</head>
<body>



	<form action="${ entrada }">
	
		<input type="hidden" name="acao" value="NovaEmpresa" />
	
		Nome: <input type="text" name="nome" method="post" /> 
		
		Data Abertura: <input type="text" name="data" method="post" /> 
		
		<input type="submit" value="Cadastrar" />
		
		<br/>
		<br/>
		
	</form>
	
	
	<form action="${ entrada }">
	
		<input type="submit" value="Listar Empresas"/>
		<input type="hidden" name="acao" value="ListaEmpresas" />
		
	</form>

</body>
</html>