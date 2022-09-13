package POOExercícios;

public class Conta {
	
	private String nomeCliente;
	private String nivel;
	private int saldo;
	
	public Conta(String nomeCliente, String nivel, int saldo) {
		
		this.nomeCliente = nomeCliente;
		this.nivel = nivel;
		this.saldo = saldo;
		
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public void imprimirInfo() {
		System.out.println("\n**********Banco Dev - Dados do cliente**********");
		System.out.println("\nO cliente "+nomeCliente+" de status "+nivel+" possui um saldo de R$"+saldo+" em sua conta bancária.");
		
	}
	

}
