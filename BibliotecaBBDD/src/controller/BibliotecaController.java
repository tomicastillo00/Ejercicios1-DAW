package controller;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dao.LibroDao;
import excepciones.CamposVaciosException;
import excepciones.IsbnException;
import modelo.Libro; 
public class BibliotecaController {

	private List<Libro>listaLibros;
	Connection cn;
	
	public BibliotecaController(Connection cn) {
		// TODO Auto-generated constructor stub
		this.cn=cn;
	}
	
	
	public List<Libro> getListaLibros(String sql) throws SQLException, IsbnException, CamposVaciosException {
		LibroDao biblioDao=new LibroDao(cn);
		return biblioDao.getConsultaLibros(sql);
	}

	public boolean agregar(String isbn, String titulo, String autor, String editorial) throws IsbnException, CamposVaciosException, SQLException {
		boolean agregado=false;
		Libro lib=new Libro(titulo, autor, editorial, isbn);
		LibroDao biblioDao=new LibroDao(cn);
		agregado=biblioDao.agregarLibroPst(lib);
		return agregado;
	}
	
	public int borrar(String sql) throws SQLException {
		int rows;
		LibroDao lib=new LibroDao(cn);
		rows=lib.borrarPst(sql);
		return rows;
	}


	

}
