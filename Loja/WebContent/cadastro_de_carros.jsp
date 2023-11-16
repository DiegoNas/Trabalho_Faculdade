

<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">


<title> Cadastrar carros </title>

<link rel = "icon" href = "Imagens/carro.png">
<link rel = "stylesheet" href ="style.css">

<head>
	
<body>
			
		<h1> Incluir novos carros no Estoque </h1>
	<a href = "TelaDirecionamento.jsp" class = "Botao3" > Retornar ao Painel  </a>
	<form action ="insert3" >
			
		<table id="tabela">
			<tr>
			<tr>
				<td><input type = "text" name = "marca" placeholder=" Marca" class="CAIXA1"></td>
			</tr>
			<tr>
			<tr>
				<td><input type = "text" name = "modelo" placeholder="Modelo" class="CAIXA1"></td>
			</tr>
			<tr>
			<tr>
				<td><input type = "text" name = "anofabricacao" placeholder="Ano Fabricação" class="CAIXA1"></td>
			</tr>
			<tr>
			<tr>
				<td><input type = "text" name = "anomodelo" placeholder="Ano Modelo" class="CAIXA1"></td>
			</tr>	
			<tr>	

			<td><input type = "text" name = "valor" placeholder="Valor" class="CAIXA1"></td>
			</tr>	
			<tr>
			<tr>
			<tr>
			<td><input type = "text" name = "descricao" placeholder="Descrição" class="CAIXA1"></td>
			</tr>	
			<tr>
		</table>
		<input type="submit" value="Adicionar" class = "Botao1">
	</form>
	
</body>
</html>