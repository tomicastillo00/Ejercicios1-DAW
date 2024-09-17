package encriptacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Encriptacion2 {

	public Encriptacion2() throws IOException {
		// TODO Auto-generated constructor stub
		File fichero=new File("encriptacion.txt");
		if(!fichero.exists())
			fichero.createNewFile();
		
		//Leemos el fichero para convertir en array 
				FileReader fr=new FileReader(fichero);
				BufferedReader br=new BufferedReader(fr);
				
				String mensaje="Atacaremos al amanecer";
				String[]array=(br.readLine().split(";"));
				int []arrayNum=new int [array.length];
				
				//Pasamos el array de cadenas a entero
				for(int x=0;x<array.length;x++) {
					arrayNum[x]=Integer.parseInt(array[x]);
				}
				
				while(mensaje.length()%arrayNum.length!=0) {
					mensaje+="&";
				}
				
				String mensajeEncriptado="";
				
				System.out.println("Mensaje sin encriptar= "+mensaje);
				String subcadena="";
				
				//Realizamos la encriptacion
				for(int x=0;x<mensaje.length();x+=arrayNum.length) {
					subcadena=mensaje.substring(x, x+arrayNum.length);
					mensajeEncriptado+=encripta(subcadena,arrayNum);
				}
				
				System.out.println("Mensaje encriptado= "+mensajeEncriptado);
				
	}

	private String encripta(String subcadena, int[] array) {
		// TODO Auto-generated method stub
		char[]caracteres=new char[array.length];
		for(int x=0;x<array.length;x++) {
			caracteres[x]=subcadena.charAt(array[x]);
		}
		String mensaje=String.valueOf(caracteres);
		return mensaje;
	}

}
