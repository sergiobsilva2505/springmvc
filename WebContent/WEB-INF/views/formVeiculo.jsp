<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form - Novo Veiculo</title>
</head>
<body>
	<c:import url="head.jsp" />
	<br>
	<h2>Adicionar Veiculo</h2>
	<br>
	<fieldset>
		<legend>Dados do veiculo:</legend>
		<form action="adicionaVeiculo" method="post">

			<label for="cor"> Cor:</label> <input type="text" name="cor"></input><br />

			<label for="marca">Marca:</label> <input type="text" id="marca"
				name="marca"><br />
			<!-- todo -->

			<label for="modelo">Modelo:</label> <input type="text" id="modelo"
				name="modelo"><br /> <label for="placa">Placa:</label> <input
				type="text" id="placa" name="placa"><br /> <label
				for="tipo">Tipo:</label> <input type="text" id="tipo" name="tipo"><br />

			<input type="submit" value="Adicionar">
		</form>
	</fieldset>

</body>
</html>