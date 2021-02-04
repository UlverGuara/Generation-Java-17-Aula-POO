package exPOO;

/*6. Implemente a classe Vendedor como subclasse da classe Pessoa.
Um determinado vendedor tem como atributos da classe Pessoa
e tamb�m os atributos pr�prios como valorVendas (correspondente ao valor monet�rio dos artigos vendidos)
e o atributo comissao (porcentagem do valorVendas que ser� adicionado ao vencimento base do Vendedor).*/

public class Ex6Vendedor extends Ex1Pessoa {
	// Declara��o dos Atributos da classe.
	private double valorVendas;
	private double comissao;

	// M�todo Construtor.
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

	// Declara��o dos demais M�todos da Classe.
	public void imprimaInfo() {
		System.out.println("Nome: " + getNome() + ".");
		System.out.println("Endere�o: " + getEndereco() + ".");
		System.out.println("Telefone: " + getTelefone() + ".");
		System.out.println("Comida favorita: " + getComidaFavorita() + ".");
		System.out.println("N�mero da Sorte: " + getNumeroSorte() + ".");
		System.out.println("Valor das vendas: " + valorVendas + ".");
		System.out.println("Comiss�o: " + comissao + ".");
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
