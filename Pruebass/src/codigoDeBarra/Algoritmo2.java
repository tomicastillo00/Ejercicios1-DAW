package codigoDeBarra;

public class Algoritmo2 {

	public Algoritmo2() {
		// TODO Auto-generated constructor stub
		String isbn="84 12345 678904";
		String isbn2=isbn.replace(" ", "");
		int acu=0;
		int dato=0;
		for(int x=0;x<isbn2.length()-1;x++) {
			dato=Integer.parseInt(isbn2.substring(x, x+1));
			if(x%2!=0)
				acu+=(dato*3);
			else
				acu+=dato;
		}
		int acu2=acu;
		while(acu%10!=0) {
			acu++;
		}
		int dc=acu-acu2;
		if(Integer.parseInt(isbn2.substring(12))==dc)
			System.out.println("El isbn es correcto");
		else 
			System.out.println("Es incorrecto");
	}

}
