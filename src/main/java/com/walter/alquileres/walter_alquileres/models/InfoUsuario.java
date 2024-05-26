package com.walter.alquileres.walter_alquileres.models;

import java.time.LocalDate;

public class InfoUsuario {
	
//	CAMPOS
	
	private Long id;
	private String dni;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private LocalDate fechaNacimiento;
	private String correo;
	private String celular;
	private Boolean estado;
	
//	CONSTRUCTORES
	
	public InfoUsuario() {
	}
	
	public InfoUsuario(Long id, String dni, String nombre, String apellidoPaterno, String apellidoMaterno,
			LocalDate fechaNacimiento, String correo, String celular, Boolean estado) {
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.fechaNacimiento = fechaNacimiento;
		this.correo = correo;
		this.celular = celular;
		this.estado = estado;
	}
	
//	GETTERS Y SETTERS

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "InfoUsuario [id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno
				+ ", apellidoMaterno=" + apellidoMaterno + ", fechaNacimiento=" + fechaNacimiento + ", correo=" + correo
				+ ", celular=" + celular + ", estado=" + estado + "]";
	}

}
