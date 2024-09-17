package vista;

import java.security.Permissions;
import java.util.Scanner;

import equals_hashcode.EstudioEquals;
import herencia.Consultor;
import herencia.Empleado;
import herencia.Trabajador;
import interfaces.Cebra;
import interfaces.CirculoB;
import interfaces.Geometria;
import interfaces.Leon;
import interfaces.Rana;
import interfaces.RectanguloB;
import modelo.Artista;
import modelo.Bicicleta;
import modelo.Circulo;
import modelo.Persona;
import modelo.Persona1;
import modelo.Persona2;
import modelo.Punto;
import modelo.Rectangulo;
import paqueteC.C;


public class Main {
	
	public Main() {
		//Constructor
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ClasePersona();
		//Constructores();
		//Propiedades_y_Metodos();
		//Argumentos();//comentar varags (metodos que reciben un numero indeterminado de datos)
		//PasoValorReferencia();
		//Modificadores();
		//metodosEstaticos(); //metodos y atributos estaticos
		//sobrecarga();
		//polimorfismo();
		//interfaces();
		EstudioEquals equ=new EstudioEquals();
	}

	
	
	private static void interfaces() {
		// TODO Auto-generated method stub
		//Las interfaces son declaraciones de intenciones, como una herencia pero solo para darle una intencion a todo lo que sea interfaz
		Leon leon=new Leon("Mamifero","Sabana");
		Rana rana=new Rana("Anfibio","Charca");
		Cebra cebra=new Cebra();
		
		leon.acechar();
		rana.acechar();
		rana.vigilar();
		cebra.vigilar();
		
		
		RectanguloB rectangulo=new RectanguloB(5, 4);
		RectanguloB rectangulo2=new RectanguloB(4, 5);
		Geometria rectangulo3=new RectanguloB(6,5);
		System.out.println(rectangulo.compareTo(rectangulo2));
		System.out.println(rectangulo.compareTo(rectangulo3));
		CirculoB circulo=new CirculoB(5);
		CirculoB circulo2=new CirculoB(6);
		System.out.println(circulo.compareTo(circulo2));
		
		
	}

	private static void polimorfismo() {
		// TODO Auto-generated method stub
		//Definimos la referencia con el tipo trabajador para todos los objetos
		Trabajador trabajador;
		Trabajador empleado;
		Trabajador consultor;
		
		//Luego para instanciarlas las haremos con sus clases correspondientes
		trabajador = new Trabajador("Bill Gates","Presidente","Redmond","","");
		empleado = new Empleado("Larry Ellison","Presidente","Redwood","","",100000.0,1000.0);
		consultor = new Consultor("Steve Jobs","Consultor Jefe","Cupertino","","",20,1000.0);
		
		saludar(trabajador);
		saludar(empleado);
		saludar(consultor);
		
		imprimirNombreYPaga(trabajador);
		imprimirNombreYPaga(empleado);
		imprimirNombreYPaga(consultor);
		
	}

	private static void saludar(Trabajador t) {
		// TODO Auto-generated method stub
		System.out.println("Hola, "+t.getNombre());
	}

	private static void imprimirNombreYPaga(Trabajador t) {
		// TODO Auto-generated method stub
		System.out.printf("El trabajador %s tiene una paga de %.2f€ %n", t.getNombre(),t.calcularPaga());
		
	}

	private static void sobrecarga() {
		// TODO Auto-generated method stub
		
		//Podemos tener metodos que se llamen igual siempre y cuando reciban diferentes argumentos
		//En esto se basa la sobrecarga
		
		Artista artista=new Artista();
		
		//Los metodos dibuja pueden recibir distintos argumentos
		artista.dibuja("Hola");
		artista.dibuja(7);
		artista.dibuja(7, 8.3f);
		
		Persona2 perso1=new Persona2();
		Persona2 perso2=new Persona2("Pepe","Perez");
		Persona2 perso3=new Persona2("Alejandro","Ruiz",33);
		
		System.out.println(perso1);
		System.out.println(perso2);
		System.out.println(perso3);
		
	}

	private static void metodosEstaticos() {
		// TODO Auto-generated method stub
		
		//Los metodos estaticos son metodos que se pueden llamar sin necesidad de instanciarlos
		
		Bicicleta bici1=new Bicicleta(21,27,0);
		Bicicleta bici2=new Bicicleta(18,24,0);
		
		System.out.println(bici1);
		System.out.println(bici2);
		
		//La forma correcta de llamar a un metodo de instancia no es a traves de un objeto
		//System.out.println(bici1.getNumeroDeBicicletas());
		//Sino de su clase
		System.out.println(Bicicleta.getNumeroDeBicicletas());
	}

	private static void Modificadores() {
		// TODO Auto-generated method stub
		//A a = new A();  //A no es accesible, aunque este en un subpaquete
		B b=new B();
		System.out.println(b.b);//Esta opcion no suele ser recomendable, ya que los atributos deben ser privados
		System.out.println(b.getB());//Esta seria la opcion perfecta para acceder al atributo
		
		C c=new C();
		//System.out.println(c.c); //Si intentamos acceder al atributo, error
		System.out.println(c.getC());
		
	}

	private static void PasoValorReferencia() {
		// TODO Auto-generated method stub
		Circulo circle=new Circulo(2,3);
		System.out.println(circle);
		moveCircle(circle,23,56);
		System.out.println(circle);
		
	}

	private static void moveCircle(Circulo circle, int x, int y) {
		// TODO Auto-generated method stub
		
		//Cogemos lo que vale la posicion "x" del circulo, le sumamos lo acordado y le enviamos el nuevo valor
		circle.setX(circle.getX()+x);
		
		//Cogemos lo que vale la posicion "y" del circulo, le sumamos lo acordado y le enviamos el nuevo valor
		circle.setY(circle.getY()+y);
		
		//Se instancia un objeto con unos nuevos valores, pero al salir del metodo el "circle" vuelve al valor anterior modificado por el set
		circle=new Circulo(0,0);
		System.out.println(circle.toString());
	}

	private static void Argumentos() {
		// TODO Auto-generated method stub
		Punto punto1=new Punto(0,0);
		Punto punto2=new Punto(5,0);
		Punto punto3=new Punto(5,3);
		Punto punto4=new Punto(0,3);
		
		Punto[]puntos= {punto1,punto2,punto3,punto4};
		
		Rectangulo rectangulo=new Rectangulo(punto1, punto2, punto3, punto4);
		Rectangulo rectangulo2=new Rectangulo(puntos);
		System.out.println(rectangulo.toString());
		
		//Desistanciamos objeto y lo volvemos a instanciar
		rectangulo=null;
		rectangulo=new Rectangulo();
		
		//En el metodo "setOtraFigura" podemos mandar los que queramos gracias al varags
		rectangulo.setOtraFigura(punto1,punto2);
		System.out.println(rectangulo.toString());
		
	}

	private static void Propiedades_y_Metodos() {
		// TODO Auto-generated method stub
		Persona2 p=new Persona2();
		Scanner leer=new Scanner(System.in);
		System.out.println("Introduce el nombre de tu colega");
		p.setNombre(leer.next());
		p.setApellidos("Perez");
		p.setAltura(180);
		p.setEdad(23);
		p.setPeso(75.5f);
		
		//Para imprimir por pantalla el nombre que se le ha asignado al objeto "p"
		System.out.println(p.getNombre());
		
		//Poner el nombre del objeto o poner el nombre seguido de ".toString()" es lo mismo, siempre y cuando el metodo toString este en la clase del objeto 
		System.out.println(p.toString());
		System.out.println(p);
		
	}

	private static void Constructores() {
		// TODO Auto-generated method stub
		Persona1 tomi=new Persona1("Manuel","Ruiz Gonzalez");
		tomi.presentacion();
		
		Persona1 pepe=new Persona1("Antonio","Castillo Real",31);
		pepe.presentacion();
		
	}
	
	private static void ClasePersona() {
		//Para declarar un objeto de una clase se instancia con la clase del tipo de objeto
		//En este caso 3 personas distintas
		Persona persona=new Persona();
		Persona persona2=new Persona();
		Persona persona3=new Persona();
		
		//Estos son los metodos que hemos creado en la clase persona, aunque podemos utilizar tambien los metodos por defecto
		//como equals,wait...
		persona.nacer();
		persona.hablar();
		persona.caminar();
		persona.morir();
		
		//Cuando ya no necesitamos el objeto, lo desinstanciamos
		persona=null;
		
		persona2.nacer();
		
		persona3.caminar();
		
	}

	
}
