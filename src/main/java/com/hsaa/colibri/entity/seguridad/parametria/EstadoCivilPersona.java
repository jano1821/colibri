package com.hsaa.colibri.entity.seguridad.parametria;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hsaa.colibri.entity.config.Auditoria;

@Entity
@Table(name = "SSPESCI")
public class EstadoCivilPersona extends Auditoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "N_IDESCI", unique = true, nullable = false, insertable = true, updatable = true, precision = 6, scale = 0)
	private Long identificadorEstadoCivil;

	@Column(name = "C_DESCRI", nullable = false, insertable = true, updatable = true, length = 20)
	private String descripcionEstadoCivil;

	@Column(name = "C_ABREVI", nullable = false, insertable = true, updatable = true, length = 10)
	private String abreviaturaEstadoCivil;

	public Long getIdentificadorEstadoCivil() {
		return identificadorEstadoCivil;
	}

	public void setIdentificadorEstadoCivil(Long identificadorEstadoCivil) {
		this.identificadorEstadoCivil = identificadorEstadoCivil;
	}

	public String getDescripcionEstadoCivil() {
		return descripcionEstadoCivil;
	}

	public void setDescripcionEstadoCivil(String descripcionEstadoCivil) {
		this.descripcionEstadoCivil = descripcionEstadoCivil;
	}

	public String getAbreviaturaEstadoCivil() {
		return abreviaturaEstadoCivil;
	}

	public void setAbreviaturaEstadoCivil(String abreviaturaEstadoCivil) {
		this.abreviaturaEstadoCivil = abreviaturaEstadoCivil;
	}

	public EstadoCivilPersona(Long identificadorEstadoCivil, String descripcionEstadoCivil,
			String abreviaturaEstadoCivil) {
		super();
		this.identificadorEstadoCivil = identificadorEstadoCivil;
		this.descripcionEstadoCivil = descripcionEstadoCivil;
		this.abreviaturaEstadoCivil = abreviaturaEstadoCivil;
	}

	public EstadoCivilPersona() {

	}

}