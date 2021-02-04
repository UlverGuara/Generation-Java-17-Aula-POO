package exPOO;

/*5. Implemente a classe Operario como subclasse da classe Pessoa.
Um determinado operário tem como atributos da classe Pessoa e também os atributos próprios como
valorProducao (que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário)
e comissao (que corresponde à porcentagem do valorProducao que será adicionado ao vencimento base do operário).*/

public class Ex5Main {
	public static void main(String[] args) {
		// Instanciando um Objeto da Classe Ex5Operario.
		Ex5Operario operario = new Ex5Operario("Pessoal1", "Rua1", "9999-6666", "Paçocas", 10);
		operario.setValorProducao(1000);
		operario.setComissao(10);
		operario.caculaComissao();

		operario.imprimaInfo();

	}

}
