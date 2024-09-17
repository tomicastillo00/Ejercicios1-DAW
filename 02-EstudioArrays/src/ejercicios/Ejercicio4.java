package ejercicios;

public class Ejercicio4 {

	public Ejercicio4() {
		
		int[][]matriz=new int[5][5];
		int filas=0;
		int columnas=2;
		
		for(int x=1;x<=25;x++) {
			matriz[filas][columnas]=x;
			if(x%5==0) {//si es multiplo de 5 se hace una serie de cosas, sumamos una fila pero sin moverse de columna
				filas++;
			
				if(filas>4) 
					filas=0;
				
		}else {//si no es multiplo de 5, se resta una fila y se le suma una columna
					filas--;
				
				if(filas<0) 
					filas=4;
				
				columnas++;
				if(columnas>4) 
					columnas=0;
				
		}
		}
	mostrarMatriz(matriz);
		
		
	}

	private void mostrarMatriz(int[][] matriz) {
		
		for(int x=0;x<matriz.length;x++) {
			for(int y =0;y<matriz[x].length;y++) {
				System.out.printf("%3d",matriz[x][y]);
			}
			System.out.println("");
		}
		
		
	}

}
