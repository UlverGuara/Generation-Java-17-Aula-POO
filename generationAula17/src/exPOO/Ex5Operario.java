package exPOO;

/*5. Implemente a classe Operario como subclasse da classe Pessoa.
 Um determinado oper�rio tem como atributos da classe Pessoa e tamb�m os atributos pr�prios como
 valorProducao (que corresponde ao valor monet�rio dos artigos efetivamente produzidos pelo oper�rio)
 e comissao (que corresponde � porcentagem do valorProducao que ser� adicionado ao vencimento base do oper�rio).*/

public class Ex5Operario extends Ex1Pessoa {
	// Declara��o dos Atributos da classe.
	private double valorProducao;
	private double comissao;

	// M�todo Construtor.
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

	// Declara��o dos demais M�todos da Classe.
	public void imprimaInfo() {
		System.out.println("Nome: " + getNome() + ".");
		System.out.println("Endere�o: " + getEndereco() + ".");
		System.out.println("Telefone: " + getTelefone() + ".");
		System.out.println("Comida favorita: " + getComidaFavorita() + ".");
		System.out.println("N�mero da Sorte: " + getNumeroSorte() + ".");
		System.out.println("Valor da Produ��o: " + valorProducao + ".");
		System.out.println("Comiss�o: " + comissao + ".");
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
