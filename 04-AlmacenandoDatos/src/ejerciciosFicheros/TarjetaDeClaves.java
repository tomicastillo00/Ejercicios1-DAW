package ejerciciosFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TarjetaDeClaves {

	public TarjetaDeClaves() throws IOException {
		Scanner leer=new Scanner(System.in);
		
		// CREAMOS FICHERO SI NO EXISTE
		File tarjeta;
		tarjeta=new File("tarjeta.txt");
		if(!tarjeta.exists())
			tarjeta.createNewFile();
		
		//Esta clase lee un fichero
				FileReader fr=new FileReader(tarjeta);
				//Esta clase captura los datos leidos en el fichero de la clase anterior
				BufferedReader br=new BufferedReader(fr);
				
				System.out.println("Introduzca usuario y contraseña");
				
				String uscon=leer.next(); //leo usuario y contraseña
				boolean incorrecto=true;
				boolean error=false;
				String dato="";
				
				do {
					dato=br.readLine();
					if(dato==null) {//si la siguiente linea no tiene nada sale del bucle
						incorrecto=false;
						error=true;
					}
					else if(dato.equals(uscon))//si la linea del fichero es igual a la introducida por teclado, sale del bucle
					incorrecto=false;
				}while(incorrecto);
				
				if (error)
					System.out.println("Muy mal");
				else {
					dato=br.readLine();
					String [] array=dato.split(",");
				
					int num=(int) (Math.random()*(25-1+1));
					
					System.out.println("Introduce el codigo del segmento "+num);
					num--;
					String clave=leer.next();
					if (clave.equals(array[num]))
						System.out.println("Clave correcta");
					else
						System.out.println("Clave INCORRECTA");
					
					
					
					
					
					
					
					
					
					
				}
				
				
	}

}
