package herencia;

/*Para declarar que una clase esta heredando de otra, se utiliza la palabra reservada extend
 * Al utilizar la palabra extends, hace que la clase "Empleado" sea "hija" de la clase "Trabajador" 
 a esto lo llamamos herencia y sirve para acceder a los atributos y metodos de la clase "Padre" */
public class Empleado extends Trabajador {
	
	//No nos hace falta escribir los atributos como nombre, apellidos y tal
	//Aunque podemos darle otros atributos que sean especificos de la clase empleado
	private double sueldo;
	private double impuestos;
	
	//DUDA
	private final int PAGAS=14;
	
	public Empleado(String nombre,String puesto,String direccion,String telefono,String nSS,double sueldo,double impuestos) {
		//Para acceder a los costructores de la clase Trabajador, utilizamos la palabra reservada super
		super(nombre,puesto,direccion,telefono,nSS);
		this.sueldo = sueldo;
		this.impuestos = impuestos;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	public int getPAGAS() {
		return PAGAS;
	}

	public double calcularPaga() {
		return (sueldo-impuestos)/PAGAS;
	}

	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", impuestos=" + impuestos + ", PAGAS=" + PAGAS + "]";
	}
	
	

	
	
}
