package com.hsaa.colibri.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Auditable implements Entidad {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8328590692059198658L;
	@Column(name = "C_ESTREG", length = 1)
	private String estadoRegistro;

	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "A_FECINS")
	private Date fechaInsercion;
	
	 @Column(name = "A_USUINS")
	private int usuarioInsercion;
	 
	 @Column(name = "A_OSYINS", length = 20)
	private String osInsercion;
	 
	 @Column(name = "A_BROINS", length = 20)
	private String browserInsercion;
	 
	 @Column(name = "A_DEVINS", length = 20)
	private String deviceInsercion;
	 
	 @Column(name = "A_SCRINS", length = 20)
	private String screenrInsercion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "A_FECMOD")
	private Date fechaModificacion;
	
	 @Column(name = "A_USUMOD")
	private int usuarioModificacion;
	 
	 @Column(name = "A_OSYMOD", length = 20)
	private String osModificacion;
	 
	 @Column(name = "A_BROMOD", length = 20)
	private String browserModificacion;
	 
	 @Column(name = "A_DEVMOD", length = 20)
	private String deviceModificacion;
	 
	 @Column(name = "A_SCRMOD", length = 20)
	private String screenrModificacion;

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

	public int getUsuarioInsercion() {
		return usuarioInsercion;
	}

	public void setUsuarioInsercion(int usuarioInsercion) {
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

	public String getScreenrInsercion() {
		return screenrInsercion;
	}

	public void setScreenrInsercion(String screenrInsercion) {
		this.screenrInsercion = screenrInsercion;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public int getUsuarioModificacion() {
		return usuarioModificacion;
	}

	public void setUsuarioModificacion(int usuarioModificacion) {
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

	public String getScreenrModificacion() {
		return screenrModificacion;
	}

	public void setScreenrModificacion(String screenrModificacion) {
		this.screenrModificacion = screenrModificacion;
	}

}
