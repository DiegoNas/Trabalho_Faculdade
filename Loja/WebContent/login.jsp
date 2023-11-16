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
			
		<h1> Tela de Login !</h1>
		<h2> Clique no Link para Alterar a senha!</h2>
<a href="recuperarsenha.jsp" > Alterar a Senha</a>
			
	<form action ="autenticador" method ="post" >
			
		<table>
			<tr>
			<tr>
				<td><input type = "text" name = "login" placeholder= "Login" class ="CAIXA1"></td>
			</tr>
			<tr>
				<tr>
			<tr>
				<td><input type = "text" name = "senha" placeholder="senha" class="CAIXA1"></td>
			</tr>
			<tr>
		</table>
		<input type="submit"  value="Acessar" class = "Botao1" >

	</form>
	  


</body>


</html>