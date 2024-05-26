package com.walter.alquileres.walter_alquileres.models;

public class Pendiente {
	
//	CAMPOS
	
	private Long id;
	private CronogramaPagos cronogramaPagosId;
	private String descripcion;
	private Boolean estado;
	
//	CONSTRUCTORES
	
	public Pendiente() {
	}
	
	public Pendiente(Long id, CronogramaPagos cronogramaPagosId, String descripcion, Boolean estado) {
		this.id = id;
		this.cronogramaPagosId = cronogramaPagosId;
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

	public CronogramaPagos getCronogramaPagosId() {
		return cronogramaPagosId;
	}

	public void setCronogramaPagosId(CronogramaPagos cronogramaPagosId) {
		this.cronogramaPagosId = cronogramaPagosId;
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
		return "Pendiente [id=" + id + ", cronogramaPagosId=" + cronogramaPagosId + ", descripcion=" + descripcion
				+ ", estado=" + estado + "]";
	}
	
}
