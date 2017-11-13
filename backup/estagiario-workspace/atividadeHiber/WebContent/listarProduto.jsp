<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Produtos</title>
</head>
<body>

	<table border="2">

		<tr>
			<td>Id</td>
			<td>Nome</td>
			<td>Descrição</td>
			<td>Categoria</td>
			<td>Valor</td>
			<td>Excluir</td>
			<td>Editar</td>
		</tr>
		<c:forEach var="produto" items="${produtos}">
			<form method="post" action="controle?logica=AlterarProdutos">
				<tr>
					<td><input type="text" name = "id" value="${produto.id}" /></td>
					<td><input type="text" name="nome" value="${produto.nome}" /></td>
					<td><input type="text" name="descricao"
						value="${produto.descricao}" /></td>
					<td><input type="text" name="categoria"
						value="${produto.categoria}" /></td>
					<td><input type="text" name="valor" value="${produto.valor}" /></td>
					<td><a href="controle?logica=RemoveProdutos&id=${produto.id}">Remover</a>
					</td>
					<td><input type="submit" value="Alterar"></td>
				</tr>
			</form>
		</c:forEach>
	</table>

</body>
</html>