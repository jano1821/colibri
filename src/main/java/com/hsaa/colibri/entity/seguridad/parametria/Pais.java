package com.hsaa.colibri.entity.seguridad.parametria;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hsaa.colibri.entity.config.Auditoria;

@Entity
@Table(name = "SSPPAIS")
public class Pais extends Auditoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "N_IDPAIS", unique = true, nullable = false, insertable = true, updatable = true, precision = 3, scale = 0)
	private Long identificadorPais;

	@Column(name = "C_DESCRI", nullable = false, insertable = true, updatable = true, length = 100)
	private String descripcionPais;

	@Column(name = "C_ABREVI", nullable = false, insertable = true, updatable = true, length = 30)
	private String abreviaturaPais;

	public Long getIdentificadorPais() {
		return identificadorPais;
	}

	public void setIdentificadorPais(Long identificadorPais) {
		this.identificadorPais = identificadorPais;
	}

	public String getDescripcionPais() {
		return descripcionPais;
	}

	public void setDescripcionPais(String descripcionPais) {
		this.descripcionPais = descripcionPais;
	}

	public String getAbreviaturaPais() {
		return abreviaturaPais;
	}

	public void setAbreviaturaPais(String abreviaturaPais) {
		this.abreviaturaPais = abreviaturaPais;
	}

	public Pais(Long identificadorPais, String descripcionPais, String abreviaturaPais) {
		super();
		this.identificadorPais = identificadorPais;
		this.descripcionPais = descripcionPais;
		this.abreviaturaPais = abreviaturaPais;
	}

	public Pais() {

	}

}