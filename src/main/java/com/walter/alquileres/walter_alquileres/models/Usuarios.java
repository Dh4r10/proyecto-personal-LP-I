package com.walter.alquileres.walter_alquileres.models;

import java.time.LocalDateTime;
import java.util.UUID;

public class Usuarios {
	
//	CAMPOS
	
	private Long id;
	private TipoUsuario tipoUsuarioId;
	private InfoUsuario infoUsuarioId;
	private UUID idPublico;
	private String username;
	private String password;
	private LocalDateTime ultimoIngreso;
	private LocalDateTime ultimoCierre;
	private LocalDateTime fechaCreacion;
	private Boolean estado;
	
//	CONSTRUCTOR
	
	public Usuarios() {
	}
	
	public Usuarios(Long id, TipoUsuario tipoUsuarioId, InfoUsuario infoUsuarioId, UUID idPublico, String username,
			String password, LocalDateTime ultimoIngreso, LocalDateTime ultimoCierre, LocalDateTime fechaCreacion,
			Boolean estado) {
		this.id = id;
		this.tipoUsuarioId = tipoUsuarioId;
		this.infoUsuarioId = infoUsuarioId;
		this.idPublico = idPublico;
		this.username = username;
		this.password = password;
		this.ultimoIngreso = ultimoIngreso;
		this.ultimoCierre = ultimoCierre;
		this.fechaCreacion = fechaCreacion;
		this.estado = estado;
	}
	
//	GETTERS Y SETTERS

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoUsuario getTipoUsuarioId() {
		return tipoUsuarioId;
	}

	public void setTipoUsuarioId(TipoUsuario tipoUsuarioId) {
		this.tipoUsuarioId = tipoUsuarioId;
	}

	public InfoUsuario getInfoUsuarioId() {
		return infoUsuarioId;
	}

	public void setInfoUsuarioId(InfoUsuario infoUsuarioId) {
		this.infoUsuarioId = infoUsuarioId;
	}

	public UUID getIdPublico() {
		return idPublico;
	}

	public void setIdPublico(UUID idPublico) {
		this.idPublico = idPublico;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDateTime getUltimoIngreso() {
		return ultimoIngreso;
	}

	public void setUltimoIngreso(LocalDateTime ultimoIngreso) {
		this.ultimoIngreso = ultimoIngreso;
	}

	public LocalDateTime getUltimoCierre() {
		return ultimoCierre;
	}

	public void setUltimoCierre(LocalDateTime ultimoCierre) {
		this.ultimoCierre = ultimoCierre;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", tipoUsuarioId=" + tipoUsuarioId + ", infoUsuarioId=" + infoUsuarioId
				+ ", idPublico=" + idPublico + ", username=" + username + ", password=" + password + ", ultimoIngreso="
				+ ultimoIngreso + ", ultimoCierre=" + ultimoCierre + ", fechaCreacion=" + fechaCreacion + ", estado="
				+ estado + "]";
	}

}
