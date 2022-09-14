package POOExercícios;

public class Preguica extends Animal {
	
	private int subidaPreguica;
	
	public Preguica (String nome, int idade, String som, int subidaPreguica) {
		super(nome, idade, som);
		this.subidaPreguica = subidaPreguica;
		
	}

	public int getSubidaPreguica() {
		return subidaPreguica;
	}

	public void setSubidaPreguica(int subidaPreguica) {
		this.subidaPreguica = subidaPreguica;
	}
	
	public void imprimirPreguica() {
		System.out.println("\nO(A) bicho(a) preguiça "+getNome()+" tem "+getIdade()+" anos de idade, sobe em média "+subidaPreguica+
				" metros de árvore por hora, e emite o seguinte som: "+getSom());
		
	}

}