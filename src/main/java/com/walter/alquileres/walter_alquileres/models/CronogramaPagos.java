package com.walter.alquileres.walter_alquileres.models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CronogramaPagos {
	
//	CAMPOS
	
	private Long id;
	private Alquiler alquilerId;
	private LocalDate fechaInicial;
	private LocalDate fechaFinal;
	private BigDecimal monto;
	private String descripcion;
	private Boolean estado;
	
//	CONSTRUCTORES
	
	public CronogramaPagos() {
	}
	
	public CronogramaPagos(Long id, Alquiler alquilerId, LocalDate fechaInicial, LocalDate fechaFinal, BigDecimal monto,
			String descripcion, Boolean estado) {
		this.id = id;
		this.alquilerId = alquilerId;
		this.fechaInicial = fechaInicial;
		this.fechaFinal = fechaFinal;
		this.monto = monto;
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

	public Alquiler getAlquilerId() {
		return alquilerId;
	}

	public void setAlquilerId(Alquiler alquilerId) {
		this.alquilerId = alquilerId;
	}

	public LocalDate getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(LocalDate fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public LocalDate getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(LocalDate fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
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
		return "CronogramaPagos [id=" + id + ", alquilerId=" + alquilerId + ", fechaInicial=" + fechaInicial
				+ ", fechaFinal=" + fechaFinal + ", monto=" + monto + ", descripcion=" + descripcion + ", estado="
				+ estado + "]";
	}
	
}
