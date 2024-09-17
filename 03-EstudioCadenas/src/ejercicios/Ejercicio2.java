package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public Ejercicio2() {
		//2.- Un programa que me pida una frase y e diga si es palíndroma.
		//Busca frases palíndromas en internet.
		
		Scanner leer=new Scanner(System.in);
		String frase=leer.nextLine();
		String fraseVolteada="";
		
		frase=frase.replace(" ", "");//quitamos los espacios
		
		char aux;//creamos variable de caracter auxiliar
		for(int x=frase.length()-1;x>=0;x--) {
			aux=frase.charAt(x);//sacaremos los caracteres desde el final de la cadena
			fraseVolteada+=aux;//y se lo sumamos a la variable fraseVolteada
		}
		System.out.println(fraseVolteada);//mostramos como se ve la frase volteada
	
		boolean palindroma=frase.equalsIgnoreCase(fraseVolteada);//comprobamos que la frase es igual ignorando las mayusculas y minusculas
		if (palindroma)
			System.out.println("La frase es palindroma");
		else
			System.out.println("La frase NO es palindroma");
	}

}
