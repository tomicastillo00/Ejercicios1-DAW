package modelo;

import java.util.LinkedList;
import java.util.Queue;

public class ColaEspera {
//Tiene dos colas
	//Vamos a meter en las colas, datos de clientes. Cuando este esperando en la cola de espera y cuando sea atendidos en la de atendidos
	private Queue<DatosCliente>colaEspera;
	private Queue<DatosCliente>colaAtendidos;
	
	//En el constructor, cuando se instancie la clase cola espera, instanciaremos las dos listas
	public ColaEspera() {
		// TODO Auto-generated constructor stub
		colaEspera=new LinkedList<DatosCliente>();
		colaAtendidos=new LinkedList<DatosCliente>();
	}
	
	//Para añadir un nuevo cliente
	public void nuevoCliente(Cliente cliente) {
		//Cuando recibamos un cliente, instanciamos un objeto de tipo datoscliente
		DatosCliente datos=new DatosCliente(cliente);
		//agregamos al final de la cola
		colaEspera.add(datos);
	}
	
	/*
	 * Atender cliente: se saca de la cola de 
	 * espera y se mete en la de atendidos
	 * retorna el cliente atendido
	 */
	public Cliente atenderCliente() {
		//Eliminamos del principio de la cola
		DatosCliente datos=colaEspera.remove();
		datos.atiende();
		//Se guarda la hora de salida de la lista de espera y se añade a la lista de atendidos
		colaAtendidos.add(datos);
		
		return datos.cliente;
	}
	/*
	 * Cuando llamemos a este metodo, recorreremos la lista colaAtendidos que tiene datos 
	 * de tipo DatosClientes y nos dice cuanto tiempo ha tardado en ser atendido y finalmente
	 * nos devolvera el tiempo en segundos
	 */
	public double tiempoEsperaAtendidos() {
		long tiempo=0;
		int num=0;
		for(DatosCliente datos:colaAtendidos) {
			tiempo=tiempo+datos.salida-datos.entrada;
			num++;
		}
		if(num==0) {
			return 0.0;
		} else {
			return(((double)tiempo)/num)/1000.0;
		}
	}
	
	
}
