package modelo;

public class Persona2 {
	//Estructura, conocida como propiedades o atributos
	
	private String nombre;
	private String apellidos;
	private int edad;
	private int altura;
	private float peso;
	

	//Constructor vacio
	public Persona2() {
		nombre="desconocido";
		this.apellidos="desconocido";
		this.edad=0;
	}
	
	//Constructor con algunos parametros
	public Persona2(String nombre, String apelli) {
		this.nombre = nombre;
		apellidos = apelli;	
	}
	
	public Persona2(String nombre, String apellidos, int edad) {
		this(nombre, apellidos);
		this.edad = edad;
	}
	
	public Persona2(String nombre, String apellidos, int edad, int altura, float peso) {
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
		public void saludo(String mensaje) {
			System.out.println(//aqui tampoco hace falta poner el this
					"Hola, soy "+nombre+" "+apellidos+" y quiero saludarte diciendote "+mensaje);
		}
		
		
		
		//Cuando un metodo empieza por get, nos devuelve informacion de un atributo
		//Cuando un metodo empieza por set, nos permite acceder a una propiedad de atributo para modificarla
		public String obtenerNombreCompleto() {
			return this.nombre+" "+this.apellidos;
		}
		
		//Si le damos click derecho y a "source" habra una opcion que nos generara metodos "get" y "set"

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

		//El metodo toString pasa a cadena todo el objeto completo, para cuando haya un "Sysout" con el nombre del objeto solo, automaticamente salta el metodo toString
		@Override
		public String toString() {
			return "Persona2 [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", altura=" + altura
					+ ", peso=" + peso + "]";
		}
		
		
		
}
