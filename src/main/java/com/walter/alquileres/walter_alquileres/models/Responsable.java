package com.walter.alquileres.walter_alquileres.models;

public class Responsable {
	
//	CAMPOS
	
	private Long id;
	private Sucursales sucursalesId;
	private Usuarios usuariosId;
	private Boolean estado;
	
//	CONSTRUCTORES
	
	public Responsable() {
	}
	
	public Responsable(Long id, Sucursales sucursalesId, Usuarios usuariosId, Boolean estado) {
		this.id = id;
		this.sucursalesId = sucursalesId;
		this.usuariosId = usuariosId;
		this.estado = estado;
	}
	
//	GETTERS Y SETTERS

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Sucursales getSucursalesId() {
		return sucursalesId;
	}

	public void setSucursalesId(Sucursales sucursalesId) {
		this.sucursalesId = sucursalesId;
	}

	public Usuarios getUsuariosId() {
		return usuariosId;
	}

	public void setUsuariosId(Usuarios usuariosId) {
		this.usuariosId = usuariosId;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Responsable [id=" + id + ", sucursalesId=" + sucursalesId + ", usuariosId=" + usuariosId + ", estado="
				+ estado + "]";
	}

}
