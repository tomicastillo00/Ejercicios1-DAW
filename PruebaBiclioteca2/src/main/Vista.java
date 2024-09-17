package main;

import excepciones.CamposVaciosException;
import excepciones.ISBNException;
import modelo.Libro;

public class Vista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String isbn="978-84-17157-92-0"; String titulo="La trilogia"; String autor="Carmen Mola"; String editorial="Planeta";
		String fechaDevolucion="2022-02-27"; String precio="20.5"; String prestado="true";
		try {
			Libro libro=new Libro(isbn, titulo, autor, editorial, fechaDevolucion, precio, prestado);
			System.out.println(libro.toString());
		} catch (ISBNException | CamposVaciosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
