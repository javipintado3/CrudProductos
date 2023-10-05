package com.javierpintado.controllerServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.javierpintado.bd.ConexionBD;
import com.javierpintado.model.Producto;


public class UpdateControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
ConexionBD ctr = new ConexionBD();
   
    public UpdateControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    }
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try {
				String nombre = request.getParameter("nombre");
				String descripcion = request.getParameter("descripcion");
				String peso = request.getParameter("peso");
				String stock = request.getParameter("stock");
				String id = request.getParameter("id");
	      
	           
	         
	            
	           
	        	Producto nuevoProducto = new Producto(Integer.parseInt(id), nombre, descripcion, Float.parseFloat(peso), Integer.parseInt(stock));
	            
	            
	            
	            boolean actualizado = ctr.updateProducto(nuevoProducto);
	            if (!actualizado) {
	              
	                response.sendRedirect("JSP/error.jsp"); // Cambiar a tu página de error
	                return;
	            }
	            
	            response.sendRedirect("JSP/exito.jsp"); // Cambiar a tu página de éxito o listado

	        } catch (NumberFormatException e) {
	          
	            response.sendRedirect("JSP/error.jsp"); // Cambiar a tu página de error
	        }
	}

}
