package com.hsaa.colibri.entity.seguridad.controlErrores;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.hsaa.colibri.entity.config.Auditoria;

@Entity
@Table(name = "SSTCERR")
public class ControlError extends Auditoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "N_IDCERR", unique = true, nullable = false, insertable = true, updatable = true, precision = 15, scale = 0)
	private Long identificadorControlError;

	// CODIGO EMPRESA

	// CODIGO USUARIO

	@Column(name = "C_CODERR", nullable = false, insertable = true, updatable = true, length = 8)
	private String codigoError;

	@Column(name = "C_DESERR", nullable = false, insertable = true, updatable = true, length = 200)
	private String descripcionError;

	@Column(name = "C_NOMPRO", nullable = false, insertable = true, updatable = true, length = 500)
	private String nombreProceso;

	@Temporal(TemporalType.DATE)
	@Column(name = "D_FECPRO", unique = false, nullable = false, insertable = true, updatable = true, length = 7)
	private Date fechaProceso;

	@Column(name = "C_HORPRO", unique = false, nullable = false, insertable = true, updatable = true, length = 8)
	private String horaProceso;

	public Long getIdentificadorControlError() {
		return identificadorControlError;
	}

	public void setIdentificadorControlError(Long identificadorControlError) {
		this.identificadorControlError = identificadorControlError;
	}

	public String getCodigoError() {
		return codigoError;
	}

	public void setCodigoError(String codigoError) {
		this.codigoError = codigoError;
	}

	public String getDescripcionError() {
		return descripcionError;
	}

	public void setDescripcionError(String descripcionError) {
		this.descripcionError = descripcionError;
	}

	public String getNombreProceso() {
		return nombreProceso;
	}

	public void setNombreProceso(String nombreProceso) {
		this.nombreProceso = nombreProceso;
	}

	public Date getFechaProceso() {
		return fechaProceso;
	}

	public void setFechaProceso(Date fechaProceso) {
		this.fechaProceso = fechaProceso;
	}

	public String getHoraProceso() {
		return horaProceso;
	}

	public void setHoraProceso(String horaProceso) {
		this.horaProceso = horaProceso;
	}

	public ControlError(Long identificadorControlError, String codigoError, String descripcionError,
			String nombreProceso, Date fechaProceso, String horaProceso) {
		super();
		this.identificadorControlError = identificadorControlError;
		this.codigoError = codigoError;
		this.descripcionError = descripcionError;
		this.nombreProceso = nombreProceso;
		this.fechaProceso = fechaProceso;
		this.horaProceso = horaProceso;
	}

	public ControlError() {

	}

}
