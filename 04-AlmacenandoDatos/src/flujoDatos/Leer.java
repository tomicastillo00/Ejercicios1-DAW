package flujoDatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leer {

	//PARA LEER UNA VARIABLE TIPO CADENA
	public static String dato() throws IOException {
		String dato="";
		
		//Es clase nos permite capturar datos desde un origen
				InputStreamReader isr=new InputStreamReader(System.in);
				//Esta clase es el filtro que nos permite capturar los datos de un flujo, en este caso de la clase InputStreamReader
				BufferedReader br=new BufferedReader(isr);
				dato=br.readLine();
		
		return dato;
	}
	
	//PARA LEER UNA VARIABLE TIPO ENTERA
	public static int datoInt() throws IOException, NumberFormatException {
		//Utilizamos el metodo anterior
		int num=0;
		//String datoCadena=dato();
		//num=Integer.parseInt(datoCadena);
		num=Integer.parseInt(dato());
		return num;
	}

	//PARA LEER UNA VARIABLE TIPO DOUBLE
	public static double datoDouble() throws NumberFormatException, IOException {
		double num=0;
		num=Double.parseDouble(dato());
		return num;
	}
}
