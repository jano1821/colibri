package com.hsaa.colibri.repository.persona;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hsaa.colibri.entity.persona.Persona;

@Repository("personaRepository")
public interface PersonaRepository extends JpaRepository<Persona, Long> {

	@Query(value = "SELECT model FROM Persona AS model WHERE model.estadoRegistro = 'S' ORDER BY model.codigoPersona DESC", 
			countQuery = "SELECT COUNT(model) FROM Persona AS model WHERE model.estadoRegistro = 'S'")
	public abstract Page<Persona> getListPersona(Pageable pageable);

	@Query(value = "SELECT model FROM Persona AS model WHERE model.tipoPersona = :tipoPersona AND model.estadoRegistro = 'S'", 
			countQuery = "SELECT COUNT(model) FROM Persona AS model WHERE model.tipoPersona = :tipoPersona AND model.estadoRegistro = 'S'")
	public abstract Page<Persona> getListPersonaByTipoPersona(@Param("tipoPersona") String tipoPersona,
			Pageable pageable);
	
	@Query(value = "SELECT model FROM Persona AS model WHERE model.numeroDocumento = :numeroDocumento",
			countQuery = "SELECT COUNT(model) FROM Persona AS model WHERE model.numeroDocumento = :numeroDocumento")
	public abstract Page<Persona> getListPersonaByNumeroDocumento(@Param("numeroDocumento") String numeroDocumento,
			Pageable pageable);
	
	@Query(value = "SELECT model FROM Persona AS model WHERE model.tipoDocumentoPersona.identificadorTipoDocumento = :identificadorTipoDocumento "
			+ "AND model.numeroDocumento = :numeroDocumento",
			countQuery = "SELECT COUNT(model) FROM Persona AS model WHERE model.tipoDocumentoPersona.identificadorTipoDocumento = :identificadorTipoDocumento "
					+ "AND model.numeroDocumento = :numeroDocumento")
	public abstract Page<Persona> getListPersonaByTipoDocumentoNumeroDocumento(@Param("identificadorTipoDocumento") Long identificadorTipoDocumento,
			@Param("numeroDocumento") String numeroDocumento, Pageable pageable);
	
	@Query(value = "SELECT model FROM Persona AS model WHERE model.nombreCompletoPersona LIKE :nombreCompletoPersona",
			countQuery = "SELECT COUNT(model) FROM Persona AS model WHERE model.nombreCompletoPersona LIKE :nombreCompletoPersona")
	public abstract Page<Persona> getListPersonaByNombreCompleto(@Param("nombreCompletoPersona") String nombreCompletoPersona,
			Pageable pageable);
	
}