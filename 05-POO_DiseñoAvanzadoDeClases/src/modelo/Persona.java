package modelo;

import java.util.Objects;
import java.util.SortedMap;
import java.util.TreeMap;

public class Persona implements Comparable<Persona> {

	//Estructura, conocida como propiedades o atributos
	//Atributos de estancia, porque si no se instancia no podremos acceder a ellos
	private String nombre;
	private String apellidos;
	private String dni;
	private int edad;
	private int altura;
	private float peso;
	private SortedMap<String,String> agendate1;

	
	
	//Comportamiento, conocido como metodos
	//Estos seran publicos en la mayoria de casos porque los utilizaremos en cualquier parte del proyecto
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public SortedMap<String, String> getAngedate1() {
		return agendate1;
	}

	public void setAgendate1(SortedMap<String, String> agendate1) {
		this.agendate1 = agendate1;
	}

	public Persona() {
		//aqui es indiferente poner el this porque no hay variables
		nombre="desconocido";
		this.apellidos="desconocido";
		this.edad=0;
	}
	
	//Constructor con algunos parametros
	public Persona(String nombre, String apelli) {
		//Aqui es imprescindible poner el this, ya que sino no se referira al atributo sino al a variable del metodo
		this.nombre = nombre;
		//o tambien podemos cambiar el nombre a la variable, sin necesidad de poner el this
		apellidos = apelli;	
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
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni);
	}

	public Persona(String nombre, String apellidos, int edad) {
		this(nombre, apellidos);//asi podremos mandar el nombre y apellidos al constructor anterior
		this.edad = edad;
	}
	
	public Persona(String nombre, String apellidos, int edad, int altura, float peso) {
		//this.nombre=nombre;
		//this.apellidos=apellidos;
		//this.edad=edad;
		this(nombre,apellidos,edad);
		this.altura=altura;
		this.peso=peso;
	}
	
	public Persona(String nombre , String apellidos, String dni) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.dni=dni;
		this.agendate1=new TreeMap<String,String>();
	}

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

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", edad=" + edad
				+ ", altura=" + altura + ", peso=" + peso + ", agendate1=" + agendate1 + "]";
	}



	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		//Esto lo vamos a utilizar para ordenar por los apellidos
		return this.apellidos.compareTo(o.apellidos);
	}
}
