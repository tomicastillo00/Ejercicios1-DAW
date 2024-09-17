package modelo;

import java.time.LocalDate;

import excepciones.CamposVaciosException;
import excepciones.CuentaException;
import excepciones.DNIException;

public class CuentaCorriente {

	//Atributos
	private String numCuenta;
	private String dni;
	private String titular;
	private Double saldo;
	private LocalDate fechaAlta;
	private Boolean bloqueada;
	
	
	
	
	public CuentaCorriente(String numCuenta, String dni, String titular, String saldo, String fechaAlta,
			String bloqueada) throws CamposVaciosException, CuentaException, DNIException {
		this.setNumCuenta(numCuenta);
		this.setDni(dni);
		this.setTitular(titular);
		this.setSaldo(saldo);
		this.setFechaAlta(fechaAlta);
		this.setBloqueada(bloqueada);
	}

	public CuentaCorriente() {
		// TODO Auto-generated constructor stub
	}
	
	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) throws CamposVaciosException, CuentaException {
		if(numCuenta.equals("")) {
			throw new CamposVaciosException();
		}
		else {
			if(compruebaCuenta(numCuenta))
		this.numCuenta = numCuenta;
			else
				throw new CuentaException();
		}
	}

	private boolean compruebaCuenta(String numCuenta) {
		// TODO Auto-generated method stub
		
		return false;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) throws CamposVaciosException, DNIException {
		if(dni.equals("")) {
			throw new CamposVaciosException();
		}
		else {
			if(compruebaDNI(dni))
		this.dni = dni;
			else
				throw new DNIException();
		}
	}

	private boolean compruebaDNI(String dni) {
		// TODO Auto-generated method stub
		String letra1="";//inicializa variable auxiliar de la letra
		String num=dni.substring(0, 8);//extraemos los numeros del dni
		String letra=dni.substring(8);//extraemos la letra
		boolean esValido=false;//inicializamos la variable boleana que es la que posteriormente nos devolvera
		int num1=Integer.parseInt(num);//pasamos la cadena "num" a entero para poder procesarla
		int resto=num1%23;//comprobamos el resto de la variable numerica dividiendolo entre 23
		switch (resto) {//segun el resto de la division correspondera una letra o otra
		case 0:
			letra1="T";
			break;
		case 1:
			letra1="R";
			break;
		case 2:
			letra1="W";
			break;
		case 3:
			letra1="A";
			break;
		case 4:
			letra1="G";
			break;
		case 5:
			letra1="M";
			break;
		case 6:
			letra1="Y";
			break;
		case 7:
			letra1="F";
			break;
		case 8:
			letra1="P";
			break;
		case 9:
			letra1="D";
			break;
		case 10:
			letra1="X";
			break;
		case 11:
			letra1="B";
			break;
		case 12:
			letra1="N";
			break;
		case 13:
			letra1="J";
			break;
		case 14:
			letra1="Z";
			break;
		case 15:
			letra1="S";
			break;
		case 16:
			letra1="Q";
			break;
		case 17:
			letra1="V";
			break;
		case 18:
			letra1="H";
			break;
		case 19:
			letra1="L";
			break;
		case 20:
			letra1="C";
			break;
		case 21:
			letra1="K";
			break;
		case 22:
			letra1="E";
			break;
		default:
			break;
		}
		if(letra.equals(letra1))//finalmente comprobara si la letra es la que corresponde y nos dira si es valido o no
			esValido=true;
		
		return esValido;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) throws CamposVaciosException {
		if(titular.equals(""))
			throw new CamposVaciosException();
		else
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(String saldo) throws CamposVaciosException {
		if(saldo.equals("")) {
			throw new CamposVaciosException();
		}
		else {
		this.saldo = Double.parseDouble(saldo);
		}
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) throws CamposVaciosException {
		if(fechaAlta.equals(""))
			throw new CamposVaciosException();
		else
		this.fechaAlta = LocalDate.parse(fechaAlta);
	}

	public Boolean getBloqueada() {
		return bloqueada;
	}

	public void setBloqueada(String bloqueada) throws CamposVaciosException {
		if(bloqueada.equals(""))
			throw new CamposVaciosException();
		else
		this.bloqueada = Boolean.parseBoolean(bloqueada);
	}

	
}
