<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adicione Produto</title>
</head>
<body>

	<form method="post" action="adicionaProduto">
		<table border="2">
			<tr>
				<td>Nome:</td>
				<td><input type="text" name="nome"></td>
			<tr>
			<tr>
				<td>Descrição:</td>
				<td><input type="text" name="descricao"></td>
			<tr>
			<tr>
				<td>Categoria:</td>
				<td><input type="text" name="categoria"></td>
			<tr>
			<tr>
				<td>Valor:</td>
				<td><input type="text" name="valor"></td>
			<tr>
			<tr>
				<td colspan="2"><input type="submit" value="Inserir"></td>
			<tr>
		</table>
	</form>

</body>
</html>