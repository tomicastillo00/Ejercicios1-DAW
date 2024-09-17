package interfaces;

//Tambien podemos utilizar dos interfaces a la vez
public class Rana extends Animal implements Cazador,Presa{

	public Rana() {
		// TODO Auto-generated constructor stub
	}

	public Rana(String especie, String habitat) {
		super(especie, habitat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void vigilar() {
		// TODO Auto-generated method stub
		System.out.println("Cuidao con los pajaro brodel");
	}

	@Override
	public void acechar() {
		// TODO Auto-generated method stub
		System.out.println("Me wa comel la mousca");
	}

}
