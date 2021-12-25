<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des magasin</title>
</head>
<body>
<h1>Liste des livre</h1>
<table>
<c:forEach items="${listem }"   var="mag" > 
<tr><td>${mag.id}<td><td>${mag.titre}</td><td>${mag.lieu}</td><td>${mag.titre}</td></tr></c:forEach>

</table>

</body>
</html>