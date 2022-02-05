package com.hsaa.colibri.utilities;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CadenaUtil {

	/**
	 * Metodo que crea la cadena comunmente llamada
	 * <code>MyData<code> para llenado de la tabla javascript, tiene el formato ya establecido 
	 * param <b>listaMetodos</b> : Lista de metodos a imprimir ordenados segun la forma como se desea la cabecera
	 * param <b>clase</b>: ejemplo <code>String.class</code> o
	 * <code>BeanPersona.class<code>
	 * 
	 * @param <b>lista</b>: {@link List} conteniendo la lista de objetos de donde se
	 *                      generara la cadena
	 * @see Method
	 * @see Class
	 * @return {@link StringBuilder} con el siguiente formato
	 *         <b>["val1","val2","val3","val4","val5"],["val1","val2","val3","val4","val5"]<b>
	 */
	public static StringBuilder getMyData(Method[] listaMetodos, List<?> lista) {

		StringBuilder sb = new StringBuilder();
		Object[] args = null;
		for (int i = 0; i < lista.size(); i++) {
			Object obj = lista.get(i);
			sb.append("[");
			for (int j = 0; j < listaMetodos.length; j++) {
				Method metodo = listaMetodos[j];
				Object val = "";
				try {
					val = metodo.invoke(obj, args);
					sb.append("\"" + val + "\"");
					if (j < listaMetodos.length - 1) {
						sb.append(",");
					}
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}

			}
			sb.append("]");
			if (i < lista.size() - 1) {
				sb.append(",");
			}
		}
		return sb;
	}

	/**
	 * Metodo que devuelve un booleano true si es caso es blanco o nulo y false en
	 * caso contrario
	 * 
	 * @param cadena: cadena que se va evaluar
	 * @return boolean [true|false]
	 */
	public static boolean esBlankStringCadena(String cadena) {
		boolean b = true;
		if (cadena != null && cadena.trim().length() > 0) {
			return false;
		}
		return b;
	}

	/**
	 * Metodo que te devuelve un arreglo con datos de una trama contenido tiene un
	 * separador
	 * 
	 * @param cadena:    parametro de tipo cadena ejemplo ["234;444;567;24"]
	 * @param separador: parametro cadena [";"]
	 * @return retorna un arreglo s[0]="234" s[1]="444" s[2]="567" s[3]="24" o en su
	 *         defecto null;
	 */
	public static String[] desencadenar(String cadena, String separador) {
		if (cadena == null || "".equals(cadena))
			return null;

		StringTokenizer st = new StringTokenizer(cadena, separador);
		String[] s = new String[st.countTokens()];
		int i = 0;
		while (st.hasMoreTokens()) {
			s[i] = st.nextToken();
			i++;
		}

		return s;
	}

	// Recibe un String y si es null devuelve ""
	public static String obtieneCadena(String cadena) {
		return cadena == null ? "" : cadena;
	}

	// Prepara una cadena para que sea aceptable al grid
	public static String preparaCadena(String cadena) {
		if (cadena == null)
			return cadena;

		// Transforma el Enter: (char)10 en espacio vac�o
		cadena = cadena.replace((char) 10, ' ');
		cadena = cadena.replace((char) 13, ' ');

		// Reemplaza las " y , con espacios vac�os
		cadena = cadena.replace(',', ' ');
		cadena = cadena.replace('"', ' ');

		return cadena;
	}

	// Devuelve el substring de una cadena
	public static String obtieneSubStr(String cadena, int inicio, int fin) {
		String subStr = "";

		if (cadena == null || "".equals(cadena))
			return subStr;

		if (inicio > cadena.length() || fin > cadena.length() || inicio > fin)
			return subStr;

		subStr = cadena.substring(inicio, fin);

		return subStr;
	}

	public static String llenaCeros(String strCad, int intNumero) {
		String strAcumulaCadena = "";
		for (int i = 0; i < intNumero; i++) {
			strAcumulaCadena = strAcumulaCadena + strCad;
		}

		return strAcumulaCadena;
	}

	public static int contarNumerosEnCadena(String cadena) {
		int cntNrosEnCadena = 0;
		String caracter = "";
		for (int i = 0; i < cadena.length(); i++) {
			caracter = cadena.substring(i, i + 1);
			if (caracter.equals("0") || caracter.equals("1") || caracter.equals("2") || caracter.equals("3")
					|| caracter.equals("4") || caracter.equals("5") || caracter.equals("6") || caracter.equals("7")
					|| caracter.equals("8") || caracter.equals("9")) {
				cntNrosEnCadena++;
			}
		}
		return cntNrosEnCadena;
	}

	public static int contarRangoCaracteresEnCadena(String cadena, String rangoCaracteres) {
		int cntRanCarEnCadena = 0;
		String caracter = "";
		int encontrado = 0;
		for (int i = 0; i < cadena.length(); i++) {
			caracter = cadena.substring(i, i + 1);
			encontrado = rangoCaracteres.indexOf(caracter, 0);
			if (encontrado != -1)
				cntRanCarEnCadena++;
		}
		return cntRanCarEnCadena;
	}

	/**
	 * validarCadena
	 * 
	 * @param cadena
	 * @return {@link StringBuilder} devuelve la cadena si es diferente de null caso
	 *         contrario devuelve ""
	 */
	public static String validarCadena(String cadena) {
		return cadena != null ? cadena.trim() : "";
	}

	/**
	 * validarCadenaDecimal
	 * 
	 * @param cadena
	 * @return
	 */
	public static Double validarCadenaDecimal(String cadena) {
		return cadena != null ? Double.valueOf(cadena) : 0.0;
	}

	/**
	 * validarPorRegex
	 * 
	 * @param cadena
	 * @param regex
	 * @return
	 */
	public static boolean validarPorRegex(String cadena, String regex) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(cadena);
		return matcher.matches();
	}

	/**
	 * Convierte texto en parrafo, en texto de una sola linea.
	 * 
	 * @param strText -> Texto a convertir
	 * @return texto en una sola linea
	 */
	public static String compressText(String strText) {

		String str = strText.replace("'", "\\'").replace("\"", "\\'").replace("\n", " ").replace("\r", " ");
		return str.trim();

	}

	/**
	 * Elimina los caracteres numericos y elimina el exceso de espaciado entre
	 * palabras.
	 * 
	 * @param str Texto a convertir
	 * @return Texto sin caracteres alfanumericos y sin mas de un espacion en blanco
	 *         entre palabras
	 */
	public static String removeNoAlfanumerico(String str) {
		return str.replaceAll("\\W", " ").replaceAll("\\s{2,}", " ");
	}

	/**
	 * Formatea cadena, la direcciona y rellena con un caracer hasta un maximo
	 * numero de caracteres.
	 * 
	 * @param strCadena
	 * @param intMaxLongCadena
	 * @param strDireccion
	 * @param strCar
	 */
	public static String formateaCadena(String strCadena, int intMaxLongCadena, String strDireccion, String strCar) {

		if (strCadena != null && strCadena.length() > 0) {
			strCadena = strCadena.replace("�", "N");
		}

		String cadena = "";
		String subCadena = "";

		int indice = 0;
		int longitud_cadena = 0;

		if (strCadena == null) {
			cadena = "";
			longitud_cadena = 0;
		} else {
			if (strCadena.equals("") || strCadena.toUpperCase().equals("NULL")) {
				longitud_cadena = 0;
				cadena = "";
			} else {
				cadena = strCadena.trim();
				longitud_cadena = cadena.length();
			}
		}
		cadena = cadena.trim();
		if (longitud_cadena > intMaxLongCadena) {
			cadena = cadena.substring(0, intMaxLongCadena);
		}

		if (strDireccion != null && strDireccion.equals("L")) { // L=LEFT, R=RIGHT
			indice = longitud_cadena;
			while (indice < intMaxLongCadena) {
				cadena = cadena + strCar;
				indice++;
			}
		} else {
			subCadena = "";
			indice = longitud_cadena;
			while (indice < intMaxLongCadena) {
				subCadena = subCadena + strCar;
				indice++;
			}
			cadena = subCadena + cadena;
		}
		return cadena;
	}

	/**
	 * Replica una cadena
	 * 
	 * @param valor
	 * @param nroVeces
	 * @return
	 */
	public static String replicar(final String valor, final int nroVeces) {
		if (nroVeces <= 0) {
			return "";
		}
		final StringBuilder s = new StringBuilder(valor.length() * nroVeces);
		for (int i = nroVeces; --i >= 0;) {
			s.append(valor);
		}
		return s.toString();
	}

	/**
	 * Valida que un nombre propio sea solo letras
	 * 
	 * @param cadena
	 * @return boolean
	 */
	public static boolean validarNombre(String cadena) {
		if (StringUtil.isEmpty(cadena)) {
			return false;
		}
		if (contarNumerosEnCadena(cadena) > 0) {
			return false;
		}
		return true;
	}

	/**
	 * Valida una cadena tenga la estructura de un email
	 * 
	 * @param email
	 * @return boolean
	 */
	public static boolean validarEmail(String email) {
		String patternEmail = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		Pattern pattern = Pattern.compile(patternEmail);

		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

}