package ejercicios;

import java.util.Scanner;

public class MensajeSecreto {

	public MensajeSecreto() {
		Scanner leer=new Scanner(System.in);
		String mensaje="";
		String[]alf= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		int pala=leer.nextInt();
		for(int pal=0;pal<pala;pal++) {
			String palabra="";
			int num1=leer.nextInt();
			for(int x=0;num1>x;x++) {
			int num2=leer.nextInt();
			int num3=leer.nextInt();
			String letra=sacarLetra(alf,num2,num3);
			palabra+=letra;
			}
			
			mensaje+=palabra;
			mensaje+=" ";
		}
		System.out.println(mensaje);
	}

	private String sacarLetra(String[] alf, int num2, int num3) {
		String palabra="";
		num2=num2-1;
		if(par(num3)) {
			
			palabra+=alf[num2];
		}
		else {
			palabra+=alf[25-(num2)];
				
		}
		return palabra;
	}

	private boolean par(int num3) {
		boolean par=false;
		if(num3%2==0)
			par=true;
		return par;
	}

}
