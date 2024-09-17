package modelo;

public class Calculadora {

	int mr;
	
	public Calculadora() {
		// TODO Auto-generated constructor stub
		mr=0;
	}
	
	public int suma(int x, int y) {
		mr= x+y;
		return mr;
	}
	
	public int multiplicacion(int x,int y) {
		mr=x*y;
		return mr;
	}

}
