package exPOO;

/*2. Considere, como subclasse da classe Pessoa (desenvolvida no exerc�cio anterior) a classe Fornecedor.
Considere que cada inst�ncia da classe Fornecedor tem, para al�m dos atributos que caracterizam a classe Pessoa,
os atributos valorCredito (correspondente ao cr�dito m�ximo atribu�do ao fornecedor)
e valorDivida (montante da d�vida para com o fornecedor).
Implemente na classe Fornecedor, para al�m dos usuais m�todos seletores e modificadores, um m�todo obterSaldo()
que devolve a diferen�a entre os valores dos atributos valorCredito e valorDivida.
Depois de implementada a classe Fornecedor,
crie um programa de teste adequado que lhe permita verificar o funcionamento dos m�todos implementados na classe Fornecedor e os herdados da classe Pessoa.*/

public class Ex2Main {
	public static void main(String[] args) {
		// Instanciando um Objeto da Classe Ex2Fornecedor.
		Ex2Fornecedor fornecedor = new Ex2Fornecedor("Pessoal1", "Rua1", "9999-6666", "Pa�ocas", 10, 6000, 3000);
		Ex2Fornecedor fornecedor1 = new Ex2Fornecedor();
		Ex2Fornecedor fornecedor2 = new Ex2Fornecedor("rafa", "rua0101");
		fornecedor.setValorCredito(1000);
		fornecedor.setValorDivida(100);
		fornecedor.setObterSaldo(0);

		// fornecedor.imprimaInfo();

		fornecedor1.setNome("pedro");
		fornecedor2.setEndereco("ruarua");

		fornecedor.imprimaInfo();
		System.out.println(fornecedor1.getNome());
		System.out.println(fornecedor2.getEndereco());
		System.out.println(fornecedor2.getNome());
	}

}
