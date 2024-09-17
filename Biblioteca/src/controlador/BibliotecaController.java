package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import excepciones.CamposVaciosException;
import excepciones.ISBNException;
import interfaces.OrdenaFecha;
import modelo.Libro;

public class BibliotecaController {

	private List<Libro> biblioteca=new ArrayList<Libro>();
	
	public BibliotecaController() throws IOException, ISBNException, CamposVaciosException {
		// TODO Auto-generated constructor stub
		File arch=new File("biblioteca.txt");
		
		if(!arch.exists())
			arch.createNewFile();
		
		FileReader fr=new FileReader(arch);
		BufferedReader br=new BufferedReader(fr);
		//Ponemos libro a null
		String linea = "";
		Libro libro = null;
		while ((linea = br.readLine()) != null) {
			//Leemos fichero
			String[]datos=linea.split(";");
			String isbn=datos[0];
			String titulo=datos[1];
			String autor=datos[2];
			String editorial=datos[3];
			String fechaDevolucion=datos[4];
			String precio=datos[5];
			String prestado=datos[6];
			
			//Instanciamos libro con los datos extraidos del fichero
		libro=new Libro(isbn,titulo,autor,editorial,fechaDevolucion,precio,prestado);
		//Añadimos libro a la biblioteca
		biblioteca.add(libro);
		//Ponemos libro a null
		System.out.println(libro);
		libro=null;
		}
		
		fr.close();
		br.close();

		fr = null;
		br = null;
		
	}

	public List<Libro> getBiblioteca() {
		return biblioteca;
		}
	
		public void setBiblioteca(List<Libro> biblioteca) {
		this.biblioteca = biblioteca;
		}
		
		public Libro buscarLibroIsbn(String isbn) {
		Libro l=null;
		for(int x=0;x<biblioteca.size();x++) {
		if(isbn.equals(biblioteca.get(x).getIsbn()))
		l=biblioteca.get(x);
		}
		return l;
		}
		
		public boolean agregarLibro(String isbn, String titulo, String autor, String editorial, String precio) throws
		ISBNException, DateTimeParseException, NumberFormatException, CamposVaciosException {
		boolean agregado=false;
		Libro l =new Libro(isbn, titulo, autor, editorial, precio);
		if(!biblioteca.contains(l)) {
		biblioteca.add(l);
		agregado=true;
		}
		return agregado;
		}
		
		public Libro prestarLibro(String isbn,String fecha) throws DateTimeParseException{
		Libro l=buscarLibroIsbn(isbn);
		if(l !=null && l.isPrestado()==false) {
		l.setPrestado("true");
		l.setFechaDevolucion(fecha);
		}
		return l;
		}
		
		public boolean devolverLibro(String isbn) {
		boolean modificado=false;
		Libro l=buscarLibroIsbn(isbn);
		if(l !=null && l.isPrestado()==true) {
		l.setPrestado("false");
		l.setFechaDevolucion("null");
		modificado=true;
		}
		return modificado;
		}
		
		public boolean eliminarLibro(String isbn) {
		boolean eliminado=false;
		Libro l=buscarLibroIsbn(isbn);
		if(l !=null) {
		biblioteca.remove(l);
		eliminado=true;
		}
		return eliminado;
		}
		public int eliminarLibrosPrestados() {
		int cant=0;
		/*List<Libro> prestados=new ArrayList<Libro>();

		for(Libro l:biblioteca) {
		if(l.isPrestado()) {
		prestados.add(l);
		cant++;
		}
		}
		if(cant !=0) {
		biblioteca.removeAll(prestados);
		}*/
		Iterator<Libro>iter=biblioteca.iterator() ;
		Libro l;
		while (iter.hasNext()) {
		l=iter.next();
		if(l.isPrestado()) {
		//biblioteca.remove(l);
		iter.remove();
		cant++;}
		}
		return cant;
		}
		public List<Libro> filtrarAutor(String autor){
		List<Libro> librosAutor=new ArrayList<Libro>();
		for(Libro l:biblioteca) {
		if(autor.equals(l.getAutor()))
		librosAutor.add(l);
		}
		if(librosAutor.size()==0)
		librosAutor=null;
		else
		Collections.sort(librosAutor);
		return librosAutor;
		}
		public List<Libro>pendientesEntrega(){
		List<Libro> pendientes=new ArrayList<Libro>();
		LocalDate fechaActual=LocalDate.now();
		Period periodo = null;
		for(Libro libro:biblioteca) {
		if(libro.getFechaDevolucion()!=null) {
		periodo=Period.between(libro.getFechaDevolucion(), fechaActual);
		int fueraPlazo=periodo.getYears()+periodo.getMonths()+periodo.getDays();
		if(fueraPlazo>0)
		pendientes.add(libro);
		Collections.sort(pendientes,new OrdenaFecha());
		}
		}
		return pendientes;
		}
		public boolean salvarDatos() throws IOException {
		boolean salvado=false;
		FileWriter fw;
		fw = new FileWriter("biblioteca.txt");//borramos el fichero y creamos uno nuevo
		BufferedWriter bw=new BufferedWriter(fw);
		for(Libro l:biblioteca) {
		bw.write(l.toString());
		bw.newLine();
		}
		fw.flush();

		bw.close();
		fw.close();
		salvado=true;
		return salvado;
		}
		@Override
		public String toString() {
		return "BibliotecaController [biblioteca=" + biblioteca + "]";
		}
	
}
