package ejercicios;

public class Ejercicio7 {

	public Ejercicio7() {
		/*7. Diseña un programa en Java que rellene un array de 4x4 de la siguiente manera:
		1 0 0 0
		0 1 0 0
		0 0 1 0
		0 0 0 1
		A continuación muestre el contenido del array por pantalla.*/
		
		int[][]matriz=new int [4][4];
		for(int x=0;x<matriz.length;x++) {
			for(int y=0;y<matriz[x].length;y++) {
				if(igual(x,y)) {
					matriz[x][y]=1;
				}
				else {
					matriz[x][y]=0;
				}
				
			}
		}
		for(int x=0;x<matriz.length;x++) {
			for(int y=0;y<matriz[x].length;y++) {
			System.out.print(matriz[x][y]+" - ");	
			}
			System.out.println("");
		}
	
		
		
		
		
		
		
		
	}

	private boolean igual(int x,int y) {
		boolean igual=false;
		if(x==y)
			igual=true;
		
		return igual;
	}

}
