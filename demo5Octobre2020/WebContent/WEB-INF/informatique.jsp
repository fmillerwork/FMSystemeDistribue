<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Informatique</title>
</head>
<body>
<h1>Informatique</h1>
<%@ include file ="menu.jsp" %>

<%
out.println("Bonjour " + (String)request.getAttribute("prenom") + ", bienvenu en cours d'informatique !");
%>

<!-- Utilisation de Expression Language (EL) -->
<p>
	Bonjour ${nom} ${prenom}
</p>
<h2>Éléments d'un tableau</h2>
<p>
${array[0]}
${array[1]}
</p>
</body>
</html>