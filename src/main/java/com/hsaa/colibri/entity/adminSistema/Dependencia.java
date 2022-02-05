package com.hsaa.colibri.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "SSTDEPE")
public class SSDependencia extends Auditable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8470675856926815834L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "N_IDENTI", nullable = false, unique = true)
	private int id;
	
	 @Column(name = "C_CODIGO", length = 10)
	private String codigo;
	 
	 @Column(name = "C_DESCRI", length = 100)
	private String descripcion;
	 
	 @Column(name = "C_ABREVI", length = 30)
	private String abreviatura;
	 
	@ManyToOne(cascade = {}, fetch = FetchType.LAZY)
    @JoinColumn(name = "N_CODEMP", unique = false, nullable = false)
	private SSEmpresa ssEmpresa;
	
	 @OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "ssDependencia") 
	private List<SSUsuario> lstUsuarios;
	
	
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getAbreviatura() {
		return abreviatura;
	}
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	
	

}
