package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

import excepcione.CamposVaciosException;
import excepcione.IsbnException;
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
		String linea="";
		Libro lib=null;
		while((linea=br.readLine())!=null){
			String [] dato=linea.split(";");
			String isbn=dato[0];
			String titulo=dato[1];
			String autor=dato[2];
			String editorial=dato[3];
			String fechaDev=dato[4];
			String precio=dato[5];
			String prestado=dato[6];
			
			//Instanciamos
			lib=new Libro(isbn, titulo, autor, editorial, fechaDev, precio, prestado);
			//Lo metemos en la lista
			biblioteca.add(lib);
			lib=null;	
		
		}
		
		br=null;
		fr=null;
		
		
		
		
	}

	public List<Libro> getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(List<Libro> biblioteca) {
		this.biblioteca = biblioteca;
	}

	
	
	public Libro buscarLibro (String isbn) {
		Libro l=null;
		for(int x=0;x<biblioteca.size();x++) {
		if(isbn.equals(biblioteca.get(x).getIsbn()))
		l=biblioteca.get(x);
		}
		return l;
	}
	
	public boolean agregarLibro(String isbn,String titulo, String autor, String editorial, String precio) throws CamposVaciosException, IsbnException {
		boolean agregado=false;
		Libro l= new Libro(isbn, titulo, autor, editorial, precio);
		
			if(!biblioteca.contains(l)){
				biblioteca.add(l);
				agregado=true;
			}
		return agregado;
	}
	public Libro prestarLibro(String isbn,String fecha) {
		Libro l=buscarLibro(isbn);
		
		if(l !=null && l.isPrestado()==false) {
		 l.setFechaDevolucion(fecha);
		 l.setPrestado("true");
		}
		return l;
	}
	
	public List<Libro>pendientesEntrega(){
		return biblioteca;
		
	}
	
	public boolean salvarDatos() throws IOException {
		boolean salvado=false;
		FileWriter fw=new FileWriter("biblioteca.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		for(int x=0;x<biblioteca.size();x++) {
			bw.write(biblioteca.get(x).toString());
			bw.newLine();
		}
		fw.flush();
		bw.close();
		fw.close();
		salvado=true;
		return salvado;
		
	}
	
	
}
