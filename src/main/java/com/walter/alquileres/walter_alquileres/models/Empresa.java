package com.walter.alquileres.walter_alquileres.models;

public class Empresa {

//	CAMPOS
	
	private Arrendatario arrendatarioId;
	private String tipoRuc;
	private String ruc;
	private String razonSocial;
	private Boolean estado;
	
//	CONSTRUCTORES
	
	public Empresa() {
	}
	
	public Empresa(Arrendatario arrendatarioId, String tipoRuc, String ruc, String razonSocial, Boolean estado) {
		this.arrendatarioId = arrendatarioId;
		this.tipoRuc = tipoRuc;
		this.ruc = ruc;
		this.razonSocial = razonSocial;
		this.estado = estado;
	}
	
//	GETTERS Y SETTERS

	public Arrendatario getArrendatarioId() {
		return arrendatarioId;
	}

	public void setArrendatarioId(Arrendatario arrendatarioId) {
		this.arrendatarioId = arrendatarioId;
	}

	public String getTipoRuc() {
		return tipoRuc;
	}

	public void setTipoRuc(String tipoRuc) {
		this.tipoRuc = tipoRuc;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Empresa [arrendatarioId=" + arrendatarioId + ", tipoRuc=" + tipoRuc + ", ruc=" + ruc + ", razonSocial="
				+ razonSocial + ", estado=" + estado + "]";
	}
	
}
