package com.hsaa.colibri.service.impl.adminSistema;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ConfigurationCondition.ConfigurationPhase;
import org.springframework.stereotype.Service;

import com.hsaa.colibri.entity.adminSistema.Empresa;
import com.hsaa.colibri.repository.adminSistema.EmpresaRepository;
import com.hsaa.colibri.service.adminSistema.EmpresaService;
import com.hssa.colibri.jsons.SSEmpresaRest;

@Service
public class EmpresaServiceImpl implements EmpresaService {

	@Autowired
	EmpresaRepository ssEmpresaRepository;

	public static final ModelMapper MODEL_MAPPER = new ModelMapper();

	@Override
	public SSEmpresaRest findByID(Integer id) {
//		MODEL_MAPPER.getConfiguration().setFieldMatchingEnabled(true)
//		.setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);
		Optional<Empresa> s = ssEmpresaRepository.findById(id);
		return MODEL_MAPPER.map(s, SSEmpresaRest.class);
	}

}
