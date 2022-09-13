package POOExercícios;

public class contaTeste {

	public static void main(String[] args) {
		
		Conta cliente1 = new Conta ("Tício", "Varejo", 5000);
		Conta cliente2 = new Conta ("Mévio", "Black", 80000);
		Conta cliente3 = new Conta ("Maria", "Platinum", 25000);
		
		cliente1.imprimirInfo();
		cliente2.imprimirInfo();
		cliente3.imprimirInfo();

	}

}
