package com.hsaa.colibri.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmpresaRest {
	
	@JsonProperty("id")
	private int id;
	
	@JsonProperty("codigo")
	private String codigo;
	 
	@JsonProperty("descripcion")
	private String descripcion;
	 
	@JsonProperty("abreviatura")
	private String abreviatura;
	 

}
