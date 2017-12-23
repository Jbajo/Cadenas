package com.example.demo;

import java.awt.List;
import java.util.ArrayList;

public class Cadenas {

	
	/*sumar numeros de una cadena de texto*/
	
		
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
	
	public static String cambiaEspacios(String cadena) {
		String aux = cadena;
		
		while(aux.indexOf(" ")!=-1) {
			aux = aux.replace(" ","/");		
		}
		return aux;
			
		
	}
	
	public static int sumaNumerosCadena(String cadena) {
		String[] arrayCadena = cadena.split(",");
		int suma = 0;
		for (String string : arrayCadena) {
			suma += Integer.parseInt(string);
		}
		return suma;
	}
	
	
	public static ArrayList<String> buscarSecuencias(String cadena) {
			
			boolean enteroEncontrado = false;
			String aux = new String();
			ArrayList <String> listaNumeros = new ArrayList<>();
			
	
			for (int i = 0; i<cadena.length(); i++) {			
				
				//comienza secuencia
				if(cadena.charAt(i)== '1'||cadena.charAt(i)== '2'||cadena.charAt(i)== '3'||cadena.charAt(i)== '4'||cadena.charAt(i)== '5'||cadena.charAt(i)=='6'||cadena.charAt(i)== '7'||cadena.charAt(i)== '8'||cadena.charAt(i)== '9'||cadena.charAt(i)== '0') {
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
	
	public static ArrayList<String> buscarSecuenciasConSigno(String cadena) {
		
		boolean enteroEncontrado = false;
		String aux = new String();
		ArrayList <String> listaNumeros = new ArrayList<>();
		

		for (int i = 0; i<cadena.length(); i++) {			
			
			//comienza secuencia
			if(cadena.charAt(i)== '-'||cadena.charAt(i)== '+'){
				if(i<cadena.length()-1)
					if(cadena.charAt(i+1)== '1'||cadena.charAt(i+1)== '2'||cadena.charAt(i+1)== '3'||cadena.charAt(i+1)== '4'||cadena.charAt(i+1)== '5'||cadena.charAt(i+1)=='6'||cadena.charAt(i+1)== '7'||cadena.charAt(i+1)== '8'||cadena.charAt(i+1)== '9'||cadena.charAt(i+1)== '0') {
						enteroEncontrado = true;
						aux+=String.valueOf(cadena.charAt(i));		
						aux+=String.valueOf(cadena.charAt(i+1));
						
					}
					else {
						enteroEncontrado=false;
						aux= "";
					}
					
					
				
			}
			else if (enteroEncontrado) {
					
					aux+=String.valueOf(cadena.charAt(i));	
					
			
					
									
			//secuencia al final de la cadena
			
		}
			else {
				aux ="";
			}
				
		}
		
		if (enteroEncontrado) {		
			System.out.println("fin de cadena" + aux);
			//enteroEncontrado=false;
			//listaNumeros.add(aux);
			//aux= "";
		}
			
				
		
	return listaNumeros;
	
	}
}
	

