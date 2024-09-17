package estudiotipodatos;

import java.util.Scanner;

public class EstudioTipoDatos {

	public EstudioTipoDatos() {
		//Tipos de datos:
		//enteros(int)
		//reales (double)
		//logicos (boolean)
		//caracter (char) si yo almaceno un numero entero en "char",este se guarda en su codigo ASCII
		//cadena de texto (String)
		// TODO Auto-generated constructor stub
		System.out.println("Estudio Tipos de Datos");
		byte tipoByte=24;
		System.out.println("tipoByte = "+tipoByte);
		int x; //Declara la variable "x" como entera
		x=5; //Inicializa o asigna el valor 5 a la variable x, aunque se podria definir y inicializar en la misma linea de codigo
		System.out.println("El valor actual de mi variable es "+ x);
		x=7;//Muestra de nuevo el valor de "x"
		System.out.println("y ahora es "+ x);
		long tipoLong;
		tipoLong=111111111111111L;//hay que poner L al final para definir como long
		System.out.println("Variable de tipo long: "+tipoLong);
		char letra1= 'c';
		char letra2= 'a';
		char letra3= 's';
		char letra4 ='a';
		System.out.println("letra1: "+ letra1);
		System.out.println("letra3: "+ letra3);
		System.out.println("todas las letras juntas: "+letra1+letra2+letra3+letra4);
		//se suman todas las variables char porque son caracteres y forman la palabra casa
		char c= 'A';
		int codAscii= c;
		System.out.println("Caracter "+ c + " Ascii =" + codAscii);
		c=76;
		System.out.println("Caracter "+ c);
		//los decimales son considerados como double si queremos utilizar float,
		//tendremos que hacer un casting
		float tipoFloat= 23.4F;
		//tipoFloat=23.4; //da error
		tipoFloat=(float)23.4;
		float tipoFloat2= 23.4f;
		System.out.println(tipoFloat);
		System.out.println(tipoFloat2);
		//al poner la "F" es igual que hacer el casting
		double a; //se declaran las variables x e y
		double  b;//de tal forma que se puedan almacenar decimales
		a=7;
		b=25.01;
		System.out.println("a vale "+a);
		System.out.println("b vale "+b);
		
		//CONSTANTES
		final double PI=3.14;//se pone final por ser una constante
		
		//CONVERSION DE TIPOS .... CASTING
		double div;
		int dividendo, divisor;
		dividendo= 7;
		divisor =3;
		div = dividendo / (double)divisor;
		System.out.println("La division de "+dividendo + "/" + divisor + "=" + div );
		//hacemos el casting (del divisor o dividendo, da igual cual porque solo 
		//uno de los dos tiene que ser double) en la division ya que sino no tendriamos los decimales y solo nos saldria 2 exacto
		
		//boolean
		boolean sw= false;
		sw=true;
		
		
		//CADENAS
		String miPalabra= "cerveza";
		String miFrase = "donde esta mi cerveza"; 
		System.out.println("Una palabra que uso con frecuencia: "+miPalabra);
		System.out.println("Una frase que uso a veces: "+miFrase);
		
		//Pedir dato por teclado
		Scanner leer =new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		String nombre= leer.nextLine();
		//String nombre= leer.next();
		//leer=null; leer = new Scanner (System.in);
		System.out.println("Introduce tu edad: ");
		int edad= leer.nextInt();
		System.out.println("Tu nombre es "+ nombre + " y mi edad es "+ edad + " años");
		
		
	}

}
