package examenAñoPasao;

public class Ejercicio2 {

	public Ejercicio2() {

		/*Crea un metodo qu recibe una cadena encriptada y el array de desencriptacion 
		 * y devuelve el mensaje desencriptado
		 */
		String mensaje="easAtocrmaa-r-cpnl-olaaimnr-uee-d-d-lmseor&e-&az&m";
		int []clave= {3,4,9,6,1,7,0,8,5,2};
		String mensajeDesencriptado=desencripta(mensaje,clave);
		System.out.println(mensajeDesencriptado);
		
	}

	private String desencripta(String mensaje, int[] clave) {
		String subcadena="";
		String desencriptacion="";
		
		for(int x=0;x<mensaje.length();x+=clave.length) {
			subcadena=mensaje.substring(x, x+clave.length);
			desencriptacion+=desencriptado(subcadena,clave);
		}
		return desencriptacion;
	}

	private String desencriptado(String subcadena, int[] clave) {
		char[]subvariable=new char[clave.length];
		for(int x=0;x<clave.length;x++) {
			subvariable[x]=subcadena.charAt(clave[x]);
		}
		String resultado=String.valueOf(subvariable);
		
		return resultado;
	}

}
