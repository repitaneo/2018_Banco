package banco;


public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cuenta unaCuenta = new Cuenta("Marcos",
						"20480023002345670000",
						20);
		System.out.println(unaCuenta);
		
		unaCuenta.ingreso(3);
		System.out.println(unaCuenta);
		
		unaCuenta.reintegro(34);
		System.out.println(unaCuenta);
		
						
	}

}
