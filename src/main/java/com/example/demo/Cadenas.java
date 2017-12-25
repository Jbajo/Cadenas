package com.example.demo;

import java.awt.List;
import java.util.ArrayList;

public class Cadenas {

		
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
			ArrayList <Character> listaCompara = new ArrayList<> ();
			
			listaCompara.add('0');
			listaCompara.add('1');
			listaCompara.add('2');
			listaCompara.add('3');
			listaCompara.add('4');
			listaCompara.add('5');
			listaCompara.add('6');
			listaCompara.add('7');
			listaCompara.add('8');
			listaCompara.add('9');
	
			for (int i = 0; i<cadena.length(); i++) {			
				
				//comienza secuencia
				if(listaCompara.contains(cadena.charAt(i))) {
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
		ArrayList <Character> listaCompara = new ArrayList<> ();
		
		listaCompara.add('0');
		listaCompara.add('1');
		listaCompara.add('2');
		listaCompara.add('3');
		listaCompara.add('4');
		listaCompara.add('5');
		listaCompara.add('6');
		listaCompara.add('7');
		listaCompara.add('8');
		listaCompara.add('9');
		
		
		for (int i = 0; i<cadena.length(); i++) {			
			
			//comienza secuencia con signo
			if(cadena.charAt(i)== '-'||cadena.charAt(i)== '+'){
				if(i<cadena.length()-1)
					if(listaCompara.contains(cadena.charAt(i+1))) {
						enteroEncontrado = true;
						aux+=String.valueOf(cadena.charAt(i));		
						
						
					}
					else {						
						enteroEncontrado=false;
						aux= "";
					}				
			}
			//comienza secuencia sin signo
			else if (listaCompara.contains(cadena.charAt(i))) { 					
					aux+=String.valueOf(cadena.charAt(i));	
					enteroEncontrado=true;
			}
			
			//finaliza secuencia
			else if (enteroEncontrado) {
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
}
	

