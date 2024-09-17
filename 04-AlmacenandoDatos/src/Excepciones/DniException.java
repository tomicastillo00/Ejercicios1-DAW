package Excepciones;
//Se utiliza la palabra reservada "extends" para que DniExpection herede ser una excepcion
public class DniException extends Exception{

	public DniException() {
		// La palabra "super" se utiliza para que nos lance el mensaje cuando genere excepcion
		super("DNI erroneo");
		
	}

}
