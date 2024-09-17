package vista;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.format.DateTimeParseException;
import java.util.List;

import controller.BibliotecaController;
import dao.DbConnection;
import dao.LibroDao;
import excepciones.CamposVaciosException;
import excepciones.IsbnException;
import modelo.Libro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String isbn="8-41234-5678-905";
		String titulo="Tom sayer";
		String autor="Pepe linare";
		String editorial="Juani";
		String fechaDev="2022-10-27";
		String precio="5.46";
		String prestado="True";
				try {
					Libro libr=new Libro(titulo, autor, editorial, isbn);
					System.out.println("Objeto instanciado");
				
					//instanciamos dbconnecion y conection
				DbConnection db=new DbConnection();
				Connection cn=db.getCn();
				BibliotecaController biblio=new BibliotecaController(cn);
				
				//mandamos sentencia sql
				
				System.out.println("======MOSTRAR LIBROS======");
				
				String sql="select * from libros";
				List<Libro>listaLibros=biblio.getListaLibros(sql);
				
				//despues de haber guardado la lista la recorremos para asegurarnos que se han guardado los datos
				for(Libro lib:listaLibros)
					System.out.println(lib.toString());
				
				//cerramos conexion
				biblio=null;
					db.cerrarConexion();
					db=null;
			
					
					System.err.println("======AGREGAR LIBRO======");
					//instanciamos dbconnecion y connection
					db=new DbConnection();
					cn=db.getCn();
					biblio=new BibliotecaController(cn);
					isbn="978-8409049-325";
					titulo="Tomas sayer";
					autor="Pepito grillo";
					editorial="anaya";
					if(biblio.agregar(isbn, titulo, autor, editorial))
						System.out.println("El libro se ha agregado correctamente");
					else
						System.err.println("El libro no se ha podido agregar");
					biblio=null;
					db.cerrarConexion();
					db=null;
					
					System.out.println("========CONSULTA CON PARAMETROS====");
					db=new DbConnection();
					cn=db.getCn();
					biblio=new BibliotecaController(cn);
					titulo="as Lla";
					String campo="titulo";
					sql="select * from libros where " + campo + " like '%" + titulo + "%'";
					List<Libro> listaConsulta=biblio.getListaLibros(sql);
					for(Libro l:listaConsulta)
						System.out.println(l.toString());
					biblio=null;
							db.cerrarConexion();
							db=null;
							
							System.out.println("===========BORRAR==========");
							db=new DbConnection();
							cn=db.getCn();
							biblio=new BibliotecaController(cn);
							campo="editorial";
							String cadenaBusqueda="anaya";
							String sql1="delete from libros where "+campo+"='"+cadenaBusqueda+"'";
							int rows=biblio.borrar(sql1);
							if(rows>0)
								System.out.println("Se han borrado "+rows+" registros");
							else
								System.out.println("No se han encontrado registros");
							biblio=null;
							db.cerrarConexion();
							db=null;
							
							
					
					
					
					
					
				} catch (SQLException  |  DateTimeParseException | NumberFormatException | IsbnException | CamposVaciosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

}
