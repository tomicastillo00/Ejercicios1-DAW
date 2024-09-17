package modelo;

import java.util.Calendar;

public class Reloj {

	public static long ahora() {
		//Devuelve la hora actual en milisegundos
		return Calendar.getInstance().getTimeInMillis();
	}
	
}
