package com.hsaa.colibri.services.impl;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ConfigurationCondition.ConfigurationPhase;
import org.springframework.stereotype.Service;

import com.hsaa.colibri.entities.SSEmpresa;
import com.hsaa.colibri.repositories.SSEmpresaRepository;
import com.hsaa.colibri.services.SSEmpresaService;
import com.hssa.colibri.jsons.SSEmpresaRest;

@Service
public class SSEmpresaServiceImpl implements SSEmpresaService {

	@Autowired
	SSEmpresaRepository ssEmpresaRepository;

	public static final ModelMapper MODEL_MAPPER = new ModelMapper();

	@Override
	public SSEmpresaRest findByID(Integer id) {
//		MODEL_MAPPER.getConfiguration().setFieldMatchingEnabled(true)
//		.setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);
		Optional<SSEmpresa> s = ssEmpresaRepository.findById(id);
		return MODEL_MAPPER.map(s, SSEmpresaRest.class);
	}

}
