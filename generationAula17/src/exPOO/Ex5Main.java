package exPOO;

/*5. Implemente a classe Operario como subclasse da classe Pessoa.
Um determinado oper�rio tem como atributos da classe Pessoa e tamb�m os atributos pr�prios como
valorProducao (que corresponde ao valor monet�rio dos artigos efetivamente produzidos pelo oper�rio)
e comissao (que corresponde � porcentagem do valorProducao que ser� adicionado ao vencimento base do oper�rio).*/

public class Ex5Main {
	public static void main(String[] args) {
		// Instanciando um Objeto da Classe Ex5Operario.
		Ex5Operario operario = new Ex5Operario("Pessoal1", "Rua1", "9999-6666", "Pa�ocas", 10);
		operario.setValorProducao(1000);
		operario.setComissao(10);
		operario.caculaComissao();

		operario.imprimaInfo();

	}

}
