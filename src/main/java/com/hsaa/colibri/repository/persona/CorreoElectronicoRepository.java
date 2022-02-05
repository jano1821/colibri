package com.hsaa.colibri.repository.persona;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hsaa.colibri.entity.persona.CorreoElectronico;

@Repository("correoElectronicoRepository")
public interface CorreoElectronicoRepository extends JpaRepository<CorreoElectronico, Long>{
	
	@Query(value = "SELECT model FROM CorreoElectronico model WHERE model.persona.codigoPersona = :codigoPersona "
			+ "AND model.estadoRegistro = 'S'")
	public abstract CorreoElectronico findByCodigoPersona(@Param("codigoPersona") Long codigoPersona);

}