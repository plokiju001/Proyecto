/**
 * 
 */
package com.utiles.datos;

/**
 * @author imarcial
 * @version 1.0
 */
public final class Cifrar {
	private final static String LLAVE = "1S3F4FJ6DD5C2I5YFDA";
	
	//*** FUNCIONES DE CODIFICACION
	public final static String Codifica(String valor) {
		rc4 crip = new rc4();
		
		return crip.StringToHexString(crip.Salaa(valor, LLAVE));
	}
	
	public final static String Codifica(String valor, String llave) {
		rc4 crip = new rc4();
		
		return crip.StringToHexString(crip.Salaa(valor, llave));
	}

	
	//*** FUNCIONES DE DE-CODIFICACION
	public final static String deCodifica(String valor) {
		rc4 crip = new rc4();
		
		return crip.Pura(crip.hexStringToString(valor), LLAVE);	
	}
	
	public final static String deCodifica(String valor, String llave) {
		rc4 crpt = new rc4();
		
		return crpt.Pura(crpt.hexStringToString(valor),llave);
		
	}
}
