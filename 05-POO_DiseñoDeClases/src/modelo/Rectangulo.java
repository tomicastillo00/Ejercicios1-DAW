package modelo;

import java.util.Arrays;

public class Rectangulo {
	
//Atributos
	
	private Punto[]puntos;
	
	
//Ponemos constructor vacio por defecto para evitar fallos con algunas frameworks
	public Rectangulo() {
		//El constructor vacio inicializa los atributos a los valores por defecto
	}
	
//Constructor al que se le manda los 4 puntos y se lo asigna al array de puntos de los atributos
	public Rectangulo(Punto p1, Punto p2, Punto p3, Punto p4) {
		puntos=new Punto[] {p1,p2,p3,p4};
	}
	
//Constructor al que se le manda los 4 puntos pero ya en formato array
	public Rectangulo(Punto[]puntos) {
		this.puntos=puntos;
	}
	
//Los puntos(...) son varags y es un metodo que recibe un numero indeterminado de argumentos)
//Es decir, aqui por ejemplo puede recibir tanta cantidad de puntos como se quiera
	public void setOtraFigura(Punto... puntos) {
		this.puntos=puntos;
	}

//Devuelve los puntos del array
	public Punto[] getPuntos() {
		return puntos;
	}

//Asignar nuevos puntos de array
	public void setPuntos(Punto[] puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "Rectangulo [puntos=" + Arrays.toString(puntos) + "]";
	}
	
	
	

}
