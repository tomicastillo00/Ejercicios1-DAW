package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import excepciones.CamposVaciosException;
import excepciones.CuentaMalException;

public class CuentaBancaria implements Comparable<CuentaBancaria>{

	//Atributos
	private String numCuenta ;
	private String dni;
	private String titular;
	private double saldo;
	private LocalDate fechaAlta;
	private boolean bloqueada;
	
	
	
	public CuentaBancaria(String numCuenta, String dni, String titular, String saldo, String fechaAlta,
			String bloqueada) throws CamposVaciosException , DateTimeParseException, CuentaMalException{
		this.setNumCuenta(numCuenta);
		this.setDni(dni);
		this.setTitular(titular);
		this.setSaldo(saldo);
		this.setFechaAlta(fechaAlta);
		this.setBloqueada(bloqueada);
	}


	public String getNumCuenta() {
		return numCuenta;
	}


	public void setNumCuenta(String numCuenta) throws CamposVaciosException, CuentaMalException {
		if(numCuenta.equals("")) {
			throw new CamposVaciosException();
		}
		else {
			if(compruebaCuenta(numCuenta))
		this.numCuenta = numCuenta;
			else
				throw new CuentaMalException();
		}
	}


	private boolean compruebaCuenta(String numCuenta2) {
		// TODO Auto-generated method stub
		
		return false;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(String saldo) throws CamposVaciosException {
		if(saldo.equals(""))
			throw new CamposVaciosException();
		else
		this.saldo = Double.parseDouble(saldo);
	}


	public LocalDate getFechaAlta() {
		return fechaAlta;
	}


	public void setFechaAlta(String fechaAlta) throws CamposVaciosException,DateTimeParseException {
		if(fechaAlta.equals(fechaAlta))
			throw new CamposVaciosException();
		else
		this.fechaAlta = LocalDate.parse(fechaAlta);
	}


	public boolean isBloqueada() {
		return bloqueada;
	}


	public void setBloqueada(String bloqueada) throws CamposVaciosException {
		if(bloqueada.equals(""))
				throw new CamposVaciosException();
		else
		this.bloqueada = Boolean.parseBoolean(bloqueada);
	}


	public CuentaBancaria() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public int compareTo(CuentaBancaria o) {
		// TODO Auto-generated method stub
		return numCuenta.compareTo(o.getNumCuenta());
	}

}
