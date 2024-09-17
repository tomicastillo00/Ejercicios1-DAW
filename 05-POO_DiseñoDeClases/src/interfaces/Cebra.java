package interfaces;

//Siempre tenemos que poner para las interfaces, la palabra reservada implements junto al nombre de la Interfaz
public class Cebra extends Animal implements Presa{
	
	public Cebra() {
		// TODO Auto-generated constructor stub
	}

	public Cebra(String especie, String habitat) {
		super(especie, habitat);
		// TODO Auto-generated constructor stub
	}
//Esta interfaz es igual que el leon pero con una cebra. Asi que no seria cazador, seria una presa y tendria otro metodo a realizar diferente
	@Override
	public void vigilar() {
		// TODO Auto-generated method stub
		System.out.println("A correr de los leones");
	}

	
}
