package interfaces;

public class RectanguloB implements Geometria{

	private double largo;
	private double ancho;

	public RectanguloB(double largo,double ancho) {
		// TODO Auto-generated constructor stub
		this.ancho=ancho;
		this.largo=largo;
	}
	public double getArea() {
		return this.ancho*this.largo;
	}
	
	@Override
	public int compareTo(Geometria figura) {
		// TODO Auto-generated method stub
		RectanguloB rectangulo=(RectanguloB)figura;
		if(getArea()>rectangulo.getArea())return 1;
		else if (getArea()<rectangulo.getArea())return -1;
		else return 0;
	}

	
	
}
