package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	private static String bd= "biblioteca";
	private static String parametros="?useSLL=false&serverTimezone=UTC";
	private static String user="root";
	private static String password="trebujena";
	private static String url="jdbc:mysql://localhost:3306/"+bd+parametros;
	Connection cn=null;
	
	public DbConnection() {
		// TODO Auto-generated constructor stub
		
		try {
			cn=DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("La conexion se realizo con exito");
		
	}

	public Connection getCn() {
		return cn;
	}


	public void cerrarConexion() throws SQLException {
		if (cn!=null) {
			System.err.println("Closing database: ["+ cn+"]....");
			cn.close();
			System.err.println("La base de datos ha sido desconectada");
		}
	}
}
