package com.javierpintado.controllerServlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.javierpintado.bd.ConexionBD;
import com.javierpintado.model.Producto;




public class ListarControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   ConexionBD ctr = new ConexionBD();
	
    public ListarControllerServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		List<Producto> productos = ctr.readProcuto();
		request.setAttribute("PRODUCTOS", productos);
		
	 RequestDispatcher dispatcher = request.getRequestDispatcher("JSP/ListarProducto.jsp");
	 dispatcher.forward(request, response);
		
		
	}

	
}
