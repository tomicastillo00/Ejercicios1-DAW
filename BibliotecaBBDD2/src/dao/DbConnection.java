package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	private static String bd = "biblioteca";
	private static String parametros = "?useSSL=false&serverTimezone=UTC";
	private static String user = "root";
	private static String password = "trebujena";
	private static String url = "jdbc:mysql://localhost:3306/" + bd + parametros;
	
	Connection cn=null;
	
	public Connection getCn() {
		return cn;
	}

	public DbConnection() throws SQLException {
		// TODO Auto-generated constructor stub
		cn=DriverManager.getConnection(url, user, password);
		if(cn!=null)
			System.out.println("Se ha conectado con la base de datos");
		
	}
	
	public void cerrarConexion() throws SQLException {
		if(cn!=null) {
			System.err.println("Cerrando base de datos: ["+cn+"] ....");
			cn.close();
			System.out.println("La base de datos ha sido desconectada");
		}
	}

}
