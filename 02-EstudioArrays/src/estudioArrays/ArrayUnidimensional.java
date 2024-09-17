package estudioArrays;

public class ArrayUnidimensional {

	public ArrayUnidimensional() {
		//Declarar Array, asignarle 10 espacios y darle valores a las diferentes posiciones
		int [] enteros;
		enteros=new int[10];
		enteros[0]=7;enteros[1]=8;enteros[2]=9;enteros[3]=7;enteros[4]=5;enteros[5]=2;enteros[6]=7;
		
		//Declarar Array y asignarle 10 espacios en la misma linea de codigo
		int[]enteros2 =new int[10];
		
		//Declara Array con valores ya dados en sus 10 posiciones
		int notas[]= {8,2,6,4,5,6,7,8,3,10};
		int suspensos=0;
		for(int x=0;x<10;x++) {//Recorre el array y muestra por pantalla todas las notas
			//System.out.println(notas[x]);
			if(notas[x]<5) 
				suspensos++;//no hace falta poner llaves en el IF porque solo es una linea de codigo
		}
		
		//Ha contado los suspensos y finalmente muestra el numero de estos
		System.out.println("Suspensos: "+suspensos);
		
		//Estos dos arrays se convierten en el mismo pero con distinto nombre
		int notas2[]=notas;
		//Es decir, si cambiamos el valor de uno, el otro tambien cambiara
		notas2[0]=10;
		
		//El metodo cambia la posicion 9 del array notas, y por lo tanto tambien cambia el array notas2
		metodo1(notas);
		
		
		int primitiva[]=generaPrimitiva();//se declara array primitiva que se inicializa con un metodo que genera sus numeros
		for(int x=0;x<primitiva.length;x++)//el FOR tampoco tiene llaves por solo tener una linea
		//length se utiliza para referirse a la longitud del array
			System.out.print(primitiva[x]+"-");
		
		//Se declara e instancia del tiron todo a la vez
		String nombres[]= {"Alba","Cristina","Elena","Christian","Antonio","Andres","Gabi","Jose Antonio","Pedro","Dani"};
		for(int x=0;x<notas.length;x++) 
			System.out.println(nombres[x]+" : "+notas[x]);
		
	}

	private int[] generaPrimitiva() {
		// TODO Auto-generated method stub
		int nuevaPrimitiva[]= {5,14,28,9,6,38};
		return nuevaPrimitiva;
	}

	private void metodo1(int[] notasModificadas) {
		// TODO Auto-generated method stub
		notasModificadas[9]=0;
	}

}
