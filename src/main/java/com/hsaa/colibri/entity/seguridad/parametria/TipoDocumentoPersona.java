package com.hsaa.colibri.entity.seguridad.parametria;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hsaa.colibri.entity.config.Auditoria;

@Entity
@Table(name = "SSPDOPE")
public class TipoDocumentoPersona extends Auditoria{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "N_IDDOPE", unique = true, nullable = false, insertable = true, updatable = true, precision = 6, scale = 0)
	private Long identificadorTipoDocumento;

	@Column(name = "C_DESCRI", nullable = false, insertable = true, updatable = true, length = 30)
	private String descripcionTipoDocumento;

	@Column(name = "C_ABREVI", nullable = false, insertable = true, updatable = true, length = 10)
	private String abreviaturaTipoDocumento;

	@Column(name = "C_TIPPER", nullable = false, insertable = true, updatable = true, length = 1)
	private String tipoPersona;

	public Long getIdentificadorTipoDocumento() {
		return identificadorTipoDocumento;
	}

	public void setIdentificadorTipoDocumento(Long identificadorTipoDocumento) {
		this.identificadorTipoDocumento = identificadorTipoDocumento;
	}

	public String getDescripcionTipoDocumento() {
		return descripcionTipoDocumento;
	}

	public void setDescripcionTipoDocumento(String descripcionTipoDocumento) {
		this.descripcionTipoDocumento = descripcionTipoDocumento;
	}

	public String getAbreviaturaTipoDocumento() {
		return abreviaturaTipoDocumento;
	}

	public void setAbreviaturaTipoDocumento(String abreviaturaTipoDocumento) {
		this.abreviaturaTipoDocumento = abreviaturaTipoDocumento;
	}

	public String getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public TipoDocumentoPersona(Long identificadorTipoDocumento, String descripcionTipoDocumento,
			String abreviaturaTipoDocumento, String tipoPersona) {
		super();
		this.identificadorTipoDocumento = identificadorTipoDocumento;
		this.descripcionTipoDocumento = descripcionTipoDocumento;
		this.abreviaturaTipoDocumento = abreviaturaTipoDocumento;
		this.tipoPersona = tipoPersona;
	}

	public TipoDocumentoPersona() {

	}

}