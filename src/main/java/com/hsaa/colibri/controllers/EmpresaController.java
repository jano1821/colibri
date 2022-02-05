package com.hsaa.colibri.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hsaa.colibri.json.EmpresaRest;
import com.hsaa.colibri.service.adminSistema.EmpresaService;

@RestController
@RequestMapping(path = "/empresas" + "/v1")
public class EmpresaController {

	@Autowired
	EmpresaService ssEmpresaService;

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "emp"+"/{"+"id"+"}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public EmpresaRest getById(@PathVariable Integer id) {
		EmpresaRest s = ssEmpresaService.findByID(id);
		return s;
	}
}
