package estudioArrays;

import java.util.Arrays;

public class LaClaseArrays {

	public LaClaseArrays() {
		
		// binarySearch permite buscar un elemento en una matriz que este ordenada ascendentemente
		//si lo encuentra, devuelve la posicion, si no la posicion donde deberia estar -1 en negativo
		int[]matriz= {0,15,16,18,25,28,30,45,50};
		int num=25; // numero a buscar
		int pos=Arrays.binarySearch(matriz, num);
		if(pos>0)
			System.out.println("Se ha encontrado el numero "+num+" en la posicion "+pos);
		else 
			System.err.println("No se ha encotrado , "+num+" deberia estar en la posicion "+(pos+1));
		
		
		//equals || verifica si dos patrices son iguales (mismo numero de elementos en el mismo orden)
		int[]matriz2= {0,15,17,18,25,28,30,45,50};
		boolean sw=Arrays.equals(matriz, matriz2);
		if(sw)
			System.out.println("Las dos matrices son iguales");
		else 
			System.err.println("Las dos matrices NO son iguales");
		
		
		//fill || permite asignar un valor a una matriz completa o a un rango
		int[]matriz3=new int [10];
		Arrays.fill(matriz3, -1);//rellena la matriz3 de "-1"
		System.out.println(Arrays.toString(matriz3));//se pasa el array a cadena y se imprime por pantalla
		Arrays.fill(matriz3, 2,5,8);//esto quiere decir que se quiere rellenar desde la posicion 2 a la 4 (pone 5 pero llega una antes de la posicion introducida) de 8
		System.out.println(Arrays.toString(matriz3));
		
		
		//sort|| ordena una matriz, tambien podemos ordenar un rango
		int []matriz4= {6,3,9,15,2,48,5,3};
		Arrays.sort(matriz4);
		System.out.println(Arrays.toString(matriz4));
		
		
		//copyOf|| copiar unos elementos de una matriz
		int[]matriz5=null;
		System.out.println("matriz original: "+Arrays.toString(matriz));
		matriz5=Arrays.copyOf(matriz, 20);//copia la matriz en la matriz5 pero con 20 posiciones
		System.out.println(matriz5.length);//devuelve el numero de posiciones de array
		System.out.println(Arrays.toString(matriz5));//es decir, que las posiciones que falten por rellenar tendran valor 0
		matriz5=Arrays.copyOf(matriz, 5);	// aqui es al reves, se acorta la matriz a 5 posiciones	
		System.out.println(matriz5.length); // es decir, que se pierden datos que estaban escritos anteeriormente
		System.out.println(Arrays.toString(matriz5));
	}

}
