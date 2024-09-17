package estudiotipodatos;

import java.util.Iterator;
import java.util.Scanner;

public class EstudioEstructurasRepeticion {

	public EstudioEstructurasRepeticion() {
		// TODO Auto-generated constructor stub
		Scanner leer = new Scanner(System.in);
		String pausa = "";
		System.out.println("Estudio estructuras de repeticion#######");
		//#####FOR#####
		System.out.println("Bucle for#####");
		for (int i = 1 ; i < 11 ; i++) {
			System.out.println(i);
		}
		//ESTRUCTURA: for(Declarar variable; establecer condicion; contador)
		System.out.println("Pulsa para continuar");
		pausa = leer.next();
		System.out.println("=============");
		for (int i = 1; i < 11; i += 2) {
			System.out.println(i);
		}
		System.out.println("Pulsa para continuar");
		pausa = leer.next();
		System.out.println("=============");
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("Pulsa para continuar");
		pausa = leer.next();
		
		//#####WHILE#####
		System.out.println("Bucle while######");
		int i = 1;
		//el codigo se repite siempre que la condicion sea verdadera
		while (i < 11) {
			System.out.println(i);
			i++;
		}
		System.out.println("Pulsa para continuar");
		pausa = leer.next();
		
		//#####DO WHILE#####
		System.out.println("Bucle do while#########");
		i = 1;
		//es igual que while, la unica diferecia es que DO WHILE 
		//por fuerza realiza la repeticion del codigo AL MENOS UNA VEZ
		//esto se debe a que la condicion se establece al final de la estructura
		do {
			System.out.println(i);
			i++;
		} while (i < 11);
		System.out.println("Pulsa para continuar");
		pausa = leer.next();
		//PARA EL VIDEO Y REALIZA LOS SIGUIENTES EJERCICIOS
		/**
		 * Bucle while que termina cuando se introduce por teclado un numero negativo.
		 * Muestra la cantidad de numeros introducidos y la suma
		 */
		/**
		 * Bucle do-while que termina cuando se introduce por teclado un numero impar.
		 */
		
		//Ejercicio bucle while
		//Scanner leer = new Scanner(System.in);(lo comento porque ya esta arriba de la clase y por lo tanto estaria duplicada)
		int num = 0;
		int cont = 0;
		int suma = 0;
		while (num >=0) {
		System.out.println("Introduce un numero entero");
		num = leer.nextInt();	
		suma = suma + num;
		cont++;
	}
		suma=suma-num;
		System.out.println("La cantidad de numeros introducidos es "+cont+" y la suma de todos estos es "+suma);

		//Ejercicio bucle do while
		int nume = 0;
		int resto = 0;
		//Scanner leer = new Scanner(System.in);
		do {
			System.out.println("Introduce un numero");
			nume = leer.nextInt();
			resto = nume%2;
		} while (resto==0);
		System.out.println("FIN");
		
		}
	}
