package com.hsaa.colibri.utilities;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class AbstractService {

	protected Long _toLong(Object objeto) {
		return StringUtil.toLong(objeto);
	}

	protected Integer _toInteger(Object objeto) {
		return StringUtil.toInteger(objeto);
	}

	protected Short _toShort(Object objeto) {
		return StringUtil.toShort(objeto);
	}

	protected Double _toDouble(Object objeto) {
		return StringUtil.toDouble(objeto);
	}

	protected Float _toFloat(Object objeto) {
		return StringUtil.toFloat(objeto);
	}

	protected String _toBlank(String cadena) {
		return StringUtil.toBlank(cadena);
	}

	protected String _toBlankObject(Object object) {
		return StringUtil.toBlankObject(object);
	}

	protected String _toStr(Object object) {
		return StringUtil.toStr(object);
	}

	protected boolean _isEmpty(Object object) {
		return StringUtil.isEmpty(object);
	}

	protected String _subStr(String cadena, int indexFin) {
		return StringUtil.subStr(cadena, indexFin);
	}

	protected String _subStr(String cadena, int indexInicio, int indexFin) {
		return StringUtil.subStr(cadena, indexInicio, indexFin);
	}

	protected String _isEmpty(String object, String defaultValue) {
		return _isEmpty(object) ? defaultValue : object;
	}

	protected boolean _equiv(Object cadena1, Object cadena2) {
		return StringUtil.equiv(cadena1, cadena2);
	}

	protected boolean _inList(String cadena, String... valores) {
		return StringUtil.inList(cadena, valores);
	}

	/**
	 * Este metodo devuelbe una clase Pageable con datos cargados segun parametros
	 * 
	 * @param pagina
	 * @param cantidad
	 * @param campo
	 * @param ordenar
	 * @param descendente
	 * @return
	 */
	protected Pageable obtenerIndexPorPagina(Integer pagina, Integer cantidad, String campo, boolean ordenar,
			boolean descendente) {

		Integer index = 0;
		Pageable pageable;

		index = (pagina - 1);

		if (ordenar) {
			if (descendente) {
				pageable = PageRequest.of(index, cantidad, Sort.by(campo).descending());
			} else {
				pageable = PageRequest.of(index, cantidad, Sort.by(campo));
			}
		} else {
			pageable = PageRequest.of(index, cantidad);
		}
		return pageable;
	}
	
}