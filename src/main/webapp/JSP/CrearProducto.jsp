<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Crear Producto</title>
</head>
<body>
<h1>Formulario de Producto</h1>
    <form action="../CreateControllerServlet" method="POST">
        <label for="nombre">Nombre del Producto:</label>
        <input type="text" id="nombre" name="nombre" required><br><br>
        
        <label for="descripcion">Descripción del Producto:</label>
        <input type="text" id="descripcion" name="descripcion" required><br><br>
        
        <label for="peso">Peso del Producto:</label>
        <input type="number" id="peso" name="peso" required><br><br>
        
        <label for="stock">Stock del Producto:</label>
        <input type="number" id="stock" name="stock" required><br><br>
        
        <label for="id">Id del Producto:</label>
        <input type="number" id="id" name="id" required><br><br>
        
        <input type="submit" value="Guardar Producto">
    </form>
</body>
</html>