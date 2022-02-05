package com.hsaa.colibri.repository.persona;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hsaa.colibri.entity.persona.Telefono;

@Repository("telefonoRepository")
public interface TelefonoRepository extends JpaRepository<Telefono, Long>{
	
	@Query(value = "SELECT model FROM Telefono model WHERE model.persona.codigoPersona = :codigoPersona "
			+ "AND model.tipoTelefono = :tipoTelefono AND model.estadoRegistro = 'S'")
	public abstract Telefono findByCodigoPersonaAndTipoPersona(@Param("codigoPersona") Long codigoPersona,
			@Param("tipoTelefono") String tipoTelefono);

}