package com.example.demo;

import java.util.List;
import java.util.ArrayList;

/**
 * 
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 *
 */
public class Cadenas {

	public static boolean esParseable(String numeroEnString){
		try {
		int numero = Integer.parseInt(numeroEnString);
		return true;
		} catch (Exception e) {
		return false;
		}
		}
/**
 * 		
 * @param cadena cadena con las vocales a contar
 * @return el numero de vocales en un vector de enteros
 */
	public static int [] sumaaVocales (String cadena){
		
		int vocales[] = new int [] {0,0,0,0,0};
		
		for (int j = 0; j< cadena.length(); j++) {
				
				switch (cadena.charAt(j)) {
				case 'a':
					vocales[0]++;
					break;
				case 'e':
					vocales[1]++;
					break;
				case 'i':
					vocales[2]++;
					break;
				case 'o':
					vocales[3]++;
					break;
				case 'u':
					vocales[4]++;
					break;
				default:
					break;
				}		
			
		}
		
		return vocales;
		
	}
	
	/**
	 * 
	 * @param cadena cadena a tratar
	 * @return la cadena tratatda sin espacios
	 */
	public static String cambiaEspacios(String cadena) {
		String aux = cadena;
		
		while(aux.indexOf(" ")!=-1) {
			aux = aux.replace(" ","/");		
		}
		return aux;
			
		
	}
	
	/**
	 * 
	 * @param cadena cadena con numeros a parsear
	 * @return la suma de numeros de la cadena
	 */
	
	public static int sumaNumerosCadena(String cadena) {
		String[] arrayCadena = cadena.split(",");
		int suma = 0;
		for (String string : arrayCadena) {
			suma += Integer.parseInt(string);
		}
		return suma;
	}
	
	/**
	 * 
	 * @param cadena cadena de numeros a parsear
	 * @return secuencias numericas parseadas a entero en un ArrayList
	 */
public static List<String> buscarSecuenciasConSigno(String cadena) {
		
		boolean enteroEncontrado = false;
		String aux = new String();
		List <String> listaNumeros = new ArrayList<>();
			
		
		for (int i = 0; i<cadena.length(); i++) {			
			
			//comienza secuencia con signo
			if(cadena.charAt(i)== '-'||cadena.charAt(i)== '+'){
				if(i<cadena.length()-1)
					if(esParseable(String.valueOf(cadena.charAt(i+1)))) {
						enteroEncontrado = true;
						aux+=String.valueOf(cadena.charAt(i));		
						
						
					}
					else{						
						enteroEncontrado=false;
						aux= "";
					}				
			}
			//comienza secuencia sin signo
			else if (esParseable(String.valueOf(cadena.charAt(i)))) { 					
					aux+=String.valueOf(cadena.charAt(i));	
					enteroEncontrado=true;
			}
			
			//finaliza secuencia
			if(i<cadena.length()-1)
			if (enteroEncontrado&&!esParseable(String.valueOf(cadena.charAt(i+1)))) {
				listaNumeros.add(aux);
				aux="";
				enteroEncontrado = false;
			}			
			
			//caso numero al final de una cadena
			if (enteroEncontrado && i == cadena.length()-1) {
				enteroEncontrado=false;
				listaNumeros.add(aux);
				aux= "";
			}	
					
		}
		
		return listaNumeros;	
	
	}

public static ArrayList<String> buscarSecuencias(String cadena) {
	
	boolean enteroEncontrado = false;
	String aux = new String();
	ArrayList <String> listaNumeros = new ArrayList<>();
	

	for (int i = 0; i<cadena.length(); i++) {			
		
		//comienza secuencia
		if(esParseable(String.valueOf(cadena.charAt(i)))) {
			enteroEncontrado = true;
			aux += String.valueOf(cadena.charAt(i));					
			
		}
		
		//fin de secuencia
		else if (enteroEncontrado) {
			
			enteroEncontrado=false;
			listaNumeros.add(aux);
			aux= "";
			
			
		}
		
		//secuencia al final de la cadena
		if (enteroEncontrado && i == cadena.length()-1) {
			System.out.println(aux);
			enteroEncontrado=false;
			listaNumeros.add(aux);
			aux= "";
			
		}		
		
	}

return listaNumeros;

}
}
	
	
	

