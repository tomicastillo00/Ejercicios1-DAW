package vista;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;

import controlador.BibliotecaController;
import excepciones.CamposVaciosException;
import excepciones.ISBNException;
import modelo.Libro;

public class Main {

	

		public static void main(String[] args) {
			// TODO Esbozo de método generado automáticamente
			String isbn="978-84-17157-92-0"; String titulo="La trilogia"; String autor="Carmen Mola"; String editorial="Planeta";
			String fechaDevolucion="2022-02-27"; String precio="20.5"; String prestado="false";
			try {
			Libro libro=new Libro(isbn, titulo, autor, editorial, fechaDevolucion, precio, prestado);
			System.out.println(libro);
			System.err.println("=========================================");
			BibliotecaController biblio=new BibliotecaController();
			mostrar(biblio.getBiblioteca());
			System.err.println("===========Agregar Libro==============================");
			biblio.agregarLibro(isbn, titulo, autor, editorial, precio);
			mostrar(biblio.getBiblioteca());
			System.err.println("================Prestar Libro=========================");
			isbn="978-84-17157-92-0";
			//String fecha="2022-03-25";
			LocalDate fechaDevol=LocalDate.now();
			fechaDevol=fechaDevol.plusDays(20);
			String fecha=fechaDevol.toString();
			Libro l=biblio.prestarLibro(isbn, fecha);
			if(l!=null)
			System.out.println(l.getTitulo()+" Fecha Devolucion:"+l.getFechaDevolucion());
			else
			System.err.println("No se ha encontrado el libro");
			mostrar(biblio.getBiblioteca());
			System.err.println("=============Devolver Libro ============================");
			if(biblio.devolverLibro(isbn))
			System.out.println("Libro entregado");
			else
			System.err.println("No se ha encontrado el libro");
			mostrar(biblio.getBiblioteca());
			System.err.println("===========Eliminar un Libro==============================");
			if(biblio.eliminarLibro(isbn))
			System.out.println("Se ha eliminado el libro");
			else
			System.err.println("No se ha podido eliminar el libro");
			mostrar(biblio.getBiblioteca());
			System.err.println("=============Filtrar autor ordenado Titulo============================");
			List<Libro>listaAutor=biblio.filtrarAutor("Arturo Perez Reverte");
			mostrar(listaAutor);
			System.err.println("=============Mostrar Pendientes devolucion ordenado fecha============================");
			List<Libro>listaPendientes=biblio.pendientesEntrega();
			mostrar(listaPendientes);
			//borrar libros prestados
			System.out.println("=========================================");
			int c=biblio.eliminarLibrosPrestados();
			mostrar(biblio.getBiblioteca());
			System.err.println("=============Salvar Datos============================");
			biblio.salvarDatos();
			} catch (DateTimeParseException | NumberFormatException | ISBNException | CamposVaciosException|IOException
			e) {
			// TODO Bloque catch generado automáticamente
			System.out.println(e.getMessage());
			}
			}

			private static void mostrar(List<Libro> biblioteca) {
			// TODO Esbozo de método generado automáticamente
			for(Libro l:biblioteca)
			System.out.println(l);
		
	}

}
