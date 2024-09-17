package estudioCadenas;

public class Cadenas {

	public Cadenas() {
		
		//String nombre=new String("Tomas");
		String nombre= "Tomas";
		
		System.out.println("Propiedades de las cadenas");
		String cadena="Bienvenido a la clase de programacion         ";
		String cad2="AAA";
		//devuelve la longitud de la Sting, incluyendo espacios en blanco.
		int tam=cadena.length();
		System.out.println("El tamaño de "+cadena+" = "+tam);
		
		//*char charAt (int indice): devuelve el caracter asociado al indice que se le pasa
		//a la String sobre la que se aplica el metodo. Si el indice no existe se lanza una 
		//StringIndexOutOfBoundsExcepcion que hereda de IndexOutOfBoundsException. MUY USADO
		System.out.println("====================");
		System.out.println("====charAt==========");
		System.out.println("Caracter = "+cadena.charAt(0));
		for(int x=0;x<cadena.length();x++) {
			System.out.print(cadena.charAt(x)+"-");
		}//devuelve variable tipo char
		
		System.out.println("================");
		System.out.println("=======Substring======");
		//String substring(int indiceIni, int indiceFin): devuelve una String obtenida a partir de la String
		//anterior y del indice inicial y final, MUY USADO
		
		System.out.println(cadena.substring(1, 3));//me extrae desde el hueco 1 al 3(un numero antes, es decir, el 2)
		System.out.println(cadena.substring(2));//imprime por pantalla a partir del caracter 2
		
		//int indexOf(String srt,int indice): devuelve el indice en el que aparece por primera vez la String del
		//primer argumento en la que se aplica el metodo, a partir del indice especificado en el segundo
		//argumento. Recordar que una String esta indexada. Si el indice a partir del que se inicia la busqueda 
		//no existe o la String no aparece, devuelve -1. MUY USADO
		
		System.out.println("=================");
		System.out.println("====indexOf======");
		
		System.out.println(cadena.indexOf("clase"));//devuelve la posicion de la palabra
		System.out.println(cadena.indexOf("o"));//devuelve la posicion de la primera vez que aparece la letra en la String
		System.out.println(cadena.indexOf("x"));//nos devolvera -1 ya que el caracter no se encuentra en la cadena
		
		
		//equals permite saber si dos cadenas son iguales
		
		System.out.println("======================");
		System.out.println("======equals==========");
		String nombre1="Antonio",nombre2="Antonio";
		System.out.println(nombre1.equals(nombre2));//este, es sensible a mayusculas y minusculas
		nombre="antonio";
		System.out.println(nombre.equalsIgnoreCase(nombre2));//este no es sensible, por lo tanto nos devolveria true
		
		//compareTo Permite comparar dos cadenas entre si lexicograficamente. Retornara 0
		//si son iguales, un numero menos que 0 si la cadena(cad1) es anterior en ordena 
		//alfabetico a la que se pasa por argumento (cad2), y un numero mayor que 0 si la 
		//cadeba es posterior en orden alfabetico, tambien tenemos compareToIgnoreCase()
		
		System.out.println("================");
		System.out.println("======compareTo=====");
		nombre="Ana";
		System.out.println(nombre.compareTo(nombre2));//nos devuelve negativo, ya que Ana va por delante de Antonio alfabeticamente
		
		//trim elimina espacios por delante y por detras de una cadena
		System.out.println("=============");
		System.out.println("===trim======");
		String cad3=cadena.trim();//recorta los espacios sobrantes de la cadena
		System.out.println(cad3.length());//nos muestra el numero de caracteres sin espacios
		
		//toUpperCase() devuelve una cadena en minuscula a mayuscula
		System.out.println("=================");
		System.out.println("===toLowerCase===");
		System.out.println(cadena.toLowerCase());//devuelve la cadena en minuscula
		System.out.println("===toUpperCase===");
		System.out.println(cadena.toUpperCase());//devuelve la cadena en MAYUSCULA
		
		//replace Generara una copia de la cadena cad1, en la que se sustituiran todas las
		//apariciones de cad2 por cad3. El remplazo se hara de izquierda a derecha
		
		System.out.println("===================");
		System.out.println("=====remplace======");
		System.out.println(cadena.replace(" ",""));//quita los espacios
		System.out.println(cadena.replace("a", "*"));//sustituye las a por "*"
		
		//cad1.startsWith(cad2) Retornara true si la cadena comienza por la cadena pasada como
		//argumento. En caso contrario retornara false tambien teneos endWith(cad2) y cad1.contain
		System.out.println("===================");
		System.out.println("====startsWith=====");
		System.out.println(cadena.startsWith("Bienvenido"));//para saber si empieza por esta cadena
		System.out.println(cadena.contains("ida"));//para saber si contiene esta cadena
		
		
		//cadena.split lo utilizaremos mucho con los ficheros
		String alumno="Tomas,Castillo,1DAW,Programacion,BBDD,sistemas,lenguaje de marcas,4,8,true";
		String[]rompeCadena=alumno.split(",");// nos convierte la cadena anterior en un array de cadenas, indicando que esta separado con la coma
		
		String asignatura="Programacion";
		char[]caracteres=asignatura.toCharArray();//pasa la cadena asignatura a un array de caracteres con todas sus letras
		
		System.out.println("");
		
	}

}
