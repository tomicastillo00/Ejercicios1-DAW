package estudiotipodatos;

import java.util.Scanner;

public class EstudiosEstructurasCondicionales { 

	public EstudiosEstructurasCondicionales() {
		// TODO Auto-generated constructor stub
		System.out.println("Estudio estructuras basicas");
		
		
		//Estudio if
		
		
		int edad = 15;
		boolean esBisiesto = true;
		
		if (esBisiesto) {
			System.out.println("El año es bisiesto");
			
		}
		else {
			System.out.println("El año no es bisiesto");
		}
		if (edad>=18) {
			System.out.println("MAYOR DE EDAD");
			
		}
		else {
			System.out.println("MENOR DE EDAD");
	}
	Scanner leer = new Scanner (System.in);
	System.out.println("Cual es la capital de Kiribati¿?");
	String respuesta = leer.next();
	
	if (respuesta.equals("Tarawa")) {
		System.out.println("La respuesta es correcta");
	}
	else {
		System.out.println("La respuesta es incorrecta");

	
	}

	System.out.println("Por favor, introduce un numero entero");
	int x = leer.nextInt();
	
	//en el if ponemos lo importante, en el else ponemos lo menos importante
			
			if (x < 0) {
				System.out.println("El numero introducido es negativo");
				
			}
			else {
				System.out.println("El numero introducido es positivo");
			}
			
			//if else if...
			int edadPedro = 15, edadLuis = 17;
			
			//esta estructura se utiliza para valorar MAS DE UNA condicion
			
			if (edadPedro>=18 & edadLuis>=18) {
				
				System.out.println("Los dos son mayores de edad y pueden votar");
				
			}
			else if (edadPedro < 18 && edadLuis >=18) {
				System.out.println("Luis puede votar pero Pedro no por ser menor de edad");
				
			}
			else if (edadPedro < 18 && edadLuis < 18) {
				System.out.println("No puede votar ninguno porque son menores de edad");
				
			}
			else {
				System.out.println("ninguna de las 3 opciones");
			}
			
			//Estudio switch
			
			System.out.println("Por favor introduzca numero de mes: ");
			//el switch es para elegir una opcion dependiendo de la variable
			
	int mes = leer.nextInt();
	String nombreDelMes;
	switch (mes) {
	case 1: 
		nombreDelMes = "enero";
		break;
	
	case 2: 
		nombreDelMes = "febrero";
		break;
	
	case 3: 
		nombreDelMes = "marzo";
		break;
	
	case 4: 
		nombreDelMes = "abril";
		break;
	
	case 5: 
		nombreDelMes = "mayo";
		break;
	
	case 6: 
		nombreDelMes = "junio";
		break;
	
	case 7: 
		nombreDelMes = "julio";
		break;
	
	case 8: 
		nombreDelMes = "agosto";
		break;
	
	case 9: 
		nombreDelMes = "septiembre";
		break;
	
	case 10: 
		nombreDelMes = "octubre";
		break;
	
	case 11: 
		nombreDelMes = "noviembre";
		break;
	
	case 12: 
		nombreDelMes = "diciembre";
		break;
	//se pone break porque sino se pone, entraria en la correspondiente, pero tambien en todas las siguientes
	default:
		nombreDelMes = "No existe ese mes ";
		
	}
	System.out.println("Mes "+mes+ ": "+nombreDelMes);
	System.out.println("Estriba para llegar a la pagina correspondiente: inicio, registro o salir");
	
	//otro ejemplo
	String pagina = leer.next();
	switch(pagina) {
	case "inicio":
		System.out.println("Pagina de inicio");
		break;
	case "registro": 
		System.out.println("Pagina de registro");
		break;
	case "salir":
		System.out.println("Cerrar sesion");
		break;
	}
	System.out.println("Calculo de areas: 1.cuadrado, 2.rectangulo o 3.triangulo ");
	int opcion = leer.nextInt();
	double lado, base, altura;
	switch (opcion) {
	case 1: 
		System.out.println("Introduzca el lado del cuadrado en cm: ");
		lado = leer.nextDouble();
		System.out.println("El area del cuadrado es "+(lado * lado)+ " cm2");
		break;
	case 2: 
		System.out.println("Introduzca la altura del rectangulo en cm: ");
		altura = leer.nextDouble();
		System.out.println("Introduzca la base del rectangulo en cm: ");
		base = leer.nextDouble();
		System.out.println("El area del rectangulo es "+(base * altura)+ " cm2");
		break;
	case 3: 
		System.out.println("Introduzca la base del triangulo en cm: ");
		base = leer.nextDouble();
		System.out.println("Introduzca la altura del triangulo en cm: ");
		altura = leer.nextDouble();
		System.out.println("El area del rectangulo es "+((base * altura)/2)+ " cm2");
		break;
		default:
			System.out.println("la opcion elegida no es correcta");
		}
	
	}		
		
}
	
