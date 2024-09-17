package ejerciciosExcepciones;

public class CuentaCorriente {

	public CuentaCorriente() {
		// TODO Auto-generated constructor stub
		String numCuenta="14320154497422504551";
		String entidad=numCuenta.substring(0, 4);
		String sucursal=numCuenta.substring(4, 8);
		String D=numCuenta.substring(8,9);
		String C=numCuenta.substring(9,10);
		String cuenta=numCuenta.substring(10,20);
		
		int ent=Integer.parseInt(entidad);
		int suc=Integer.parseInt(sucursal);
		int con=Integer.parseInt(D);
		int con2=Integer.parseInt(C);
		
		
		String entidadSucursal=numCuenta.substring(0, 8);
		int[] entSuc=new int [10];
		int[]matriz = {2,8,5,10,9,7,3,6};
		for(int x=0;x<entSuc.length;x++) {
			entSuc[x]=entidadSucursal.charAt(x)*matriz[x];		
		}
		int acu=0;
		for(int x=0;x<entSuc.length;x++) {
			acu=+entSuc[x];
		}
	 int de=11-(acu%11);
	 System.out.println(de);
	 
		
		
		
		
		
		
		
		
	}
	

}
