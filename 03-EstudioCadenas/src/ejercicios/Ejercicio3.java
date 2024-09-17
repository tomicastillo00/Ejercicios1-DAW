package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public Ejercicio3() {
		
		/*3.-Crea un programa que compruebe si un dni es correcto (8 números y una letra) 
		 * Recordad que la letra se calcula dividiendo el numero entre 23 y mirando el resto
		 *  (Mirad en internet la letra con que se corresponde)*/
		Scanner leer=new Scanner(System.in);
System.out.println("Introduzca un DNI");
		String dni=leer.next();
	
	if(esValido(dni))//se comprueba con la funcion si el dni es valido
	System.out.println("El DNI es valido, puede continuar");
	else
		System.err.println("El DNI NO es valido");
	}

	private boolean esValido(String dni) {
		String letra1="";//inicializa variable auxiliar de la letra
		String num=dni.substring(0, 8);//extraemos los numeros del dni
		String letra=dni.substring(8);//extraemos la letra
		boolean esValido=false;//inicializamos la variable boleana que es la que posteriormente nos devolvera
		int num1=Integer.parseInt(num);//pasamos la cadena "num" a entero para poder procesarla
		int resto=num1%23;//comprobamos el resto de la variable numerica dividiendolo entre 23
		switch (resto) {//segun el resto de la division correspondera una letra o otra
		case 0:
			letra1="T";
			break;
		case 1:
			letra1="R";
			break;
		case 2:
			letra1="W";
			break;
		case 3:
			letra1="A";
			break;
		case 4:
			letra1="G";
			break;
		case 5:
			letra1="M";
			break;
		case 6:
			letra1="Y";
			break;
		case 7:
			letra1="F";
			break;
		case 8:
			letra1="P";
			break;
		case 9:
			letra1="D";
			break;
		case 10:
			letra1="X";
			break;
		case 11:
			letra1="B";
			break;
		case 12:
			letra1="N";
			break;
		case 13:
			letra1="J";
			break;
		case 14:
			letra1="Z";
			break;
		case 15:
			letra1="S";
			break;
		case 16:
			letra1="Q";
			break;
		case 17:
			letra1="V";
			break;
		case 18:
			letra1="H";
			break;
		case 19:
			letra1="L";
			break;
		case 20:
			letra1="C";
			break;
		case 21:
			letra1="K";
			break;
		case 22:
			letra1="E";
			break;
		default:
			break;
		}
		if(letra.equals(letra1))//finalmente comprobara si la letra es la que corresponde y nos dira si es valido o no
			esValido=true;
		
		return esValido;
	}

			
	

}
