package com.hsaa.colibri.repository.seguridad.controlErrores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hsaa.colibri.entity.seguridad.controlErrores.ControlError;

@Repository("controlErrorRepository")
public interface ControlErrorRepository extends JpaRepository<ControlError, Long>{

}
