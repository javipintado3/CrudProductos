package com.javierpintado.controllerServlet;

import jakarta.servlet.RequestDispatcher;
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
            int id = Integer.parseInt(request.getParameter("id"));
            String nombre = request.getParameter("nombre");
            String descripcion = request.getParameter("descripcion");
            Float peso = Float.parseFloat(request.getParameter("peso"));
            int stock = Integer.parseInt(request.getParameter("stock"));
            Producto nuevoProducto;

            nuevoProducto = new Producto(id, nombre, descripcion, peso, stock);
            System.out.println(nuevoProducto.toString());


            boolean actualizado = ctr.updateProducto(nuevoProducto);
           
            if (!actualizado) {
                response.sendRedirect("JSP/error.jsp");
                return;
            }

            response.sendRedirect("JSP/exito.jsp"); 

        } catch (NumberFormatException e) {
            response.sendRedirect("JSP/error.jsp"); 
        }
	
	
	}

}
