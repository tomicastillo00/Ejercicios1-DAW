package modelo;

public class Artista {

	//Estos metodos pueden recibir diferentes argumentos, a esto se le llama sobrecarga
	public void dibuja(String s) {
		System.out.println(s);
	}
	
	public void dibuja(int i) {
		System.out.println(i);
	}
	
	public void dibuja(double f) {
		System.out.println(f);
	}
	
	public void dibuja(int i,double f) {
		System.out.println(i);
		System.out.println(f);
	}
	
}
