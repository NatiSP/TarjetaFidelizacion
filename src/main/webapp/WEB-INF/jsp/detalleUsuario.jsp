<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<td>Usuario:</td>
			<td>${usuario.nombre}</td>
		</tr>
		<tr>
			<td>Puntos:</td>
			<td>${usuario.puntos}</td>
		</tr>
		<tr>
			<td><a href="/TarjetaFidelizacion/movimientos/verMovimientos">Ver Movimientos</a></td>
		</tr>
		<tr>
			<td><a href="/TarjetaFidelizacion/reservas/verReservas">Ver Reservas</a></td>
		</tr>
	</table>


</body>
</html>