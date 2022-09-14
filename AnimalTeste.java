package POOExercícios;

public class AnimalTeste {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro ("Spot", 5, "Au Au", 65);
		Cavalo horse = new Cavalo ("Lady", 2, "Ihhhh", 88);
		Preguica sloth = new Preguica ("Slow", 6, "Ahhhh Ahhh", 120);
		
		dog.imprimirCachorro();
		dog.emitirLatido();
		dog.correDog();
		horse.imprimirCavalo();
		horse.emitirRelinche();
		horse.correHorse();
		sloth.imprimirPreguica();
		sloth.emitirSom();
		sloth.sobeSloth();

	}

}
