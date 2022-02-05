package com.hsaa.colibri.utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class FormatoFecha {

	public String obtenerFechaActual() {
		int dia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		int mes = Calendar.getInstance().get(Calendar.MONTH);
		int anio = Calendar.getInstance().get(Calendar.YEAR);

		String strDia = dia < 10 ? "0" + dia : dia + "";
		String strMes = mes < 9 ? "0" + (mes + 1) : (mes + 1) + "";
		String fecha = strDia + "/" + strMes + "/" + anio;

		return fecha;
	}

	public String obtenerFechaActualInverso() {
		int dia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		int mes = Calendar.getInstance().get(Calendar.MONTH);
		int anio = Calendar.getInstance().get(Calendar.YEAR);

		String strDia = dia < 10 ? "0" + dia : dia + "";
		String strMes = mes < 10 ? "0" + (mes + 1) : (mes + 1) + "";
		String fecha = anio + "/" + strMes + "/" + strDia;

		return fecha;
	}

	/**
	 * Metodo que permite formatear la fecha en formato AAAA-MM-DD al formato
	 * DD/MM/AAAA
	 * 
	 * @param strCadena Cadena
	 * @return Fecha formateada
	 */
	public String obtenerFecha(String strCadena) {
		// Si la fecha viene con datos de la hora, estos son descartados
		if (strCadena.length() > 10)
			strCadena = strCadena.substring(0, 10);

		if (strCadena.length() == 10) {
			String strResultado = strCadena.substring(8) + "/" + strCadena.substring(5, 7) + "/"
					+ strCadena.substring(0, 4);
			return strResultado;
		} else
			return strCadena;
	}

	/**
	 * Devuelve una cadena de fecha formateada tipo dd/mm/yyyy
	 * 
	 * @param fecha : parametro de entrada de tipo yyyy-mm-dd
	 * @return cadena fecha ejemplo [02/09/2006]
	 */
	public static String obtenerFechaFromyyyymmddG(String fecha) {

		String fechaFinal = null;

		if (!StringUtil.isEmpty(fecha) && fecha.length() == 10) {
			String[] arrFecha = CadenaUtil.desencadenar(fecha, "-");
			fechaFinal = arrFecha[2] + "/" + arrFecha[1] + "/" + arrFecha[0];
		}
		return fechaFinal;
	}

	/**
	 * Devuelve una cadena de fecha formateada tipo dd/mm/yyyy
	 * 
	 * @param fecha : parametro de entrada de tipo yyyy/mm/dd
	 * @return cadena fecha ejemplo [02/09/2006]
	 */
	public static String obtenerFechaFromyyyymmddS(String fecha) {

		String fechaFinal = null;

		if (!StringUtil.isEmpty(fecha) && fecha.length() == 10) {
			String[] arrFecha = CadenaUtil.desencadenar(fecha, "/");
			fechaFinal = arrFecha[2] + "-" + arrFecha[1] + "-" + arrFecha[0];
		}
		return fechaFinal;
	}

	public static String dateUtilToStringDDMMYYYY(Date date) {
		if (StringUtil.isEmpty(date))
			return null;

		return new SimpleDateFormat("dd/MM/yyyy").format(date);
	}

	public static String dateToStringYYYYMMDD(Date date) {
		if (StringUtil.isEmpty(date))
			return null;

		return new SimpleDateFormat("yyyy/MM/dd").format(date);
	}

	public static String dateToStringDDMMYYYYHHMMSS(Date date) {
		if (StringUtil.isEmpty(date))
			return null;

		return new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(date);
	}

	public static String dateToStringDDMMYYYY24HHMMSS(Date date) {
		if (StringUtil.isEmpty(date))
			return null;

		return new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(date);
	}

	public static java.sql.Date stringToSqlDate(String fecha) {

		java.sql.Date dFecha = null;

		if (!StringUtil.isEmpty(fecha) && fecha.length() == 10) {
			try {
				long lTime = new SimpleDateFormat("dd/MM/yyyy").parse(fecha).getTime();
				dFecha = new java.sql.Date(lTime);
			} catch (Exception e) {
				return null;
			}
		}
		return dFecha;
	}

	public static java.util.Date stringToUtilDate(String fecha) {

		Date dFecha = null;

		if (!StringUtil.isEmpty(fecha) && fecha.length() == 10) {
			try {
				long lTime = new SimpleDateFormat("dd/MM/yyyy").parse(fecha).getTime();
				dFecha = new Date(lTime);
			} catch (Exception e) {
				return null;
			}
		}
		return dFecha;
	}

	public static String datetoString(Date fecha) {
		return (new SimpleDateFormat("dd-MM-yyyy")).format(fecha);
	}

	public static java.util.Date stringSqlDate(String fecha) throws Exception {
		return (new SimpleDateFormat("yyyy-MM-dd")).parse(fecha);
	}

	public static Date stringToDateConFormato(String fecha, String formato) {

		Date dFecha = null;

		if (!StringUtil.isEmpty(fecha)) {
			try {
				long lTime = new SimpleDateFormat(formato).parse(fecha).getTime();
				dFecha = new Date(lTime);
			} catch (Exception e) {
				return null;
			}
		}
		return dFecha;
	}

	public static String stringddMMyyyyToStringMMddyyyy(String fecha) {

		Date dFecha = null;

		if (StringUtil.isEmpty(fecha))
			return null;

		try {
			dFecha = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
		} catch (Exception e) {
			e.printStackTrace();
			dFecha = null;
		}

		return new SimpleDateFormat("MM/dd/yyyy").format(dFecha);
	}

	public static String obtenerHora() {
		Calendar calendar = Calendar.getInstance();

		int intHora = calendar.get(Calendar.HOUR_OF_DAY);
		int intMinutos = calendar.get(Calendar.MINUTE);
		int intSegundos = calendar.get(Calendar.SECOND);

		String strHora = intHora < 10 ? "0" + intHora : intHora + "";
		String strMinutos = intMinutos < 10 ? "0" + (intMinutos) : (intMinutos) + "";
		String strSegundos = intSegundos < 10 ? "0" + (intSegundos) : (intSegundos) + "";
		String strHoraCompleta = strHora + ":" + strMinutos + ":" + strSegundos;

		return strHoraCompleta;
	}

	public static String primerDiaMes(String strCadena) {
		String strResultado;
		strResultado = "01" + "/" + strCadena.substring(3, 5) + "/" + strCadena.substring(6, 10);
		return strResultado;
	}

	public static int obtenerAnios(Date fechaNac, Date fechaActual) {
		Calendar earlier = Calendar.getInstance();
		Calendar later = Calendar.getInstance();

		earlier.setTime(fechaNac);
		later.setTime(fechaActual);

		long millis = later.getTimeInMillis() - earlier.getTimeInMillis();
		long days = (long) millis / (1000 * 60 * 60 * 24) + 1; // +1 to make the end inclusive

		// Count number of february 29's between cal1 and cal2
		int startyear = earlier.get(Calendar.YEAR);
		int endyear = later.get(Calendar.YEAR);

		if (earlier.get(Calendar.MONTH) > Calendar.FEBRUARY)
			startyear++;

		if (later.get(Calendar.MONTH) < Calendar.FEBRUARY
				|| (later.get(Calendar.MONTH) == Calendar.FEBRUARY && later.get(Calendar.DAY_OF_MONTH) < 29))
			endyear--;

		int feb29s = 0;
		for (int i = startyear; i <= endyear; i++)
			if ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0))
				feb29s++;

		return (int) days / (365 + feb29s);
	}

	public static int diasTranscurridos(Date fechaInicial, Date fechaFinal, String tipoCalendario, String tipoCuenta) {

		int nNroMesesTmp;
		int diasTranscurridos = 0;

		Date dFechaInicioTmp;
		Date dFechaFinalTmp;

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		////////////////////////////////////////////////////////////
		// Valida el Tipo de Calendario de acuerdo al Tipo de Cuenta
		////////////////////////////////////////////////////////////
		String cTipoCalendario = tipoCalendario;

		Calendar cInicial = Calendar.getInstance();
		Calendar cFinal = Calendar.getInstance();
		cInicial.setTime(fechaInicial);
		cFinal.setTime(fechaFinal);

		if (cInicial.after(cFinal) || cInicial.equals(cFinal))
			return 0;

		// Descompone Fecha Inicial
		int nDiaInicial = cInicial.get(Calendar.DAY_OF_MONTH);
		int nMesInicial = cInicial.get(Calendar.MONTH) + 1;// Enero es 0
		int nAnioInicial = cInicial.get(Calendar.YEAR);

		// Descompone Fecha Final
		int nDiaFinal = cFinal.get(Calendar.DAY_OF_MONTH);
		int nMesFinal = cFinal.get(Calendar.MONTH) + 1;// Enero es 0
		int nAnioFinal = cFinal.get(Calendar.YEAR);

		// Ajusta El dia Final para Tipo Calendario Financiero
		if ("F".equals(cTipoCalendario)) {
			if (nDiaInicial > 30)
				nDiaInicial = 30;

			if (nDiaFinal > 30)
				nDiaFinal = 30;
		}

		/////////////////////////////////////////////////////
		// Calcula los Dias
		/////////////////////////////////////////////////////

		// Si el Calendario es Natural
		if ("N".equals(cTipoCalendario)) {

			/////////////////////////////////////////
			// Cuentas Activas (Pr�stamos)
			////////////////////////////////////////
			if ("A".equals(tipoCuenta)) {

				// Dias por A�o Transcurrido: Acumula 365 D�as por Cada a�o
				if ((nAnioFinal - nAnioInicial - 1) > 0)
					diasTranscurridos = (nAnioFinal - nAnioInicial - 1) * 365;

				// Cuando el A�o Final es mayor al A�o Inicial
				if (nAnioFinal > nAnioInicial) {

					try {
						///////////////////////////////////////
						/// Acumula Los Dias del Periodo Inicial
						///////////////////////////////////////
						// Dias del A�o Inicial
						dFechaInicioTmp = fechaInicial;
						dFechaFinalTmp = new Date(sdf.parse("31/12/" + nAnioInicial).getTime());
						diasTranscurridos = diasTranscurridos
								+ (int) ((dFechaFinalTmp.getTime() - dFechaInicioTmp.getTime())
										/ (1000 * 60 * 60 * 24));

						// Si entre los meses transcurridos se encuentra Febrero, validar que el a�o no
						// sea bisiesto,
						// en este caso le resta 1 d�a.
						if (nMesInicial < 2 && bisiesto(nAnioInicial))
							diasTranscurridos = diasTranscurridos - 1;

						/////////////////////////////////////
						/// Acumula Los Dias del Periodo Final
						/////////////////////////////////////

						// Dias del Anio Inicial
						dFechaInicioTmp = new Date(sdf.parse("01/01/" + nAnioFinal).getTime());
						dFechaFinalTmp = fechaFinal;

						diasTranscurridos = diasTranscurridos
								+ (int) ((dFechaFinalTmp.getTime() - dFechaInicioTmp.getTime())
										/ (1000 * 60 * 60 * 24));

						// Si entre los meses transcurridos se encuentra Febrero, validar que el a�o no
						// sea bisiesto,
						// en este caso le resta 1 d�a.
						if (nMesInicial < 2 && bisiesto(nAnioFinal))
							diasTranscurridos = diasTranscurridos - 1;
					} catch (ParseException e) {
						e.printStackTrace();
					}
				}

				// Cuando el A�o Final no es mayor al A�o Inicial
				else {

					// Dias entre fechas del mismo A�o
					dFechaInicioTmp = fechaInicial;
					dFechaFinalTmp = fechaFinal;

					diasTranscurridos = diasTranscurridos
							+ (int) ((dFechaFinalTmp.getTime() - dFechaInicioTmp.getTime()) / (1000 * 60 * 60 * 24));

					// Si entre los meses transcurridos se encuentra Febrero, validar que el a�o no
					// sea bisiesto,
					// en este caso le resta 1 d�a.
					if (nMesInicial < 2 && bisiesto(nAnioFinal))
						diasTranscurridos = diasTranscurridos - 1;
				}
			}

			/////////////////////////////////////////
			// Cuentas Pasivas
			/////////////////////////////////////////
			else
				diasTranscurridos = (int) ((fechaFinal.getTime() - fechaInicial.getTime()) / (1000 * 60 * 60 * 24));
		}
		// Si el Calendario es Financiero
		else {
			// Para el Último día de febrero considerar siempre 30
			if (nMesFinal == 2 && ultimoDiadelMes(nMesFinal, nAnioFinal) == nDiaFinal) {
				nDiaFinal = 30;
			}

			// Dias por Anio Transcurrido: Acumula 360 Dias por Cada anio
			if ((nAnioFinal - nAnioInicial - 1) > 0)
				diasTranscurridos = (nAnioFinal - nAnioInicial - 1) * 360;

			// Cuando el Anio Final es mayor al Anio Inicial
			if (nAnioFinal > nAnioInicial) {

				//////////////////////////////////////
				// Acumula Los Dias del Periodo Inicial
				//////////////////////////////////////

				// Dias de los meses del A�o Inicial
				nNroMesesTmp = 12 - nMesInicial;

				diasTranscurridos = diasTranscurridos + (nNroMesesTmp * 30);

				// Dias del Mes Inicial
				diasTranscurridos = diasTranscurridos + (30 - nDiaInicial);

				////////////////////////////////////
				// Acumula Los Dias del Periodo Final
				////////////////////////////////////

				// Dias de los meses del A�o Inicial
				nNroMesesTmp = nMesFinal - 1;

				diasTranscurridos = diasTranscurridos + (nNroMesesTmp * 30);

				// Dias del Mes Inicial
				diasTranscurridos = diasTranscurridos + nDiaFinal;
			}

			// Cuando el A�o Final no es mayor al A�o Inicial
			else {

				/////////////////////////////////
				// Dias entre fechas del mismo A�o
				/////////////////////////////////

				// Dias de los Meses del Periodo
				nNroMesesTmp = nMesFinal - nMesInicial - 1;

				if (nNroMesesTmp > 0)
					diasTranscurridos = diasTranscurridos + (30 * nNroMesesTmp);

				// Dias del Periodo
				if (nMesInicial == nMesFinal)
					diasTranscurridos = diasTranscurridos + (nDiaFinal - nDiaInicial);
				else {
					// Dias del Mes Inicial
					diasTranscurridos = diasTranscurridos + (30 - nDiaInicial);

					// Dias del Mes Final
					diasTranscurridos = diasTranscurridos + nDiaFinal;
				}
			}
		}
		return diasTranscurridos;
	}

	public static boolean bisiesto(int year) {
		return (year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0);
	}

	public static int ultimoDiadelMes(int mes, int anio) {
		int dias[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int maximodia = dias[mes - 1];
		if (mes == 2 && bisiesto(anio))
			++maximodia;
		return maximodia;
	}

	public static String obtenerAno(String fecha) {
		String ano = "";
		if (fecha != null && fecha.length() == 10) {
			String[] arrFecha = CadenaUtil.desencadenar(fecha, "/");
			ano = arrFecha[2];
		}
		return ano;
	}

	public static String obtenerMes(String fecha) {
		String mes = "";
		if (fecha != null && fecha.length() == 10) {
			String[] arrFecha = CadenaUtil.desencadenar(fecha, "/");
			mes = arrFecha[1];
		}
		return mes;
	}

	public static String obtenerDia(String fecha) {
		String mes = "";
		if (fecha != null && fecha.length() == 10) {
			String[] arrFecha = CadenaUtil.desencadenar(fecha, "/");
			mes = arrFecha[0];
		}
		return mes;
	}

	public static Date agregarDiasAFecha(Date fechaInicio, int diasAdicionar, String tipoCalendario,
			String tipoCuenta) {

		int nDiaFechaInicial;
		int nMesFechaInicial;
		int nAnioFechaInicial;

		int nDiaFechaFinal;
		int nMesFechaFinal;
		int nAnioFechaFinal;

		Date fechaCalculada = null;

		////////////////////////////////////////////////////////////
		// Valida el Tipo de Calendario de acuerdo al Tipo de Cuenta
		////////////////////////////////////////////////////////////
		String cTipoCalendario = tipoCalendario;
		if ("P".equals(tipoCuenta))
			cTipoCalendario = "N";

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(fechaInicio);

		// Descompone Fecha Inicial
		nDiaFechaInicial = calendar.get(Calendar.DAY_OF_MONTH);
		nMesFechaInicial = calendar.get(Calendar.MONTH) + 1;// Enero es 0
		nAnioFechaInicial = calendar.get(Calendar.YEAR);

		///////////////////////////
		// CALENDARIO NATURAL
		///////////////////////////
		if ("N".equals(cTipoCalendario)) {

			//////////////////////////////
			// Cuentas Activas (Pr�stamos)
			//////////////////////////////
			if ("A".equals(tipoCuenta)) {
				// diasAdicionar
				calendar.add(Calendar.DATE, diasAdicionar);
				fechaCalculada = new Date(calendar.getTimeInMillis());

				nDiaFechaFinal = calendar.get(Calendar.DAY_OF_MONTH);
				nMesFechaFinal = calendar.get(Calendar.MONTH) + 1;// Enero es 0
				nAnioFechaFinal = calendar.get(Calendar.YEAR);

				// Calcula los Anios entre Periodos
				int nAnioPeriodo = nAnioFechaFinal - nAnioFechaInicial - 1;
				if (nAnioPeriodo < 0)
					nAnioPeriodo = 0;

				int nBisiestos = 0;

				// Determina el Numero de Bisiestos entre los periodos calculados
				if (nAnioPeriodo > 0) {
					int nPeriodo = nAnioFechaInicial + 1;
					while (nPeriodo > (nAnioFechaFinal - 1)) {
						if (bisiesto(nPeriodo))
							nBisiestos = nBisiestos + 1;

						// Adiciona un periodo
						nPeriodo = nPeriodo + 1;
					}
				}

				// Analiza si existen Bisiestos en el A�o de la Fecha Inicial
				if (bisiesto(nAnioFechaInicial) && nMesFechaInicial <= 2 && nMesFechaFinal > 2)
					nBisiestos = nBisiestos + 1;

				// Analiza si existen Bisiestos en el A�o de la Fecha Final
				if (nAnioFechaFinal > nAnioFechaInicial && bisiesto(nAnioFechaFinal) && nMesFechaFinal > 2)
					nBisiestos = nBisiestos + 1;

				calendar.add(Calendar.DATE, nBisiestos * -1);
				fechaCalculada = new Date(calendar.getTimeInMillis());
			}

			//////////////////////////////
			// Cuentas Pasivas
			//////////////////////////////
			else {
				// El calendario se hab�a seteado con p: fechaInicio
				calendar.add(Calendar.DATE, diasAdicionar);
				fechaCalculada = new Date(calendar.getTimeInMillis());
			}
		}

		///////////////////////////
		// CALENDARIO FINANCIERO
		///////////////////////////
		else {

			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			// Resuelve Dia Final segun el Mes
			int nDias = nMesFechaInicial == 2 ? 28 : 30;
			if (nDiaFechaInicial > nDias)
				nDiaFechaInicial = 30;

			int nAniosAdicionar = diasAdicionar / 360;
			int nDiasPendientes = diasAdicionar - (nAniosAdicionar * 360);

			int nMesesAdicionar = nDiasPendientes / 30;
			nDiasPendientes -= nMesesAdicionar * 30;

			int nDiasAdicionar = nDiasPendientes;

			// Adiciona A�os
			nAnioFechaFinal = nAnioFechaInicial + nAniosAdicionar;

			// Adiciona Meses
			nMesFechaFinal = nMesFechaInicial + nMesesAdicionar;

			if (nMesFechaFinal > 12) {
				nAnioFechaFinal = nAnioFechaFinal + 1;
				nMesFechaFinal = nMesFechaFinal - 12;
			}

			// Adiciona Dias
			nDiaFechaFinal = nDiaFechaInicial + nDiasAdicionar;
			nDias = 30;
			if (nMesFechaFinal == 2)
				nDias = 28;

			if (nDiaFechaFinal > nDias) {
				nMesFechaFinal = nMesFechaFinal + 1;
				if (nMesFechaFinal > 12) {
					nAnioFechaFinal = nAnioFechaFinal + 1;
					nMesFechaFinal = nMesFechaFinal - 12;
				}

				nDiaFechaFinal = nDiaFechaFinal - nDias;
			}

			// Valida el Dia Final
			if (nMesFechaFinal == 2) {
				if (nDiaFechaFinal > 28)
					nDiaFechaFinal = 28;
			} else if (nDiaFechaFinal > 30)
				nDiaFechaFinal = 30;

			// Arma Fecha en base a Calculos
			try {
				fechaCalculada = new Date(
						sdf.parse(nDiaFechaFinal + "/" + nMesFechaFinal + "/" + nAnioFechaFinal).getTime());
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}

		return fechaCalculada;
	}

	public int obtenerDias(Date fecha1, Date fecha2) {

		Calendar earlier = Calendar.getInstance();
		Calendar later = Calendar.getInstance();

		earlier.setTime(fecha1);
		later.setTime(fecha2);

		long millis = later.getTimeInMillis() - earlier.getTimeInMillis();
		long days = (long) millis / (1000 * 60 * 60 * 24) + 1; // +1 to make the end inclusive

		return (int) days;
	}

	public static String obtenerUltimaFechaMes(int mes, int anio) {

		int dia = 0;

		String strDia = "";
		String strMes = "";

		String strFecha = null;

		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dia = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			dia = 30;
			break;
		case 2: {
			if (esBisiesto(anio))
				dia = 29;
			else
				dia = 28;
		}
			;
			break;
		}

		strDia = (dia < 10) ? ("0" + dia) : (dia + "");
		strMes = (mes < 10) ? ("0" + mes) : (mes + "");
		strFecha = strDia + "/" + strMes + "/" + anio;

		return strFecha;
	}

	public static boolean esBisiesto(int year) {
		return (year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0);
	}

	public static String obtenerNombreMes(Integer mes) {
		String[] names = { "Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic" };
		return names[mes - 1];
	}

	public static int calcularEdad(Date fechaNacimiento, Date fechaActual) {

		Calendar cal = Calendar.getInstance();
		Calendar now = Calendar.getInstance();

		cal.setTime(fechaNacimiento);
		now.setTime(fechaActual);

		int edad = now.get(Calendar.YEAR) - cal.get(Calendar.YEAR);

		if ((cal.get(Calendar.MONTH) > now.get(Calendar.MONTH)) || (cal.get(Calendar.MONTH) == now.get(Calendar.MONTH)
				&& cal.get(Calendar.DAY_OF_MONTH) > now.get(Calendar.DAY_OF_MONTH))) {
			edad--;
		}
		return edad;
	}

	public static List<Date> obtenerFechasNoLaborables(Date fechaInicio, Date fechaFin) {

		List<Date> listaFechasNoLaborables = new ArrayList<Date>(0);

		String anioInicio = obtenerAno(dateUtilToStringDDMMYYYY(fechaInicio));
		String anioFin = obtenerAno(dateUtilToStringDDMMYYYY(fechaFin));
		Integer anioInicioInt = StringUtil.toInteger(anioInicio), anioFinInt = StringUtil.toInteger(anioFin);

		for (int i = anioInicioInt; i <= anioFinInt; i++) {
			listaFechasNoLaborables.add(stringToUtilDate("01/01/" + i));// anio nuevo
			listaFechasNoLaborables.add(stringToUtilDate("13/04/" + i));// semana santa
			listaFechasNoLaborables.add(stringToUtilDate("14/04/" + i));// semana santa
			listaFechasNoLaborables.add(stringToUtilDate("01/05/" + i));// dia del trabajo
			listaFechasNoLaborables.add(stringToUtilDate("28/07/" + i));// fiestas patrias
			listaFechasNoLaborables.add(stringToUtilDate("29/07/" + i));// fiestas patrias
			listaFechasNoLaborables.add(stringToUtilDate("08/10/" + i));// batalla de angamos
			listaFechasNoLaborables.add(stringToUtilDate("01/11/" + i));// todos los santos
			listaFechasNoLaborables.add(stringToUtilDate("25/12/" + i));// navidad
		}
		return listaFechasNoLaborables;
	}

	public FormatoFecha() {
		super();
	}

}
