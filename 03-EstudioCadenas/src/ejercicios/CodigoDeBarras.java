package ejercicios;

import java.util.Scanner;

public class CodigoDeBarras {

	public CodigoDeBarras() {
		
/*		- Para calcular el algoritmo de cálculo del dígito de control pongamos como ejemplo el siguiente código,
		84 12345 67890 ? , conocemos que el 84 identifica al país, los siguientes 5 dígitos la empresa y los últimos 5 dígitos
		con el artículo/producto.
		
		El proceso a seguir es:
		
		1.- Multiplicamos por 1 las posiciones impares y por 3 las posiciones pares del código, empezando de izquierda a
		derecha.
		
		2.- Sumamos los valores resultantes.
		8 + 12 + 1 + 6 + 3 + 12 + 5 + 18 + 7 + 24 + 9 + 0 = 105
		
		3.- Restamos de la decena superior el valor de la suma de los valores resultantes. El resultado de esta operación es el
		valor del código de control (primera posición de la derecha del código de barras). Si el resultado es 0 el dígito de
		control será 0.
		En nuestro ejemplo la decena superior a 105 es 11 0, por tanto:
		110 105 = 5 ==> 5 es el valor del código de control
		*/
		Scanner leer=new Scanner(System.in);
		System.out.println("Introduce un codigo de barras");
		String codigo=leer.next();
		int cont=0;
		String subcadena="";
		for(int x=0;x<codigo.length()-1;x++) {
			subcadena=codigo.substring(x,x+1);
			if(esImpar(x))
				cont+=Integer.parseInt(subcadena);
			else
				cont+=(Integer.parseInt(subcadena))*3;
		}
		int dece=cont;
		while(dece%10!=0) {
			dece++;
		}
		int control=dece-cont;
		if((Integer.parseInt(codigo.substring(12)))==control)
			System.out.println("El codigo es CORRECTO");
		else 
			System.out.println("EL codigo es INCORRECTO");
	}

	private boolean esImpar(int x) {
		boolean impar=false;
		if(x%2==0)
			impar=true;
		return impar;
	}

}
