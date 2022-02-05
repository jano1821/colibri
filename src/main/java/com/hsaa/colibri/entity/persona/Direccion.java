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
import com.hsaa.colibri.entity.seguridad.parametria.Ubigeo;

@Entity
@Table(name = "PEDDIRE")
public class Direccion extends Auditoria{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "N_IDDIRE", unique = true, nullable = false, insertable = true, updatable = true, precision = 15, scale = 0)
	private Long identificadorDireccion;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "N_CODPER", nullable = false, insertable = true, updatable = true)
	private Persona persona;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "N_IDUBIG", nullable = false, insertable = true, updatable = true)
	private Ubigeo ubigeo;

	@Column(name = "C_DESDIR", nullable = false, insertable = true, updatable = true, length = 300)
	private String descripcionDireccion;

	public Long getIdentificadorDireccion() {
		return identificadorDireccion;
	}

	public void setIdentificadorDireccion(Long identificadorDireccion) {
		this.identificadorDireccion = identificadorDireccion;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Ubigeo getUbigeo() {
		return ubigeo;
	}

	public void setUbigeo(Ubigeo ubigeo) {
		this.ubigeo = ubigeo;
	}

	public String getDescripcionDireccion() {
		return descripcionDireccion;
	}

	public void setDescripcionDireccion(String descripcionDireccion) {
		this.descripcionDireccion = descripcionDireccion;
	}

	public Direccion(Long identificadorDireccion, Persona persona, Ubigeo ubigeo, String descripcionDireccion) {
		super();
		this.identificadorDireccion = identificadorDireccion;
		this.persona = persona;
		this.ubigeo = ubigeo;
		this.descripcionDireccion = descripcionDireccion;
	}

	public Direccion() {

	}

}