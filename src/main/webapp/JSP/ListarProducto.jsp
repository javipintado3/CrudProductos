<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de producto</title>
</head>
<body>
<h1>Listado de Productos:</h1>
<table>
	<thead>
            <th>ID</th>
            <th>Nombre</th>
            <th>Descripción</th>
            <th>Peso</th>
            <th>Stock</th>
        </thead>
	<c:forEach var="producto" items="${PRODUCTOS}">
		<tr>
			<td>${producto.getId()}</td>
			<td>${producto.getNombre()}</td>
			<td>${producto.getDescripcion()}</td>
			<td>${producto.getPeso()}</td>
			<td>${producto.getStock()}</td>
			<td>
			<form action="EliminarControllerServlet" method="post">
			
				<input type="hidden" value="${producto.getId()}" name="id">
				<input type="submit" value="Borrar">
			</form>
			</td>
			<td>
			<form action="JSP/Update.jsp" method="post">
				<input type="hidden" value="${producto.getId()}" name="id">
				<input type="submit" value="Actualizar">
			</form>
			</td>
		</tr>
	</c:forEach>
	</table>
	<br>
	<a href = "JSP/CrearProducto.jsp">Crear Producto</a>
</body>
</html>