package lista;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import modelo.Bicicleta;
import modelo.Persona;

public class Lista_1 {

	public Lista_1() {
		// TODO Auto-generated constructor stub
		Persona p1=new Persona("Pepe","Garcia");
		Persona p2=new Persona("Maria","Perez");
		Bicicleta b1=new Bicicleta(11, 29);
		Collection coleccion=new ArrayList();
		//Para añadir objetos a una lista utilizaremos el metodo add
		coleccion.add(p1);
		coleccion.add(p2);
		coleccion.add(p1);
		coleccion.add(b1);
		
		//Este for se utiliza para recorrer la coleccion de objetos que tenemos añadidos a esta
		//Donde pone Object se puede poner tambien la clase del objeto ,lo que pasa que si ponemos persona
		//nos dara un error porque en la coleccion hay un objeto de la clase bicicleta
		
		for(Object elem : coleccion) {
			System.out.println(elem);
			//como tenemos en la clase persona y bicicleta el metodo toString nos lo devuelve como cadenas
		}
		
		//LISTA
		List<Persona> lista=null;
		lista=new ArrayList<Persona>();
		lista.add(p1);lista.add(p2);lista.add(p2);
		for(Persona person:lista) {
			System.out.println(person);
		}
		//Para extraer un objeto en concreto utilizaremos el get
		System.out.println("El primer elemento es "+lista.get(0));
		
		//Se puede borrar mandandole el indice o el objeto que se quiere borrar
		System.out.println("=============BORRAR================");
		//Aqui se borra por el indice de donde esta el objeto en la lista
		
		Persona p=lista.remove(0);
		System.out.println("Hemos borrado "+p);
		for(Persona person:lista) {
			System.out.println(person);
		}
		
		//Aqui se borra especificando el objeto
		lista.remove(p2);
		for(Persona person:lista) {
			System.out.println("..."+person);
		}
		
		lista.add(p1);
		//Podemos agregar a una lista e instanciar un objeto a la misma vez
		lista.add(new Persona("Antonio","Perez"));
		System.out.println("======================");
		for(Persona person:lista) {
			System.out.println("..."+person);
		}
		System.err.println(lista.get(2));
		
		//El iterador se utiliza para recorrer la lista tambien
		System.out.println("===========ITERATOR=========");
		//Para utilizarlo tendremos que importar el paquete java.util la clase iterador
		//Indicamos que el iterador es de tipo persona, a traves del metodo iterator cargamos todos los elementos de la lista
		java.util.Iterator<Persona> iter=lista.iterator();
		//Este bucle quiere decir que mientras haya elementos en la lista
		while(iter.hasNext()) {
			//Persona p3=iter.next();
			//Para acceder a los elementos de la lista utilizaremos el next
			System.out.println(iter.next().toString());
		}
		
		System.out.println("============FOR==========");
		//Si queremos saber cuantos elementos hay en la lista utilizaremos el metodo size
		for(int x=0;x<lista.size();x++) {
			p=lista.get(x);
			System.out.println(p);
		}
		
		//otros metodos
		
		/* void clear()=vacia lista
		 * boolean isEmpty()=dice si esta vacia o no la lista
		 * boolean contain(Object o)=indica si un objeto esta en una lista
		 * int indexOf(Object o)=para saber el lugar que ocupa en la lista el objeto
		 */
		
	}

}
