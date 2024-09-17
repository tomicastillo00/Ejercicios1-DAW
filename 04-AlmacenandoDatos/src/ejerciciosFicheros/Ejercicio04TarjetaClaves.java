package ejerciciosFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04TarjetaClaves {

	public Ejercicio04TarjetaClaves() throws IOException {
		// TODO Auto-generated constructor stub

		//String usu = "maria";
		//String contr = "4321";

		File fichero;
		fichero = new File("tarjeta.txt");
		if(!fichero.exists()) {
			fichero.createNewFile();
		}
		boolean errorUsuario = false;
		do {
			errorUsuario = false;
			Scanner leer = new Scanner(System.in);
			System.out.println("Introduce usuario");
			String usu = leer.next();
			System.out.println("Introduce contraseña");
			String contr = leer.next();

			FileReader fr = new FileReader(fichero);
			BufferedReader br = new BufferedReader(fr);
			String dato;
			dato = br.readLine();
			int ntarjetas = Integer.parseInt(dato);
			String usuario;
			String contraseña;
			String[]linea;
			//compruebo que lee bien el fichero
			//System.out.println(dato);
			while((dato = br.readLine())!=null) {
				linea = dato.split(",");
				//System.out.println(Arrays.toString(linea));
				usuario = linea[0];
				contraseña = linea[1];

				//System.out.println(usuario + contraseña);
				//LOCALIZAMOS LA TARJETA CLAVE DEL USUSARIO
				if(usuario.equals(usu) && contraseña.equals(contr) ) {
					dato = br.readLine();
					break;
				}else {
					br.readLine();
				}
			}
			//cerramos el fichero
			fr.close();
			br.close();
			//si se ha salido del while porque es correcto, entonces
			if(dato != null) {
				//genero un metodo para rellenar tarjeta
				int[][]tarjetaClaves = devuelveTarjeta(dato);

				//metodo para imprimir la tarjeta
				String []filas = {"A", "B", "C", "D", "E"};
				imprimetarjeta(tarjetaClaves, filas);		

				//genero la clave que quiero que introduzca
				int fila = (int)Math.floor (Math.random()*(4-0+1)+0);
				int columna = (int)Math.floor (Math.random()*(4-0+1)+0);
				System.out.println();
				System.out.println("Introduce la clave correspondiente a " + filas [fila] + (columna+1));

				//compruebo que la clave introducida es correcta.
				comprueboClave(fila,columna, tarjetaClaves);

			}else {
				System.out.println("Datos Incorrectos");
				errorUsuario = true;
			}

		}while(errorUsuario);


	}

	private void comprueboClave(int fila, int columna, int[][] tarjetaClaves) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);

		int contador = 3;
		while(contador >0) {
			int claveIntroducida = leer.nextInt();
			if (claveIntroducida ==  tarjetaClaves[fila][columna]) {
				System.out.println("La clave introducida es CORRECTA");
				break;
			}
			else {
				contador--;
				System.out.println("La clave introducida es INCORRECTA, VUELVA A INTENTARLO");
			}	
			if (contador == 0)
				System.out.println("Tarjeta Bloqueada");
		}

	}

	private void imprimetarjeta(int[][] tarjetaClaves, String[] filas) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("   1    2    3    4    5");
		for (int x = 0; x<tarjetaClaves.length; x++) {
			for (int y=0; y<tarjetaClaves[x].length; y++) {

			}
			System.out.println(filas [x] +  Arrays.toString(tarjetaClaves[x]));
		}

	}

	private int[][] devuelveTarjeta(String dato) {
		// TODO Auto-generated method stub
		int[][]tarjetaClaves = new int[5][5];
		String []linea = dato.split(",");
		int[] claves = new int[linea.length];
		for(int i= 0; i<linea.length; i++) {
			claves[i] =Integer.parseInt(linea[i]) ;
		}
		int cont= 0;
		for (int x = 0; x<tarjetaClaves.length; x++) {
			for (int y =0; y<tarjetaClaves[x].length; y++) {
				tarjetaClaves[x][y]=claves[cont];
				cont++;
			}
		}
		return tarjetaClaves;
	}

}
