package tute;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerFricheroTute {
		

			public LeerFricheroTute() throws IOException {
				// TODO Auto-generated constructor stub
				
				//Creamos el fichero y rellenamos con los datos.
				File fichero=new File("JuegoDelTute.txt");
				if (!fichero.exists()) {
					fichero.createNewFile();
				}
				
				//Una vez creado y rellenado, declaramos los tipos de datos que vamos a extraer del fichero.
				int NumeroDeJugadas; String Jugadas[]=new String[4]; String PaloGanador;int cantidadJugadores=4;
				
				//Declaramos una variable que usaremos como referencia para la ronda en la que nos encontremos. Y otra para el jugador.
				int ronda=1; int jugador=1;
				
				//Ahora pasamos a leer el fichero y guardar cada dato en su lugar.
				FileReader fr=new FileReader(fichero);
				BufferedReader br=new BufferedReader(fr);
				
				//La primera línea es el número de jugadas que hay
				NumeroDeJugadas=Integer.parseInt(br.readLine());
				
				//Las siguientes lineas son las partidas, y el palo ganador de cada partida.
				//Debemos leer las 3 partidas una detrás de otra, mientras mostramos si hay algún jugador que haya cantado o si no ha cantado nadie.
				//Hacemos un primer bucle que se repetirá 3 veces, ya que hay 3 partidas
				for (int i = 0; i < NumeroDeJugadas; i++) {
					
					//Analizamos una partida por vuelta
					//Otro bucle que se repetirá 4 veces ya que hay 4 jugadores.
					for (int j = 0; j < cantidadJugadores; j++) {
						
						//Declaramos una variable en la que iremos almacenando las líenas de texto para extraer la jugada.
						String Jugada="";
						String LineaJugada=br.readLine();
						
						//Extraemos la parte que nos interesa
						Jugada=LineaJugada.substring(10, LineaJugada.length());
						
						//La añadimos a nuestro array de Jugadas
						Jugadas[j]=Jugada;
						
						//Repetimos el proceso
					}
					//Hacemos otro bucle para mostrar las jugadas
					for (int j = 0; j < Jugadas.length; j++) {
						System.out.println("Jugador"+(j+1)+":"+Jugadas[j]);
					}
					//Extraemos el palo ganador y lo mostramos.
					PaloGanador=br.readLine();
					System.out.println("El palo ganador es: "+PaloGanador);
					
					//Hacemos un método que compruebe las jugadas y diga quien canta.
					compruebaGanador(Jugadas,PaloGanador,ronda,jugador);
					
					//Volvemos a dejar vacío  el array de jugadas para analizar la siguiente partida.
					Jugadas=new String[4];
					
					//Aumentamos para pasar a la ronda 2.
					ronda++;
					System.out.println("");
				}
			}

			private void compruebaGanador(String[] Jugadas, String PaloGanador, int ronda, int jugador) {
				// TODO Auto-generated method stub
				boolean cantar=false;
				for (int i = 0; i < Jugadas.length; i++) {
					if (Jugadas[i].contains("11O")&&Jugadas[i].contains("12O")) {
						if (PaloGanador.equals("O")) {
							System.out.println("Jugador "+jugador+" puede cantar 40 en oro");
							cantar=true;
						}
						else {
							System.out.println("Jugador "+jugador+" puede cantar 20 en oro");
							cantar=true;
						}
				
					}
					if (Jugadas[i].contains("11E")&&Jugadas[i].contains("12E")) {
						if (PaloGanador.equals("E")) {
							System.out.println("Jugador "+jugador+" puede cantar 40 en espada");
							cantar=true;
						}
						else {
							System.out.println("Jugador "+jugador+" puede cantar 20 en espada");
							cantar=true;
						}
					}	
					if (Jugadas[i].contains("11B")&&Jugadas[i].contains("12B")) {
						if (PaloGanador.equals("B")) {
							System.out.println("Jugador "+jugador+" puede cantar 40 en basto");
							cantar=true;
						}
						else {
							System.out.println("Jugador "+jugador+" puede cantar 20 en basto");
							cantar=true;
						}
					}
					if (Jugadas[i].contains("11C")&&Jugadas[i].contains("12C")) {
						if (PaloGanador.equals("C")) {
							System.out.println("Jugador "+jugador+" puede cantar 40 en copas");
							cantar=true;
						}
						else {
							System.out.println("Jugador "+jugador+" puede cantar 20 en copas");
							cantar=true;
						}
					}
					jugador++;
				}
				if (cantar==false) System.out.println("Nadie puede cantar");
				System.out.println("Fin de la jugada "+ronda);
			}

		}

	


