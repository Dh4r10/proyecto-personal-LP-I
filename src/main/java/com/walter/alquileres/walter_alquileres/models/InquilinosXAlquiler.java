package com.walter.alquileres.walter_alquileres.models;

public class InquilinosXAlquiler {
	
//	CAMPOS
	
	private Long id;
	private Inquilinos inquilinosId;
	private Alquiler alquilerId;
	private String descripcion;
	private Boolean estado;
	
//	CONSTRUCTORES
	
	public InquilinosXAlquiler() {
	}
	
	public InquilinosXAlquiler(Long id, Inquilinos inquilinosId, Alquiler alquilerId, String descripcion,
			Boolean estado) {
		this.id = id;
		this.inquilinosId = inquilinosId;
		this.alquilerId = alquilerId;
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

	public Inquilinos getInquilinosId() {
		return inquilinosId;
	}

	public void setInquilinosId(Inquilinos inquilinosId) {
		this.inquilinosId = inquilinosId;
	}

	public Alquiler getAlquilerId() {
		return alquilerId;
	}

	public void setAlquilerId(Alquiler alquilerId) {
		this.alquilerId = alquilerId;
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
		return "InquilinosXAlquiler [id=" + id + ", inquilinosId=" + inquilinosId + ", alquilerId=" + alquilerId
				+ ", descripcion=" + descripcion + ", estado=" + estado + "]";
	}

}
