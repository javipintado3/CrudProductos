package com.javierpintado.bd;

import java.sql.Connection;
import java.sql.DriverManager;
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
		// TODO Auto-generated method stub
		return false;
	}


	


	@Override
	public Boolean updateProducto(Producto producto) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean deleteProducto(Integer id) {
		// TODO Auto-generated method stub
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
