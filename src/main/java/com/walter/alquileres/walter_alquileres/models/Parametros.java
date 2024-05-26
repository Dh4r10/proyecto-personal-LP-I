package com.walter.alquileres.walter_alquileres.models;

public class Parametros {
	
//	CAMPOS
	
	private Long id;
	private Estaticas estaticasId;
	private String nombre;
	private String descripcion;
	private Boolean estado;
	
//	CONSTRUCTORES
	
	public Parametros() {
	}
	
	public Parametros(Long id, Estaticas estaticasId, String nombre, String descripcion, Boolean estado) {
		this.id = id;
		this.estaticasId = estaticasId;
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

	public Estaticas getEstaticasId() {
		return estaticasId;
	}

	public void setEstaticasId(Estaticas estaticasId) {
		this.estaticasId = estaticasId;
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
		return "Parametros [id=" + id + ", estaticasId=" + estaticasId + ", nombre=" + nombre + ", descripcion="
				+ descripcion + ", estado=" + estado + "]";
	}

}
