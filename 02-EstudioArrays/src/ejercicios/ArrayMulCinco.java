package ejercicios;

import java.util.Arrays;

public class ArrayMulCinco {

	public ArrayMulCinco() {
		/* Generar Array de numeros aleatorios que no se repitan.
		 * Cuando se genere el array se recorre y se forma otro modificandolo
		 * dependiendo de la siguiente condicion.
		 * CONDICION: si el numero es multiplo de cinco se queda igual, pero si no lo es,
		 * se convertira automaticamente en el multiplo de 5 siguiente
		 */
		
		int []aleatorio=gererarAleatorioSinRepeticion(10,1,100);
		for(int x=0;x<aleatorio.length;x++) {
			System.out.print(aleatorio[x]+" - ");
		}
		System.out.println("");
		int[]array=aleModificado(aleatorio);	
		for(int x=0;x<array.length;x++) {
			System.out.print(array[x]+" - ");
		}
		
	}

	private int[] aleModificado(int[] aleatorio) {
		int[]array=new int[aleatorio.length];
		
		for(int x=0;x<aleatorio.length;x++) {
			array[x]=aleatorio[x];
			do {
				
			if(array[x]%5!=0) 
				array[x]++;
			}while(array[x]%5!=0);
		}
		return array;
	}

	private int[] gererarAleatorioSinRepeticion(int cant, int limMin, int limMax) {
		int[]aleatorio=new int [cant];
		int ale=0;
		if((limMax-limMin+1)<cant)
			return aleatorio;
		for(int x=0;x<aleatorio.length;x++) {
			do {
				ale=(int)(Math.random()*(limMax-limMin+1)+limMin);
			}while(esRepe(ale,aleatorio));
			aleatorio[x]=ale;
		}
		Arrays.sort(aleatorio);
			
		return aleatorio;
		
		
		
		
	}

	private boolean esRepe(int ale, int[] aleatorio) {
		boolean repe=false;
		for(int x=0;x<aleatorio.length;x++) {
			if(aleatorio[x]==ale)
				repe=true;
		}
		return repe;
	}
	

}