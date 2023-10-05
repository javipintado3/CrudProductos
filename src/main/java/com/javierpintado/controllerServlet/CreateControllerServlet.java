package com.javierpintado.controllerServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;

import com.javierpintado.bd.ConexionBD;
import com.javierpintado.model.Producto;

/**
 * Servlet implementation class CreateControllerServlet
 */
public class CreateControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	ConexionBD ctr = new ConexionBD();
	
    public CreateControllerServlet() {
        super();
    }

	
	
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre = request.getParameter("nombre");
		String descripcion = request.getParameter("descripcion");
		String peso = request.getParameter("peso");
		String stock = request.getParameter("stock");
		String id = request.getParameter("id");
		
		 try {

			Producto producto = new Producto(Integer.parseInt(id), nombre, descripcion, Float.parseFloat(peso), Integer.parseInt(stock));
			 ctr.createProducto(producto);
	            response.sendRedirect("JSP/exito.jsp"); 
	        } catch(Exception e) {
	            e.printStackTrace();
	            response.sendRedirect("JSP/error.jsp"); 
	        }
	    

		
		
		
	}

}
