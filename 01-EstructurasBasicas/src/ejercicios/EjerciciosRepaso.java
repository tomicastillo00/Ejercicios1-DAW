package ejercicios;

import java.util.Scanner;

public class EjerciciosRepaso {

	public EjerciciosRepaso() {
		Scanner leer=new Scanner(System.in);
		/*1. Introducir un número entero de dos dígitos por teclado. Si es positivo y tiene dos cifras,
		 *  indicar cuánto suman sus dos dígitos; si no cumple esas condiciones, mostrar el mensaje: 
		 *  “No es positivo o no tiene dos cifras.”*/
		
		/*System.out.println("Introduce un numero");
		
		int n= leer.nextInt();
		
	
		if (positivo(n) && dosCifras(n)) {
	int suma= calcula(n);
	System.out.printf("La suma de sus dos cifras es %d", suma);
		}
		else {
		System.out.println("No es positivo o no tiene dos cifras");
		}
	}
*/
	
		
	/*private boolean dosCifras(int n) {
		boolean dosCifras=false;
		if (n>=10 && n<=99) {
			dosCifras=true;
		}
		return dosCifras;
	}
		
		private boolean positivo(int n) {
			boolean positi=false;
		if (n>=0) {
			positi=true;
		}
		return positi;
	}
		private int calcula(int n) {
			int prim;
			int segun;
			int suma=0;
			prim=n%10;
			segun=n/10;	
			suma=segun+prim;
			return suma;
		}*/

		/*2. Introducir un número entero por teclado. Si es positivo, entonces averiguad si es par o
impar. Si es par, hallar si es múltiplo de 2, de 4 o de 8 y, en ese caso, mostrad el
mensaje:”El número es par y múltiplo de 2 o de 4 o de 8". Si es impar, hallar si es múltiplo
de 3, de 5 o de 7 y, en ese caso, mostrad el mensaje:”El número es impar y múltiplo de 3 o
de 5 o de 7".*/
		
		/*int n, resto1, resto2;
		int x= 3;
		resto1=0; resto2=0;
		boolean esMultiplo=false;
		System.out.println("Introduce un numero");
		n=leer.nextInt();
		while (n<0) {
			System.out.println("El numero es negativo, introduzca otro");
			n=leer.nextInt();
		}
		resto1= n % 2;
		if(resto1==0) {
			System.out.println("Es par y multiplo de 2 o de 4 o de 8");
		}
		else {
			do {
				resto2=n % x;
				x+=2;
				if (resto2==0) {
					x=8;
					esMultiplo=true;
				}
			}while (x<=7);
			if (esMultiplo) {
				System.out.println("Es impar y multiplo de 3 o de 5 o de 7");
			}
			else {
				System.out.println("Es impar y no es multiplo de 3 o de 5 o de 7");
			}
		}
		
	
		
		
		
		
	}*/
		/*3. Introducir un número entero por teclado que se supone que es una hora del día. Indicar
si corresponde a la mañana (entre las 6 y las 11, ambas inclusive), si es una hora de la
tarde (entre las 12 y las 19, ambas inclusive), si es de la noche (entre las 20 y las 23,
ambas inclusive), si es de la madrugada (entre las 0 y las 5, ambas inclusive) o bien, si no
puede corresponder a una hora del día.*/
		
		/*System.out.println("Introduzca un numero");
		int num = leer.nextInt();
		momento(num);
		


	private String momento(int num) {
		
		if (6<=num && 11>=num) {
			System.out.println("Es por la mañana");
		}
		else if (12<=num && 19>=num) {
			System.out.println("Es por la tarde");
		}
		else if (20<=num && 23>=num) {
			System.out.println("Es por la noche");
		}
		else if (0<=num && 5>=num) {
			System.out.println("Es de madrugada");
		}
		return null;
	}*/
		
		/*4. Introducir un número entero por teclado que se supone que es un mes del año. Si es así,
indicar cuántos días tiene el mes que le antecede.*/
		
		/*System.out.println("Introduce un numero");
		int num = leer.nextInt();
		String mes= null;
		int dias=0;
		mes(num,mes,dias);
		
		
}

	private void mes(int num,String mes,int dias) {
	

	if (num==1) {
		mes="enero";
		dias=31;
	}
	else if (num==2) {
		mes="febrero";
		dias=31;
	}
	else if (num==3) {
		mes="marzo";
		dias=28;
	}
	else if (num==4) {
		mes="abril";
		dias=31;
	}
	else if (num==5) {
		mes="mayo";
		dias=30;
	}
	else if (num==6) {
		mes="junio";
		dias=31;
	}
	else if (num==7) {
		mes="julio";
		dias=30;
	}
	else if (num==8) {
		mes="agosto";
		dias=31;
	}
	else if (num==9) {
		mes="septiembre";
		dias=31;
	}
	else if (num==10) {
		mes="octubre";
		dias=30;
	}
	else if (num==11) {
		mes="noviembre";
		dias=31;
	}
	else if (num==12) {
		mes="diciembre";
		dias=30;
	}
	if (0<num && 12>=num) {
		System.out.println("El mes anterior de "+mes+" tiene "+dias+" dias");
	}
	else {
		System.out.println("El numero no corresponde a ningun mes");
	}*/
		
		/*5. Introducir un número entero por teclado que se supone que es un año. Indicar si es
bisiesto o no y por qué motivo (P.e.: “Es bisiesto por ser múltiplo de 4 y no de 100”. P.e.:
“Es bisiesto por ser múltiplo de 400”. P.e.: “No es bisiesto por ser múltiplo de 100”).*/
		
	/*System.out.println("introduce un numero");
		
		int num=leer.nextInt();
		bisiesto(num);
		
	}

	private void bisiesto(int num) {
		int resto=0;
		int resto2=0;
		resto=num%4;
		resto2=num%100;
		if(resto==0 && resto2!=0) {
			System.out.println("Es bisiesto por ser multiplo de 4 y no de 100");
		}
		resto=num%400;
		if(resto2==0 && resto==0) {
			System.out.println("Es bisiesto por ser multiplo de 400 y 100");
		}
		else {
			System.out.println("No es bisiesto");
		}*/
		
		
		/*6. Mostrar los 20 números impares inmediatamente inferiores al 100, en orden decreciente,
y al final, la suma de todos ellos.*/
		/*int x=0;
		inferiores(x);
		
	}*/

	/*private void inferiores(int x) {
		int i=1;
		int acu=99;
		int num=99;
		System.out.println(num);
		do {
			num=num-2;
			acu=num+acu;
			i++;
			System.out.printf("%d %n",num);
		}while(i<20);
		System.out.printf("La suma de los 20 impares es %d", acu);
		*/
		
		/*7. Introducir 20 números enteros por teclado. 
		 * Indicar cuánto suman (en valor absoluto) los negativos, y cuánto los positivos.*/
		
		/*int x=0;int cont=0;
		int sumaPos=0;
		int sumaNeg=0;
		do {
			System.out.println("Introduce un numero");
			x=leer.nextInt();
			cont++;
			if(x>0) {
				sumaPos=x+sumaPos;
			}
			if(x<0) {
				sumaNeg=x+sumaNeg;
			}
		} while(cont<5);
		sumaNeg=sumaNeg*(-1);
		System.out.printf("La suma de los positivos es %d y la de los negativos %d",sumaPos,sumaNeg);
		*/
		
		/*8. Calcular la suma : 1 + 2 + 3 +.....+ 20. Luego, la suma : 1 + 3 + 5 +.....+ 51. 
		 * Y, por último, la suma : 1 - 2 + 3 -.....+ 19 - 20.*/
		//1º
		/*System.out.print("1+2+3+...+20 ");
		int x=1; int y=2;
		do {
			x=x+y;
			y++;
		}while(y<=20);
		System.out.printf("= %d %n",x);
		//2º
		 System.out.print("1+3+5+...+51 ");
		 x=1;y=3;
		 do {
			 x=x+y;
			 y+=2;
		 }while(y<=51);
		 System.out.printf("= %d %n",x);
		 //3º
		System.out.print("1-2+3-...+19-20");
		x=1;y=-2;
		int z=3;
		do {
			x=x+y;
			y-=2;
			if (y!=-20) {
			x=x+z;
			z+=2;
		}
		}while(y>-20);
		System.out.printf("= %d %n",x);*/
		
		
		/*9. Introducir un número entero que llamaremos <dia_semana>, y comprendido entre 0 y 6, de modo que 
		 * el 0 corresponderá al Domingo, el 1 al Lunes,... y así sucesivamente, hasta el 6 que señalará al Sábado. 
		 * Suponed que el 1º de Enero de un año cualquiera “cae” en el día que marca <dia_semana>. Tendréis que
		 *  presentar en pantalla todos los días del mes de Enero, cada uno en una línea, acompañado del nombre
		 *   del día de la semana que le corresponde.
		 *   
		 */
		
		/*int diaSemana;
		System.out.println("Introduce un numero entero equivalente a un dia de la semana");
		diaSemana=leer.nextInt();
		enero(diaSemana);
		
		
	}

	private void enero(int x) {
	String nombreDia;int cont=0;
	do {
	switch (x) {
	case 0:
		nombreDia="Domingo";
		break;
	case 1:
		nombreDia="Lunes";
		break;
	case 2:
		nombreDia="Martes";
		break;
	case 3:
		nombreDia="Miercoles";
		break;
	case 4:
		nombreDia="Jueves";
		break;
	case 5:
		nombreDia="Viernes";
		break;
	case 6:
		nombreDia="Sabado";
		break;
		default:
			nombreDia="0";
	}
	if (nombreDia!="0"){
		
	
	cont++;
	System.out.println(cont+" de enero: "+nombreDia);
	x++;
	if(x>=7) {
		x=0;
	}}
	if(nombreDia=="0") {
		cont=32;
		System.out.println("El numero utilizado no corresponde a ningun dia de la semana");
	}
	}while(cont<31);
	}*/
	
		/*10. Leer 10 datos, compuesto cada uno de ellos por un nombre de persona y su sueldo 
		 * neto mensual, y obtener y visualizar el nombre y sueldo de la persona que más cobra y de la que menos. 
		 * Si hay varias con el mismo sueldo (máximo o mínimo) se presentará la primera 
		 * que aparezca en la secuencia de entrada.*/
	
		/*String nombre, nombreMayor="", nombreMenor="";
		int sueldo=0, sueldoMayor=0, sueldoMenor=100000;
		int cont=0;
		
		do {
			System.out.println("Introduce un nombre");
			nombre=leer.next();
			System.out.println("Introduce su salario");
			sueldo=leer.nextInt();
			
			if(elMayor(sueldo,sueldoMayor)) {
				sueldoMayor=sueldo;
				nombreMayor=nombre;
			}
			if(elMenor(sueldo,sueldoMenor)) {
				sueldoMenor=sueldo;
				nombreMenor=nombre;
			}
			cont++;
		}while(cont<10);
		System.out.printf("%s es el que mas cobra, ya que cobra %d %n",nombreMayor,sueldoMayor);
		System.out.printf("%s es el que menos cobra, ya que cobra %d %n",nombreMenor, sueldoMenor);
		*/
		
	
	}

	/*private boolean elMenor(int x, int y) {
		boolean menor= false;
		if (x<y) {
			menor=true;
		}
		return menor;
	}

	private boolean elMayor(int x, int y) {
		boolean mayor=false;
		if (x>y) {
			mayor=true;
		}
		return mayor;
	}*/



}