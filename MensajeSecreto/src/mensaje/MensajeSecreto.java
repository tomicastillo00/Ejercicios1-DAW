package mensaje;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MensajeSecreto {

	public MensajeSecreto() throws IOException {
		// TODO Auto-generated constructor stub
		File fichero=new File("encriptacion.txt");
		if (!fichero.exists())
			fichero.createNewFile();
		
		
		FileReader fr=new FileReader(fichero);
		BufferedReader br=new BufferedReader(fr);
		
		String[]alf= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		int numLetras=0;
		int num1=0;
		int num2=0;
		String cadena="";
		String dato=br.readLine();
		int palabras=Integer.parseInt(dato);
		
		for(int pala=0;pala<palabras;pala++) {
			dato=br.readLine();
			numLetras=Integer.parseInt(dato);
			for(int letra=0;letra<numLetras;letra++) {
				dato=br.readLine();
				num1=Integer.parseInt(dato);
				dato=br.readLine();
				num2=Integer.parseInt(dato);
				cadena+=sacarLetra(num1,num2,alf);
			}
			cadena+=" ";
		}
		System.out.println(cadena);
		
	}

	//num1=posicion
	//num2=si es par empieza por el principio, si es impar empieza por el final
	private String sacarLetra(int num1, int num2, String[] alf) {
		String letra="";
		num1--;
		if(num2%2==0) {
			letra=alf[num1];
		} else {
			letra=alf[25-num1];
		}
		return letra;
	}

	
	
}
