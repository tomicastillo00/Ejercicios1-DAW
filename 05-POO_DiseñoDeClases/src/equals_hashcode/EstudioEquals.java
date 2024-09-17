package equals_hashcode;

import modelo.Persona1;

public class EstudioEquals {

	public EstudioEquals() {
		// TODO Auto-generated constructor stub
		Persona1 p=new Persona1("Pepe","Garcia","123");
		Persona1 p1=new Persona1("Pepe","Garcia","123");
		
		String cadena="hola";
		String cadena1="hola";
		
		System.out.println(cadena.equals(cadena1));
		
		//El equals utiliza los hashcode de los objetos para compararlos
		System.out.println(p.equals(p1));
		System.out.println("hascode : "+p.hashCode());
		System.out.println("hascode : "+p1.hashCode());
		System.out.println(p.equals(p1));
		//En este caso son iguales porque su dni es igual, y a nivel de clase hay un metodo 
		//que hace que el dni se refleje en el hashcode
	}

}
