<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
HttpSession seccionp = (HttpSession) request.getSession();
String usuarioseccion = (String) seccionp.getAttribute("Usuario");
if(usuarioseccion==null){
	response.sendRedirect("index.jsp");
}
%>
<body>
<form action="ServelerUser" method = "post">

<input type="submit" value ="CERRAR" name="btnCerrar">

</form>
<a href="historialUsuarios.jsp">VER HISTORIAL DE USUARIOS </a>
<h1>Hola desde el principal</h1>
</body>
</html>