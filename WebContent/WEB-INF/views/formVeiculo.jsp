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
	<br>
	<form action="adicionaTarefa" method="post">

		<label for="descricao"> Descrição:</label> 
		<input type="text"
			name="descricao"></input><br /> 
		<label for="nao">Finalizada:</label>
		<input type="text" id="finalizada" name="finalizado" ><br /><!-- todo -->

		<label for="dataFinalizacao">Data de finalização:</label> 
		<input type="text" id="dataFinalizacao" name="dataFinalizacao"><br />

		<input type="submit" value="Adicionar">
	</form>

</body>
</html>