package estudioExcepciones;

public class Excepciones {

	public Excepciones() {
		// TODO Auto-generated constructor stub
		System.out.println("Manejo de Excepciones...");
		/*El try va haciendo un analisis del codigo a medida que se va ejecutando
		 * y en el caso que se vea una excepcion, salta del tiron al catch
		 */
		//Con este primer ejemplo vemos que la palabla "Exception" del catch captura cualquier excepcion
		
		/*
		try {
			String numero="1234";
			int num=Integer.parseInt(numero);
			System.out.println("Numero = "+num);
			int div = num/0;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Se ha producido un error");
		}*/
		
		//Con este primer ejemplo vemos que dependiendo de la excepcion que haya salta a un catch o a otro
		
		try {
			String numero="1234";
			int num=Integer.parseInt(numero);;
			System.out.println("Numero = "+num);
			int div = num/0;
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Se ha producido una division por cero");
		}
		catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Introduzca solo numeros");
		}
		//Aunque haya dos excepciones en el codigo solo tendra en cuenta la primera que se ejecute
		//En estos ejemplo da igual los errores, el programa continua, lo cual no deberia ser asi...
		System.out.println("El programa continua");
	}

}
