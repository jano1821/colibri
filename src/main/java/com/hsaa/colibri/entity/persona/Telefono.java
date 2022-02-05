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
@Table(name = "PEDTELF")
public class Telefono extends Auditoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "N_IDTELF", unique = true, nullable = false, insertable = true, updatable = true, precision = 15, scale = 0)
	private Long identificadorTelefono;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "N_CODPER", nullable = false, insertable = true, updatable = true)
	private Persona persona;

	@Column(name = "C_TIPTEL", nullable = false, insertable = true, updatable = true, length = 1)
	private String tipoTelefono;

	@Column(name = "C_NUMTEL", nullable = false, insertable = true, updatable = true, length = 20)
	private String numeroTelefono;

	public Long getIdentificadorTelefono() {
		return identificadorTelefono;
	}

	public void setIdentificadorTelefono(Long identificadorTelefono) {
		this.identificadorTelefono = identificadorTelefono;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public String getTipoTelefono() {
		return tipoTelefono;
	}

	public void setTipoTelefono(String tipoTelefono) {
		this.tipoTelefono = tipoTelefono;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public Telefono(Long identificadorTelefono, Persona persona, String tipoTelefono, String numeroTelefono) {
		super();
		this.identificadorTelefono = identificadorTelefono;
		this.persona = persona;
		this.tipoTelefono = tipoTelefono;
		this.numeroTelefono = numeroTelefono;
	}

	public Telefono() {

	}

}