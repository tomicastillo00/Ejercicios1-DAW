package interfaces;

import java.util.Comparator;

import modelo.Libro;

public class OrdenaFecha implements Comparator<Libro> {

	//esto se crea aqui porque hay q añadirle la interfaz comparator
	

	@Override
	public int compare(Libro o1, Libro o2) {
		// TODO Auto-generated method stub
		return o1.getFechaDevolucion().compareTo(o2.getFechaDevolucion());
	}

}
