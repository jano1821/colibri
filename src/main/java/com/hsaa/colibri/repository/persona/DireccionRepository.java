package com.hsaa.colibri.repository.persona;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hsaa.colibri.entity.persona.Direccion;

@Repository("direccionRepository")
public interface DireccionRepository extends JpaRepository<Direccion, Long>{
	
	@Query(value = "SELECT model FROM Direccion model WHERE model.persona.codigoPersona = :codigoPersona "
			+ "AND model.estadoRegistro = 'S'")
	public abstract Direccion findByCodigoPersona(@Param("codigoPersona") Long codigoPersona);

}