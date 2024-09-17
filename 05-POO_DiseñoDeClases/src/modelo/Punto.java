package modelo;

public class Punto {

	private int x;
	private int y;
	
	
	public Punto(int x, int y) {
		this.x=x;
		this.y=y;
	}


	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

}
