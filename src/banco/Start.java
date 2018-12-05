package banco;


public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cuenta bbva = new Cuenta("Marcos",
						"20380023002345670000",
						2000);
		System.out.println(bbva);
		
		
		Cuenta  santander = new Cuenta("Maria",
				"10500023002345670000",
				5000);
		System.out.println(santander);
		

		System.out.println("-----------------------");
		
		
		bbva.transferencia(santander, 150);
		System.out.println(bbva);
		System.out.println(santander);
		
		
		
	}

}
