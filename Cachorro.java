package POOExercícios;

public class Cachorro extends Animal {
	
	private int velocidadeCachorro;
	
	public Cachorro (String nome, int idade, String som, int velocidadeCachorro) {
		super(nome, idade, som);
		this.velocidadeCachorro = velocidadeCachorro;
		
	}

	public int getVelocidadeCachorro() {
		return velocidadeCachorro;
	}

	public void setVelocidadeCachorro(int velocidadeCachorro) {
		this.velocidadeCachorro = velocidadeCachorro;
	}
	
	public void imprimirCachorro() {
		System.out.println("\nO(A) cachorro(a) "+getNome()+" tem "+getIdade()+" anos de idade, corre a uma velocidade média de "+velocidadeCachorro+
				"km por hora, e emite o seguinte som: "+getSom());
	}
	
	public void emitirLatido() {
		System.out.println("\nAU AUUUUUU");
	}
	
	public void correDog() {
		System.out.println("\nDisse ele correndo em sua direção!!!!");
	}

}
