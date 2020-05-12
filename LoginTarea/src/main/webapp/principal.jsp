<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
HttpSession seccionn= (HttpSession) request.getSession();
String usuariovariableseccion= (String)seccionn.getAttribute("Usuario");
if(usuariovariableseccion==null){
	response.sendRedirect("index.jsp");
}
%>
<body>
<form action="ServelerUser" method="post">
<input type="submit" value="Cerrar" name="btncerrar">
</form>
<h1>Hola desde principal</h1>
</body>
</html>