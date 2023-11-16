<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">

<title>Loja de Carros</title>


<link rel = "icon" href = "Imagens/carro.png">
<link rel = "stylesheet" href ="style.css">

</head>



<body>
			
		<h1> Alteração dos dados !</h1>
			
	<form action ="UP1" >
			
		<table>
		
			<tr>
			<tr>
				<td><input type = "text" name = "id" placeholder= "ID" class ="CAIXA1" readonly value= "<%out.print(request.getAttribute("id"));%>"></td>
			</tr>
			<tr>
				<td><input type = "text" name = "login" placeholder= "Login" class ="CAIXA1" value= "<%out.print(request.getAttribute("login"));%>"></td>
			</tr>
			<tr>
			<tr>
				<td><input type = "text" name = "nome" placeholder= "Nome Cadastrado" class ="CAIXA1" value= "<%out.print(request.getAttribute("nome"));%>"></td>
			</tr>
			<tr>
			<tr>
				<td><input type = "text" name = "datanascimento" placeholder="Data de nascimento" class="CAIXA1" value= "<%out.print(request.getAttribute("datanascimento"));%>"></td>
			</tr>
			<tr>
		</table>
		<input type="submit"  value="Acessar" class = "Botao1" >

	</form>
	  


</body>


</html>