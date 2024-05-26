package com.walter.alquileres.walter_alquileres.models;

import java.math.BigDecimal;

public class Movimiento {
	
//	CAMPOS
	
	private Long id;
	private Caja cajaId;
	private String tipoMovimiento;
	private BigDecimal monto;
	private String descripcion;
	private Boolean estado;
	
//	CONSTRUCTORES
	
	public Movimiento() {
	}
	
	public Movimiento(Long id, Caja cajaId, String tipoMovimiento, BigDecimal monto, String descripcion,
			Boolean estado) {
		this.id = id;
		this.cajaId = cajaId;
		this.tipoMovimiento = tipoMovimiento;
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

	public Caja getCajaId() {
		return cajaId;
	}

	public void setCajaId(Caja cajaId) {
		this.cajaId = cajaId;
	}

	public String getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(String tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
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
		return "Movimiento [id=" + id + ", cajaId=" + cajaId + ", tipoMovimiento=" + tipoMovimiento + ", monto=" + monto
				+ ", descripcion=" + descripcion + ", estado=" + estado + "]";
	}

}
