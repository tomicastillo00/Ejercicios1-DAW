package modelo;

import java.util.Objects;

public class Persona1 {

	//Estructura, conocida como propiedades o atributos
	//Los atributos deben estar protegidos estando privados
	private String nombre;
	private String apellidos;
	private String dni;
	private int edad;
	private int altura;
	private float peso;
	
	
	//El "this" es una palabra reservada para referirse al atributo del objeto y clase
	
	
	//Constructor vacio
	public Persona1() {
		//aqui es indiferente poner el this porque no hay variables
		nombre="desconocido";
		this.apellidos="desconocido";
		this.edad=0;
	}
	
	//Constructor con algunos parametros
	public Persona1(String nombre, String apelli) {
		//Aqui es imprescindible poner el this, ya que sino no se referira al atributo sino al a variable del metodo
		this.nombre = nombre;
		//o tambien podemos cambiar el nombre a la variable, sin necesidad de poner el this
		apellidos = apelli;	
	}
	public Persona1(String nombre, String apellidos,String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;	
		this.dni=dni;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona1 other = (Persona1) obj;
		return Objects.equals(dni, other.dni);
	}

	public Persona1(String nombre, String apellidos, int edad) {
		this(nombre, apellidos);//asi podremos mandar el nombre y apellidos al constructor anterior
		this.edad = edad;
	}
	
	public Persona1(String nombre, String apellidos, int edad, int altura, float peso) {
		//this.nombre=nombre;
		//this.apellidos=apellidos;
		//this.edad=edad;
		this(nombre,apellidos,edad);
		this.altura=altura;
		this.peso=peso;
	}
	
	//Comportamiento, conocido como metodos
		
		public void caminar() {
			System.out.println("Estoy caminando");
		}
		
		public void hablar() {
			System.out.println("Estoy hablando");
		}
		
		public void nacer() {
			System.out.println("Acabo de nacer");
		}
		
		public void morir() {
			System.out.println("Hasta mas ver");
		}
		
		public void presentacion() {
			System.out.println(
					"Mi nombre es "+this.nombre+" "+this.apellidos+", y tengo "+this.edad+" años de edad");
		}
	
}
