package modelo;

public class Cliente {

	private String numero;
	private String nombre;
	
	public Cliente(String nom, String num) {
		this.nombre = nom;
		this.numero = num;
	}
	
	public String toString() {
		String cad="Cliente : "+this.nombre+" num : "+this.numero;
		return cad;
	}
	
	
	
	
	
}
