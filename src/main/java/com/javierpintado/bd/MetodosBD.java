package com.javierpintado.bd;

import java.util.List;

import com.javierpintado.model.Producto;

public interface MetodosBD {

	boolean createProducto(Producto producto);
	List<Producto> readProcuto();
	Boolean updateProducto(Producto producto);
	boolean deleteProducto(Integer id);
}
