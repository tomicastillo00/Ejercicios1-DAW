package vista;

import java.io.IOException;
import java.time.format.DateTimeParseException;
import java.util.List;

import controlador.BibliotecaController;
import excepciones.CamposVaciosException;
import excepciones.ISBNException;
import modelo.Libro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Instanciamos libro
			Libro libr=new Libro("8412345678905", "Cositas", "Tomas", "Edelvives", "2005-12-05", "20.12", "true");
			//Instanciamos controlador
			BibliotecaController gestionLibros=new BibliotecaController();
			//Sacamos el atributo del controlador, es decir, la lista
			List <Libro> biblio= gestionLibros.getBiblioteca();
	
			//La recorremos al completo y la mostramos por pantalla
			for(Libro lib:biblio )
				System.out.println(lib);
			
		} catch (CamposVaciosException | ISBNException | DateTimeParseException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
