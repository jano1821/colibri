package com.hsaa.colibri.entity.seguridad.parametria;

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
@Table(name = "SSPUBIG")
public class Ubigeo extends Auditoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "N_IDUBIG", unique = true, nullable = false, insertable = true, updatable = true, precision = 4, scale = 0)
	private Long identificadorUbigeo;

	@Column(name = "C_CODDPT", nullable = false, insertable = true, updatable = true, length = 2)
	private String codigoDepartamento;

	@Column(name = "C_CODPRO", nullable = false, insertable = true, updatable = true, length = 2)
	private String codigoProvincia;

	@Column(name = "C_CODDIS", nullable = false, insertable = true, updatable = true, length = 2)
	private String codigoDistrito;

	@Column(name = "C_DESCRI", nullable = false, insertable = true, updatable = true, length = 50)
	private String descripcionUbigeo;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "N_IDPAIS", nullable = false, insertable = true, updatable = true)
	private Pais pais;

	@Column(name = "C_CODPOS", nullable = true, insertable = true, updatable = true, length = 10)
	private String codigoPostal;

	public Long getIdentificadorUbigeo() {
		return identificadorUbigeo;
	}

	public void setIdentificadorUbigeo(Long identificadorUbigeo) {
		this.identificadorUbigeo = identificadorUbigeo;
	}

	public String getCodigoDepartamento() {
		return codigoDepartamento;
	}

	public void setCodigoDepartamento(String codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}

	public String getCodigoProvincia() {
		return codigoProvincia;
	}

	public void setCodigoProvincia(String codigoProvincia) {
		this.codigoProvincia = codigoProvincia;
	}

	public String getCodigoDistrito() {
		return codigoDistrito;
	}

	public void setCodigoDistrito(String codigoDistrito) {
		this.codigoDistrito = codigoDistrito;
	}

	public String getDescripcionUbigeo() {
		return descripcionUbigeo;
	}

	public void setDescripcionUbigeo(String descripcionUbigeo) {
		this.descripcionUbigeo = descripcionUbigeo;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public Ubigeo(Long identificadorUbigeo, String codigoDepartamento, String codigoProvincia, String codigoDistrito,
			String descripcionUbigeo, Pais pais, String codigoPostal) {
		super();
		this.identificadorUbigeo = identificadorUbigeo;
		this.codigoDepartamento = codigoDepartamento;
		this.codigoProvincia = codigoProvincia;
		this.codigoDistrito = codigoDistrito;
		this.descripcionUbigeo = descripcionUbigeo;
		this.pais = pais;
		this.codigoPostal = codigoPostal;
	}

	public Ubigeo() {

	}

}