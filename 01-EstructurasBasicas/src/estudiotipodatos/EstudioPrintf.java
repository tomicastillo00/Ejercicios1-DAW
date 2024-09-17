package estudiotipodatos;

public class EstudioPrintf {

	public EstudioPrintf() {
	
	int x = 33;
	int y = 10;
	int contador = 0;
	
	double dec = 1 / 3.0;
	
	/* %d = numeros enteros
	 * %f = numeros reales
	 * %s = cadenas (variables String)
	 * %c = variables char, o caracter (ASCII)
	 * %n = salto de linea
	 */
	
	 String nombre = "Pepe";
	 String apell = "Garcia";
	 // El printf sirve para poder introducir variables sin tener que ir concatenando
	 // todo el rato con el simbolo "+"
	 System.out.printf("Numero Entero: %d otro numero : %d %n", x, y);
	 System.out.printf("%10d %n", x);
	 System.out.println("dec con todos los decimales "+dec);
	 System.out.printf("Real : %f %n", dec);
	 System.out.printf("%.3f %n", dec);
	 System.out.printf("Alineacion derecha %10.3f %n", dec);
	 System.out.printf("Alineacion izquierda %-10.3f %d %n", dec, x);
	 System.out.printf("%s %n", nombre);
	 System.out.printf("%10s %n", nombre);
	 System.out.printf("%-10s %-10s %n", nombre, apell);
	 
	 while (x < 123) {
		 contador++;
		 char c = (char) x;
		 System.out.printf("%3d : %c",x, c);
		 x++;
		 if (contador==5) {
			 System.out.println("");
			 contador = 0;
		 }
	 }
	 
	}	
}
