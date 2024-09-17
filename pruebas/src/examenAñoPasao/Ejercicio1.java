package examenAñoPasao;

import java.util.Scanner;

public class Ejercicio1 {

	public Ejercicio1() {
		
		Scanner leer=new Scanner(System.in);
		double precioEntradas=0;
		System.out.println("Venta de entradas CineCompa");
		System.out.println("Numero de entradas: ");
		int numEntradas=leer.nextInt();
		System.out.println("Dia de la semana(1-7)");
		int diaSemana=leer.nextInt();
		int entradasDoble=0;
		int precioDobles=0;
		switch (diaSemana) {
		case 1,2,5,6,7: 
			precioEntradas=8;
			break;
		case 3: 
			precioEntradas=5;
			break;
		case 4: 
			if(numEntradas%2==0) {
				 entradasDoble=numEntradas/2;
			}
			else {
				numEntradas=1;
				 entradasDoble=(numEntradas-1)/2;
			}
			 precioDobles=11;
			precioEntradas=8;
			break;
		
		default:
			System.out.println("ERROR");
		}
		
		System.out.println("¿Tiene tarjeta CineCompa? (si=1/no=2)");
		int tarjeta=leer.nextInt();
		double descuento=0;
		switch (tarjeta) {
		case 1: 
			descuento=0.1;
			break;
		case 2: 
			descuento=0;
			break;
		default:
			System.out.println("ERROR");
		}
		System.out.println("================================");
		System.out.println("Aqui tiene sus entradas disfrute");
		System.out.println("================================");
		if (entradasDoble>0) {
			System.out.println("Entradas de pareja: "+entradasDoble);
			System.out.println("Precio por entradas de pareja: "+precioDobles);
		}
		if (numEntradas>0) {
			System.out.println("Entradas individuales: "+numEntradas);
			System.out.println("Precio por entrada individual: "+precioEntradas);
		}
		double total= (entradasDoble*precioDobles)+(numEntradas*precioEntradas);
			System.out.println("Total: "+total);
			descuento=total*descuento;
			System.out.println("Descuento: "+descuento);
			double resul=total-descuento;
			System.out.println("A pagar: "+resul);
		
	}

}
