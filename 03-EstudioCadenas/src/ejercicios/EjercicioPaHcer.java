package ejercicios;

import java.util.Scanner;

public class EjercicioPaHcer {

	public EjercicioPaHcer() {
		Scanner leer=new Scanner(System.in);
		
		/*1-. Cifrado Cesar: encripta un mensaje dandole el valor
		 * ASCII correspondinte +2 a cada caracter, luego lo desciframos
		 */
		
		System.out.println("Introduzca una contraseña");
		String contra=leer.nextLine();
		String contra1="";
		String contra2="";
		
		for(int x=0;x<contra.length();x++) {
			char c=contra.charAt(x);
			int carAscii=c;
			c+=2;
			contra1+=c;
		}
		System.out.println("Contraseña encriptada: "+contra1);
		for(int x=0;x<contra1.length();x++) {
			char c=contra1.charAt(x);
			int carAscii=c;
			c-=2;
			contra2+=c;
		}
		System.out.println("Contraseña desencripada: "+contra2);
		
		
		
		
		/*2-. Contraseña segura(8 caracteres, numeros y letras(mayuscula y 
		 * minuscula) y caracteres especiales)
		 */
		
		
		/*System.out.println("Introduce contraseña");
		String contra=leer.nextLine();
		boolean ochoCar=false,contieneNum=false,contieneMayus=false,
				contieneMinus=false,contieneEsp=false;
		
		int tam=contra.length();
		if (tam==8)
			ochoCar=true;
		
		for(int x= 0;x<contra.length();x++) {
			
			char c = contra.charAt(x);
			if (Character.isUpperCase(c))
				contieneMayus=true;
			if(Character.isLowerCase(c))
				contieneMinus=true;
			if (Character.isDigit(c))
				contieneNum=true;
			else
				contieneEsp=true;
		}
		if(ochoCar&&contieneMayus&&contieneMinus&&contieneNum&&contieneEsp) {
			System.out.println("La contraseña es segura");
		}
		else {
			System.out.println("La contraseña NO es segura");
		}*/
		
	}}
	