package exPOO;

/*1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores (getters) e modificadores (setters),
e ainda o construtor padrão e pelo menos mais duas opções de construtores conforme sua percepção.
Atributos: String nome; String endereço; String telefone;*/

public class Ex1Pessoa {
	// Declaração dos Atributos da classe.
	private String nome;
	private String endereco;
	private String telefone;
	private String comidaFavorita;
	private int numeroSorte;

	// Método Construtor.
	public Ex1Pessoa(String nome, String endereco, String telefone, String comidaFavorita, int numeroSorte) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.comidaFavorita = comidaFavorita;
		this.numeroSorte = numeroSorte;
	}
	
	public Ex1Pessoa(String nome, String endereco) 
	{
		
	}
	public Ex1Pessoa() 
	{
		
	}

	// Declaração dos demais Métodos da Classe.
	public void imprimaInfo() {
		System.out.println("-----------------------------------------------");
		System.out.println("Nome: " + nome + ".");
		System.out.println("Endereço: " + endereco + ".");
		System.out.println("Telefone: " + telefone + ".");
		System.out.println("Comida favorita: " + comidaFavorita + ".");
		System.out.println("Número da Sorte: " + numeroSorte + ".");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getComidaFavorita() {
		return comidaFavorita;
	}

	public void setComidaFavorita(String comidaFavorita) {
		this.comidaFavorita = comidaFavorita;
	}

	public int getNumeroSorte() {
		return numeroSorte;
	}

	public void setNumeroSorte(int numeroSorte) {
		this.numeroSorte = numeroSorte;
	}

}
