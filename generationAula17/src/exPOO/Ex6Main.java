package exPOO;

/*6. Implemente a classe Vendedor como subclasse da classe Pessoa.
Um determinado vendedor tem como atributos da classe Pessoa
e tamb�m os atributos pr�prios como valorVendas (correspondente ao valor monet�rio dos artigos vendidos)
e o atributo comissao (porcentagem do valorVendas que ser� adicionado ao vencimento base do Vendedor).*/

public class Ex6Main {
	public static void main(String[] args) {
		// Instanciando um Objeto da Classe Ex6Vendedor.
		Ex6Vendedor vendedor = new Ex6Vendedor("Pessoal1", "Rua1", "9999-6666", "Pa�ocas", 10, 500, 10);
		
		vendedor.caculaComissao();

		vendedor.imprimaInfo();

	}

}
