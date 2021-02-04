package exPOO;

/*2. Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior) a classe Fornecedor.
Considere que cada instância da classe Fornecedor tem, para além dos atributos que caracterizam a classe Pessoa,
os atributos valorCredito (correspondente ao crédito máximo atribuído ao fornecedor)
e valorDivida (montante da dívida para com o fornecedor).
Implemente na classe Fornecedor, para além dos usuais métodos seletores e modificadores, um método obterSaldo()
que devolve a diferença entre os valores dos atributos valorCredito e valorDivida.
Depois de implementada a classe Fornecedor,
crie um programa de teste adequado que lhe permita verificar o funcionamento dos métodos implementados na classe Fornecedor e os herdados da classe Pessoa.*/

public class Ex2Fornecedor extends Ex1Pessoa {
	// Declaração dos Atributos da classe.
	private float valorCredito;
	private float valorDivida;
	private float obterSaldo;

	// Método Construtor.
	public Ex2Fornecedor(String nome, String endereco, String telefone, String comidaFavorita, int numeroSorte, float valorCredito, float valorDivida) {
		super(nome, endereco, telefone, comidaFavorita, numeroSorte);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		this.obterSaldo = obterSaldo;
	}

	public Ex2Fornecedor() {

	}

	public Ex2Fornecedor(String nome, String endereco) {

	}

	public void caculaSaldo() // Calculo do Saldo
	{
		double TotalSaldo = valorCredito - valorDivida;
	}

	// Declaração dos demais Métodos da Classe.
	public void imprimaInfo() {
		System.out.println("-----------------------------------------------");
		System.out.println("Nome: " + getNome() + ".");
		System.out.println("Endereço: " + getEndereco() + ".");
		System.out.println("Telefone: " + getTelefone() + ".");
		System.out.println("Comida favorita: " + getComidaFavorita() + ".");
		System.out.println("Número da Sorte: " + getNumeroSorte() + ".");
		System.out.println("Credito: " + valorCredito + ".");
		System.out.println("Divida: " + valorDivida + ".");
		System.out.println("Saldo: " + obterSaldo + ".");
		System.out.println("-----------------------------------------------");
	}

	public float getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}

	public float getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}

	public float getObterSaldo() {
		return obterSaldo;
	}

	public void setObterSaldo(float obterSaldo) {
		this.obterSaldo = obterSaldo;
	}

}
