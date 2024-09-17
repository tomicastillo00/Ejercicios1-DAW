package estudioExcepciones;

import java.util.Scanner;

import Excepciones.DniException;

public class Excepciones2 {
//Al poner throws en el constructor, hacemos la gestion de la excepcion correspondiente donde este vinculada (EN ESTE CASO EN EL MAIN)
	public Excepciones2() throws ArithmeticException{
		
		System.out.println("Manejo de Excepciones....");
		Scanner leer=new Scanner(System.in);
		boolean incorrecto=true;
		System.out.println("Introduzca un numero");
		int num=0;
		do {
			
			String numero=leer.next();
			try {
				num=Integer.parseInt(numero);
				incorrecto=false;
			}catch(NumberFormatException e) {
				System.out.println("Introduzca solo numeros");
				
			}
		}while(incorrecto);
		System.out.println("Dato introducido correctamente");
		
		//operar(num);
		
		System.out.println("Introduzca un DNI");
		String dni=leer.next();
		
		try {
			compruebaDni(dni);
		} catch (DniException e) {
			//El metodo getMessage lanza el mensaje que hemos puesto en el super en la clase DniException
			System.out.println(e.getMessage());
		}
		
	}



private void operar(int num) {
	// TODO Auto-generated method stub
	dividir(num);
}

private void dividir(int num) {
	// TODO Auto-generated method stub
	int div=num/0;
	//En este caso se produciria un fallo aritmetico al ser imposible dividir un numero entre 0
}

private void compruebaDni(String dni)throws DniException {
	// TODO Auto-generated method stub
	
	String letrasDNI="TRWAGMYFPDXBNJZSQVHLCKE";
	dni=dni.toUpperCase();
	if(dni.length()==9) {
		String numeroDNI=dni.substring(0, 8);
		char letra=dni.charAt(8);
		
		try {
			int numDni=Integer.parseInt(numeroDNI);
			int resto=numDni%23;
			char letraDni=letrasDNI.charAt(resto);
			if(letra!=letraDni)
				throw new DniException();
			
		}catch (NumberFormatException e) {
			// TODO: handle exception
			throw new DniException();
		}
	}
	else {
		throw new DniException();
	}
	
	
}

}
