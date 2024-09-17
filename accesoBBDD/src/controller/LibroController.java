		package controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dao.LibroDao;
import excepciones.CamposVaciosException;
import excepciones.IsbnException;
import modelo.Libro;

public class LibroController {
	
		private List<Libro> libros;
		Connection cn;
		public LibroController(Connection cn) {
		// TODO Apéndice de constructor generado automáticamente
		this.cn=cn;
		}
		
		public List<Libro> getLibros(String sql) throws SQLException, IsbnException, CamposVaciosException {
		LibroDao biblioteca=new LibroDao(cn);
		return biblioteca.getConsultaLibros(sql);
		}
		
		//*******************************************************************************************************

		public boolean agregar( String titulo,String autor,String editorial,String isbn) throws IsbnException, CamposVaciosException,
		SQLException{
		boolean agregado=false;
		Libro libro=new Libro(titulo, autor, editorial, isbn);
		LibroDao libroDao=new LibroDao(cn);
		agregado=libroDao.agregarLibroPst(libro);
		//agregado=true;
		return agregado;
		}
		//*******************************************************************************************************

		public int borrar(String sql) throws SQLException {
		int rows=0;
		LibroDao libroDao=new LibroDao(cn);
		rows=libroDao.borrarLibroPst(sql);
		return rows;
		}
		public int prestar(String idlib) throws SQLException, IsbnException, CamposVaciosException,NumberFormatException {
		int row=0;
		LibroDao libroDao=new LibroDao(cn);
		String campo="idlibros";
		int id=Integer.parseInt(idlib);
		String sql="select * from libros where "+campo+" = '"+id+"'";
		List<Libro> libros=libroDao.getConsultaLibros(sql);
		if(libros.size()!=0&& !libros.get(0).isPrestado()) {
		row=libroDao.prestarLibroPst(id);
		}
		return row;
		}
		public int prestarIsbn(String isbn,boolean prestado) throws SQLException, IsbnException,
		CamposVaciosException,NumberFormatException {
		int row=0;
		LibroDao libroDao=new LibroDao(cn);
		String campo="isbn";
		String sql="select * from libros where "+campo+" = '"+isbn+"'";
		List<Libro> libros=libroDao.getConsultaLibros(sql);
		if(libros.size()!=0) {
		row=libroDao.prestarLibroPst(isbn,prestado);
		}
		
		return row;
		}
		}