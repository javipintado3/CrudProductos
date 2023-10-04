package com.javierpintado.model;

public class Producto {

	private Integer id;
	private String nombre;
	private String descripcion;
	private Float peso;
	private Integer stock;
	
	public Producto(Integer id, String nombre, String descripción, Float peso, Integer stock) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripción;
		this.peso = peso;
		this.stock = stock;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripción() {
		return descripcion;
	}

	public void setDescripción(String descripción) {
		this.descripcion = descripción;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripción=" + descripcion + ", peso=" + peso
				+ ", stock=" + stock + "]";
	}
	
	
	
	
}
