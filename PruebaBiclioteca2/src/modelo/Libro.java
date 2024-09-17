package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Objects;

import excepciones.CamposVaciosException;
import excepciones.ISBNException;

public class Libro implements Comparable<Libro>{
 
	//Atributos
	private String isbn;
	private String titulo;
	private String autor;
	private String editorial;
	private LocalDate fechaDev;
	private double precio;
	private boolean prestado; 
	
	
	public Libro(String isbn, String titulo, String autor, String editorial, String fechaDev, String precio,
			String prestado) throws ISBNException, CamposVaciosException {
		super();
		this.setIsbn(isbn);
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setEditorial(editorial);
		this.setFechaDev(fechaDev);
		this.setPrecio(precio);
		this.setPrestado(prestado);
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) throws ISBNException {
		if(compruebaIsbn(isbn))
		this.isbn = isbn;
		else
			throw new ISBNException();
	}

	private boolean compruebaIsbn(String isbn) {
		boolean correcto=false;
		String codigo=isbn.replace("-", "");
		int cont=0;
		String subcadena="";
		for(int x=0;x<codigo.length()-1;x++) {
			subcadena=codigo.substring(x,x+1);
			if(esImpar(x))
				cont+=Integer.parseInt(subcadena);
			else
				cont+=(Integer.parseInt(subcadena))*3;
		}
		int dece=cont;
		while(dece%10!=0) {
			dece++;
		}
		int control=dece-cont;
		if((Integer.parseInt(codigo.substring(12)))==control)
			correcto=true;
		else 
			correcto=false;
	

	
		return correcto;
	}
	private boolean esImpar(int x) {
		boolean impar=false;
		if(x%2==0)
			impar=true;
		return impar;
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

	public LocalDate getFechaDev() {
		return fechaDev;
	}

	public void setFechaDev(String fechaDev) throws DateTimeParseException{
	if(fechaDev.equals("null"))
		this.fechaDev=null;
	else
		this.fechaDev = LocalDate.parse(fechaDev);
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) throws CamposVaciosException {
		if(precio.equals(""))
			throw new CamposVaciosException();
		else
		this.precio = Double.parseDouble(precio);
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(String prestado) {
		
		this.prestado = Boolean.parseBoolean(prestado);
	}

	

	@Override
	public String toString() {
		return this.isbn+","+this.titulo+","+this.autor+","+this.editorial+","+this.getFechaDev()+","+this.precio+","+this.isPrestado();
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
		return this.titulo.compareTo(o.getTitulo());
	}

}
