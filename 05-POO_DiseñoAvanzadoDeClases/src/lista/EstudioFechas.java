package lista;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EstudioFechas {

	public EstudioFechas() {
		// TODO Auto-generated constructor stub
		//Para capturar la fecha actual
		LocalDate fecha=LocalDate.now();
		System.out.println("Fecha Actual:"+fecha);
		
		try {
			//Para capturar la fecha que quiera el usuario utilizamos el metodo .of
			fecha=LocalDate.of(2022, 2, 28);
			System.out.println("Fecha int yyyy MM dd : "+fecha);
			
			
			//Podemos pedir una cadena y con el parse, lo pasamos a formato fecha
			//Hay que mandarlo en este formato con guion
			LocalDate fecha2=LocalDate.parse("2022-03-15");
			System.out.println("Fecha String: "+fecha2);
			

			//Aqui decimos que el format de la fecha es el que esta metido en el parentesis
			//si ponemos MM el mes tiene que tener dos digitos, igual con la fecha
			DateTimeFormatter FOMATTER= DateTimeFormatter.ofPattern("yyy/M/d");
			//Pasamos la fecha de cadena a fecha pero con el formato del FOMATTER
			LocalDate fecha3=LocalDate.parse("2015/10/2",FOMATTER);
			System.out.println("Fecha formateada: "+fecha3);
			
			
		}catch(DateTimeException e) {
		System.out.println(e.getMessage());
	}
		
		System.out.println(fecha.getYear());
		System.out.println(fecha.getMonthValue());
		System.out.println(fecha.getDayOfMonth());
		
		
		//Podemos capturar la fecha y hora a la vez con la clase LocalDateTime
		//Fecha y hora actual
		LocalDateTime fecha_y_hora =LocalDateTime.now();
		System.out.println("Fecha y hora actual: "+fecha_y_hora);
		
		//Fecha y hora introducida por el usuario
		fecha_y_hora=LocalDateTime.of(2022,10,15,15,30);
		System.out.println("Fecha y hora int: "+fecha_y_hora);
		
		//Fecha y hora actual pero de manera distinta
		fecha_y_hora=LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("Fecha y hora actual 2 : "+fecha_y_hora);
		
		
	}
}
