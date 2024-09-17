package ejercicios;

import java.util.Scanner;

public class ComprobacionISBN {

	public ComprobacionISBN() {
		
		Scanner leer=new Scanner(System.in);
		System.out.println("Introduce un ISBN");
		String codigo=leer.next();
		int cont=0;
		for(int x=0;x<codigo.length()-1;x++) {
			String subcadena=codigo.substring(x, x+1);
			if(esImpar(x))
				cont+=Integer.parseInt(subcadena);
			else
				cont+=Integer.parseInt(subcadena)*3;
			
		}
		int resto= cont%10;
		int control=control(resto);
		if((Integer.parseInt(codigo.substring(12)))==control)
			System.out.println("El ISBN es CORRECTO");
		else
			System.out.println("El ISBN es INCORRECTO");
		
	}
		
		

	private boolean esImpar(int x) {
		boolean impar=false;
		if(x%2!=0)
			impar=true;
		return impar;
	}

	private int control(int resto) {
		int resul=10-resto;
		if(resul==10)
			resul=0;
			
		return resul;
	}

}
