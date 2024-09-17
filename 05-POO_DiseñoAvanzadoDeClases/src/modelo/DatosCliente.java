package modelo;

public class DatosCliente {

	Cliente cliente;
	long entrada,salida;
	
	
	public DatosCliente(Cliente c) {
		// TODO Auto-generated constructor stub
		//Recibe el cliente y le asocia la hora de entrada
		this.cliente=c;
		entrada=Reloj.ahora();
	}
	void atiende() {
		salida=Reloj.ahora();
	}

}
