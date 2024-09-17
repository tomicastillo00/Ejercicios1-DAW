package vista;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;

import controlador.BibliotecaController;
import excepcione.CamposVaciosException;
import excepcione.IsbnException;
import modelo.Libro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String isbn="978-84-18949-13-5"; String titulo="La trilogia"; String autor="Carmen Mola"; String editorial="Planeta";
		String fechaDevolucion="2022-02-27"; String precio="20.5"; String prestado="false";
		
		try {
			Libro libro=new Libro(isbn, titulo, autor, editorial, fechaDevolucion, precio, prestado);
			
			BibliotecaController gestionLibros=new BibliotecaController();
			mostrar(gestionLibros.getBiblioteca());
			System.err.println("Agregar libro");
			if(gestionLibros.agregarLibro(isbn, titulo, autor, editorial, precio))
				System.out.println("El libro se ha agregado");
			else
				System.out.println("El libro no se ha podido agregar");
			mostrar(gestionLibros.getBiblioteca());
			System.err.println("Prestar libro");
			LocalDate fechaActual=LocalDate.now();
			String fechaDev=fechaActual.plusDays(20).toString();
			Libro l=gestionLibros.prestarLibro(isbn, fechaDev);
			if(l!=null) {
				System.out.println(l.getTitulo()+" con fecha de devolucion el "+l.getFechaDevolucion());
			}
			mostrar(gestionLibros.getBiblioteca());
			gestionLibros.salvarDatos();
		} catch (DateTimeParseException | CamposVaciosException | IsbnException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		

	}

	private static void mostrar(List<Libro> biblioteca) {
		// TODO Auto-generated method stub
		for(Libro l:biblioteca)
			System.out.println(l.toString());
		
	}

}
