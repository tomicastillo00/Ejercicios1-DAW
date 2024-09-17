package ejercicios;

import java.util.Scanner;

public class TarjetaDeVisitas {

	public TarjetaDeVisitas() {
		Scanner leer=new Scanner(System.in);
		/* TARJETA DE CLAVES
		 * 		1		2		3		4		5
		 * 
		 * A	173		844		288		678		235		NUMEROS 100-999
		 * 
		 * B	...		...		...		...		...
		 * 
		 * C	...		...		...		...		...
		 * 
		 * D	...		...		...		...		...
		 * 
		 * F	...		...		...		...		...	
		 * 
		 * 
		 * Introduce la coordenada A4 (cada vez que lo ejecutamos debe pedir una coordenada distinta)
		 * 
		 * 	Si es correcto--->mensaje de que nos deja realizar la operacion
		 * 	Si no es correcto nos peira otra vez el numero
		 * 	tenemos 3 intentos para introducir la coordenada.
		 * 
		 * 1º Genera una tarjeta de clave (100,999,25)
		 * 2º Pasar los num de la tarjeta en una matriz bidimensional llamada tarjeta 5x5
		 * 	  Guardamos las letras de las filas en un array paralelo --> letras {"A","B"....}
		 * 3º Mostrar por pantalla
		 * 4º Pedir una coordenada(formada por ua fila (num aleatorio 0-4 que mostrara una letra) y una columna
		 * (num aleatorio 0-4 que mostrara una columna num+1).
		 * fila: NumGenerado=3 --> letra C 			columna: NumGenerado=2 --> columna 3
		 * 5º Introduciomos un num y comprobamos que esta en la tarjeta | tarjeta [F][C] == num
		 * 
		 */
		
		
		int [] clavesUni = generarNumeroAleatorios(100,999,25);
		int[][]clavesBidi=new int [5][5];
		int cont=0;
		pasarABidimensional(clavesBidi,clavesUni,cont);
		String[]filas= {"A","B","C","D","E"};

		System.out.println("");
		for(int x=0;x<clavesBidi.length;x++) {
			
			System.out.print(filas[x]+" -");
			for(int y=0;y<clavesBidi[x].length;y++) {
			System.out.print(clavesBidi[x][y]+" - ");	
			}
			System.out.println("");
			}
		System.out.println("Introduce una fila(A-E)");
		int x=0;
		String fila=leer.next();
		x=leerFila(fila);
		System.out.println("Introduce una columna(1-5)");
		int y=leer.nextInt();
		y-=1;
		System.out.println("Introduzca contraseña de tarjeta");
		
		boolean incorrecto=true;
		cont=3;
		do {
			int contra=leer.nextInt();
		if(clavesBidi[x][y]==contra)
			incorrecto=false;
		else {
			cont--;
			if(cont==0)
				incorrecto=false;
			else
			System.err.println("Contraseña incorrecta, te quedan "+ cont+" intentos");}
		
		}while(incorrecto);
	
		
		
		if(cont==0) {
			System.err.println("Intentos agotados, pruebe dentro de un rato");
		}
		else if(incorrecto==false) {
			System.out.println("Contraseña CORRECTA");
		}
		else {
			System.out.println("ERROR");
		}
		
		
		
		
		
	}

	private int leerFila(String fila) {
		int x=0;
		switch (fila) {
		
		case "A": {
			x=0;
			break;
		}case "B": {
			x=1;
			break;
		}case "C": {
			x=2;
			break;
		}case "D": {
			x=3;
			break;
		}case "E": {
			x=4;
			break;
		}
		
		
	
		}
		return x;
		
	}

	private void pasarABidimensional(int[][] clavesBidi, int[] clavesUni, int cont) {
		for(int x=0;x<clavesBidi.length;x++) {
			for(int y=0;y<clavesBidi[x].length;y++) {
				clavesBidi[x][y]=clavesUni[cont];
				cont++;
			}
		}
		
	}

	private int[] generarNumeroAleatorios(int limMin, int limMax, int cant) {
	int []aleatorio=new int[cant];
	int ale=0;
	if((limMax-limMin+1)<cant)
		return aleatorio;
	for(int x=0;x<aleatorio.length;x++) {
		do {
			ale=(int)(Math.random()*(limMax-limMin+1)+limMin);
		}while(repetidos(ale,aleatorio));
		aleatorio[x]=ale;
	}
	return aleatorio;
	
	
	}

	private boolean repetidos(int ale, int[] aleatorio) {
		boolean repe=false;
		for(int x=0;x<aleatorio.length;x++) {
			if(ale==aleatorio[x])
				repe=true;
		}
			
		return repe;
	}

}
