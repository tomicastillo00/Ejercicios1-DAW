package encriptacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Encriptacion {

	public Encriptacion() throws IOException {
				//Encriptacion traspuesta
				//Mensaje a encriptar: Atacaremos al atardecer
				//Array para la encriptacion: [5,2,0,4,1,3]
		
		File fichero=new File("encriptacion.txt");
		if(!fichero.exists())
			fichero.createNewFile();
		
		//Escribimos en el fichero el array que queremos utilizar para la encriptacion
		FileWriter fw=new FileWriter(fichero);
		BufferedWriter bw=new BufferedWriter(fw);
		
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Introduce 5 numeros");
		
		//1
		bw.write(leer.next());bw.write(";");
		//2
		bw.write(leer.next());bw.write(";");
		//3
		bw.write(leer.next());bw.write(";");
		//4
		bw.write(leer.next());bw.write(";");
		//5
		bw.write(leer.next());bw.write(";");
		//6
		bw.write(leer.next());
		
	
	
		//Pasamos los numeros al fichero y cerramos el flujo de datos
		fw.flush();
		bw.close();
		fw.close();
	
		//Leemos el fichero para convertir en array 
		FileReader fr=new FileReader(fichero);
		BufferedReader br=new BufferedReader(fr);
		
		String mensaje="Atacaremos al amanecer";
		String[]arrayFichero=(br.readLine()).split(";");
		int[]array=new int[arrayFichero.length];
		
		//Pasamos el array de cadenas del fichero a un array de enteros gracias a un for
		for(int x=0;x<arrayFichero.length;x++) {
			array[x]=Integer.parseInt(arrayFichero[x]);
		}
		//En este momento tenemos todo preparado para hacer el ejercicio igual que si no hubiera fichero
		
		//Hacemos que los caracteres del mensaje sea multiplo de la longitudd del array
		while(mensaje.length()%array.length!=0) {
			mensaje+="&";
		}
		System.out.println(mensaje);
		
		//Encriptar mensaje
		String subcadena="";
		String mensajeEncriptado="";
		for(int x=0;x<mensaje.length();x+=array.length) {
			subcadena=mensaje.substring(x, x+array.length);
			mensajeEncriptado+=encripta(subcadena,array);
		}
		System.out.println(mensajeEncriptado);
		
		//Desencriptamos el mensaje
		
		String mensajeDesencriptado="";
		for(int x=0;x<mensajeEncriptado.length();x+=array.length) {
			subcadena=mensajeEncriptado.substring(x, x+array.length);
			mensajeDesencriptado+=desencripta(subcadena,array);
		}
		System.out.println(mensajeDesencriptado);
	}

	private String desencripta(String subcadena, int[] array) {
		String mensaje="";
		char[]arrayCarac=new char[subcadena.length()];
		for(int x=0;x<subcadena.length();x++) {
			arrayCarac[x]=subcadena.charAt(array[x]);
		}
		mensaje=String.valueOf(arrayCarac);
		return mensaje;
	}

	private String encripta(String subcadena, int[] array) {
		String mensaje="";
		char[]arrayCarac=new char[array.length];
		for(int x=0;x<array.length;x++) {
			arrayCarac[array[x]]=subcadena.charAt(x);
		}
		mensaje=String.valueOf(arrayCarac);
		return mensaje;
	}

}
