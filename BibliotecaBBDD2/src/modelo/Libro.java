package modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.Objects;
import java.util.Scanner;

import excepciones.CamposVaciosException;
import excepciones.IsbnException;

public class Libro {
	private int idlibros;
	private String titulo, autor, editorial, isbn;
	private boolean prestado;
	private LocalDate fechaPrestamo, fechaDevolucion;
	private LocalDateTime fechaAlta;
	
	public Libro(String titulo, String autor, String editorial, String isbn) throws IsbnException, CamposVaciosException {
	super();
	this.setTitulo(titulo);
	this.setAutor(autor);
	this.setEditorial(editorial);
	this.setIsbn(isbn);
	this.setPrestado(false);
	//java.util.Date fecha=new java.util.Date();
	this.setFechaAlta( LocalDateTime.now());
	this.setFechaPrestamo(null);
	this.setFechaDevolucion(null);
	}
	
	public Libro(int idlibros,String titulo, String autor, String editorial, String isbn, boolean prestado, LocalDate fechaPrestamo,
	LocalDate fechaDevolucion, LocalDateTime fechaAlta) throws IsbnException, CamposVaciosException {
	super();
	this.idlibros = idlibros;
	this.setTitulo(titulo);
	this.setAutor(autor);
	this.setEditorial(editorial);
	this.setIsbn(isbn);
	this.setPrestado(prestado);
	this.setFechaAlta(fechaAlta);
	this.setFechaPrestamo(fechaPrestamo);
	this.setFechaDevolucion(fechaDevolucion);
	}
	public String getIdlibros(){
	return Integer.toString(idlibros);
	}
	public String getTitulo() {
	return titulo;
	}
	public void setTitulo(String titulo) throws CamposVaciosException {
	if(titulo.length()==0) throw new CamposVaciosException();
	this.titulo = titulo;
	}
	public String getAutor() {
	return autor;
	}
	public void setAutor(String autor) throws CamposVaciosException {
	if(autor.length()==0) throw new CamposVaciosException();
	this.autor = autor;
	}
	public String getEditorial() {
	return editorial;
	}
	public void setEditorial(String editorial) throws CamposVaciosException {
	if(editorial.length()==0) throw new CamposVaciosException();
	this.editorial = editorial;
	}
	public String getIsbn() {
	return isbn;
	}
	public void setIsbn(String isbn) throws IsbnException, CamposVaciosException {
	if(isbn.length()==0) throw new CamposVaciosException();
	if(!compruebaIsbn(isbn))throw new IsbnException();
	this.isbn = isbn;
	
	}
	public boolean isPrestado() {
	return prestado;
	}
	public void setPrestado(boolean prestado) {
	this.prestado = prestado;
	}
	public LocalDate getFechaPrestamo() {
	return fechaPrestamo;
	}
	public void setFechaPrestamo(LocalDate fechaPrestamo) {
	this.fechaPrestamo = fechaPrestamo;
	}
	public LocalDate getFechaDevolucion() {
	return fechaDevolucion;
	}
	public void setFechaDevolucion(LocalDate fechaDevolucion) {
	this.fechaDevolucion = fechaDevolucion;
	}
	public LocalDateTime getFechaAlta() {
	return fechaAlta;
	}
	public void setFechaAlta(LocalDateTime fechaAlta) {
	this.fechaAlta = fechaAlta;
	}
	@Override
	public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
	return result;
	}
	@Override
	public boolean equals(Object obj) {
	if (this == obj)
	return true;
	if (obj == null)
	return false;
	if (getClass() != obj.getClass())
	return false;
	Libro other = (Libro) obj;
	if (isbn == null) {
	if (other.isbn != null)
	return false;
	} else if (!isbn.equals(other.isbn))
	return false;
	return true;
	}
	@Override
	public String toString() {
	return "Libro=" + idlibros + "," + titulo + "," + autor + ", " + editorial
	+ ", " + isbn + ", " + prestado + ", " + fechaPrestamo
	+ ", " + fechaDevolucion + ", " + fechaAlta + "]";
	}
	public String[] toStringGrid(){
	String fecha=fechaPrestamo.toString();
	String prest=Boolean.toString(prestado);
	String[]fila={Integer.toString(idlibros),
	titulo,autor,editorial,isbn,fecha,prest
	};
	return fila;
	}
	private static boolean compruebaIsbn(String isbn) {
	
	boolean correcto=false;
	isbn=isbn.replaceAll("-", "");
	// System.out.println(isbn);
	double isb=Double.parseDouble(isbn);
	char DC= isbn.charAt(isbn.length()-1);
	int DCint=Integer.parseInt(Character.toString(DC));
	//System.out.println(DCint);
	int suma=0;
	int cont=1;
	int multi=0;
	for(int x=0;x<isbn.length()-1;x++){
	char c=isbn.charAt(x);
	int num=Integer.parseInt(Character.toString(c));
	if(cont%2!=0)
	multi=num*1;
	else
	multi=num*3;
	suma+=multi;
	cont++;
	}
	// System.out.println(suma);
	int dc=10-(suma%10);
	// System.out.println("dc ="+dc);
	if(dc==10)
	dc=0;
	if(dc==DCint)
	correcto=true;
	return correcto;
	}
}

