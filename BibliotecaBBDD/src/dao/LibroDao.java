package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import excepciones.CamposVaciosException;
import excepciones.IsbnException;
import modelo.Libro;

public class LibroDao {
	private Connection cn;
	
	public LibroDao(Connection cn) {
		// TODO Auto-generated constructor stub
		this.cn=cn;
	}
	public List<Libro> getConsultaLibros(String sql) throws SQLException, IsbnException, CamposVaciosException{
		List<Libro>listaLibros=new ArrayList<Libro>();
		PreparedStatement pst=cn.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		Libro lib;
		while(rs.next()) {
			int id=rs.getInt("idlibros");
			String titulo=rs.getString("titulo");
			String autor=rs.getString("autor");
			String editorial=rs.getString("editorial");
			boolean prestado=rs.getBoolean("prestado");
			LocalDate fechaPrestamo=null;
			LocalDate fechaDevolucion=null;
			String isbn=rs.getString("isbn");
			LocalDateTime fechaAlta=rs.getTimestamp("fechaAlta").toLocalDateTime();
			if(rs.getDate("fechaPrestamo")!=null)
				fechaPrestamo=rs.getDate("fechaPrestamo").toLocalDate();
			if(rs.getDate("fechaDevolucion")!=null)
				fechaDevolucion=rs.getDate("fechaDevolucion").toLocalDate();
			lib=new Libro(id, titulo, autor, editorial, isbn, prestado, fechaPrestamo, fechaDevolucion, fechaAlta);
			listaLibros.add(lib);
			lib=null;
		}
		
		return listaLibros;
	}
	
	public boolean agregarLibroPst(Libro lib) throws SQLException {
		boolean agregado=false;
		String isbn=lib.getIsbn();
		String titulo=lib.getTitulo();
		String editorial=lib.getEditorial();
		String autor=lib.getAutor();
		LocalDateTime fechaAlta=lib.getFechaAlta();
		String sql="insert into libros values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement pst=cn.prepareStatement(sql);
		pst.setInt(1, 0);
		pst.setString(2, titulo);
		pst.setString(3,autor);
		pst.setString(4,editorial);
		pst.setBoolean(5, false);
		pst.setDate(6,null);
		pst.setDate(7, null);
		pst.setString(8, isbn);
		Timestamp ts=Timestamp.valueOf(fechaAlta);
		pst.setTimestamp(9, ts);
		pst.executeUpdate();
		pst=null;
		agregado=true;	
		
		return agregado;
	}

	public int borrarPst(String sql) throws SQLException {
		int rows=0;
		PreparedStatement pst=cn.prepareStatement(sql);
		rows=pst.executeUpdate();
		
		return rows;
	}
	
}
