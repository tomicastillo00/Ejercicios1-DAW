package modelo;

import java.time.LocalDate;

public class Bicicleta implements Comparable<Bicicleta>{

	
	private int id;
	private String marca;
	private LocalDate fecha;
	private int numMarchas;
	private int diametroRueda;
	private int velocidad;

	
	
	//Variable estatica
	//Compartida para todas las instancias
	private static int numeroDeBicicletas=0;


	public static int getNumeroDeBicicletas() {
		//No podemos usar this
		//return this.numeroDeBicicletas;
		return numeroDeBicicletas;
	}

	
	public Bicicleta(int numMarchas,int diametroRueda,int velocidad) {
		this.numMarchas = numMarchas;
		this.diametroRueda = diametroRueda;
		this.velocidad = velocidad; 
		id= ++numeroDeBicicletas;
	}
	public Bicicleta(int numMarchas,int diametroRueda) {
		this.numMarchas = numMarchas;
		this.diametroRueda = diametroRueda;
		id= ++numeroDeBicicletas;
	}


	public Bicicleta(int numMarchas, int diametroRueda, String marca) {
		this.numMarchas=numMarchas;
		this.diametroRueda=diametroRueda;
		this.marca=marca;
	}


	public Bicicleta(int numMarchas,int diametroRueda ,String marca, LocalDate fecha ) {
		this.marca = marca;
		this.fecha = fecha;
		this.numMarchas = numMarchas;
		this.diametroRueda = diametroRueda;
	}


	public int getNumMarchas() {
		return numMarchas;
	}


	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}


	public int getDiametroRueda() {
		return diametroRueda;
	}


	public void setDiametroRueda(int diametroRueda) {
		this.diametroRueda = diametroRueda;
	}


	public int getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public static void setNumeroDeBicicletas(int numeroDeBicicletas) {
		Bicicleta.numeroDeBicicletas = numeroDeBicicletas;
	}


	@Override
	public String toString() {
		return "Bicicleta [numMarchas=" + numMarchas + ", diametroRueda=" + diametroRueda + ", velocidad=" + velocidad
				+ ", id=" + id + "]";
	}


	@Override
	public int compareTo(Bicicleta o) {
		// TODO Auto-generated method stub
		//Generamos este metodo con la interfaz Comparable
		
		//Comparamos la marca del objeto instanciado(This) con la marca del siguiente(o)
		return this.getMarca().compareTo(o.getMarca());
		
		//Si queremos comparar por el diametro de la rueda
		
		/*if(this.getDiametroRueda()>o.getDiametroRueda())return 1;
		else if(this.getDiametroRueda()<o.getDiametroRueda())return -1;
		else return 0;*/
		
		//return this.getDiametroRueda()-o.getDiametroRueda();
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	
	
	
	
}
