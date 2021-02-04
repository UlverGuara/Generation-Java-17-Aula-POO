package exPOO;

/*6. Implemente a classe Vendedor como subclasse da classe Pessoa.
Um determinado vendedor tem como atributos da classe Pessoa
e também os atributos próprios como valorVendas (correspondente ao valor monetário dos artigos vendidos)
e o atributo comissao (porcentagem do valorVendas que será adicionado ao vencimento base do Vendedor).*/

public class Ex6Vendedor extends Ex1Pessoa {
	// Declaração dos Atributos da classe.
	private double valorVendas;
	private double comissao;

	// Método Construtor.
	public Ex6Vendedor(String nome, String endereco, String telefone, String comidaFavorita, int numeroSorte, double valorVendas, double comissao) {
		super(nome, endereco, telefone, comidaFavorita, numeroSorte);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	
	public void caculaComissao() {
		double salario = 1000;
		double totalComissao =   (valorVendas * comissao / 100); 
		System.out.println("-----------------------------------------------");
		System.out.println("Valor total recebido: " + (salario + totalComissao) + ".");
		
	}

	// Declaração dos demais Métodos da Classe.
	public void imprimaInfo() {
		System.out.println("Nome: " + getNome() + ".");
		System.out.println("Endereço: " + getEndereco() + ".");
		System.out.println("Telefone: " + getTelefone() + ".");
		System.out.println("Comida favorita: " + getComidaFavorita() + ".");
		System.out.println("Número da Sorte: " + getNumeroSorte() + ".");
		System.out.println("Valor das vendas: " + valorVendas + ".");
		System.out.println("Comissão: " + comissao + ".");
		System.out.println("-----------------------------------------------");

	}

	

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

}
