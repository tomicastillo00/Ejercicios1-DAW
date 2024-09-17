package ejercicios;

public class Ejercicio8 {

	public Ejercicio8() {
		
		/*8.-Dado un array de enteros de tamaño 5x5, diseñar un programa en Java que lo rellene 
		 * como en la siguiente figura:
		0 1 2 3 4
		1 2 3 4 3
		2 3 4 3 2
		3 4 3 2 1
		4 3 2 1 0
		*/
		
		int [][]matriz=new int[5][5];
		for(int x = 0;x<matriz.length;x++) {
			for(int y = 0;y<matriz[x].length;y++) {
				matriz[x][y]=x+y;
				mayorCuatro(matriz,x,y);
			}
		}
		
		for(int x = 0;x<matriz.length;x++) {
			for(int y = 0;y<matriz[x].length;y++) {
				System.out.print(matriz[x][y]+" - ");
			}
			System.out.println("");
			}
		
	}

	private void mayorCuatro(int[][] matriz, int x, int y) {
		
		if(matriz[x][y]==5) {
		matriz[x][y]=3;
		}
		else if(matriz[x][y]==6) {
			matriz[x][y]=2;
			}
		else if(matriz[x][y]==7) {
			matriz[x][y]=1;
			}
		else if(matriz[x][y]==8) {
			matriz[x][y]=0;
			}
	}

}
