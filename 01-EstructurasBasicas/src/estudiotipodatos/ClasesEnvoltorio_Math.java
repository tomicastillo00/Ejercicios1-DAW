package estudiotipodatos;

public class ClasesEnvoltorio_Math {

	public ClasesEnvoltorio_Math() {
		// TODO Auto-generated constructor stub
		
		
		String n = "123";
		int x  = 123;
		int num;
		
		num = Integer.parseInt("12345");
		System.out.println(num);//se pasa el numero de la cadena a una variable entera
		
		String numString = Integer.toString(x);
		System.out.println("Numero "+x+" como cadena : "+numString);
		
		System.out.println("1111 en base 2 = "+Integer.parseInt("1111",2));//pasa de una cadena binario a entero normal
		System.out.println("123456 en hexadecimal = "+Integer.toHexString(123456));//pasa de normal a una cadena hexagesimal
		System.out.println("135 en binario = "+Integer.toBinaryString(135));//pasa de entero normal a una cadena binaria
		
		char c = '9';
		boolean sw = true;
		System.out.println("El caracter c es una letra ?..."+Character.isLetter(c));
		//comprueba si el caracter es una letra
		System.out.println("El caracter c es un digito ?..."+Character.isDigit(c));
		//comprueba si el caracter es un digito
		System.out.println("El caracter c es mayuscula ?..."+Character.isUpperCase(c));
		//comprueba si el caracter es mayuscula
		
		String numDouble = "53.758425";
		double d = Double.parseDouble(numDouble);
		System.out.printf("La cadena %s es el numero %.3f %n", numDouble, d);
		
		String valorSw = "true";
		sw = Boolean.parseBoolean(valorSw);
		System.out.println(Boolean.toString(sw));
		
		
		//LA CLASE MATH
		
		System.err.println("Math.ceil=======================");
		System.out.println(Math.ceil(2.3));//muestra 3.0
		System.out.println(Math.ceil(0.895));//muestra 1.0
		System.out.println(Math.ceil(-1.87));//muestra -1.0
		System.out.println(Math.ceil(-0.9));//muestra -0.0
		
		System.err.println("Math.floor=======================");
		System.out.println(Math.floor(2.8));//muestra 2.0
		System.out.println(Math.floor(0.895));//muestra 0.0
		System.out.println(Math.floor(-1.87));//muestra -2.0
		System.out.println(Math.floor(-0.9));//muestra -1.0
		
		System.err.println("Redondeos========================");
		System.out.println(Math.rint(0.891));//muestra 1.0
		System.out.println(Math.rint(6.5));//muestra 6
		System.out.println(Math.rint(6.51));//muestra 7
		
		System.err.println("Potencias y raices==============");
		System.out.println(Math.pow(5,2));//muestra 25
		System.out.println(Math.sqrt(25));//muestra raiz cuadrada 25= 5
		System.out.println((Math.pow(25,1/2.0)));//raiz cuadrada 25 = 5
		System.out.println(Math.pow(125, 1/3.0));//raiz cubica 125 = 5
		
		System.err.println("Trigonometria====================");
		int angulo = 30;
		
		System.out.println(Math.sin(Math.toRadians(angulo)));//raiz cubica 125 = 5
		System.out.printf("El seno de un angulo de %d grados es = %.1f %n", angulo, Math.toRadians(angulo));
		double cosAngulo = 0.86;
		System.out.printf("Un coseno de %.2f corresponde a un angulo de %f %n", cosAngulo, Math.toDegrees(Math.acos(cosAngulo)));
		
		System.err.println("Max de 2 numero =================");
		System.out.println(Math.max(3, 14));
		
		System.err.println("Aleatorios=======================");
		System.out.println(Math.random());//nos da numeros aleatorios entre 0 y 1
		
		int ale = 0;
		//nos dara numeros entre 0-4(ya que al 5 nunca llegara)
		for (x=0; x<10; x++) { 
			ale = (int) Math.floor(Math.random()*5);
			System.out.print(ale+"-");		
		}
		System.out.println();
		//nos dara numeros entre 0-10(ya que por defecto seria hasta el 9, lo que pasa que en este caso le sumamos 1 al 10)
		for (x=0; x<10; x++) { 
			ale = (int) Math.floor(Math.random()*10+1);
			System.out.print(ale+"-");		
		}
		System.out.println();
		
		int menor=5, mayor=7;
		//nos dara numeros en un intervalo(en este caso 5-7)
		for (x=0; x<10; x++) {
			ale = (int) Math.floor(Math.random()*(mayor-menor+1)+menor);
			System.out.print(ale+"-");		
		}
	
		
		
		
	}

}
