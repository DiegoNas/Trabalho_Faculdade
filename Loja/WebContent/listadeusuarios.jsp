
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ page import="model.JavaBeans2"%>
<%@ page import="model.JavaBeans3"%>
<%@ page import="model.JavaBeans"%>
<%@ page import="java.util.ArrayList"%>

<%
@ SuppressWarnings ("unchecked")
	ArrayList<JavaBeans3> lista2 = (ArrayList<JavaBeans3>)
request.getAttribute("contatos3");


%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">


<link rel = "icon" href = "Imagens/carro.png">
<link rel = "stylesheet" href ="style.css">

<title>Usuarios no sistema</title>


</head>
<body>

	<h1>Usuarios Cadastrados</h1>
	<a href = "TelaDirecionamento.jsp" class = "Botao3" > Retornar ao Painel  </a>
	<table id="tabela">
		<thead> 
			<tr>
				<th>id </th>
				<th>Login </th>
				<th>Nome </th>
				<th>Data de Nascimento </th>
				<th>Opções </th>
	
	
			</tr>
	
	</thead>
	<tbody>
	
	<% for(int i = 0; i < lista2.size(); i++){ %>
	
	<tr>
		<td><%= lista2.get(i).getid()%></td>
		<td><%= lista2.get(i).getlogin() %></td>
		<td><%= lista2.get(i).getnome()%></td>
		<td><%= lista2.get(i).getdatanascimento() %></td>
		<td><a href="editar?id=<%=lista2.get(i).getid() %>" class = "Botao3" >Editar Usuario</a>
			<a href="deleteuser?id=<%=lista2.get(i).getid()%>" class = "Botao3" >Excluir Usuario</a>
		</td>
	
	</tr>
	
	
	<%}	%>
	
	
	</tbody>
		
	</table>

</body>
</html>