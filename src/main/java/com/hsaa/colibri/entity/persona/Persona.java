package com.hsaa.colibri.entity.persona;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.hsaa.colibri.entity.config.Auditoria;
import com.hsaa.colibri.entity.seguridad.parametria.EstadoCivilPersona;
import com.hsaa.colibri.entity.seguridad.parametria.TipoDocumentoPersona;

@Entity
@Table(name = "PEMPERS")
public class Persona extends Auditoria{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "N_CODPER", unique = true, nullable = false, insertable = true, updatable = true, precision = 15, scale = 0)
	private Long codigoPersona;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "N_IDDOPE", nullable = false, insertable = true, updatable = true)
	private TipoDocumentoPersona tipoDocumentoPersona;

	@Column(name = "C_NUMDOC", unique = true, nullable = false, insertable = true, updatable = true, length = 15)
	private String numeroDocumento;

	@Column(name = "C_TIPER", nullable = false, insertable = true, updatable = true, length = 1)
	private String tipoPersona;

	@Column(name = "C_APEPAT", nullable = true, insertable = true, updatable = true, length = 30)
	private String apellidoPaterno;

	@Column(name = "C_APEMAT", nullable = true, insertable = true, updatable = true, length = 30)
	private String apellidoMaterno;

	@Column(name = "C_PRINOM", nullable = true, insertable = true, updatable = true, length = 30)
	private String primerNombre;

	@Column(name = "C_SEGNOM", nullable = true, insertable = true, updatable = true, length = 30)
	private String segundoNombre;

	@Column(name = "C_OTRNOM", nullable = true, insertable = true, updatable = true, length = 30)
	private String otroNombre;

	@Column(name = "C_RAZSOC", nullable = true, insertable = true, updatable = true, length = 60)
	private String razonSocial;

	@Column(name = "C_NOMPER", nullable = true, insertable = true, updatable = true, length = 150)
	private String nombreCompletoPersona;

	@Column(name = "C_NUMRUC", nullable = true, insertable = true, updatable = true, length = 11)
	private String numeroRUC;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "N_IDESCI", nullable = false, insertable = true, updatable = true)
	private EstadoCivilPersona estadoCivilPersona;

	@Column(name = "C_GENERO", nullable = true, insertable = true, updatable = true, length = 1)
	private String genero;

	@Temporal(TemporalType.DATE)
	@Column(name = "D_FECNAC", nullable = true, insertable = true, updatable = true, length = 7)
	private Date fechaNacimiento;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "persona")
	private List<Telefono> listTelefono;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "persona")
	private List<Direccion> listDireccion;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "persona")
	private List<CorreoElectronico> listCorreoElectronico;

	public Long getCodigoPersona() {
		return codigoPersona;
	}

	public void setCodigoPersona(Long codigoPersona) {
		this.codigoPersona = codigoPersona;
	}

	public TipoDocumentoPersona getTipoDocumentoPersona() {
		return tipoDocumentoPersona;
	}

	public void setTipoDocumentoPersona(TipoDocumentoPersona tipoDocumentoPersona) {
		this.tipoDocumentoPersona = tipoDocumentoPersona;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getOtroNombre() {
		return otroNombre;
	}

	public void setOtroNombre(String otroNombre) {
		this.otroNombre = otroNombre;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getNombreCompletoPersona() {
		return nombreCompletoPersona;
	}

	public void setNombreCompletoPersona(String nombreCompletoPersona) {
		this.nombreCompletoPersona = nombreCompletoPersona;
	}

	public String getNumeroRUC() {
		return numeroRUC;
	}

	public void setNumeroRUC(String numeroRUC) {
		this.numeroRUC = numeroRUC;
	}

	public EstadoCivilPersona getEstadoCivilPersona() {
		return estadoCivilPersona;
	}

	public void setEstadoCivilPersona(EstadoCivilPersona estadoCivilPersona) {
		this.estadoCivilPersona = estadoCivilPersona;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public List<Telefono> getListTelefono() {
		return listTelefono;
	}

	public void setListTelefono(List<Telefono> listTelefono) {
		this.listTelefono = listTelefono;
	}

	public List<Direccion> getListDireccion() {
		return listDireccion;
	}

	public void setListDireccion(List<Direccion> listDireccion) {
		this.listDireccion = listDireccion;
	}

	public List<CorreoElectronico> getListCorreoElectronico() {
		return listCorreoElectronico;
	}

	public void setListCorreoElectronico(List<CorreoElectronico> listCorreoElectronico) {
		this.listCorreoElectronico = listCorreoElectronico;
	}

	public Persona(Long codigoPersona, TipoDocumentoPersona tipoDocumentoPersona, String numeroDocumento,
			String tipoPersona, String apellidoPaterno, String apellidoMaterno, String primerNombre,
			String segundoNombre, String otroNombre, String razonSocial, String nombreCompletoPersona, String numeroRUC,
			EstadoCivilPersona estadoCivilPersona, String genero, Date fechaNacimiento, List<Telefono> listTelefono,
			List<Direccion> listDireccion, List<CorreoElectronico> listCorreoElectronico) {
		super();
		this.codigoPersona = codigoPersona;
		this.tipoDocumentoPersona = tipoDocumentoPersona;
		this.numeroDocumento = numeroDocumento;
		this.tipoPersona = tipoPersona;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.otroNombre = otroNombre;
		this.razonSocial = razonSocial;
		this.nombreCompletoPersona = nombreCompletoPersona;
		this.numeroRUC = numeroRUC;
		this.estadoCivilPersona = estadoCivilPersona;
		this.genero = genero;
		this.fechaNacimiento = fechaNacimiento;
		this.listTelefono = listTelefono;
		this.listDireccion = listDireccion;
		this.listCorreoElectronico = listCorreoElectronico;
	}

	public Persona() {

	}

}