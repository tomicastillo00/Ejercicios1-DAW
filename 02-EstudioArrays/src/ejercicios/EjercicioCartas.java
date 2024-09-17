package ejercicios;

import java.util.Arrays;

public class EjercicioCartas {

	public EjercicioCartas() {

		String cartas[] = { "1O", "2O", "3O", "4O", "5O", "6O", "7O", "SO", "CO", "RO",
							"1C", "2C", "3C", "4C", "5C", "6C", "7C", "SC", "CC", "RC",
							"1E", "2E", "3E", "4E", "5E", "6E", "7E", "SE", "CE", "RE",
							"1B", "2B", "3B", "4B", "5B", "6B", "7B", "SB", "CB", "RB", };
			
		int[][]partida=new int[10][];
		int[]jugada;
		for(int x=0;x<partida.length;x++) {
			jugada=repartirCartas(8,0,39);
			partida[x]=jugada;
		}
		int cartaGanadora=(int)(Math.random()*(39-0+1)+0);
		System.out.println("La carta ganadora es el= "+cartas[cartaGanadora]);
	
	
	mostrarPartidas(partida,cartas);
	cartasRepartidas(partida,cartas,cartaGanadora);
	}

	private void cartasRepartidas(int[][] partida, String[] cartas, int cartaGanadora) {
		int[]jugador1=new int[40];
		int[]jugador2=new int[40];
		for(int x=0;x<partida.length;x++) {
		for(int y=0;y<partida[x].length;y++) {
		if(y<4)
		jugador1[partida[x][y]]++;
		else {
		jugador2[partida[x][y]]++;
		}
		}
		}
		System.out.println(Arrays.toString(jugador1));
		System.out.println(Arrays.toString(jugador2));
		System.out.println("Jugador 1 "+cartas[cartaGanadora]+" : "+jugador1[cartaGanadora]);

		System.out.println("Jugador 2 "+cartas[cartaGanadora]+" : "+jugador2[cartaGanadora]);
		if(jugador1[cartaGanadora]>jugador2[cartaGanadora])
		System.out.println("Gana el Jugador1");
		else if(jugador1[cartaGanadora]<jugador2[cartaGanadora])
		System.out.println("Gana el Jugador2");
		else
		System.out.println("EMPATE");
		
	}

	private void mostrarPartidas(int[][] partida, String[] cartas) {
	System.out.println("Jugador 1	Jugador 2");
		for(int x=0;x<partida.length;x++) {
			System.out.println("");
			for(int y=0;y<partida[x].length;y++) {
				if(y<4) {
					System.out.print(cartas[partida[x][y]]+" ");
				}
				else {
					if (y==4) System.out.print("   ");
					System.out.print(cartas[partida[x][y]]+" ");
				}
			}
		}
			
		
	}

	private int[] repartirCartas(int cant, int limMin, int limMax) {
		
		int[]nuevaPartida=new int [cant];
		int ale=0;
		for(int x=0;x<nuevaPartida.length;x++) {
			do {
			ale=(int)(Math.random()*(limMax-limMin+1)+limMin);
			}while(repetido(nuevaPartida,ale));
			nuevaPartida[x]=ale;
		}
		
		return nuevaPartida;
	}

	private boolean repetido(int[] aleatorio, int ale) {
		
		boolean repe=false;
		for(int x=0;x<aleatorio.length;x++) {
			if(aleatorio[x]==ale)
				repe=true;
		}
		
		return repe;
	}

}
