package com.hsaa.colibri.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hsaa.colibri.entities.SSEmpresa;

@Repository
public interface SSEmpresaRepository extends JpaRepository<SSEmpresa, Integer>{

}
