package com.hsaa.colibri.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SSTUSUA")
public class SSUsuario extends Auditable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8470675856926815834L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "N_IDENTI", nullable = false, unique = true)
	private int id;
	
	 @Column(name = "C_CODIGO", length = 15)
	private String codigo;
	 
	 @Column(name = "C_DESCRI", length = 100)
	private String nombre;
	 
	@ManyToOne(cascade = {}, fetch = FetchType.LAZY)
    @JoinColumn(name = "N_CODDEP", unique = false, nullable = false)
	private SSDependencia ssDependencia;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public SSDependencia getSsDependencia() {
		return ssDependencia;
	}
	public void setSsDependencia(SSDependencia ssDependencia) {
		this.ssDependencia = ssDependencia;
	}
	
	
	

}