package modelo;

public class Persona {

	//Estructura, conocida como propiedades o atributos
	//Atributos de estancia, porque si no se instancia no podremos acceder a ellos
	String nombre;
	String apellidos;
	int edad;
	int altura;
	float peso;
	
	
	//Comportamiento, conocido como metodos
	//Estos seran publicos en la mayoria de casos porque los utilizaremos en cualquier parte del proyecto
	
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
	
}
