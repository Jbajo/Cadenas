package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * 
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 *
 */
public class CadenasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadenasApplication.class, args);
		String a1 = "cadena de 10";
		String a2 = "cadena algo más larga";
		String a3 = "cadena mucho pero que mucho más larga";
		String a4 = "pepe juan manolo ricardo";
		String a5 = "-120 Pepe -156 -++124 pe-1";
		
		System.out.println(Cadenas.cambiaEspacios(a4));		
		
		
		int suma = 0;
		for (String aux : Cadenas.buscarSecuenciasConSigno(a5)) {
			System.out.println(aux);
			suma+= Integer.parseInt(aux);
					
		}
		System.out.println(suma);
			
				
				
				
		
	}
}
