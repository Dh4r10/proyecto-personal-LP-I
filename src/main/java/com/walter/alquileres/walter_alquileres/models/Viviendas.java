package com.walter.alquileres.walter_alquileres.models;

import java.math.BigDecimal;

public class Viviendas {

//	CAMPOS
	
	private Long id;
	private Sucursales sucursalesId;
	private String nombre;
	private String descripcion;
	private BigDecimal precio;
	private Integer numHabitaciones;
	private Integer numCamas;
	private String tipoVivienda;
	private Boolean estado;
	
//	CONSTRUCTORES
	
	public Viviendas() {
	}
	
	public Viviendas(Long id, Sucursales sucursalesId, String nombre, String descripcion, BigDecimal precio,
			Integer numHabitaciones, Integer numCamas, String tipoVivienda, Boolean estado) {
		this.id = id;
		this.sucursalesId = sucursalesId;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.numHabitaciones = numHabitaciones;
		this.numCamas = numCamas;
		this.tipoVivienda = tipoVivienda;
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

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Integer getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(Integer numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public Integer getNumCamas() {
		return numCamas;
	}

	public void setNumCamas(Integer numCamas) {
		this.numCamas = numCamas;
	}

	public String getTipoVivienda() {
		return tipoVivienda;
	}

	public void setTipoVivienda(String tipoVivienda) {
		this.tipoVivienda = tipoVivienda;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Viviendas [id=" + id + ", sucursalesId=" + sucursalesId + ", nombre=" + nombre + ", descripcion="
				+ descripcion + ", precio=" + precio + ", numHabitaciones=" + numHabitaciones + ", numCamas=" + numCamas
				+ ", tipoVivienda=" + tipoVivienda + ", estado=" + estado + "]";
	}
	
}
