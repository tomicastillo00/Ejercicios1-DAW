package estudioArrays;

import java.util.Scanner;

public class ArrayBidimensional {

	public ArrayBidimensional() {
		System.out.println("Estudio Arrays Bidimensionales");
		//Declaramos Array Bidimensional
		int[][]notas;
		
		
		//Array unidimensional
		int[] numeros= {1,2,3,4,5,6};
		
		
		//declaramos cuantas filas y cuantas columnas tendra el Array
		notas=new int[5][20];
		
		//O por el contrario hacemos todo del tiron
		int [][]notas2=new int[6][30];
		notas2[0][0]=1;
		
		
		//Los arrays bidimensionales los podemos declarar con los datos de las filas solo
		int [][]notas3=new int [6][];
		
		//cuando nos intereses podemos declarar las columnas que tienen dichas filas
		notas3[0]=new int [10];//fila 0 tiene 10 columnas
		notas3[1]=new int [12];//fila 1 tiene 12 columnas
		notas3[2]=new int [15];//fila 2 tiene 15 columnas
		notas3[3]=numeros;//fila 3 tiene 6 columnas con los valores declarados anteriormente
		
		//inicializamos un array a la vez que lo declaramos para obtener los valores de cada fila y cada columna
		int [][]notas4= { {5,6,7,8,9,4}//programacion
						 ,{5,6,8,1,7,9}//base de datos 
						 ,{5,5,4,6,8,7}//sistemas
						 ,{2,3,5,6,8,7} };//lenguaje
		
		// Leer un array de principio a fin
		for (int x = 0;x<notas4.length;x++) {//Bucle que recorre las filas
			
			for(int y = 0;y<notas4[x].length;y++) {//Bucle que recorre las columnas
				//se pone notas4[x] porque va a recorrer las columnas de la fila "x", es decir, la fila seleccionada en el FOR anterior
			System.out.print(notas4[x][y]+"-");
			}
			System.out.println();
		}
		System.out.println("==================================================");
		
		
		
/*for (int x = 0;x<notas4.length;x++) {
			
			for(int y = 0;y<notas4[x].length;y++) {
				notas4[x][y]=(int) (Math.random() * 10);//Con este metodo podemos rellenar un array automaticamente y aleatoriamente
			System.out.print(notas4[x][y]+"-");
			}
			System.out.println();
		}*/
		System.out.println("================================================");
		imprimirArray(notas4);
		String nombre[]= {"Maria","Pepe","Antonia","Carlos","Vicenta","Sergio"};
		String []asignaturas= {"Programacion","Sistemas","Base datos","Lenguaje de marcas"};
		//Quiero mostrar una asignatura
		System.out.println("Introduzca la asignatura (1.Programacion.-2.Sistemas.-3.BBDD.-4.LM");
		Scanner leer=new Scanner(System.in);
		int num=leer.nextInt();
		num--;
		//A continuacion se mostrara la asignatura con las notas de cada alumno
		System.out.println(asignaturas[num]);
		System.out.println("====================");
		for(int y=0;y<notas4[num].length;y++) {
			System.out.println(nombre[y]+"           "+notas4[num][y]);
}
		
		//Despues introducimos numero del alumno para saber las notas de cada asignatura de dicho alumno
		System.out.println("Introduce el numero de alumno");
		num=leer.nextInt();
		num--;
		System.out.println(nombre[num]);
		System.out.println("==============");
		for(int x=0;x<notas4.length;x++) {
			System.out.println(asignaturas[x]+"     "+notas4[x][num]);
		}
		
		
		System.out.println("==================================================");
	}

	//Al utilizar esta funcion vuelve a imprimir el array, este caso seria el generado aleatoriamente
	private void imprimirArray(int[][] notas) {
		notas[0][0]=0;//le damos valor 1 al espacio de la primera fila y primera columna 
for (int x = 0;x<notas.length;x++) {
			
			for(int y = 0;y<notas[x].length;y++) {
			System.out.print(notas[x][y]+"-");
			}
			System.out.println();
		}
		
	}

}
