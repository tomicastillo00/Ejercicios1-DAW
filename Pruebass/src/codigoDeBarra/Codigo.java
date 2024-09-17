package codigoDeBarra;

import java.util.Scanner;

public class Codigo {

	public Codigo() {
		// TODO Auto-generated constructor stub
		Scanner leer=new Scanner(System.in);
		System.out.println("Introduce algo");
		String isbn=leer.next();
		int acu=0;
		int aux=0;
		for(int x=0;x<isbn.length()-1;x++) {
			aux=Integer.parseInt(isbn.substring(x, x+1));
			if(x%2!=0) {
				aux=aux*3;
				acu+=aux;
			}
			else {
				acu+=aux;
			}
		}
		
		int dc=Integer.parseInt(isbn.substring(12));
		
		int acu1=acu;
		
		while(acu1%10!=0) {
			acu1++;
		}
		if(acu1-acu==dc)
			System.out.println("Correcto");
		else
			System.out.println("Incorrecto");
	}

}
