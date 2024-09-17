package flujoDatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlujoDatos {

	public FlujoDatos() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Estudio flujo de datos.......");
		String dato="";
		
		//Es clase nos permite capturar datos desde un origen
		InputStreamReader isr=new InputStreamReader(System.in);
		//Esta clase es el filtro que nos permite capturar los datos de un flujo, en este caso de la clase InputStreamReader
		BufferedReader br=new BufferedReader(isr);
		
		System.out.println("Introduzca un dato");
		
		int num;
		
		try {
			//El readLine lee la informacion por teclado para pasarla al objeto br
			dato=br.readLine();
			num=Integer.parseInt(dato);
		} catch (IOException | NumberFormatException e) {
			// Solo se creara un objeto de excepion, es decir, de la excepcion que ocurra primero
			System.out.println(e.getMessage());
		}
		System.out.println("Dato = "+dato);
		
	}

}
