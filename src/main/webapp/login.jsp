<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>


<body onload='document.f.j_username.focus();'>

	<h3>Entrar con Usuario y Contraseña</h3>

	<c:if test="${param.login_error ne null}">
		<font color="orange"> El intento de conectar no tuvo éxito,
			intentelo de nuevo.<br /> Razón:
			${SPRING_SECURITY_LAST_EXCEPTION.message}
		</font>
	</c:if>

	<form name="f" action="<c:url value='/login/doLogin'/>"
		method="POST">
		<security:csrfInput />
		<table>
			<tr>
				<td>Usuario:</td>
				<td><input type="text" name="username"
					value="${cookie.SPRING_SECURITY_LAST_USERNAME.value}" /></td>
			</tr>
			<tr>
				<td>Contraseña:</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td>Recordarme:</td>
				<td><input type='checkbox' name="remember-me-param" /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="Login" /></td>
			</tr>
		</table>
	</form>

	<a href="/TarjetaFidelizacion/usuario/altaCliente">Crear cuenta
		nueva</a>
	<a href="/TarjetaFidelizacion/usuario/altaOperador">Soy una empresa</a>
</body>
</html>