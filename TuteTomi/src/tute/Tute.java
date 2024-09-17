package tute;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Tute {

	public Tute() throws IOException {
		// TODO Auto-generated constructor stub
		File fichero=new File("tute.txt");
		if(!fichero.exists())
		fichero.createNewFile();
			
		FileReader fr=new FileReader(fichero);
		BufferedReader br=new BufferedReader(fr);
		
		int numeroJugadas=0;
		int jugadores=4;
		String[]jugadas=new String [4];
		numeroJugadas=Integer.parseInt(br.readLine());
		
		int jugador=1;
		
		//Bucle para jugadas
		for(int x=0;x<numeroJugadas;x++) {
			String jugada="";
			
			//Bucle para jugadores por jugada
			for(int y=0;y<jugadores;y++) {
				String lineaJugada=br.readLine();
				jugada=lineaJugada.substring(10,lineaJugada.length());
				jugadas[y]=jugada;
			}
			String paloGanador=br.readLine();
			
			compruebaGanador(jugadas,paloGanador,jugador);
			
			jugadas=new String[4];
			
		
			
			System.out.println("FIN");
			
			
		}
		
	}

	private void compruebaGanador(String[] jugadas, String paloGanador, int jugador) {
		// TODO Auto-generated method stub
		boolean canta=false;
		for(int x=0;x<jugadas.length;x++) {
			
			if(jugadas[x].contains("11O")&&jugadas[x].contains("12O")) {
				if(paloGanador.equals("O")) {
					System.out.println("El jugador "+jugador+" puede cantar cuarenta en oro");
					canta=true;
				}else {
					System.out.println("El jugador "+jugador+" puede cantar veinte en oro");
					canta=true;
				}
			}
			if(jugadas[x].contains("11B")&&jugadas[x].contains("12B")) {
				if(paloGanador.equals("B")) {
					System.out.println("El jugador "+jugador+" puede cantar cuarenta en basto");
					canta=true;
				}else {
					System.out.println("El jugador "+jugador+" puede cantar veinte en basto");
					canta=true;
				}
			}
			if(jugadas[x].contains("11E")&&jugadas[x].contains("12E")) {
				if(paloGanador.equals("E")) {
					System.out.println("El jugador "+jugador+" puede cantar cuarenta en espada");
					canta=true;
				}else {
					System.out.println("El jugador "+jugador+" puede cantar veinte en espada");
					canta=true;
				}
			}
			if(jugadas[x].contains("11C")&&jugadas[x].contains("12C")) {
				if(paloGanador.equals("C")) {
					System.out.println("El jugador "+jugador+" puede cantar cuarenta en copas");
					canta=true;
				}else {
					System.out.println("El jugador "+jugador+" puede cantar veinte en copas");
					canta=true;
				}
			}	
			jugador++;
			}
		if(canta==false)
			System.out.println("Nadie puede cantar");
		
	
			
		}
		
		
		
	

}
