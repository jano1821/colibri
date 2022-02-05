package com.hsaa.colibri.entity.adminSistema;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.hsaa.colibri.entity.config.Auditoria;


@Entity
@Table(name = "SSTEMPR")
public class Empresa extends Auditoria {

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
	 
	 @OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "ssEmpresa") 
	private List<Dependencia> lstDependencias;
	
	
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
	public List<Dependencia> getLstDependencias() {
		return lstDependencias;
	}
	public void setLstDependencias(List<Dependencia> lstDependencias) {
		this.lstDependencias = lstDependencias;
	}
	
	

}
