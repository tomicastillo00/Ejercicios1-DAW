package lista;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import modelo.Bicicleta;
import modelo.ComparaDiametro;
import modelo.ComparaFecha;

public class EstudioComparableComparator {

	public EstudioComparableComparator() {
		// TODO Auto-generated constructor stub
		
		List<Bicicleta> bicis=new ArrayList<Bicicleta>();
		Bicicleta bici=new Bicicleta(10,27,"Treck"); bicis.add(bici);bici=null;
		bici=new Bicicleta(10,29,"Canondale"); bicis.add(bici);bici=null;
		bici=new Bicicleta(11,27,"Pinarello"); bicis.add(bici);bici=null;
		bici=new Bicicleta(10,27,"Canondale"); bicis.add(bici);bici=null;
		bici=new Bicicleta(11,29,"Orbea"); bicis.add(bici);bici=null;
		bici=new Bicicleta(11,27,"BMC"); bicis.add(bici);bici=null;
		bici=new Bicicleta(11,29,"Canondale"); bicis.add(bici);bici=null;
		
		//Para ordenar por ordenacion natural(La que hemos implementado en la interfaz comparable)
		Collections.sort(bicis);
		
		for(Bicicleta bicicleta:bicis)
			System.out.println(bicicleta);
		
		//Utilizamos una sobrecarga que nos comparara en funcion de lo que hay en la clase
		Collections.sort(bicis,new ComparaDiametro());
		System.out.println("==============");

		for(Bicicleta bicicleta:bicis)
			System.out.println(bicicleta);
		
		//vamos a añadir la fecha
		System.out.println("Ordenar fecha=============");
		
		//ORDENAR POR FECHA
		List<Bicicleta> bicisFecha=new ArrayList<Bicicleta>();
		
		LocalDate fecha=LocalDate.of(2020, 12, 3);
		bici=new Bicicleta(10,27,"Treck",fecha); bicisFecha.add(bici);bici=null;
		
		fecha=LocalDate.of(2019, 12, 3);
		bici=new Bicicleta(10,29,"Canondale",fecha); bicisFecha.add(bici);bici=null;
		
		fecha=LocalDate.of(2022, 12, 3);
		bici=new Bicicleta(11,27,"Pinarello",fecha); bicisFecha.add(bici);bici=null;
		
		fecha=LocalDate.of(2010, 12, 3);
		bici=new Bicicleta(10,27,"Canondale",fecha); bicisFecha.add(bici);bici=null;
		
		fecha=LocalDate.of(2021, 12, 3);
		bici=new Bicicleta(11,29,"Orbea",fecha); bicisFecha.add(bici);bici=null;
		
		fecha=LocalDate.of(2020, 5, 3);
		bici=new Bicicleta(11,27,"BMC",fecha); bicisFecha.add(bici);bici=null;
		
		fecha=LocalDate.of(2020, 5, 3);
		bici=new Bicicleta(11,29,"Canondale",fecha); bicisFecha.add(bici);bici=null;
		
		//int x=bicisFecha.get(0).getFecha().compareTo(bicisFecha.get(1).getFecha());
		
		Collections.sort(bicisFecha,new ComparaFecha());
		for(Bicicleta bicicleta:bicisFecha)
			System.out.println(bicicleta);
		
		
	}

}
