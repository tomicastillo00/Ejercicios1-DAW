package modelo;

import java.util.Comparator;

public class ComparaFecha implements Comparator<Bicicleta> {


	@Override
	public int compare(Bicicleta b1, Bicicleta b2) {
		// TODO Auto-generated method stub
		return b1.getFecha().compareTo(b2.getFecha());
	}

}
