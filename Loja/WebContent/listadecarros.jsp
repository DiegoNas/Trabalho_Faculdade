
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ page import="model.JavaBeans2"%>
<%@ page import="model.JavaBeans4"%>
<%@ page import="model.JavaBeans"%>
<%@ page import="java.util.ArrayList"%>

<%
	@ SuppressWarnings ("unchecked")
	ArrayList<JavaBeans4> lista3 = (ArrayList<JavaBeans4>)
request.getAttribute("contatos4");


%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">


<link rel = "icon" href = "Imagens/carro.png">
<link rel = "stylesheet" href ="style.css">

<title>Carros no sistema</title>


</head>
<body>

	<h1>Carros Cadastrados</h1>
	<a href = "TelaDirecionamento.jsp" class = "Botao3" > Retornar ao Painel  </a>
	<table id="tabela">
		<thead> 
			<tr>
				<th>id </th>
				<th>marca </th>
				<th>modelo </th>
				<th>Ano de Fabricacao </th>
				<th>Ano do Modelo </th>
				<th>Valor </th>
				<th>Descrição do veiculo </th>
				<th>Opções </th>
				
	
	
			</tr>
	
	</thead>
	<tbody>
	
	<% for(int i = 0; i < lista3.size(); i++){ %>
	
	<tr>
		<td><%= lista3.get(i).getid()%></td>
		<td><%= lista3.get(i).getmarca() %></td>
		<td><%= lista3.get(i).getmodelo() %></td>
		<td><%= lista3.get(i).getanofabricacao() %></td>
		<td><%= lista3.get(i).getanomodelo() %></td>
		<td><%= lista3.get(i).getvalor() %></td>
		<td><%= lista3.get(i).getdescricao() %></td>		
		<td><a href="editar2?id=<%=lista3.get(i).getid() %>" class = "Botao3" >Editar</a>
			<a href="deletecarro?id=<%=lista3.get(i).getid()%>" class = "Botao3" >Excluir</a>
		</td>
	
	</tr>
	
	
	<%}	%>
	
	
	</tbody>
		
	</table>

</body>
</html>