package banco;

public class Cuenta {

	private String titular;
	private String numero;
	private double saldo;
	
	
	/*
	 * No tiene sentido
	 * 
	public Cuenta() {
		
		titular = "";
		saldo = 0;
		numero = 0;
	}
	
	*/
	
	
	public Cuenta(	String titular,
					String numero,
					double saldo) {
		
		// asigno a cada atributo su valor
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	
	
	public Cuenta(Cuenta otraCuenta) {
		
		titular = otraCuenta.titular;
		numero = generarNumeroCuenta();
		saldo = 0;
	}
	
	
	
	
	private String generarNumeroCuenta() {
		
		String numeroCuenta = "";
		
		/*
		 * 
		 * hacer cosas
		 * 
		 */
		
		return numeroCuenta;
	}



	/*
	 * 
	 * SETTERS Y GETTERS
	 * 
	 */
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	/*
	 * 
	 * OPERACIONES
	 * 
	 */
	
	public void ingreso(double dinero) {
		
		saldo += dinero;
	}

	
	public void reintegro(double dinero) {
		
		saldo -= dinero;
	}
	
	
	public void transferencia(Cuenta destino,double cantidad) {
		
		this.saldo -= cantidad;
		destino.saldo += cantidad;
	}
	
	
	
	
	
	

	@Override
	public String toString() {
		
		return titular +" ["+saldo+"] "+numero;
		//return "Cuenta [titular=" + titular + ", numero=" + numero + ", saldo=" + saldo + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
