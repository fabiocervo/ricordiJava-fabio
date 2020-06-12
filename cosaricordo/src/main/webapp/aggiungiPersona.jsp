<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Aggiungi Persona</title>
</head>
<body>
<form action="aggiungiPersona" method="post" >

    <h5>Inserisci Persona</h5>
    <input type="text" id="nome" name="nome" placeholder="Nome"> <br>
     <input type="text" id="cognome" name="cognome" placeholder="Cognome"> <br>
      <input type="text" id="numero" name="numero" placeholder="Numero"> <br>
<br>
  <input type="submit" style="width:150px; height:45px;margin:auto" value="Aggiungi">
  </form>
  <table >

					
						<tr>
				<th><h5>
						Nome
					</h5></th>
				<th><h5>
						Cognome
					</h5></th>
				<th><h5>
						Numero
					</h5></th>
				
			</tr>
						
					
					<c:forEach items="${listaPersone}" var="singolaPersona">

						<tr>
					<td><c:out value="${singolaPersona.getNome()}"/></td>
					<td><c:out value="${singolaPersona.getCognome()}"/></td>
					<td><c:out value="${singolaPersona.getNumero()}"/></td>
				</tr>
					</c:forEach>
				</table>
</body>
</html>