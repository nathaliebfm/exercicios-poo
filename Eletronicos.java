package POOExercícios;

public class Eletronicos {
	
	private String modelo;
	private String processador;
	private int armazenamento;
	private int ano;
	private int preço;
	
	public Eletronicos (String modelo, String processador, int armazenamento, int ano, int preço) {
		
		this.modelo = modelo;
		this.processador = processador;
		this.armazenamento = armazenamento;
		this.ano = ano;
		this.preço = preço;
		
	}
	
	
	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public String getProcessador() {
		return processador;
	}



	public void setProcessador(String processador) {
		this.processador = processador;
	}



	public int getArmazenamento() {
		return armazenamento;
	}



	public void setArmazenamento(int armazenamento) {
		this.armazenamento = armazenamento;
	}



	public int getAno() {
		return ano;
	}



	public void setAno(int ano) {
		this.ano = ano;
	}



	public int getPreço() {
		return preço;
	}



	public void setPreço(int preço) {
		this.preço = preço;
	}



	public void imprimirDados() {
		System.out.print(modelo+" de "+armazenamento+"GB de armazenamento, lançado em "+ano+", tem um processador "+processador+" custando R$"+preço+" atualmente.");
	}
	

}
