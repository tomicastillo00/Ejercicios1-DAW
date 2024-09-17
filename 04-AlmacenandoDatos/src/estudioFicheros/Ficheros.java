package estudioFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ficheros {

	public Ficheros() throws IOException {
		
		File fichero;
		fichero=new File("prueba.txt");
		//Si el fichero no existe, se crea uno
		if(!fichero.exists())
			fichero.createNewFile();
		
		//Esta clase lee un fichero
		FileReader fr=new FileReader(fichero);
		//Esta clase captura los datos leidos en el fichero de la clase anterior
		BufferedReader br=new BufferedReader(fr);
		
		String dato;
		//Este metodo lee el fichero linea por linea 
		dato=br.readLine();
		int cant=Integer.parseInt(dato);
		int tam=0;
		
		//El while lo utilizamos para poder leer el fichero hasta que una de las lineas sea nula
		while((dato=br.readLine())!=null) {
			System.out.println(dato);
			tam=Integer.parseInt(dato);
			int [][]matriz=new int[tam][];
			for(int x=0;x<tam;x++) {
				matriz[x]=devuelveArrayInt(br.readLine());
			}
		}
		
	}

	private int[] devuelveArrayInt(String readLine) {
		
		String[]cadena=readLine.split(" ");
		int []m=new int[cadena.length];
		for(int x=0;x<cadena.length;x++)
			m[x]=Integer.parseInt(cadena[x]);
		
		return m;
	}

}
