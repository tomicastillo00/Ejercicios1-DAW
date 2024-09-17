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

import com.mysql.cj.xdevapi.Result;

import excepciones.CamposVaciosException;
import excepciones.IsbnException;
import modelo.Libro;

public class LibroDao {
	Connection cn=null;
	
	public LibroDao(Connection cn) {
		// TODO Auto-generated constructor stub
		this.cn = cn;
	}
	
	public Connection getCn() {
		return cn;
	}
	
	public List<Libro>listaLib(String sql) throws SQLException, IsbnException, CamposVaciosException{
		
		List<Libro>lis=new ArrayList<Libro>();
		PreparedStatement pst=cn.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		Libro lib;
		//Recorremos cada fila
		while(rs.next()) {
			int id=rs.getInt("idLibros");
			String titulo=rs.getString("titulo");
			String autor=rs.getString("autor");
			String editorial=rs.getString("editorial");
			boolean prestado=rs.getBoolean("prestado");
			LocalDate fechaPrestamo=null;
			LocalDate fechaDev=null;
			String isbn=rs.getString("isbn");
			LocalDateTime fechaAlta=rs.getTimestamp("fechaAlta").toLocalDateTime();
			if(rs.getDate("fechaPrestamo")!=null)
				fechaPrestamo=rs.getDate("fechaPrestamo").toLocalDate();
			if(rs.getDate("fechaDevolucion")!=null)
				fechaDev=rs.getDate("fechaDevolucion").toLocalDate();
			
			//Cuando tenemos todos los datos, instanciamos libro
			lib=new Libro(id, titulo, autor, editorial, isbn, prestado, fechaPrestamo, fechaDev, fechaAlta);
			lis.add(lib);
			lib=null;
				
		}
		return lis;
	}
	
	public void agregarLibroPst(String titulo, String autor, String editorial, String isbn) throws SQLException{
		PreparedStatement pst=cn.prepareStatement("Insert into libros values()");
		
		
	}

	

	

}
