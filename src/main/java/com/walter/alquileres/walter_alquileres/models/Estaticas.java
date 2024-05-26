package com.walter.alquileres.walter_alquileres.models;

public class Estaticas {
	
//	CAMPOS
	
	private Long id;
	private String nombre;
	private String descripcion;
	private Boolean estado;
	
//	CONSTRUCTORES
	
	public Estaticas() {
	}
	
	public Estaticas(Long id, String nombre, String descripcion, Boolean estado) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Estaticas [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", estado=" + estado
				+ "]";
	}

}
