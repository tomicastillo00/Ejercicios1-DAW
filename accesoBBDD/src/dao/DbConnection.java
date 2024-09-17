 package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	static String bd = "biblioteca";
	static String parametros="?useSSL=false&serverTimezone=UTC";
	//static String parametros = "?useSSL=false";
	static String user = "root";
	static String password = "trebujena";
	static String url = "jdbc:mysql://localhost:3306/" + bd + parametros;
	// Esta variable va a guardar la conexion
	Connection conn=null;
	
	public DbConnection() {
		// TODO Auto-generated constructor stub
		try {
			//obtenemos el driver para mysql
			//Class.forName("com.mysql.jdbc.Driver");
			
			//obtenemos una conexion con los parametros especificados anteriormente
			conn=DriverManager.getConnection(url, user, password);
			
			//si conn es nulo significa que pudimos conectarnos
			if(conn!=null) {
				System.out.println("Connecting database [ "+conn+" ] OK");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.err.println("Excepcion conexion: "+e.getMessage());
		} /*catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Excepcion driver: "+e.getMessage());
		}*/
		
	}

	//Asi podremos obtener la conexion en cualquier parte del programa
	public Connection getConnection() {
		return conn;
	}
	
	//Para finalizar la conexion
	public void disconect() {
		
		if(conn!=null) {
			try {
				System.out.println("Cerrando base de datos: "+conn+" OK");
				conn.close();
				System.out.println("Base de datos desconectada");
			} catch(SQLException e) {
				System.out.println(e);
			}
		}
	}
}
