package excepciones;

public class ExcepcionDni {

	public ExcepcionDni() {
		// TODO Auto-generated constructor stub
		String dni="31628380E";
		try {
			compruebaDni(dni);
		} catch (DniException e) {
			System.out.println(e.getMessage());
		}
	}

	private void compruebaDni(String dni) throws DniException {
		// TODO Auto-generated method stub
		
		String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
		dni=dni.toUpperCase();
		if(dni.length()==9) {
			String numeroDNI=dni.substring(0, 8);
			char letra=dni.charAt(8);
			//System.out.println(numeroDNI+"-"+letra);
			try {
				int numDni=Integer.parseInt(numeroDNI);
				int resto=numDni % 23;
				char letraDni=letrasDNI.charAt(resto);
				//System.out.println("---"+letraDni+"----");
				if(letra!=letraDni)
					throw new DniException();
				
			} catch (NumberFormatException e) {
				throw new DniException();
			}
		}
		else {
			throw new DniException();
		}
	}

}
