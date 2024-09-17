package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

import excepciones.CamposVaciosException;
import excepciones.ISBNException;
import modelo.Libro;

public class BibliotecaController {

	private List<Libro> biblioteca=new ArrayList<Libro>();
	
	public BibliotecaController() throws IOException, DateTimeParseException, CamposVaciosException, ISBNException {
		// TODO Auto-generated constructor stub
		File fichero=new File("biblioteca.txt");
		if(!fichero.exists())
			fichero.createNewFile();
		
		FileReader fr=new FileReader(fichero);
		BufferedReader br=new BufferedReader(fr);
		
		String linea="";
		Libro libr=null;
		//leemos los datos
		while((linea=br.readLine())!=null) {
			String[]dato=linea.split(";");
			String isbn=dato[0];
			String nombre=dato[1];
			String apellido=dato[2];
			String editorial=dato[3];
			String fecha=dato[4];
			String precio=dato[5];
			String prestado=dato[6];
			//Instanciamos el libro
			libr=new Libro(isbn, apellido, editorial, editorial, fecha, precio, prestado);
			//Añadimos libro a la biblioteca
			biblioteca.add(libr);
			//Ponemos el libro en nulo
			libr=null;
		}
		
	
		
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
			if(isbn.equals(biblioteca.get(x).getIsbn())) 
				l=biblioteca.get(x);
		}
		return l;
	}
	

}
