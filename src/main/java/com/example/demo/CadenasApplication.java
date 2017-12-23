package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CadenasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadenasApplication.class, args);
		String a1 = "cadena de 10";
		String a2 = "cadena algo más larga";
		String a3 = "cadena mucho pero que mucho más larga";
		String a4 = "pepe juan manolo ricardo";
		String a5 = "-12 Pepe +124 pe-1";
		
		System.out.println(Cadenas.cambiaEspacios(a4));		
		
		//int vocales [] = Cadenas.cuentaVocales(a4);
		
		/*for (int i : vocales) {
			System.out.println(i);
		}*/
		
		//System.out.println(Cadenas.sumaNumerosCadena(a5));
		int suma = 0;
		for (String aux : Cadenas.buscarSecuenciasConSigno(a5)) {
			
			suma+= Integer.parseInt(aux);
					
		}
		System.out.println(suma);
			
				
				
				
		
	}
}
