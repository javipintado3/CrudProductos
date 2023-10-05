<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h2>Editar Producto</h2>

    <form action="${pageContext.request.contextPath}/UpdateControllerServlet" method="post">

        <c:if test="${not empty producto}">
            <input type="hidden" name="id" value="${producto.id}" />
        </c:if>

        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" value="${producto.nombre}" required><br>

        <label for="descripcion">Descripcion:</label>
        <input type="text" id="descripcion" name="descripcion" value="${producto.descripcion}" required><br>

        <label for="peso">Peso:</label>
        <input type="text" id="peso" name="peso" value="${producto.peso}" required><br>

        <label for="stock">Stock:</label>
        <input type="text" id="stock" name="stock" value="${producto.stock}" required><br>

        <input type="submit" value="Guardar">
    </form>
</body>
</html>