package lista;

import modelo.Cliente;
import modelo.ColaEspera;

public class ListaColaEspera {

	public ListaColaEspera() throws InterruptedException {
		// TODO Auto-generated constructor stub
		//Instanciamos la clase cola espera almacenar los clientes dentro de las listas
		//de colaEspera y colaAtendidos
		ColaEspera cola=new ColaEspera();
		
		//Luego comenzamos a instanciar los clientes que se almacenaran en formato cola
		//Primero instanciaremos el cliente
		Cliente cliente=new Cliente("Pepe","1");
		//Lo metemos en la cola
		cola.nuevoCliente(cliente);System.out.println(cliente+ "Espere en la salita");
		//Ponemos el cliente con valor null
		cliente=null;
		//Simulamos un tiempo de espera
		Thread.sleep(1000);
		//Instanciamos siguiente cliente
		cliente=new Cliente("Ana", "2");
		
		cola.nuevoCliente(cliente);System.out.println(cliente+ "Espere en la salita");
		cliente=null;
		Thread.sleep(1000);
		cliente=new Cliente("Luis", "3");
		cola.nuevoCliente(cliente);System.out.println(cliente+ "Espere en la salita");
		cliente=null;
		Thread.sleep(1000);
		cliente=new Cliente("Maria", "4");
		cola.nuevoCliente(cliente);System.out.println(cliente+ "Espere en la salita");
		cliente=null;
		Thread.sleep(1000);
		
		//ATENDEMOS A LOS CLIENTES
		System.err.println("ATENCION");
		cliente=cola.atenderCliente();
		System.err.println(cliente.toString());
		Thread.sleep(1000);
		cliente=cola.atenderCliente();
		System.err.println(cliente.toString());
		Thread.sleep(1000);
		cliente=cola.atenderCliente();
		System.err.println(cliente.toString());
		Thread.sleep(1000);
		cliente=cola.atenderCliente();
		System.err.println(cliente.toString());
		
		//Si quisieramos sacar un elemento y no hubiera se lanza NoSuchElementException
		
		System.err.println("Tiempo en ser atendidos "+cola.tiempoEsperaAtendidos());
		
		
	}

}
