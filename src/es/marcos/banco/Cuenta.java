package es.marcos.banco;

public class Cuenta {

	private String titular;
	private String numeroCuenta;
	private double saldo; 
	private String pin;
	
	
	public Cuenta(String titular,double saldo) {
		
		this.titular = titular;
		//this.numeroCuenta = se autogenera??????????????
		this.saldo = saldo;
		//this.pin = se autogenera??????????????
	}
	
	
	/**
	 * Ingreso o reitegro de dinero en una cuenta, 
	 * actualizando el saldo con la cantidad
	 * que aportamos.
	 * 
	 * @param cantidad importe a ingresar en la cuenta, positivo a ingresar
	 * y negativo a reintegrar
	 * @return nuevo saldo actualizado
	 */
	public double ingresoReintegro(double cantidad) {
		
		saldo += cantidad;	
		return saldo;
	}

	
	/**
	 * Este metodo usa dos cuentas para hacer la transferencia
	 * La primera es this, que es quien llama a la operación y recibe el dinero
	 * La segunda es cuentaDeudora, que es quien pierde el dinero
	 * @param cantidad Dimero a transferir
	 * @param cuentaDeudora La cuenta de la que se va a quitar el dinero.
	 */
	public void transferencia(double cantidad,Cuenta cuentaDeudora) {
		
		
		if(cuentaDeudora.saldo>=cantidad) {
		
			saldo += cantidad;
			cuentaDeudora.saldo -= cantidad;
		}
		else {
			
			saldo += cuentaDeudora.saldo;
			cuentaDeudora.saldo = 0;
		}
		
	}
	
	
	
	/*
	 * metodo que imprime los atributos de un objeto
	 */
	public void imprimir() {
		
		System.out.println("titular: "+titular);
		System.out.println("numero cuenta: "+numeroCuenta);
		System.out.println("saldo: "+saldo);
		System.out.println("pin: "+pin);
	}
	
	
	
	/*
	 * Estos son los setters
	 * Hemos pensado que no hace falta el del numero de cuenta 
	 * porque no va a cambiar
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	
	/*
	 * Estos son lo getters
	 */
	public String getTitular() {
		return titular;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public String getPin() {
		return pin;
	}

}
