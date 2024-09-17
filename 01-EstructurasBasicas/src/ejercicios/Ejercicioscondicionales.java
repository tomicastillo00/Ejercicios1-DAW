package ejercicios;

import java.util.Scanner;

public class Ejercicioscondicionales {

	public Ejercicioscondicionales() {
		// TODO Auto-generated constructor stub
		//Primero inicio la variable leer para todos los ejercicios
		Scanner leer=new Scanner(System.in);
		//A continuacion comenzamos a hacer los ejercicios.
		//EJERCICIO 1.- Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese
		//día.
	/*	System.out.println("Introduzca un dia de la semana lectivo");
		String diaDeLaSemana=leer.next();
		String asig;
		switch (diaDeLaSemana) {
		case "lunes": 
		asig="Lengua";
			break;
		case "martes": 
			asig="Matematicas";
			break;
		case "miercoles": 
			asig="Naturales";
			break;
		case "jueves": 
			asig="Historia";
			break;
		case "viernes": 
			asig="Educacion fisica";
			break;
		default:
			asig="Introduzca el dia correcto";
		}
		System.out.println("La asignatura que toca ese dia a primera hora es "+asig);
		*/
		
		/*EJERCICIO 2.- Realiza un programa que pida una hora por teclado y que muestre luego buenos días, 
		 * buenas tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de
		 *  21 a 5 respectivamente. Sólo se tienen encuenta las horas, los minutos no se deben introducir por teclado.*/
		/*int hora;
		System.out.println("Introduzca una hora");
		hora = leer.nextInt();
		
		if(hora>=6 && hora<=12){
		System.out.println("Buenos dias");
		}
		else if (hora>=13 && hora<=20){
		System.out.println("Buenas tardes");
		}
		else if (hora>=5 && hora<=0){
		System.out.println("Buenas noches");
		}
		*/
		/*EJERCICIO 3.- Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las horas ordinarias
		 *(40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros la hora.*/
  		/*
		int horasSemanales;
		int salarioSemanal= 0;
		
		
		System.out.println("¿Cuantas horas trabajas semanalmente");
		horasSemanales=leer.nextInt();
		if(40>=horasSemanales) {
			salarioSemanal=12*horasSemanales;
		}
		else {
			salarioSemanal=(horasSemanales-40)*16+480;
		}
		System.out.println("Usted cobrara un salario semanal de: "+salarioSemanal);
		*/
		//EJERCICIO 4-Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.
		/*int dia;
		int mes;
		System.out.println("Introduzca el numero del mes que nacio");
		mes = leer.nextInt();
		System.out.println("Introduzca el numero del dia que nacio");
		dia = leer.nextInt();
		if (dia >= 21 && mes == 3 || dia <= 19 && mes == 4) {
		System.out.println("Aries");	
		}
		else if (dia >= 20 && mes == 4 || dia <= 20 && mes == 5) {
			System.out.println("Tauro");	
			}
		else if (dia >= 21 && mes == 5 || dia <= 20 && mes == 6) {
			System.out.println("Geminis");	
			}
		else if (dia >= 21 && mes == 6 || dia <= 22 && mes == 7) {
			System.out.println("Cancer");	
			}
		else if (dia >= 23 && mes == 7 || dia <= 22 && mes == 8) {
			System.out.println("Leo");	
			}
		else if (dia >= 23 && mes == 8 || dia <= 22 && mes == 9) {
			System.out.println("Virgo");	
			}
		else if (dia >= 23 && mes == 9 || dia <= 22 && mes == 10) {
			System.out.println("Libra");	
			}
		else if (dia >= 23 && mes == 10 || dia <= 21 && mes == 11) {
			System.out.println("Escorpio");	
			}
		else if (dia >= 22 && mes == 11 || dia <= 21 && mes == 12) {
			System.out.println("Sagitario");	
			}
		else if (dia >= 22 && mes == 12 || dia <= 19 && mes == 1) {
			System.out.println("Capricornio");	
			}
		else if (dia >= 20 && mes == 1 || dia <= 18 && mes == 2) {
			System.out.println("Acuario");	
			}
		else if (dia >= 19 && mes == 2 || dia <= 20 && mes == 3) {
			System.out.println("Piscis");	
			}
		else {
			System.out.println("ERROR");
		}*/
		/*EJERCICIO 5-Escribe un programa que dada una hora determinada (horas y minutos),
		 *  calcule los segundos que faltan para llegar a la medianoche.*/
		
		/*int hora, min, segDia, segRestante;
		System.out.println("Introduzca la hora");
		hora=leer.nextInt();
		System.out.println("Introduzca los minutos");
		min=leer.nextInt();
		
		if(hora<=23 && min<=59 && hora>=0 && min>=0) {
		segDia=(min*60)+(hora*3600);
		segRestante=86400-segDia;
		System.out.println("Quedan "+segRestante+" segundos para la media noche");
		}
		else {
			System.out.println("La hora introducida no es correcta");
		}*/
		/*EJERCICIO 6- Escribe un programa que ordene tres números enteros introducidos por teclado.*/
		
		/*int primer,segun,tercer;
		System.out.println("Introduzca tres numeros enteros");
		primer=leer.nextInt();
		segun=leer.nextInt();
		tercer=leer.nextInt();
		
		if (tercer>segun & segun>primer) {
			System.out.println("El orden de los numeros es "+ primer +", " + segun+" y "+tercer);
		}
		else if (tercer>primer & primer>segun) {
			System.out.println("El orden de los numeros es "+ segun +", " + primer+" y "+tercer);
		}
		else if (primer>tercer & tercer>segun) {
			System.out.println("El orden de los numeros es "+ segun +", " + tercer+" y "+primer);
		}
		else if (segun>tercer & tercer>primer) {
			System.out.println("El orden de los numeros es "+ primer +", " + tercer+" y "+segun);
		}
		else if (segun>primer & primer>tercer) {
			System.out.println("El orden de los numeros es "+ tercer +", " + primer+" y "+segun);
		}
		else if (primer>segun & segun>tercer) {
			System.out.println("El orden de los numeros es "+ tercer +", " + segun+" y "+primer);
		}
		else {
			System.out.println("ERROR");
		}
		*/
		
		/*EJERCICIO 7-Escribe un programa que diga cuál es la última 
		 * cifra de un número entero introducido por teclado.*/
		/*int num, ultCifra;
		System.out.println("Introduce un numero entero");
		num=leer.nextInt();
		ultCifra=num%10;
		System.out.println("La ultima cifra del numero "+num+" es "+ultCifra);*/
		
		/*EJERCICIO 8- Escribe un programa que diga cuál es la primera cifra de 
		 * un número entero introducido por teclado. Se permiten números de hasta 5 cifras.*/
		
		/*int primeraCifra,num;
		primeraCifra=0;
		System.out.println("Introduce un numero entero");
		num=leer.nextInt();
		if (num>=0 && num<=9) {
			primeraCifra=num/1;
		}
		else if (num>=10 && num<=99) {
			primeraCifra=num/10;
		}
		else if (num>=100 && num<=999) {
			primeraCifra=num/100;
		}
		else if (num>=1000 && num<=9999) {
			primeraCifra=num/1000;
		}
		else if (num>=10000 && num<=99999) {
			primeraCifra=num/10000;
		}
		
		System.out.println("La ultima cifra del numero "+num+" es "+primeraCifra);*/
		/*EJERCICIO 9- Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser positivo o negativo.
		 *  Se permiten números de hasta 5 dígitos.*/
		
		/*int num, digi;
		System.out.println("Introduce un numero positivo o negativo de hasta 5 digitos");
		digi=0;
		num=leer.nextInt();
		
		if (num<=9 & num>=-9) {
			digi=1;
		}
		else if (num<=99 & num>=-99) {
			digi=2;
		}
		else if (num<=999 & num>=-999) {
			digi=3;
		}
		else if (num<=9999 & num>=-9999) {
			digi=4;
		}
		else if (num<=99999 & num>=-99999) {
			digi=5;
		}
		System.out.println("El numero "+num+" tiene "+digi+" digitos");*/
		
		/*EJERCICIO 10*/
		
		boolean esCapicua=false;
		int num = leer.nextInt();
	
		
		if(num<10) {
			esCapicua=true;
		}
		if (num>=10 && num<100) {
			if((num%10)==(num/10)) {
				esCapicua=true;
		}
		}
		if (num>=100 && num<1000) {
			if((num%10)==(num/100)) {
				esCapicua=true;
		}
		}
		if (num>=1000 && num<10000) {
			if(((num%100)/10)==((num/100)%10) && ((num%10)==(num/1000))) {
				esCapicua=true;
		}
		}
		if (num>=10000) {//no esta bien este
			if(((num%10)==(num/10000)) && ((num%100)/10)==((num/1000)%10)) {
				esCapicua=true;
		}
		}
		if(esCapicua) {
			System.out.println("El numero es capicua");
		}
		else {
			System.out.println("El numero NO es capicua");
		}
		
	}}


