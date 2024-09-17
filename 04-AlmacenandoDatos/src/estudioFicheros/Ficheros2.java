package estudioFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ficheros2 {

	public Ficheros2() throws IOException {
		// TODO Auto-generated constructor stub
		File fichero;
		fichero=new File("Fichero2.txt");
		//se crea el fichero si no existe
		if (!fichero.exists())
			fichero.createNewFile();
		
		//Se utiliza esta clase para poder enviar el fichero al flujo y poder gestionarlo
		FileWriter fw=new FileWriter(fichero);
		//Se utiliza esta clase para poder escribir en el fichero
		BufferedWriter bw=new BufferedWriter(fw);
		String linea="";
		String nombre="Pepito";
		String apellidos="Garcia Perez";
		int edad=24;
		
		//Utilizamos estas expresiones para escribirlo todo en la misma linea, utilizando bw.write 
		bw.write(nombre);bw.write(";");bw.write(apellidos);bw.write(";");bw.write(String.valueOf(edad));
		//Para pasar a la siguiente linea se utiliza el bw.newLine()
		bw.newLine();
		//Para que la informacion se escriba en el fichero debemos acabar con esto
		fw.flush();
		bw.close();
		fw.close();
		
		String [] alumnos= {"Pepe","Ana","Carlos"};
		String [] asignaturas= {"Mates","Ingles","Geografia","Fisica"};
		int[][]notas= {{5,6,7},{8,5,6},{6,7,9},{7,5,9}};
		salvarDatos(alumnos,asignaturas,notas);
		alumnos=null;asignaturas=null;notas=null;
		
	}

	private void salvarDatos(String[] alumnos, String[] asignaturas, int[][] notas) throws IOException {
		// Guardar los datos de las variables en un fichero nuevo de con un ";" de separador.
		File fichero2;
		fichero2=new File("notas.txt");
		//se crea el fichero si no existe
		if (!fichero2.exists())
			fichero2.createNewFile();
		FileReader fr=new FileReader(fichero2);
		BufferedReader br=new BufferedReader(fr);
		String dato="";
		
			dato=br.readLine();
			
			String[]nombre1=dato.split(";");
			
			dato=br.readLine();
			
			String[]asig=dato.split(";");
			
			String[][]notas1=new String[asig.length][nombre1.length];
			int cont1=0;
			while((dato=br.readLine())!=null) {
			String[]aux=dato.split(";");
			notas1[cont1]=aux;
			cont1++;
			}
			int cont=0;
			
	/*		for(int x=0;x<notas1.length;x++) {
				for(int y=0;y<notas1[x].length;y++) {
					notas1[x][y]=aux[cont];
					cont++;
				}
			}*/
			System.out.println(nombre1);
			System.out.println(asig);
			System.out.println(notas1);
		
			//ahora debemos sobreescribir el fichero con las variables anteriormente dichas
			
			FileWriter fw=new FileWriter(fichero2);
			BufferedWriter bw=new BufferedWriter(fw);
			
			//en este caso no hay que hacer bucle while de todo, ya sobreescribira hasta que no tengamos mas
			//hacemos un bucle for por cada array
			//Bucle para alumnos
			for(int x=0;x<alumnos.length;x++) {
				bw.write(alumnos[x]);
				if((alumnos.length-1)!=x)
					bw.write(";");
			}
			bw.newLine();
			//Bucle para asignaturas
			for(int x=0;x<asignaturas.length;x++) {
				bw.write(asignaturas[x]);
				if((asignaturas.length-1)!=x)
					bw.write(";");
			}
			bw.newLine();
			//Bucle para notas
			
			for(int x=0;x<notas.length;x++) {
				for(int y=0;y<notas[x].length;y++) {
					bw.write(String.valueOf(notas[x][y]));
					if((notas[x].length-1)!=y) 
						bw.write(";");//duda
				}
				if((notas.length-1)!=x)	
				bw.newLine();
				}
			fw.flush();
			bw.close();
			fw.close();
			
			

	
		
}
}
