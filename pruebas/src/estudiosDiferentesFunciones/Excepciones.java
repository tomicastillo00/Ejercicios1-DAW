package estudiosDiferentesFunciones;

public class Excepciones {

	public Excepciones() {
		
		System.out.println("Estudio Excepciones");
		int[]matriz= {1,2,3};
	
		try {
			int x=calculos();
			String dni="12p34567";
			int numDni=Integer.parseInt(dni);
			
			System.out.println(matriz[4]);//error
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Introduzca un indice correcto");
		}
		catch (ArithmeticException e) {

			System.out.println("Procesamos un error que se ha producido en un metodo");

		}
		catch (NumberFormatException e) {
			System.out.println("Introduzca dni correcto");
		}
		
		System.out.println("Estamos fuera del catch");
		
		
	}

	private int calculos()throws ArithmeticException{
		// TODO Auto-generated method stub
		return 2/0;
	}

}
