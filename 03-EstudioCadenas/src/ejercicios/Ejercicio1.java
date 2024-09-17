package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public Ejercicio1() {
/*1.- Rompe cadenas: Crea un programa que me pida una frase y me la rompa en palabras.*/
		
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Introduce una frase");
		String frase=leer.nextLine();
		String[] palabras=frase.split(" ");
		for(int x=0;x<palabras.length;x++) {
			System.out.print(palabras[x]+" - ");
		}
		
	}

}
