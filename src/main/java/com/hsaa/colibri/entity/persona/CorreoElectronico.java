package com.hsaa.colibri.entity.persona;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.hsaa.colibri.entity.config.Auditoria;

@Entity
@Table(name = "PEDCOEL")
public class CorreoElectronico extends Auditoria{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "N_IDCOEL", unique = true, nullable = false, insertable = true, updatable = true, precision = 15, scale = 0)
	private Long identificadorCorreoElectronico;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "N_CODPER", nullable = false, insertable = true, updatable = true)
	private Persona persona;

	@Column(name = "C_CORELE", nullable = false, insertable = true, updatable = true, length = 50)
	private String nombreCorreoElectronico;

	public Long getIdentificadorCorreoElectronico() {
		return identificadorCorreoElectronico;
	}

	public void setIdentificadorCorreoElectronico(Long identificadorCorreoElectronico) {
		this.identificadorCorreoElectronico = identificadorCorreoElectronico;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public String getNombreCorreoElectronico() {
		return nombreCorreoElectronico;
	}

	public void setNombreCorreoElectronico(String nombreCorreoElectronico) {
		this.nombreCorreoElectronico = nombreCorreoElectronico;
	}

	public CorreoElectronico(Long identificadorCorreoElectronico, Persona persona, String nombreCorreoElectronico) {
		super();
		this.identificadorCorreoElectronico = identificadorCorreoElectronico;
		this.persona = persona;
		this.nombreCorreoElectronico = nombreCorreoElectronico;
	}

	public CorreoElectronico() {

	}

}