package com.walter.alquileres.walter_alquileres.models;

public class Permisos {
	
//	CAMPOS
	
	private Long id;
	private TipoUsuario tipoUsuarioId;
	private Modulos modulosId;
	private String nombre;
	private String descripcion;
	private Boolean estado;
	
//	CONSTRUCTORES
	
	public Permisos() {
	}
	
	public Permisos(Long id, TipoUsuario tipoUsuarioId, Modulos modulosId, String nombre, String descripcion,
			Boolean estado) {
		this.id = id;
		this.tipoUsuarioId = tipoUsuarioId;
		this.modulosId = modulosId;
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

	public TipoUsuario getTipoUsuarioId() {
		return tipoUsuarioId;
	}

	public void setTipoUsuarioId(TipoUsuario tipoUsuarioId) {
		this.tipoUsuarioId = tipoUsuarioId;
	}

	public Modulos getModulosId() {
		return modulosId;
	}

	public void setModulosId(Modulos modulosId) {
		this.modulosId = modulosId;
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
		return "Permisos [id=" + id + ", tipoUsuarioId=" + tipoUsuarioId + ", modulosId=" + modulosId + ", nombre="
				+ nombre + ", descripcion=" + descripcion + ", estado=" + estado + "]";
	}
	
}
