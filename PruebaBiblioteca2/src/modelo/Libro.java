package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Objects;

import excepciones.CamposVaciosException;
import excepciones.IsbnException;

public class Libro implements Comparable<Libro>{

	//Atributos
	private String isbn;
	private String titulo;
	private String autor;
	private String editorial;
	private LocalDate fechaDevolucion;
	private double precio;
	private boolean prestado;
	
	
	
	public Libro(String isbn, String titulo, String autor, String editorial, String fechaDevolucion, String precio,
			String prestado) throws CamposVaciosException, DateTimeParseException, IsbnException {
		super();
		this.setIsbn(isbn);
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setEditorial(editorial);
		this.setFechaDevolucion(fechaDevolucion);;
		this.setPrecio(precio);
		this.setPrestado(prestado);
	}



	public String getIsbn() {
		return isbn;
	}



	public void setIsbn(String isbn) throws IsbnException {
		if(compruebaIsbn(isbn))
		this.isbn = isbn;
		else
			throw new IsbnException();
	}



	private boolean compruebaIsbn(String isbn) {
		isbn=isbn.replace("-", "");
		boolean valido=false;
		int acu=0;
		for(int x=0;isbn.length()-1>x;x++) {
			int dig=Integer.parseInt(isbn.substring(x,x+1));
			if(x%2!=0) 
				acu+=(dig*3);
			else 
				acu+=dig;
		}
		int acu1=acu;
		while(acu%10!=0) {
			acu++;
		}
		int control=acu-acu1;
		
		if(control==Integer.parseInt(isbn.substring(12)))
			valido=true;
		
		return valido;
		
	}
	



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) throws CamposVaciosException {
		if(titulo.equals(""))
			throw new CamposVaciosException();
		else
		this.titulo = titulo;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) throws CamposVaciosException {
		if(autor.equals(""))
			throw new CamposVaciosException();
		else
		this.autor = autor;
	}



	public String getEditorial() {
		return editorial;
	}



	public void setEditorial(String editorial) throws CamposVaciosException {
		if(editorial.equals(""))
			throw new CamposVaciosException();
		else
		this.editorial = editorial;
	}



	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}



	public void setFechaDevolucion(String fechaDevolucion) throws DateTimeParseException{
		if(fechaDevolucion.equals("null"))
			this.fechaDevolucion=null;
		else
		this.fechaDevolucion = LocalDate.parse(fechaDevolucion);
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(String precio) throws CamposVaciosException {
		if(precio.equals(""))
			throw new CamposVaciosException();
		else
		this.precio =Double.parseDouble(precio);
	}



	public boolean isPrestado() {
		return prestado;
	}



	public void setPrestado(String prestado) throws CamposVaciosException {
		if(prestado.equals(""))
			throw new CamposVaciosException();
		else
		this.prestado = Boolean.parseBoolean(prestado);
	}



	public Libro() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return isbn+","+titulo+";"+autor+","+editorial+";"+fechaDevolucion+";"+precio+";"+prestado;
	}



	@Override
	public int hashCode() {
		return Objects.hash(isbn);
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
		return Objects.equals(isbn, other.isbn);
	}



	@Override
	public int compareTo(Libro o) {
		// TODO Auto-generated method stub
		return isbn.compareTo(o.getIsbn());
	}

}
