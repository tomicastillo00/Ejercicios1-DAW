package ejercicios;

import java.util.Scanner;

public class EjerciciosRepaso2 {

	public EjerciciosRepaso2() {
		Scanner leer=new Scanner (System.in);
		// TODO Auto-generated constructor stub
		/*11. Calcular la suma de los números pares y, al mismo tiempo, 
		 * la de los impares comprendidos entre 1 y 100, ambos inclusive */
			
			/*int sumaPares=0;
			int cont=0;
			int sumaImpares=0;
			do {
				sumaPares=sumaPares+cont;
				cont+=2;
			}while(cont<=100);
			System.out.println("La suma de de los pares es "+sumaPares);
	cont=1;
	do {
		sumaImpares=sumaImpares+cont;
		cont+=2;
	}while(cont<=99);
	System.out.println("La suma de los impares es "+sumaImpares);*/
		
		/*12. Dados dos números enteros positivos, hallar el mínimo común múltiplo. Método a usar:
		 *  Se van hallando los sucesivos múltiplos del mayor de ellos hasta encontrar uno que 
		 *  sea divisible por el más pequeño. */
		
		int menor, mayor, mcm;
		System.out.println("Introduce un numero");
		menor=leer.nextInt();
		System.out.println("Introduce el segundo numero");
		mayor=leer.nextInt();
		if (menor>mayor) {
			int c= mayor;
			mayor=menor;
			menor=c;
		}
		
		System.out.println("El minimo comun multiplo de "+menor+" y "+mayor+" = ");
		mcm=mayor;
		int cont=1;
		while(mcm%menor!=0) {
			cont++;
			mcm=mayor*cont;
		}
		System.out.print(mcm);
		
		/*17. Visualizar todos los números binarios representables con 4 bits, ordenados de 
		 * menor a mayor, así como su valor decimal.*/
		
		/*14. Dado un número entero positivo hallar si es primo o no.*/
		
		/*int num=0; boolean primo= true;
		System.out.println("Introduce un numero positivo");
		num=leer.nextInt();
		while(num<0) {
			System.out.println("El numero introducido es negativo, introduce otro");
			num=leer.nextInt();
		}
		for(int i = 2;i<num;i++) {
			if(num%2==0) {
				primo=false;
			}
		}
		if (primo) {
			System.out.println("El numero es PRIMO");
		}
		else {
			System.out.println("El numero NO es primo");
		}
		*/
}
}
