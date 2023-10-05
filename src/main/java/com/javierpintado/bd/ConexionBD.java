package com.javierpintado.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.javierpintado.model.Producto;
import java.sql.Statement;

public class ConexionBD implements MetodosBD {

	
	private final String url = "jdbc:mysql://172.22.0.225:3306/JSPproducts";
	private final String usuario = "root";
	private final String key = "123";
    
    
    public ConexionBD() {
    	
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    	
    }
    	


	@Override
	public boolean createProducto(Producto producto) {
		 
		try (Connection connection = DriverManager.getConnection(url, usuario, key)) {
		        
	        	String sql = "INSERT INTO Producto (nombre, descripcion, peso, stock, id) VALUES (?, ?, ?, ?, ?)";
	            
	            try (PreparedStatement statement = connection.prepareStatement(sql)) {
	                statement.setString(1, producto.getNombre());
	                statement.setString(2, producto.getDescripcion());
	                statement.setFloat(3, producto.getPeso());
	                statement.setInt(4, producto.getStock());
	                statement.setInt(5, producto.getId());
	                int rowsInserted = statement.executeUpdate();
	                return rowsInserted > 0;
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	}


	


	@Override
	public Boolean updateProducto(Producto producto) {
		 
		try (Connection connection = DriverManager.getConnection(url, usuario, key)) {
	        	
	        	String sql = "UPDATE personas SET nombre = ?, descripcion = ?, peso = ?, stock = ? WHERE id = ?";
	            
	            try (PreparedStatement statement = connection.prepareStatement(sql)) {
	                statement.setString(1, producto.getNombre());
	                statement.setString(2, producto.getDescripcion());
	                statement.setFloat(3, producto.getPeso());
	                statement.setInt(4, producto.getStock());
	                statement.setInt(5, producto.getId());
	                int rowsUpdated = statement.executeUpdate();
	                return rowsUpdated > 0;
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return false;
	}


	@Override
	public boolean deleteProducto(Integer id) {
		   
		try (Connection connection = DriverManager.getConnection(url, usuario, key)) {
			      
	        	String sql = "DELETE FROM Producto WHERE id = ?";
	            try (PreparedStatement statement = connection.prepareStatement(sql)) {
	                statement.setInt(1, id);
	                int rowsDeleted = statement.executeUpdate();
	                return rowsDeleted > 0; 
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return false; 
	}



	@Override
	public List<Producto> readProcuto() {
		  List<Producto> list = new ArrayList<>();
		  
		  try (Connection connection = DriverManager.getConnection(url, usuario, key)) {
	            String sql = "SELECT * FROM Producto";
	            try (Statement statement = connection.createStatement();
	                    ResultSet resultSet = statement.executeQuery(sql)) {
	                   while (resultSet.next()) {
	                       Producto p = new Producto(
	                           resultSet.getInt("id"),
	                           resultSet.getString("nombre"),
	                           resultSet.getString("descripcion"),
	                           resultSet.getFloat("peso"),
	                           resultSet.getInt("stock")
	                       );
	                       list.add(p);
	                   }
	               }
	            
	        } catch (SQLException e) {
				e.printStackTrace();
			}
		
		return list;
	}
	
}
