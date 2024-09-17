package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

import excepciones.CamposVaciosException;
import excepciones.IsbnException;
import modelo.Libro;

public class BibliotecaController {

	private List <Libro> biblioteca=new ArrayList<Libro>();
	
	public BibliotecaController() throws IOException, DateTimeParseException, CamposVaciosException, IsbnException {
		// TODO Auto-generated constructor stub
		
		File fichero=new File("biblioteca.txt");
		if(!fichero.exists())
			fichero.createNewFile();
		
		FileReader fr=new FileReader(fichero);
		BufferedReader br=new BufferedReader(fr);
		
		String dato="";
		Libro lib=null;
		while((dato=br.readLine())!=null) {
			String []datos=dato.split(",");
			String isbn=datos[0];
			String titulo=datos[1];
			String autor=datos[2];
			String editorial=datos[3];
			String fechaDevolucion=datos[4];
			String precio=datos[5];
			String prestado=datos[6];
			
			//introducimos datos en el objeto libro
			lib=new Libro(isbn,titulo,autor,editorial,fechaDevolucion,precio,prestado);
			biblioteca.add(lib);
			lib=null;
			
		}
		br.close();
		fr.close();
		
	}

	@Override
	public String toString() {
		return "BibliotecaController [biblioteca=" + biblioteca + "]";
	}

	public List<Libro> getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(List<Libro> biblioteca) {
		this.biblioteca = biblioteca;
	}
	
	public Libro buscarLibro(String isbn) {
		Libro l=null;
		for(int x=0;x<biblioteca.size();x++) {
			if(isbn.equals(biblioteca.get(x).getIsbn())) {
				l=biblioteca.get(x);
			}	
		}
		return l;
	}
	
	public boolean agregarLibro(String isbn, String titulo, String autor, String editorial, String fechaDevolucion, String precio,
			String prestado) throws DateTimeParseException, CamposVaciosException, IsbnException {
			Boolean agregado=false;
			Libro l=new Libro(isbn,titulo,autor,editorial,fechaDevolucion,precio,prestado);
			if(biblioteca.contains(l)) {
				biblioteca.add(l);
		agregado=true;
			}
				return agregado;
		
	}
	
	

}
