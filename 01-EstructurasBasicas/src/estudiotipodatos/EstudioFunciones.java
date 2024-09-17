package estudiotipodatos;

import java.util.Scanner;

public class EstudioFunciones {

	public EstudioFunciones() {
		// TODO Auto-generated constructor stub
		Scanner leer=new Scanner(System.in);
		
		
		
		saludo();
		String nom= "Tomas";
		saludo2(nom);
		
		
		
		int x = 7;
		double y = 3;
		double resultado = calcula(x, y);
		
		System.out.println("Division = "+ resultado);
		System.out.println("X en principal = "+ x);
		
		
		System.out.println("Introduzca un numero positivo: ");
		int n = leer.nextInt();
		
		if (esPrimo(n)) {//salta al metodo esPrimo
			System.out.println("El "+n+" es primo");
		
		}else {
			System.out.println("El "+n+" NO es primo");
		}
		
		
	}
	
	//FUNCIONES
	
	//esta variable "nom"
	private void saludo2(String nom) {//no tiene porque llamarse igual que la que va a entrar 
		System.out.println("Bienvenido "+nom);//lo unico que tiene que ser el mismo tipo de dato
	}
			//se pone void porque no devuelve nada
	private static void saludo() {
		System.out.println("Bienvenido a la clase de programacion");
	}
	
	private static double calcula(int x, double y) {//esta funcion devuelve un numero doble
		double div = x / y;
		x = 10;
		System.out.println("X en metodo = "+x);
		return div;
	}
	
	public static boolean esPrimo(int x) {//aqui se verifica si el numero es primo o no
		boolean primo=true;
		for (int i = 2; i < x; i++) {
			if((x % i) == 0) {
				primo=false;//y se manda que no es primo
			}
		}
		return primo;//o si es primo a la funcion esPrimo
	}
	
	

}
