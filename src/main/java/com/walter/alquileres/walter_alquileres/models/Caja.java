package com.walter.alquileres.walter_alquileres.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Caja {

//	CAMPOS
	
	private Long id;
	private Sucursales sucursalesId;
	private BigDecimal montoApertura;
	private LocalDate fecha;
	private LocalTime horaApertura;
	private LocalTime horaCierre;
	private String descripcion;
	private Boolean estado;
	
//	CONSTRUCTORES
	
	public Caja() {
	}
	
	public Caja(Long id, Sucursales sucursalesId, BigDecimal montoApertura, LocalDate fecha, LocalTime horaApertura,
			LocalTime horaCierre, String descripcion, Boolean estado) {
		this.id = id;
		this.sucursalesId = sucursalesId;
		this.montoApertura = montoApertura;
		this.fecha = fecha;
		this.horaApertura = horaApertura;
		this.horaCierre = horaCierre;
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

	public Sucursales getSucursalesId() {
		return sucursalesId;
	}

	public void setSucursalesId(Sucursales sucursalesId) {
		this.sucursalesId = sucursalesId;
	}

	public BigDecimal getMontoApertura() {
		return montoApertura;
	}

	public void setMontoApertura(BigDecimal montoApertura) {
		this.montoApertura = montoApertura;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHoraApertura() {
		return horaApertura;
	}

	public void setHoraApertura(LocalTime horaApertura) {
		this.horaApertura = horaApertura;
	}

	public LocalTime getHoraCierre() {
		return horaCierre;
	}

	public void setHoraCierre(LocalTime horaCierre) {
		this.horaCierre = horaCierre;
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
		return "Caja [id=" + id + ", sucursalesId=" + sucursalesId + ", montoApertura=" + montoApertura + ", fecha="
				+ fecha + ", horaApertura=" + horaApertura + ", horaCierre=" + horaCierre + ", descripcion="
				+ descripcion + ", estado=" + estado + "]";
	}
	
}
