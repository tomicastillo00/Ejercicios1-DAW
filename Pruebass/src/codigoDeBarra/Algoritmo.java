package codigoDeBarra;

public class Algoritmo {

	public Algoritmo() {
		// TODO Auto-generated constructor stub
		
		String isbn="8412345678905";
		int acu=0;
		for(int x=0;isbn.length()-1>x;x++) {
			int dig=Integer.parseInt(isbn.substring(x,x+1));
			if(x%2!=0) 
				acu+=(dig*3);
			else 
				acu+=dig;
		}
		int acu1=acu;
		while(acu%10!=0) {
			acu++;
		}
		int control=acu-acu1;
		
		if(control==Integer.parseInt(isbn.substring(12)))
			System.out.println("isbn correcto");
		else
			System.out.println("Isbn incorrecto");
		
	}

}
