package vista;

import java.io.IOException;

import ejerciciosExcepciones.CuentaCorriente;
import ejerciciosFicheros.TarjetaDeClaves;
import estudioExcepciones.Excepciones;
import estudioExcepciones.Excepciones2;
import estudioFicheros.Ficheros;
import estudioFicheros.Ficheros2;
import flujoDatos.FlujoDatos;
import flujoDatos.Leer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CuentaCorriente corr=new CuentaCorriente();
		
		//Excepciones exc=new Excepciones();
		/*try {
		Excepciones2 exc2=new Excepciones2();
		}catch (ArithmeticException e) {
			System.err.println("Procesamos error div por cero en la vista");
		}*/
		//FlujoDatos flujo=new FlujoDatos();
		
		
		/*
		System.out.println("Introduzca un dato");
		String datos="";
		//Utilizamos la clase creada que se llama "Leer" para leer el dato, y gestionamo la excepcion aqui en el main
		try {
			datos=Leer.dato();
			
			System.out.println("Dato = "+datos);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Lo  mismo que antes pero con variable tipo entera
		System.out.println("Introduzca un numero entero");
		try {
			int num=Leer.datoInt();
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
		System.err.println("Introduzca el dato correctamente");
		}
		*/
		
		
		
		/*try {
			Ficheros ficheros=new Ficheros();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		/*try {
			TarjetaDeClaves clave=new TarjetaDeClaves();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}*/
		try {
			Ficheros2 ficheros2=new Ficheros2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}

}
