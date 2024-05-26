package com.walter.alquileres.walter_alquileres.models;

public class Sucursales {
	
//	CAMPOS
	
	private Long id;
	private String nombre;
	private String direccion;
	private String telefono;
	private Boolean estado;
	
//	CONSTRUCTORES
	
	public Sucursales() {
	}
	
	public Sucursales(Long id, String nombre, String direccion, String telefono, Boolean estado) {
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.estado = estado;
	}
	
//	GETTERS Y SETTERS

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Sucursales [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", estado=" + estado + "]";
	}

}
