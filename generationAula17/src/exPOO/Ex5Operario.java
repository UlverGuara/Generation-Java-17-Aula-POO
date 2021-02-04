package exPOO;

/*5. Implemente a classe Operario como subclasse da classe Pessoa.
 Um determinado operário tem como atributos da classe Pessoa e também os atributos próprios como
 valorProducao (que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário)
 e comissao (que corresponde à porcentagem do valorProducao que será adicionado ao vencimento base do operário).*/

public class Ex5Operario extends Ex1Pessoa {
	// Declaração dos Atributos da classe.
	private double valorProducao;
	private double comissao;

	// Método Construtor.
	public Ex5Operario(String nome, String endereco, String telefone, String comidaFavorita, int numeroSorte) {
		super(nome, endereco, telefone, comidaFavorita, numeroSorte);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public void caculaComissao() {
		double totalComissao = valorProducao + ((valorProducao * comissao) / 100);
		System.out.println("-----------------------------------------------");
		System.out.println("Valor total recebido: " + totalComissao + ".");
	}

	// Declaração dos demais Métodos da Classe.
	public void imprimaInfo() {
		System.out.println("Nome: " + getNome() + ".");
		System.out.println("Endereço: " + getEndereco() + ".");
		System.out.println("Telefone: " + getTelefone() + ".");
		System.out.println("Comida favorita: " + getComidaFavorita() + ".");
		System.out.println("Número da Sorte: " + getNumeroSorte() + ".");
		System.out.println("Valor da Produção: " + valorProducao + ".");
		System.out.println("Comissão: " + comissao + ".");
		System.out.println("-----------------------------------------------");
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

}
