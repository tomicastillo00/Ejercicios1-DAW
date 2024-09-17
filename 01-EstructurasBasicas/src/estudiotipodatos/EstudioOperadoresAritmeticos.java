package estudiotipodatos;

import java.util.Scanner;

public class EstudioOperadoresAritmeticos {

	public EstudioOperadoresAritmeticos() {
		// TODO Auto-generated constructor stub
		System.out.println("Operadores aritmeticos");
		
		//estos son el +,-,*,%(aritmeticos),><,<=,>=,==(relacional), and,or, not(Logico)
		
		int suma, a = -5, b = 3, multi;
		double sumaDoble, num1 = 5.5, num2 = 2.3;
		suma = a - b;
		multi = a * b;
		System.out.println("Suma = " + suma);
		System.out.println("Multiplicacion = = "+ multi);
		sumaDoble = num1 + a;
		suma = (int) sumaDoble;
		int divEntera,divid=7,div=3;
		double divReal,div2=3;
		divEntera = divid/div;
		System.out.println("Divi entera = "+divEntera);
		divReal = divid/(double)div;
		System.out.println("Divi real = "+divReal);
		divReal = divid/div2;
		System.out.println("Divi real 2 = "+divReal);
		int resto;
		resto= divid%div;
		System.out.println("El resto de la division es = "+resto);
		int cont=0;
		cont=cont+1; //contador
		System.out.println("Contador = "+cont);//1
		cont++;
		System.out.println("Contador = "+cont);//2
		++cont;
		System.out.println("Contador = "+cont);//3
		int y=cont++;
		System.out.println("Contador = "+y);//4
		y=++cont;
		System.out.println("Contador  ="+y);//5
		
		//contadores
		cont=cont+2;
		cont+=2;
		cont*=4;//cont=cont*4
		cont/=2;//cont=cont/4
		//acumuladores
		int acu=3;
		acu=acu+cont;
		acu+=cont;
		acu*=cont;//acu=acu*cont
	
		//Operadores de relacion
		int z = 3, r = 4;
		boolean sw = false, sw1, sw2;
		
		sw = z == r;//preguntamos si z es igual que r
		sw = z != r;//si z es distinto de r
		sw = z >= r;//si z es mayor o igual que r
		//se realiza la comparacion de z y r y se guarda el resultado(verdadero o falso) en la variable sw
		System.out.println("sw = "+sw);
		
		sw1=true;
		sw2=false;
		
		//Operador ternario en java
		int resultado = (z > r) ? z : r;
		int notaNumerica = 6;
		String notaCadena = notaNumerica < 5 ? "suspenso":"aprobado";
		
		System.out.println("El mayor es: "+ resultado);
		System.out.println("Resultado del examen"+ notaCadena);
		
		
		//Operadores lógicos
		
		sw1 = true;
		sw2 = false;
		
		
		System.out.println(!sw1);//Devuelve lo contrario de sw1
		System.out.println(sw2||sw1);//Devuelve true si al menos uno es verdadero
		System.out.println(sw1&&sw1);//Devuelve true solo cuando los dos son verdaderos
		System.out.println(sw1^sw2);//devuelve true solo si uno de los operandos es verdadero(si los dos son verdaderos devuelve falso)
		
		boolean t = true;
		boolean f = false;
		
		System.out.println("t = "+ t);
		System.out.println("f = "+ f);
		System.out.println("t && f = "+ (t && f));
		System.out.println("t || f = " +(t || f));
		System.out.println("!t = "+ !t);
		System.out.println("t || (6 > 10) = " + (t || (6>10)));
		
		
		/*Realiza un programa que calcule la nota que hace falta sacar
		 * en el segundo examen de la asignatura **Programacion** para 
		 * obtener la media deseada. Hay que tener en cuenta que la nota 
		 * del primer examen cuenta el 40% y la del segundo examen un 60%.
		 */
		
		double notaDeseada=0,notaPrimerExamen=0,notaSegundoExamen=0;
		System.out.println("¿Que nota media quieres tener?");
		Scanner leer =new Scanner(System.in);
		notaDeseada=leer.nextDouble();//se lee la nota que se desea obtener
		leer=null;
		System.out.println("¿Cuanta nota sacaste en el primer examen?");
		leer =new Scanner(System.in);
		notaPrimerExamen=leer.nextDouble();//se lee la nota del primer examen
		notaSegundoExamen=(((notaDeseada*10)-(notaPrimerExamen*4))/6);
		System.out.println("En el proximo examen deberas sacar un "+notaSegundoExamen+" o mas.");//finalmente se obtiene la nota que debe llegar el alumno para llegar al examen
	}

}
