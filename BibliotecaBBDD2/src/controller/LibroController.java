package controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

import dao.LibroDao;
import excepciones.CamposVaciosException;
import excepciones.IsbnException;
import modelo.Libro;

public class LibroController {

	Connection cn=null;
	
	public LibroController(Connection cn) {
		// TODO Auto-generated constructor stub
		this.cn=cn;
	}

	public List<Libro> consultaTabla(String sql) throws SQLException, IsbnException, CamposVaciosException{
		List<Libro>list=new ArrayList<Libro>();
		
		LibroDao libDao=new LibroDao(cn);
		list=libDao.listaLib(sql);
		
		return list;
	}
	
}
