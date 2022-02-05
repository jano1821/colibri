package com.hsaa.colibri.entity.config;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class Auditoria implements Entidad{
	
	@Column(name = "A_ESTREG", nullable = false, length = 1, insertable = true, updatable = true)
	private String estadoRegistro;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "A_FECINS", nullable = false, insertable = true, updatable = false, length = 7)
	private Date fechaInsercion;

	@Column(name = "A_USUINS", nullable = false, insertable = true, updatable = false, length = 100)
	private String usuarioInsercion;

	@Column(name = "A_OSYINS", nullable = false, insertable = true, updatable = false, length = 50)
	private String osInsercion;

	@Column(name = "A_BROINS", nullable = false, insertable = true, updatable = false, length = 50)
	private String browserInsercion;

	@Column(name = "A_DEVINS", nullable = false, insertable = true, updatable = false, length = 50)
	private String deviceInsercion;

	@Column(name = "A_SCRINS", nullable = false, insertable = true, updatable = false, length = 50)
	private String screenInsercion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "A_FECMOD", nullable = true, insertable = true, updatable = true, length = 7)
	private Date fechaModificacion;

	@Column(name = "A_USUMOD", nullable = true, insertable = true, updatable = true, length = 100)
	private String usuarioModificacion;

	@Column(name = "A_OSYMOD", nullable = true, insertable = true, updatable = true, length = 50)
	private String osModificacion;

	@Column(name = "A_BROMOD", nullable = true, insertable = true, updatable = true, length = 50)
	private String browserModificacion;

	@Column(name = "A_DEVMOD", nullable = true, insertable = true, updatable = true, length = 50)
	private String deviceModificacion;

	@Column(name = "A_SCRMOD", nullable = true, insertable = true, updatable = true, length = 50)
	private String screenModificacion;

	public String getEstadoRegistro() {
		return estadoRegistro;
	}

	public void setEstadoRegistro(String estadoRegistro) {
		this.estadoRegistro = estadoRegistro;
	}

	public Date getFechaInsercion() {
		return fechaInsercion;
	}

	public void setFechaInsercion(Date fechaInsercion) {
		this.fechaInsercion = fechaInsercion;
	}

	public String getUsuarioInsercion() {
		return usuarioInsercion;
	}

	public void setUsuarioInsercion(String usuarioInsercion) {
		this.usuarioInsercion = usuarioInsercion;
	}

	public String getOsInsercion() {
		return osInsercion;
	}

	public void setOsInsercion(String osInsercion) {
		this.osInsercion = osInsercion;
	}

	public String getBrowserInsercion() {
		return browserInsercion;
	}

	public void setBrowserInsercion(String browserInsercion) {
		this.browserInsercion = browserInsercion;
	}

	public String getDeviceInsercion() {
		return deviceInsercion;
	}

	public void setDeviceInsercion(String deviceInsercion) {
		this.deviceInsercion = deviceInsercion;
	}

	public String getScreenInsercion() {
		return screenInsercion;
	}

	public void setScreenInsercion(String screenInsercion) {
		this.screenInsercion = screenInsercion;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public String getUsuarioModificacion() {
		return usuarioModificacion;
	}

	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

	public String getOsModificacion() {
		return osModificacion;
	}

	public void setOsModificacion(String osModificacion) {
		this.osModificacion = osModificacion;
	}

	public String getBrowserModificacion() {
		return browserModificacion;
	}

	public void setBrowserModificacion(String browserModificacion) {
		this.browserModificacion = browserModificacion;
	}

	public String getDeviceModificacion() {
		return deviceModificacion;
	}

	public void setDeviceModificacion(String deviceModificacion) {
		this.deviceModificacion = deviceModificacion;
	}

	public String getScreenModificacion() {
		return screenModificacion;
	}

	public void setScreenModificacion(String screenModificacion) {
		this.screenModificacion = screenModificacion;
	}

}