package POOExercícios;

public class eletronicosTeste {

	public static void main(String[] args) {
		
		Eletronicos apple = new Eletronicos ("iPhone 13 Pro Max", "A15", 128, 2021, 6699);
		Eletronicos samsung = new Eletronicos ("Galaxy S22 Ultra", "Snapdragon 8", 256, 2022, 7599);
		
		System.out.println("\n\nPrimeiro aparelho: ");
		apple.imprimirDados();
		System.out.println("\n\nSegundo aparelho: ");
		samsung.imprimirDados();
		System.out.println("\n\nQual você prefere? ");
	}

}
