package cuadradoMagico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CuadradoMagico {

	public CuadradoMagico() throws IOException {
		// TODO Auto-generated constructor stub
		File fichero = new File("matrices.txt");
		if(!fichero.exists()) {
			fichero.createNewFile();
		}
		
		FileReader fr = new FileReader(fichero);
		BufferedReader br = new BufferedReader(fr);
	
		//Definimos cuantas matrices tiene el fichero(Primera fila del fichero)
		int numCuadrados = Integer.parseInt(br.readLine());
		System.out.println("Hay "+numCuadrados+" cuadrados en el fichero");
		
		for(int x=1;x<=numCuadrados;x++) {
			
			// Pasamos el array del fichero al programa
			
			System.out.println("CUADRADO Nº"+x);
			int longitud = Integer.parseInt(br.readLine());
			int[][]cuadrado=new int[longitud][longitud];
			
			for(int i=0;i<longitud;i++) {
				String linea=br.readLine();
				String[]fila=linea.split(" ");
				
				for(int z=0;z<fila.length;z++) {
					cuadrado[i][z]=Integer.parseInt(fila[z]);
				}
			System.out.println(Arrays.toString(cuadrado[i]));
			}
		
			// Comprobamos si este es mágico
			boolean esMagico= compruebaMagico(cuadrado);
			if(esMagico) {
				System.out.println("El cuadrado Nº"+x+" es Mágico");
			}else {
				System.out.println("El cuadrado Nº"+x+" NO ES Mágico");
			}
			
		System.out.println();
		}
		
		
		
	}

	public boolean compruebaMagico(int[][] cuadrado) {
		int suma=0;
		
		// Usamos la suma de la primera fila para compararlo con todo lo demas
		for(int x=0;x<cuadrado.length;x++) {
			suma+=cuadrado[0][x];
		}
		
		// Comparamos con todas las filas
		for(int x=0;x<cuadrado.length;x++) {
			int fila=0;
			for(int i=0;i<cuadrado.length;i++) {
				fila+=cuadrado[x][i];
			}
			if(fila!=suma) {
				return false;
			}
		}
		
		// Comparamos con todas las columnas
		for(int x=0;x<cuadrado.length;x++) {
			int columna=0;
			for(int i=0;i<cuadrado.length;i++) {
				columna+=cuadrado[i][x];
			}
			if(columna!=suma) {
				return false;
			}
		}
		// Comparamos con la diagonal principal
		int diagonal=0;
		for(int x=0;x<cuadrado.length;x++) {
			for(int i=0;i<cuadrado.length;i++) {	
				if(i==x) {
					diagonal+=cuadrado[x][i];	
				}
			}
		}
		if(diagonal!=suma) {
			return false;
		}
		// Comparamos con la diagonal secundaria
		int diagonalSec=0;
		for(int x=0;x<cuadrado.length;x++) {
			for(int i=0;i<cuadrado.length;i++) {	
				if((i+x)==(cuadrado.length-1)) {
					diagonalSec+=cuadrado[x][i];	
				}
			}
		}
		if(diagonalSec!=suma) {
			return false;
		}
		
		return true;
		
		
	}

}
