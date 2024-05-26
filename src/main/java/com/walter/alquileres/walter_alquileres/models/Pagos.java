package com.walter.alquileres.walter_alquileres.models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pagos {
	
//	CAMPOS

	private Long id;
	private Movimiento movimientoId;
	private Pendiente pendienteId;
	private String codRecibo;
	private String tipoRecibo;
	private LocalDate fechaEmision;
	private LocalDate fechaVencimiento;
	private String condicionVenta;
	private String metodoPago;
	private String moneda;
	private Integer cantidad;
	private String unidadMedida;
	private BigDecimal opExonerada;
	private BigDecimal tasaIgv;
	private BigDecimal descuento;
	private Boolean estado;
	
//	CONSTRUCTOR
	
	public Pagos() {
	}
	
	public Pagos(Long id, Movimiento movimientoId, Pendiente pendienteId, String codRecibo, String tipoRecibo,
			LocalDate fechaEmision, LocalDate fechaVencimiento, String condicionVenta, String metodoPago, String moneda,
			Integer cantidad, String unidadMedida, BigDecimal opExonerada, BigDecimal tasaIgv, BigDecimal descuento,
			Boolean estado) {
		this.id = id;
		this.movimientoId = movimientoId;
		this.pendienteId = pendienteId;
		this.codRecibo = codRecibo;
		this.tipoRecibo = tipoRecibo;
		this.fechaEmision = fechaEmision;
		this.fechaVencimiento = fechaVencimiento;
		this.condicionVenta = condicionVenta;
		this.metodoPago = metodoPago;
		this.moneda = moneda;
		this.cantidad = cantidad;
		this.unidadMedida = unidadMedida;
		this.opExonerada = opExonerada;
		this.tasaIgv = tasaIgv;
		this.descuento = descuento;
		this.estado = estado;
	}
	
//	GETTERS Y SETTERS

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Movimiento getMovimientoId() {
		return movimientoId;
	}

	public void setMovimientoId(Movimiento movimientoId) {
		this.movimientoId = movimientoId;
	}

	public Pendiente getPendienteId() {
		return pendienteId;
	}

	public void setPendienteId(Pendiente pendienteId) {
		this.pendienteId = pendienteId;
	}

	public String getCodRecibo() {
		return codRecibo;
	}

	public void setCodRecibo(String codRecibo) {
		this.codRecibo = codRecibo;
	}

	public String getTipoRecibo() {
		return tipoRecibo;
	}

	public void setTipoRecibo(String tipoRecibo) {
		this.tipoRecibo = tipoRecibo;
	}

	public LocalDate getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(LocalDate fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getCondicionVenta() {
		return condicionVenta;
	}

	public void setCondicionVenta(String condicionVenta) {
		this.condicionVenta = condicionVenta;
	}

	public String getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public BigDecimal getOpExonerada() {
		return opExonerada;
	}

	public void setOpExonerada(BigDecimal opExonerada) {
		this.opExonerada = opExonerada;
	}

	public BigDecimal getTasaIgv() {
		return tasaIgv;
	}

	public void setTasaIgv(BigDecimal tasaIgv) {
		this.tasaIgv = tasaIgv;
	}

	public BigDecimal getDescuento() {
		return descuento;
	}

	public void setDescuento(BigDecimal descuento) {
		this.descuento = descuento;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Pagos [id=" + id + ", movimientoId=" + movimientoId + ", pendienteId=" + pendienteId + ", codRecibo="
				+ codRecibo + ", tipoRecibo=" + tipoRecibo + ", fechaEmision=" + fechaEmision + ", fechaVencimiento="
				+ fechaVencimiento + ", condicionVenta=" + condicionVenta + ", metodoPago=" + metodoPago + ", moneda="
				+ moneda + ", cantidad=" + cantidad + ", unidadMedida=" + unidadMedida + ", opExonerada=" + opExonerada
				+ ", tasaIgv=" + tasaIgv + ", descuento=" + descuento + ", estado=" + estado + "]";
	}
	
}
