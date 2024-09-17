package lista;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

import modelo.Persona;

public class Lista_2 {

	public Lista_2() {
		// TODO Auto-generated constructor stub
		
		/*La interfaz SET es la encargada del tratamiento de conjuntos en el api de java.
		 * Un conjunto en Java es una coleccion de elementos que, como el conjunto en matematicas, no permite elementos duplicados
		 *Si el elemento esta duplicado, simplemente, no se agrega
		 */
		
		Set<Persona>listaHasSet=new HashSet<Persona>();
		Persona p1=new Persona("Pepe","Garcia","123");
		Persona p2=new Persona("Maria","Perez","1234");
		Persona p3=new Persona("Luis","Alvarez","1235");
		Persona p4=new Persona("Ana","Rodriguez","1236");
		System.out.println(listaHasSet.add(p1));
		System.out.println(listaHasSet.add(p2));
		//Da falso porque esta repetido
		System.out.println(listaHasSet.add(p1));
		
		//Para que funcione correctamente tendremos que tener implementado el metodo equals en la clase persona
		
		System.out.println("======Lista HastSet=======");
		for(Persona person:listaHasSet)
			System.out.println(person);
		
		
		/*SORTEDSET
		 * Esta interfaz es muy similar a la interfaz set. Tan solo se diferencia en que SORTEDSET
		 * permite que los elementos dentro del conjunto de la coleccion esten ordenados totalmente,
		 * facilitando por tanto su acceso en busquedas y haciendo mas rapido su consulta
		 */
		System.out.println("=========Lista Sorted==========");
		SortedSet<Persona> listaSorted=new TreeSet<Persona>();
		listaSorted.add(p1);listaSorted.add(p2);listaSorted.add(p3);listaSorted.add(p4);
		//Para ordenarlo utilizaremos el metodo compareTo en la clase persona en este caso
		for(Persona person: listaSorted)
			System.out.println(person);
		
		/*Map (clave,valor)
		 * HASHMAP HashMap es la clase que vamos a utilizar para implementar la interfaz Map
		 * siendo una de las mas usadas para implementar esta interfaz.
		 * Esta clase implementa la interfaz Map basada en una tabla hash en modo similar a 
		 * como lo haciamos con HashSet para la interfaz Set.
		 */
		
		Map <Integer,Persona> mp=new HashMap<Integer,Persona>();
		mp.put(4, p4);mp.put(1, p2);mp.put(1, p1);mp.put(3, p3);
		//Al ejecutar ya la lista esta ordenada gracias al mp.put
		System.out.println(mp.toString());

		System.out.println("Personas en el mapa: \n"+mp.toString().replaceAll(",", "\n"));
		
		System.out.println("=======TreeMap======");
		
		p1.getAngedate1().put("Trabajo", "6549354863");
		p1.getAngedate1().put("Casa", "654684863");
		p1.getAngedate1().put("Oficina", "957953485");
		p1.getAngedate1().put("Movil", "956345216");
		
		System.out.println("Personas en el mapa: \n"+p1);
		
		//La clase Stack es una clase de las llamadas de tipo LIFO.
		//Pila de platos, decimal a binario almacenando el resto en la pila y luego sacandolo en modo inverso
		
		Stack<String> binario=new Stack<String>(); //Lista
		binario.push("1"); binario.push("1"); 	binario.push("0"); binario.push("1");  //"1101"
		String bin="";
		
		//Recorreremos la lista sacando un iterator de la lista
		java.util.Iterator<String> iter=binario.iterator();
		
		//Recorrera el iterator mientras haya elementos en el
		while (iter.hasNext()) {
			bin+=binario.pop();
		}
		
		System.err.println(bin);
		
		//Verificacion de parentesis
		//String cadenaEquilibrada = "(Cadena Equilibrada(((()))))";
		String cadenaEquilibrada = "(Cadena Equilibrada((()))))";
		
		if(verificaParentesis(cadenaEquilibrada))
			System.out.println("Cadena equilibrada");
		else 
			System.out.println("Cadena NO equilibrada");
		
		//HACER
		
		
		
	}

	private boolean verificaParentesis(String cadenaEquilibrada) {
		// TODO Auto-generated method stub
		return false;
	}

}
