package vista;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import controller.LibroController;
import dao.DbConnection;
import excepciones.CamposVaciosException;
import excepciones.IsbnException;
import modelo.Libro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciar un Libro 
		String isbn="8-41234-5678-905";
		String titulo="Tom sayer";
		String autor="Pepe linare";
		String editorial="Juani";



					try {
						Libro libr=new Libro(titulo, autor, editorial, isbn);
						//comprobar conexion
						DbConnection db=new DbConnection();
						Connection cn=db.getCn();
						db.cerrarConexion();
						
						//Consulta tabla
						System.out.println("=========CONSULTA TABLA=========");
						db=new DbConnection();
						cn=db.getCn();
						
						//Instanciamos el controlador y le mandamos al metodo de consulta la sentencia sql
						LibroController libControl=new LibroController(cn);
						String sql="select * from libros";
						List<Libro>listaLibros=libControl.consultaTabla(sql);
						
						//Recorremos la lista que acabamos de sacar
						for(Libro lib:listaLibros)
							System.out.println(lib);
						
						
						
						
					} catch (IsbnException | CamposVaciosException | SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		

	}

}
