package es.marcos.banco;

public class Start {

	public static void main(String[] args) {


		Cuenta cuentaMarcos = new Cuenta("Marcos Fernandez",41.5);
		cuentaMarcos.imprimir();
		
		double saldoNuevo = cuentaMarcos.ingresoReintegro(1000);
		cuentaMarcos.imprimir();
		cuentaMarcos.ingresoReintegro(-200);
		cuentaMarcos.imprimir();
		
		System.out.println("-------------------------------");
		
		Cuenta david = new Cuenta("David Martinez",1000);
		cuentaMarcos.transferencia(5000, david);
		
		cuentaMarcos.imprimir();
		david.imprimir();
	
		
		
	}

}
