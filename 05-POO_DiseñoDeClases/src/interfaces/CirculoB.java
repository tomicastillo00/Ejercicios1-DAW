package interfaces;

public class CirculoB implements Geometria {
private double radio;
final double PI=Math.PI;

	
	public CirculoB(double radio) {
		// TODO Auto-generated constructor stub
		this.radio=radio;
	}
	public double getArea() {
		return PI*radio*radio;
	}
	@Override
	public int compareTo(Geometria figura) {
		// TODO Auto-generated method stub
		CirculoB circulo=(CirculoB)figura;
		if(getArea()>circulo.getArea())return 1;
		else if(getArea()<circulo.getArea())return -1;
		else return 0;
	}
	

}
