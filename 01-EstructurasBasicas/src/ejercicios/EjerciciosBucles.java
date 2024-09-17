package ejercicios;

import java.util.Iterator;
import java.util.Scanner;

public class EjerciciosBucles {

	public EjerciciosBucles() {
		Scanner leer=new Scanner(System.in);
		// TODO Auto-generated constructor stub
		/*1.- Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle
		 *  for.,while y do while*/
		/*int cont, cinco, multi;
		cinco=5;
		cont=0;
		multi=0;
		do {
			multi=cinco*cont;
			System.out.println("Multiplo= "+multi);
			cont++;
		}while (cont<=100);*/
		
		/*2 .- Muestra los números del 320 al 160, contando de 20 en 20 hacia 
		atrás utilizando un bucle while.*/
		/*int cont=320;
		while (cont > 160) {
		cont-=20;
		System.out.println(cont);
		}
		*/
		/*3.-Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. 
		 * El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje
		 *  “Lo siento, esa no es la combinación”y si acertamos se nos dirá “La caja fuerte se ha abierto 
		 *  satisfactoriamente”.Tendremos cuatro oportunidades para abrir la caja fuerte.*/
		
		/*int num, cont,combi;
		boolean acierto= false;
		cont=4;
		System.out.println("Crea una contraseña de 4 digitos: ");
		num= 0;
		num=leer.nextInt();
		while (num>9999) {
			
			System.out.println("La contraseña no es valida, introduzca otra");
			num=leer.nextInt();
		}
		 do  {
			 System.out.println("Introduzca contraseña, tienes "+ cont + " intentos");
				combi=leer.nextInt();
			 if (combi==num) {
				 cont=0;
				 acierto=true;
			 }
			 else {
			 cont--;
			 System.out.println("Lo siento, esa no es la combinacion");
			 }
		 }while (cont>0);
		 if (acierto==true) {
			 System.out.println("La caja fuerte se ha abierto satisfactoriamente");
		 }
		 else if(acierto==false) {
			 System.out.println("Has superado todos los intentos");
		 }*/
		/*4.- Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado. Este ejercicio es
		equivalente a otro realizado anteriormente, con la salvedad de que el anterior estaba limitado a números de 5 dígitos
		como máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de esta manera, la única limitación en
		el número de dígitos la establece el tipo de dato que se utilice (int o long).*/
		
		/*long num=1, dig=0;
		long numLeido;
		System.out.println("Introduzca un numero");
		numLeido=leer.nextLong();
		do {
			num=num*10;
			dig=dig+1;
			if(numLeido<num) {
				System.out.println(dig+" digitos");
			}
		
			
		}while(numLeido>num);*/
		
		
		
		/*5.- Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado.
		 *  A priori, el programa no sabe cuántos números se introducirán. El usuario indicará que ha terminado de 
		 *  introducir los datos cuando meta un número negativo.*/
		/*double numIntrod;
		double numero=0;
		double suma=0;
		double media=0;
		
		do {
			System.out.println("Introduzca un numero");
			numIntrod=leer.nextInt();
			numero++;
			suma=suma+numIntrod;
		} while(numIntrod>0);
		
			media= (suma-numIntrod)/(numero-1);
			System.out.println("La media de estos numeros es de "+media);*/
			
			
		/*6.- Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer término de la serie de
Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores, por lo que tendríamos que los términos
son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe introducir por teclado.*/
			
			/*int n;
			int primer=0;
			int segundo=1;
			int tercer;
			System.out.println("Cuantos numeros de la serie de fibonacci quiere por pantalla.");
			n=leer.nextInt();
			switch (n) {
			case 1:
				System.out.println("0");
				break;
			case 2:
				System.out.println("0 1");
				break;
			default:
				System.out.println("0 1 ");
				do {
					n--;
					tercer=primer+segundo;
					primer=segundo;
					segundo=tercer;
					System.out.println(" "+tercer);
				}while(n!=2);

			}*/
		/*7.- Escribe un programa que diga si un número introducido por teclado es o no primo. Un número primo es aquel que
sólo es divisible entre él mismo y la unidad.*/
		
		/*int num,resto;
		boolean esPrimo=true;
		System.out.println("Introduce un numero");
		num=leer.nextInt();
		for (int x=2; num>x; x++) {
			resto=num%x;
			if (resto==0) {
				esPrimo=false;
				break;
			}
		}
		if (esPrimo) {
			System.out.println("El numero "+num+" es primo");
		}
		else {
			System.out.println("El numero "+num+" NO es primo");
		}
		*/
		/*8.- Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por teclado
y validados como distintos, el programa debe empezar por el menor de los enteros introducidos e ir incrementando
de 7 en 7.*/
		
		
		/*boolean sonIguales=false;
		int primerNum;
		int segundoNum;
		do {
			System.out.println("Introduzca un numero entero: ");
			primerNum=leer.nextInt();
			System.out.println("Introduzca otro numero entero distinto: ");
			segundoNum=leer.nextInt();
			sonIguales=primerNum==segundoNum;
			if (sonIguales){
				System.out.println("Los numeros introducidos no son validos, deben ser distintos");
			}
		}while (sonIguales);
		if (primerNum>segundoNum){
				int aux = primerNum;
				primerNum=segundoNum;
				segundoNum=aux;
		}
		for (int i=primerNum;i<=segundoNum; i+=7) {
			System.out.println(i +" ");
		}*/

		
		
		/*9.- Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y nos diga cuantos
números se han introducido, la media de los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo.*/
		
		/*int num,numAnt, cont, sumImpar, contImpar;
		cont=0; sumImpar=0; contImpar=0;num=0;numAnt=0;
		
		
		do {
			
			
			System.out.println("Introduce un numero");
			
			num=leer.nextInt();
			cont++;
			
			if(0==num%2) {
				if(numAnt<num) {
					numAnt=num;
				}
			}
			
			else {
				sumImpar=sumImpar+num;
				contImpar++;
			}
			
		} while (num>0);
		
		if (0!=num%2) {
			contImpar--;
			sumImpar=sumImpar-num;
		}
		
		cont--;
		double media = (double)sumImpar/(double)contImpar;
		System.out.println("Has introducido "+cont+" numeros. La media de los impares es de "+media);
		System.out.println("El numero par mayor es "+numAnt);*/
		
		/*10.- Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.*/
		
		/*System.out.println("Introduzca un numero entero: ");
		int numIntro = leer.nextInt();
		int num = numIntro;
		int volt = 0;
		while (num>0) {
			volt = (volt * 10) + (num % 10);
			num/=10;
	}
		System.out.println("Si le damos la vuelta al " +numIntro+ " tenemos el " +volt);
*/
	/*11.Realiza un programa que pida primero un número y a continuación un dígito. El programa nos debe dar la posición
		(o posiciones) contando de izquierda a derecha que ocupa ese dígito en el número introducido.*/
		
		
		
		/*12.- Escribe un programa que calcule el factorial de un número entero leído por
		teclado.*/
		/*int aux = 1;
		int factorial;
		int cont = 1;
		
		System.out.println("Introduzca un numero para obtener el factorial:");
		factorial=leer.nextInt();
		
		while (cont<=factorial) {
			
			aux=aux*cont;
			cont++;
			
		}
		System.out.println(aux);*/
}}
