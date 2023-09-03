
package com.example.demo.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name =  "productos")
public class Producto {
	
	@Id
	@Column(name = "codigo")
	private int codigo;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "precio")
	private int precio;
	@Column(name = "cantidad")
	private int cantidad;

	public Producto(int codigo, String nombre, int precio, int cantidad) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public Producto() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
