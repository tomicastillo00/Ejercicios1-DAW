package ejercicios;

public class EjercicioEncriptacionTraspuesta {

	public EjercicioEncriptacionTraspuesta() {

		//Encriptacion traspuesta
		//Mensaje a encriptar: Atacaremos al atardecer
		//Array para la encriptacion: [5,2,0,4,1,3]
	
		int []array= {5,2,0,4,1,3};
		String mensaje="Eres un bicharraco de la encriptacion";
		while(mensaje.length()%array.length!=0) {
			mensaje+="&";
		}
		
		String mensajeEncriptado="";
		String subcadena="";
		
		for(int x=0;x<mensaje.length();x+=array.length) {
			subcadena=mensaje.substring(x, x+array.length);
			mensajeEncriptado+=encripta(subcadena,array);
		}
		System.out.println("Contraseña encriptada= "+mensajeEncriptado);
		mensaje=mensajeEncriptado;
		String mensajeDesencriptado="";
		for(int x=0;x<mensaje.length();x+=array.length) {
			subcadena=mensaje.substring(x,x+array.length);
			mensajeDesencriptado+=desencripta(subcadena,array);
		}
		System.out.println("Contraseña desencriptada= "+mensajeDesencriptado);
		
		
		
	}

	private String desencripta(String subcadena, int[] array) {
		char[]subcadenaDesencriptacion=new char[array.length];
		for(int x=0;x<subcadena.length();x++) {
			subcadenaDesencriptacion[x]=subcadena.charAt(array[x]);
		}
		String desencriptado=String.valueOf(subcadenaDesencriptacion);
		return desencriptado;
	}

	private String encripta(String subcadena, int[] array) {
		char[]subcadenaEncriptacion=new char[array.length];
		for(int x=0;x<subcadena.length();x++) {
			subcadenaEncriptacion[array[x]]=subcadena.charAt(x);
		}
		String encriptado=String.valueOf(subcadenaEncriptacion);
		
		return encriptado;
	}
	
	}
	

