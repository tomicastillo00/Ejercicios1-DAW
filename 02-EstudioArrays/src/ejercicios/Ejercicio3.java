package ejercicios;

public class Ejercicio3 {

	public Ejercicio3() {
		/*3.- Diseñar un programa que genere un sorteo de primitiva y luego empiece 
		 * a generar boletos hasta que tengamos 6 aciertos.*/
		
		int[] ganador= {4,39,7,18,42,23};
		int [] primitiva= new int [6];
		
		do {
			for(int x =0;x<primitiva.length;x++) {
				primitiva[x]=(int)(Math.random()*48)+1;
			
			}
			
		}while(esGanador(primitiva,ganador));
		
		System.out.println("Has ganado millones de pavos");
		
	}

	private boolean esGanador(int[] primi, int[] gana) {
		boolean ganador=true;
		if (primi==gana) {
			ganador=false;
		}
		return ganador;
	}

}
