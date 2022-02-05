package com.hsaa.colibri.entity.seguridad.controlErrores;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hsaa.colibri.entity.config.Auditoria;

@Entity
@Table(name = "SSPCATE")
public class CatalogoErrores extends Auditoria {

	@Id
	@Column(name = "C_IDCATE", nullable = false, insertable = true, updatable = true, length = 8)
	private String codigoCatalogoError;

	@Column(name = "C_DESCRI", nullable = false, insertable = true, updatable = true, length = 200)
	private String descripcionCatalogoError;

	public String getCodigoCatalogoError() {
		return codigoCatalogoError;
	}

	public void setCodigoCatalogoError(String codigoCatalogoError) {
		this.codigoCatalogoError = codigoCatalogoError;
	}

	public String getDescripcionCatalogoError() {
		return descripcionCatalogoError;
	}

	public void setDescripcionCatalogoError(String descripcionCatalogoError) {
		this.descripcionCatalogoError = descripcionCatalogoError;
	}

	public CatalogoErrores(String codigoCatalogoError, String descripcionCatalogoError) {
		super();
		this.codigoCatalogoError = codigoCatalogoError;
		this.descripcionCatalogoError = descripcionCatalogoError;
	}

	public CatalogoErrores() {

	}

}