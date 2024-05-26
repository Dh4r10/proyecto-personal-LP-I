package com.walter.alquileres.walter_alquileres.models;

import java.time.LocalDate;

public class Alquiler {
	
//	CAMPOS

	private Long id;
	private Viviendas viviendasId;
	private Arrendatario arrendatarioId;
	private LocalDate fechaEntrada;
	private LocalDate fechaSalida;
	private String descripcion;
	private Boolean arrendatarioInquilino;
	private Boolean estado;
	
//	CONSTRUCTORES
	
	public Alquiler() {
	}
	
	public Alquiler(Long id, Viviendas viviendasId, Arrendatario arrendatarioId, LocalDate fechaEntrada,
			LocalDate fechaSalida, String descripcion, Boolean arrendatarioInquilino, Boolean estado) {
		this.id = id;
		this.viviendasId = viviendasId;
		this.arrendatarioId = arrendatarioId;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.descripcion = descripcion;
		this.arrendatarioInquilino = arrendatarioInquilino;
		this.estado = estado;
	}
	
//	GETTERS Y SETTERS

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Viviendas getViviendasId() {
		return viviendasId;
	}

	public void setViviendasId(Viviendas viviendasId) {
		this.viviendasId = viviendasId;
	}

	public Arrendatario getArrendatarioId() {
		return arrendatarioId;
	}

	public void setArrendatarioId(Arrendatario arrendatarioId) {
		this.arrendatarioId = arrendatarioId;
	}

	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(LocalDate fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public LocalDate getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Boolean getArrendatarioInquilino() {
		return arrendatarioInquilino;
	}

	public void setArrendatarioInquilino(Boolean arrendatarioInquilino) {
		this.arrendatarioInquilino = arrendatarioInquilino;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Alquiler [id=" + id + ", viviendasId=" + viviendasId + ", arrendatarioId=" + arrendatarioId
				+ ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida + ", descripcion=" + descripcion
				+ ", arrendatarioInquilino=" + arrendatarioInquilino + ", estado=" + estado + "]";
	}
	
}
