<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<title>Error</title>
</head>
<body>
    <h1>¡Ups! Algo salió mal</h1>
    <p>Lo sentimos, hemos encontrado un error al procesar tu solicitud.</p>
    <p>Detalles del error:</p>
    <ul>
        <li><strong>Código de Error:</strong> ${pageContext.errorData.statusCode}</li>
        <li><strong>Mensaje:</strong> ${pageContext.exception.message}</li>
    </ul>
    <p>Por favor, intenta nuevamente más tarde o contacta al administrador del sistema si el problema persiste.</p>
    <a href="<c:url value='/'/>">Volver a la página principal</a>
</body>
</html>