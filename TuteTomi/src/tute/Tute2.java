package tute;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Tute2 {

	public Tute2() throws IOException {
		// TODO Auto-generated constructor stub
		File fichero=new File("tute.txt");
		if (!fichero.exists())
			fichero.createNewFile();
		
		FileReader fr=new FileReader(fichero);
		BufferedReader br=new BufferedReader(fr);
		
		int jugadores=4;
		String[]jugadas=new String [jugadores];
		int numeroJugadas;
		int jugador=1;
		
		
		
		numeroJugadas=Integer.parseInt(br.readLine());
		
		for(int x=0;x<numeroJugadas;x++) {
			String jugada="";
			for(int y=0;y<jugadores;y++) {
				String lineaJugada=br.readLine();
				jugada=lineaJugada.substring(10,lineaJugada.length());
				jugadas[y]=jugada;
			}
			String paloGanador=br.readLine();
			compruebaGanador(jugadas,jugador,paloGanador);
			
		}
	
		
		
	}

	private void compruebaGanador(String[] jugadas, int jugador, String paloGanador) {
		// TODO Auto-generated method stub
		boolean canta=false;
		
		for(int x=0;x<jugadas.length;x++) {
			
			if(jugadas[x].contains("11O")&&jugadas[x].contains("12O")) {
				if(paloGanador.equals("O")) {
					System.out.println("Jugador "+jugador+" puede cantar 40 en oro");
					canta=true;
				}else {
					System.out.println("Jugador "+jugador+" puede cantar 20 en oro"); 
					canta=true;
				}
			}
			if(jugadas[x].contains("11C")&&jugadas[x].contains("12C")) {
				if(paloGanador.equals("C")) {
					System.out.println("Jugador "+jugador+" puede cantar 40 en copas");
					canta=true;
				}else {
					System.out.println("Jugador "+jugador+" puede cantar 20 en copas"); 
					canta=true;
				}
			}
			if(jugadas[x].contains("11E")&&jugadas[x].contains("12E")) {
				if(paloGanador.equals("E")) {
					System.out.println("Jugador "+jugador+" puede cantar 40 en espada");
					canta=true;
				}else {
					System.out.println("Jugador "+jugador+" puede cantar 20 en espada"); 
					canta=true;
				}
			}
			if(jugadas[x].contains("11B")&&jugadas[x].contains("12B")) {
				if(paloGanador.equals("B")) {
					System.out.println("Jugador "+jugador+" puede cantar 40 en basto");
					canta=true;
				}else {
					System.out.println("Jugador "+jugador+" puede cantar 20 en basto"); 
					canta=true;
				}
			}
			jugador++;
		}
		if(canta==false)
			System.out.println("Nadie puede cantar");
		
		System.out.println("FIN");
	}

}
