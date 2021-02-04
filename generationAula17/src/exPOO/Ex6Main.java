package exPOO;

/*6. Implemente a classe Vendedor como subclasse da classe Pessoa.
Um determinado vendedor tem como atributos da classe Pessoa
e também os atributos próprios como valorVendas (correspondente ao valor monetário dos artigos vendidos)
e o atributo comissao (porcentagem do valorVendas que será adicionado ao vencimento base do Vendedor).*/

public class Ex6Main {
	public static void main(String[] args) {
		// Instanciando um Objeto da Classe Ex6Vendedor.
		Ex6Vendedor vendedor = new Ex6Vendedor("Pessoal1", "Rua1", "9999-6666", "Paçocas", 10, 500, 10);
		
		vendedor.caculaComissao();

		vendedor.imprimaInfo();

	}

}
