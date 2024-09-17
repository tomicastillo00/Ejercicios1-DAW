package interfaces;

public class Leon extends Animal implements Cazador {

	public Leon() {
		// TODO Auto-generated constructor stub
	}

	public Leon(String especie, String habitat) {
		super(especie, habitat);
		// TODO Auto-generated constructor stub
	}

	//Gracias a la interfaz cazador, se ha implementado el metodo acechar
	//La interfaz obliga a que toda clase que tenga la interfaz implementada, tenga que tener este metodo
	@Override
	public void acechar() {
		//Un leon no caza de la misma manera que lo puede hacer un aguila
		System.out.println("Vaya lomito tiene esa cebra");
		
		
	}

}
