		package vista;
		
		import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import controller.LibroController;
import dao.DbConnection;
import excepciones.CamposVaciosException;
import excepciones.IsbnException;
import modelo.Libro;


		public class Main {
		public static void main(String[] args) {
		try {
		DbConnection db = new DbConnection();
		System.out.println("DB conect...");
		Connection cn = db.getConnection(); // instanciaLibro()

		//hace que el atributo cn de la clase LibroController se declare
		LibroController libroController = new LibroController(cn);
		List<Libro> libros = libroController.getLibros("select * from libros");
		for (Libro l : libros)
		System.out.println(l);
		libroController = null;
		db.disconect();
		db = null;
		
		
		System.out.println("===Agregar Libro=================");
		db = new DbConnection();
		cn = db.getConnection();
		libroController = new LibroController(cn);
		String titulo = "Steve Jobs";
		String autor = "Isaacson,Walter";
		String editorial = "Debate";
		String isbn = "978-84-9992-118-1"; // boolean prestado = false;
		if (libroController.agregar(titulo, autor, editorial, isbn));
		System.err.println("EL LIBRO SE HA AGREGADO CORRECTAMENTE"); // Desconectamos
		libroController = null;
		db.disconect();
		db = null;
		
		
		System.out.println("=============================================================");
		System.err.println("CONSULTA CON PARAMETROS.....");
		db = new DbConnection();
		cn = db.getConnection();
		libroController = new LibroController(cn);
		//String campo = "autor", cadenaBusqueda = "Pe";
		//String sql2 = "select * from libros where " + campo + " like '" + cadenaBusqueda + "%'";
		String campo = "isbn";
		String cadenaBusqueda = "978-84-8130-252-3";
		String sql2 = "select * from libros where " + campo + " = '" + cadenaBusqueda + "'";
		libros = libroController.getLibros(sql2);
		System.out.println(libros.size());
		for (Libro l : libros)
		System.out.println(l);
		libroController = null;
		db.disconect();
		db = null;
		
		
		System.out.println("=============================================================");
		System.err.println("BORRAR UN REGISTRO.....");
		db = new DbConnection();
		cn = db.getConnection();
		libroController = new LibroController(cn);
		campo = "isbn";
		cadenaBusqueda = "978-84-9992-118-1";
		String sql3 = "delete from libros where " + campo + " = '" + cadenaBusqueda + "'"; //
		campo = "titulo";
		cadenaBusqueda = "Aquitania";
		// sql="delete from libros where "+campo+" = '"+cadenaBusqueda+"'";
		int rows = libroController.borrar(sql3);
		if (rows > 0)
		System.err.println("Se han borrado " + rows + " registros");
		else
		System.err.println("NO Se ha borrado NINGUN REGISTRO");
		libroController = null;
		db.disconect();
		
		db = null;
		
		
		System.out.println("=============================================================");
		System.err.println("EDITAR UN REGISTRO.....");
		// sql="Update libros Set prestado=? ,fechaPrestamo=?,fechaDevolucion=? Where
		// idlibros=?";
		db = new DbConnection();
		cn = db.getConnection();
		libroController = new LibroController(cn);
		String id = "2";
		int r = libroController.prestar(id);
		System.out.println("Se ha prestado " + r + " libros");
		libroController = null;
		db.disconect(); db = null;
		} catch (SQLException | IsbnException | CamposVaciosException e) {
		System.err.println(e.getMessage());
		}
		}
		
		
		private static void instanciaLibro() {
		String titulo = "Las Llanuras del Transito";
		String autor = "Auel,Jean M.";
		String editorial = "Maeva";
		String isbn = "978-84-95354-15-0";
		boolean prestado = true;
		LocalDate fechaPrestamo = LocalDate.parse("2017-03-30");
		LocalDate fechaDevolucion = LocalDate.parse("2017-03-19");
		LocalDateTime fechaAlta = LocalDateTime.now();
		try {
		Libro l = new Libro(0, titulo, autor, editorial, isbn, prestado, fechaPrestamo, fechaDevolucion, fechaAlta);
		System.out.println(l);
		System.out.println("===================================================");
		} catch (IsbnException | CamposVaciosException e) { // TODO Auto-generated
		System.out.println(e.getMessage());
		}
		}
}