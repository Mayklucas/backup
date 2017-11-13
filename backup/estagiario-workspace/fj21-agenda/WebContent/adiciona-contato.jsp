<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="caelum" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Contatos</title>
		<link href="css/jquery.css" rel="stylesheet">
		<script src="js/jquery.js"></script>
		<script src="js/jquery-ui.js"></script>
</head>
<body>
              <c:import url="cabecalho.jsp" />
  
     <form action="adicionaContato">
         nome: <input type="text" name="nome"/><br> 
         E-mail: <input type="text" name="email"/><br>
         Endereço: <input type="text" name="endereco"/><br>
         Data Nascimento: <input type="text" name="dataNascimento"/><br>
        
         <input type="submit" name="Gravar"/>    
     </form>
     
              <c:import url="rodape.jsp" />
              
</body>
</html>