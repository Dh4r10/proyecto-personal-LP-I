package com.walter.alquileres.walter_alquileres.models;

import java.time.LocalDate;

public class Arrendatario {
	
//	CAMPOS
	
	private Long id;
	private String tipoDocumento;
	private String numDocumento;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private LocalDate fechaNacimiento;
	private String departamentoDomicilio;
	private String provinciaDomicilio;
	private String distritoDomicilio;
	private String domicilio;
	private String correo;
	private String celular;
	private Boolean conRuc;
	private Boolean estado;
	
//	CONSTRUCTORES
	
	public Arrendatario() {
	}
	
	public Arrendatario(Long id, String tipoDocumento, String numDocumento, String nomnbre, String apellidoPaterno,
			String apellidoMaterno, LocalDate fechaNacimiento, String departamentoDomicilio, String provinciaDomicilio,
			String distritoDomicilio, String domicilio, String correo, String celular, Boolean conRuc, Boolean estado) {
		this.id = id;
		this.tipoDocumento = tipoDocumento;
		this.numDocumento = numDocumento;
		this.nombre = nomnbre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.fechaNacimiento = fechaNacimiento;
		this.departamentoDomicilio = departamentoDomicilio;
		this.provinciaDomicilio = provinciaDomicilio;
		this.distritoDomicilio = distritoDomicilio;
		this.domicilio = domicilio;
		this.correo = correo;
		this.celular = celular;
		this.conRuc = conRuc;
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

	public String getDepartamentoDomicilio() {
		return departamentoDomicilio;
	}

	public void setDepartamentoDomicilio(String departamentoDomicilio) {
		this.departamentoDomicilio = departamentoDomicilio;
	}

	public String getProvinciaDomicilio() {
		return provinciaDomicilio;
	}

	public void setProvinciaDomicilio(String provinciaDomicilio) {
		this.provinciaDomicilio = provinciaDomicilio;
	}

	public String getDistritoDomicilio() {
		return distritoDomicilio;
	}

	public void setDistritoDomicilio(String distritoDomicilio) {
		this.distritoDomicilio = distritoDomicilio;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Boolean getConRuc() {
		return conRuc;
	}

	public void setConRuc(Boolean conRuc) {
		this.conRuc = conRuc;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Arrendatario [id=" + id + ", tipoDocumento=" + tipoDocumento + ", numDocumento=" + numDocumento
				+ ", nomnbre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno="
				+ apellidoMaterno + ", fechaNacimiento=" + fechaNacimiento + ", departamentoDomicilio="
				+ departamentoDomicilio + ", provinciaDomicilio=" + provinciaDomicilio + ", distritoDomicilio="
				+ distritoDomicilio + ", domicilio=" + domicilio + ", correo=" + correo + ", celular=" + celular
				+ ", conRuc=" + conRuc + ", estado=" + estado + "]";
	}

}
