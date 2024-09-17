package dao;

import java.sql.Connection;
import java.sql.Date;
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
		private Connection cn;// importamos la libreria de java.sql
		public LibroDao(Connection cn) {
		// TODO Apéndice de constructor generado automáticamente
		this.cn=cn;
		}
		
		public List<Libro> getConsultaLibros(String sql) throws SQLException, IsbnException, CamposVaciosException{
		List<Libro> libros=new ArrayList<Libro>();
		//sql="select * from libros where autor= ? ";
		PreparedStatement pst=cn.prepareStatement(sql);
		//pst.setString(1, "Perez Reverte;Arturo");
		//pst.setString(1, "Auel,Jean M.");
		ResultSet rs=pst.executeQuery();
		Libro libro;
		while (rs.next()) {
		int id=rs.getInt("idlibros");
		String titulo = rs.getString("titulo");
		String autor = rs.getString("autor");
		String editorial = rs.getString("editorial");
		String isbn = rs.getString("isbn");
		boolean prestado = rs.getBoolean("prestado");
		LocalDateTime fechaAlta=rs.getTimestamp("fechaAlta").toLocalDateTime();
		LocalDate fechaDevolucion=null;
		LocalDate fechaPrestamo=null;
		if(rs.getDate("fechaDevolucion")!=null)
		fechaDevolucion = rs.getDate("fechaDevolucion").toLocalDate();
		if(rs.getDate("fechaPrestamo")!=null)
		fechaPrestamo=rs.getDate("fechaPrestamo").toLocalDate();
		libro = new Libro(id,titulo, autor, editorial, isbn, prestado, fechaPrestamo, fechaDevolucion,fechaAlta);
		libros.add(libro);
		libro = null;
		}
		return libros;
		}
		
		public boolean agregarLibroPst(Libro libro) throws SQLException{
		boolean agregado=false;
		String titulo = libro.getTitulo();
		String autor = libro.getAutor();
		String editorial = libro.getEditorial();
		String isbn = libro.getIsbn();
		boolean prestado =libro.isPrestado();
		LocalDateTime fechaAlta=libro.getFechaAlta();
		//idlibro,titulo,autor,editorial,prestado,fechaPrestamo,fechaDevolucion,isbn
		String sql = "insert into libros values (?,?,?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement = cn.prepareStatement(sql);
		// java.util.Date date=new java.util.Date();
		// Timestamp time=new Timestamp(date.getTime());
		preparedStatement.setInt(1, 0);
		preparedStatement.setString(2,titulo);
		preparedStatement.setString(3,autor);
		preparedStatement.setString(4,editorial);
		preparedStatement.setBoolean(5,prestado);
		preparedStatement.setDate(6, null);
		preparedStatement.setDate(7, null);
		preparedStatement.setString(8,isbn);
		Timestamp ts = Timestamp.valueOf(fechaAlta);
		preparedStatement.setTimestamp(9,ts );
		
		preparedStatement.executeUpdate();
		preparedStatement=null;
		agregado=true;
		return agregado;
		}
		public int borrarLibroPst(String sql) throws SQLException {
		int rows;
		PreparedStatement preparedStatement = cn.prepareStatement(sql);
		rows = preparedStatement.executeUpdate();
		return rows;
		}
		
		public int prestarLibroPst(int id) throws SQLException{
		int rows=0; //filas afectadas
		String sql="Update libros Set prestado=? ,fechaPrestamo=?,fechaDevolucion=? Where idlibros=?";
		PreparedStatement preparedStatement = cn.prepareStatement(sql);
		//***Obtenemos la fecha del sistema y calculamos la de devolucion
		/*java.util.Date fecha= new java.util.Date(); //fecha del sistema
		Calendar cale =new GregorianCalendar();
		cale.setTime(fecha);//defiimos el objeto calendar a partir de un DAte
		cale.add(Calendar.DAY_OF_MONTH,5);//Agregamos 5 dias
		java.util.Date fechaDev=cale.getTime();//construimos un date a partir de un calendar
		java.sql.Date fechaPrestamo=new java.sql.Date(fecha.getTime());
		java.sql.Date fechaDevolucion=new java.sql.Date(fechaDev.getTime());*/
		LocalDate fechaPrest=LocalDate.now();
		LocalDate fechaDevol=fechaPrest.plusDays(10);
		java.sql.Date fechaPrestamo=Date.valueOf(fechaPrest);
		java.sql.Date fechaDevolucion=Date.valueOf(fechaDevol);
		preparedStatement.setBoolean(1,true);
		preparedStatement.setDate(2,fechaPrestamo);
		preparedStatement.setDate(3,fechaDevolucion);
		preparedStatement.setInt(4, id);
		rows=preparedStatement.executeUpdate();
		return rows;
		}
		
		public int prestarLibroPst(String isbn,boolean prestado ) throws SQLException{
		int rows=0; //filas afectadas
		String sql="Update libros Set prestado=? ,fechaPrestamo=?,fechaDevolucion=? Where isbn=?";
		PreparedStatement preparedStatement = cn.prepareStatement(sql);
		if(prestado) {
		LocalDate fechaPrest=LocalDate.now();
		LocalDate fechaDevol=fechaPrest.plusDays(10);
		java.sql.Date fechaPrestamo=Date.valueOf(fechaPrest);
		java.sql.Date fechaDevolucion=Date.valueOf(fechaDevol);
		preparedStatement.setBoolean(1,true);
		preparedStatement.setDate(2,fechaPrestamo);
		preparedStatement.setDate(3,fechaDevolucion);
		preparedStatement.setString(4,isbn);
		rows=preparedStatement.executeUpdate();
		}
		else {
		preparedStatement.setBoolean(1,false);
		preparedStatement.setDate(2,null);
		preparedStatement.setDate(3,null);
		preparedStatement.setString(4,isbn);
		rows=preparedStatement.executeUpdate();
		}
		return rows;
		}
		//end class
		}
