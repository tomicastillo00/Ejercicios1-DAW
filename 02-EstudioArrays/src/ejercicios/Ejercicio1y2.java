package ejercicios;

import java.util.Arrays;

public class Ejercicio1y2 {

	public Ejercicio1y2() {
		
		/*1.- Diseñar una función que genere un array que simule un boleto de primitiva. 
		 * (Seis números entre 1 y 49 que no se repitan).
		2.- Diseñar un programa que me permita almacenar 10 boletos de primitiva, luego 
		genere un sorteo y me diga cuantos aciertos tiene cada boleto.*/
		
		int[][]BDPrimitiva=new int[10][];
	
		for(int x = 0;x<BDPrimitiva.length;x++) {
			BDPrimitiva[x]=generarNumerosAleatoriosSinRepeticion(6,1,49);//se guarda 10boletos
		}
		int []primitiva=generarNumerosAleatoriosSinRepeticion(6, 1, 49);//se guarda la jugada
		mostrar(primitiva);
		
	}

	private void mostrar(int[] primitiva) {
		int[]ganador= {2,6,34,16,25,48};
		Arrays.sort(ganador);
		int cont=0;
		for(int x=0;x<primitiva.length;x++) {
			System.out.printf("%d - ",primitiva[x]);
		
		}
		for(int x=0;x<primitiva.length;x++) {
			if(ganador[x]==primitiva[x]) {
				cont++;
			}
		}
		System.out.print("Has obtenido "+cont+" aciertos");
		
	}

	
	private int[] generarNumerosAleatoriosSinRepeticion(int cant, int limMin, int limMax) {
		
		int[]aleatorio=new int [cant];//guardamos la variable array a devolver
		int ale=0;//el numero que nos sale cada vez
		if((limMax-limMin+1)<cant)
			return aleatorio;
		for(int x=0;x<aleatorio.length;x++) {//recorremos el array que devolvemos dandole valores a cada hueco
			
			do {	
			ale=(int)(Math.random()*(limMax-limMin+1)+limMin);//generamos numero aleatorio
			}while(repetidos(ale,aleatorio));//si el numero que hemos generado es igual que otro anterior salta a la funcion
			
			aleatorio[x]=ale;//sabiendo que no hay otro igual, igualamos ale con el hueco del array
		}
			Arrays.sort(aleatorio);//si lo deseamos ordenamos el array
			
		
		
		return aleatorio;
	}

	private boolean repetidos(int ale, int[] aleatorio) {
		
		boolean repe=false;//creamos variable boleana
		for(int x=0;x<aleatorio.length;x++) {//recorremos array para
			if(aleatorio[x]==ale) {//comprobar aqui si hay algun numero igual
				repe=true;//para devolver que si es verdadero
				break;
			}
		}
		
		return repe;
	}

}
