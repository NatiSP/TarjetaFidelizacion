<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form modelAttribute="usuario">
		<form:input path="usuario" />
		<form:password path="password" />
		<form:button>Login</form:button>
	</form:form>

	<a href="/TarjetaFidelizacion/usuario/altaCliente">Crear cuenta nueva</a>
	<a href="/TarjetaFidelizacion/usuario/altaOperador">Soy una empresa</a>
</body>
</html>