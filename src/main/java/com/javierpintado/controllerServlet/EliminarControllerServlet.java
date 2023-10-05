package com.javierpintado.controllerServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.javierpintado.bd.ConexionBD;

/**
 * Servlet implementation class EliminarControllerServlet
 */
public class EliminarControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	ConexionBD ctr = new ConexionBD();
	
    public EliminarControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		System.out.println(id);
		try {

			if (ctr.deleteProducto(Integer.parseInt(id))) {
				response.sendRedirect("JSP/exito.jsp"); 
			} else {
				response.sendRedirect("JSP/error.jsp"); 
			}

		} catch (Exception e) {
			
			response.sendRedirect("JSP/error.jsp"); 
		}
	}

}
