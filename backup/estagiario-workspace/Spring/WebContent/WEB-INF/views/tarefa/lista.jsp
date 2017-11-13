<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="resources/jquery-3.2.1.min.js"></script>
<title>Spring MVC</title>
</head>
<body>
	<script type="text/javascript">
      function finalizaAgora(id) {
    	  $.post("finalizaTarefa", {'id' : id}, function(resposta){
    		  $("#tarefa_"+id).html("Finalizado");
    		  $("#tarefa_data_"+id).html(resposta);
    	  })
      }
    </script>
	<a href="novaTarefa">Criar nova tarefa</a>
	<br />
	<br />
	<table border="2">
		<tr>
			<th>Id</th>
			<th>Descrição</th>
			<th>Finalizado</th>
			<th>Data de finalização</th>
			<th>Excluir</th>
			<th>Altera</th>
		</tr>
		<c:forEach items="${tarefas}" var="tarefas">
			<tr>
				<td>${tarefas.id}</td>
				<td>${tarefas.descricao}</td>
				<c:if test="${tarefas.finalizado eq false}">
					<td id="tarefa_${tarefas.id}"><a href="#"
						onClick="finalizaAgora(${tarefas.id})"> Finalizar agora! </a>
				</c:if>
				<c:if test="${tarefas.finalizado eq true}">
					<td>Finalizado</td>
				</c:if>
	
				<td id="tarefa_data_${tarefas.id}">${tarefas.dataFormatada}</td>
				<td><a href="removeTarefa?id=${tarefas.id}">Remover</a></td>
				<td><a href="mostraTarefa?id=${tarefas.id}">Alterar</a></td>

			</tr>
		</c:forEach>
	</table>
	<br>
	 <a href="logout">Sair</a> 
</body>
</html>