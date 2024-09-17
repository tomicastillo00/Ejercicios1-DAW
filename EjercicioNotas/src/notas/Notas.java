package notas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Notas {

	public Notas() throws IOException {
		// TODO Auto-generated constructor stub
		File fichero=new File("notas.txt");
		if(!fichero.exists())
			fichero.createNewFile();
		
		//Esta clase lee un fichero
				FileReader fr=new FileReader(fichero);
				//Esta clase captura los datos leidos en el fichero de la clase anterior
				BufferedReader br=new BufferedReader(fr);
		
				String dato;
				//Leemos primera linea para pasarla al array de nombres
				dato=br.readLine();
				String [] nombres=dato.split(";");
				
				//Leemos segunda linea para pasarla al array de asignaturas
				dato=br.readLine();
				String [] asignaturas=dato.split(";");
				
				//Leemos las siguientes lineas para pasarlas a un array bidimensional de notas
				String [][]notas=new String [asignaturas.length][nombres.length];
				int cont=0;
				while((dato=br.readLine())!=null) {
					notas[cont]=dato.split(";");
					cont++;
				}
				
				System.out.println("¿Que quieres hacer con las notas?");
				
				Scanner leer=new Scanner(System.in);
				boolean seguir=true;
				do {
				
				System.out.println("1-.Ver notas");
				System.out.println("2-.Alumno con media mas alta");
				System.out.println("3-.Modificar nota");
				System.out.println("4-.Salir");
				
				
				int num=leer.nextInt();
				
				switch (num) {
				case 1:
					verNotas(nombres,asignaturas,notas);
					seguir=false;
					break;
				case 2:
					mediaAlta(nombres,asignaturas,notas);
					seguir=false;
					break;
				case 3:
					modificarNota(nombres,asignaturas,notas);
					seguir=false;
					break;
				case 4:
					
					seguir=false;
					break;
					

				default:
					System.out.println("Introduzca un numero valido");
					break;
				}
				if(seguir==false) {
					System.out.println("¿Quieres salir?");
					System.out.println("1- SI");
					System.out.println("2- NO");
					
					num=leer.nextInt();
					switch (num) {
					case 1:
						
						break;
					case 2:
						seguir=true;
						break;

					default:
						break;
					}
				}
					
				
				}while(seguir);
				System.out.println("Esperamos haberte ayudado");
	}

	private void modificarNota(String[] nombres, String[] asignaturas, String[][] notas) throws IOException {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		
		//Primero sacamos el numero del alumno
		System.out.println("¿A quien le vas a cambiar las notas?");
		System.out.println("1.Pepe");
		System.out.println("2.Ana");
		System.out.println("3.Carlos");
		int alum=leer.nextInt();
		alum--;
		System.out.println("");
		
		//Segundo sacamos el numero de la asignatura
		System.out.println("¿De que asignatura?");
		System.out.println("1.Mates");
		System.out.println("2.Ingles");
		System.out.println("3.Geografia");
		System.out.println("4.Fisica");
		int asig=leer.nextInt();
		asig--;
		System.out.println("");
		
		//Cuando tenemos los dos numero tenemos que ponernos en la posicion correspondiente del array,
		//lo modificaremos y luego lo pasaremos al fichero
		System.out.println("La nota de "+nombres[alum]+" en la asignatura de "+asignaturas[asig]+" es de "+notas[asig][alum]+", que nota le quieres poner");
		
		notas[asig][alum]=leer.next();
		System.out.println("");
		
		//Despues de modificar el array lo pasaremos al fichero todo de nuevo, pero esta vez con la modificacion hecha
		File fichero=new File("notas.txt");
		FileWriter fw=new FileWriter(fichero);
		BufferedWriter bw=new BufferedWriter(fw);
		
		//Sobreescribimos nombres
		for(int x=0;x<nombres.length;x++) {
			bw.write(nombres[x]);
			if(nombres.length-1!=x)
				bw.write(";");
		}
		
		bw.newLine();
		
		//Sobreescribimos asignaturas
		for(int x=0;x<asignaturas.length;x++) {
			bw.write(asignaturas[x]);
			if(asignaturas.length-1!=x)
				bw.write(";");
		}
		
		bw.newLine();
		for(int x=0;x<notas.length;x++) {
			for(int y=0;y<notas[x].length;y++) {
				bw.write(notas[x][y]);
				if(notas[x].length-1!=y)
					bw.write(";");
			}
			if(notas.length-1!=x)
				bw.newLine();
		}
		
		fw.flush();
		bw.close();
		fw.close();
		
	}
		

	private void mediaAlta(String[] nombres, String[] asignaturas, String[][] notas) {
		// TODO Auto-generated method stub
		int[]aux=new int[asignaturas.length];
		
		
		double[]media=new double [nombres.length];
		
		for(int al=0;al<nombres.length;al++) {
			int suma=0;
			
			for(int as=0;as<asignaturas.length;as++) {
				
			aux[as]=Integer.parseInt(notas[as][al]);
			suma+=aux[as];
			}
		 media[al]=(double)suma/asignaturas.length;
		}
	//Sacar la media mas grande
		int posGrande=0;
		for(int x=0;x<media.length;x++) {
			if(media[posGrande]<media[x])
				posGrande=x;
		}
		System.out.println("La media mas alta es de "+nombres[posGrande]+" con una media de "+media[posGrande]);
		
	}
	


	private void verNotas(String[] nombres, String[] asignaturas, String[][] notas) {
		// TODO Auto-generated method stub
		//Bucle de las notas empezando por los nombres

			
			for(int al=0;al<nombres.length;al++) {
				System.out.println("Notas de "+ nombres[al]+":");
				
				for(int as=0;as<asignaturas.length;as++) {
					System.out.println(asignaturas[as]+": "+notas[as][al]);
				}
				System.out.println("");
			}
		
		}
		
	}


