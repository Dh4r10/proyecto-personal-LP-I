package com.walter.alquileres.walter_alquileres.models;

import java.time.LocalDate;

public class Inquilinos {
	
//	CAMPOS

	private Long id;
	private String tipoDocumento;
	private String numDocumento;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private LocalDate fechaNacimiento;
	private Boolean estado;
	
//	CONSTRUCTORES
	
	public Inquilinos() {
	}
	
	public Inquilinos(Long id, String tipoDocumento, String numDocumento, String nombre, String apellidoPaterno,
			String apellidoMaterno, LocalDate fechaNacimiento, Boolean estado) {
		this.id = id;
		this.tipoDocumento = tipoDocumento;
		this.numDocumento = numDocumento;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.fechaNacimiento = fechaNacimiento;
		this.estado = estado;
	}
	
//	GETTERS Y SETTERS

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Inquilinos [id=" + id + ", tipoDocumento=" + tipoDocumento + ", numDocumento=" + numDocumento
				+ ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno
				+ ", fechaNacimiento=" + fechaNacimiento + ", estado=" + estado + "]";
	}
	
}
