package vista;

import java.io.IOException;
import java.time.format.DateTimeParseException;
import java.util.List;

import controlador.BibliotecaController;
import excepciones.CamposVaciosException;
import excepciones.IsbnException;
import modelo.Libro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Libro libro=new Libro("8412345678905", "Cositas", "Tomas", "Edelvives", "2005-12-05", "20.12", "true");
			BibliotecaController gestionLibros=new BibliotecaController();
			
			mostrar(gestionLibros.getBiblioteca());
			System.out.println("Buscar libro por isbn");
			Libro l=gestionLibros.buscarLibro("978-84-666-7121-7");
			System.out.println(l);
			
			System.out.println("Agregar libro");
			
		} catch (IOException | CamposVaciosException | DateTimeParseException | IsbnException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void mostrar(List<Libro> biblioteca) {
		// TODO Auto-generated method stub
		
		for(Libro l:biblioteca)
			System.out.println(l);
	}

}
