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
			
	<form action ="UP2" >
			
		<table>
		
			<tr>
			<tr>
				<td><input type = "text" name = "id" placeholder= "ID" class ="CAIXA1" readonly value= "<%out.print(request.getAttribute("id"));%>"></td>
			</tr>
			<tr>
				<td><input type = "text" name = "marca" placeholder= "Marca" class ="CAIXA1" value= "<%out.print(request.getAttribute("marca"));%>"></td>
			</tr>
			<tr>
				<td><input type = "text" name = "modelo" placeholder= "Modelo" class ="CAIXA1" value= "<%out.print(request.getAttribute("modelo"));%>"></td>
			</tr>
			<tr>
			<tr>
				<td><input type = "text" name = "anofabricacao" placeholder= "Ano de Fabrincação" class ="CAIXA1" value= "<%out.print(request.getAttribute("anofabricacao"));%>"></td>
			</tr>
			<tr>
			<tr>
				<td><input type = "text" name = "anomodelo" placeholder="Ano de modelo" class="CAIXA1" value= "<%out.print(request.getAttribute("anomodelo"));%>"></td>
			</tr>
			<tr>
				<td><input type = "text" name = "valor" placeholder="Valor" class="CAIXA1" value= "<%out.print(request.getAttribute("valor"));%>"></td>
			</tr>
			<tr>
				<td><input type = "text" name = "descricao" placeholder="Descrição" class="CAIXA1" value= "<%out.print(request.getAttribute("descricao"));%>"></td>
			</tr>
			<tr>
		</table>
		<input type="submit"  value="Alterar os dados" class = "Botao1" >

	</form>
	  


</body>


</html>