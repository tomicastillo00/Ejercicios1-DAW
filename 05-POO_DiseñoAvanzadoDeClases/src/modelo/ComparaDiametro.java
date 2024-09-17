package modelo;

import java.util.Comparator;

public class ComparaDiametro implements Comparator<Bicicleta> {

	@Override
	public int compare(Bicicleta b1, Bicicleta b2) {
		// TODO Auto-generated method stub
		/*if(b1.getDiametroRueda()>b2.getDiametroRueda())return 1;
		else if(b1.getDiametroRueda()<b2.getDiametroRueda())return -1;
		else return 0;*/
		return b1.getDiametroRueda()-b2.getDiametroRueda();
	}

}
