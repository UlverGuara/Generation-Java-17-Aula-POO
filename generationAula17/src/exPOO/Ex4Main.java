package exPOO;

/*4. Implemente a classe Administrador como subclasse da classe pessoa.
Um determinado administrador tem como atributos da classe Pessoa e também os atributos próprios como ajudaDeCusto
(ajudas referentes a viagens, estadias).*/

public class Ex4Main {
	public static void main(String[] args) {
		// Instanciando um Objeto da Classe Ex4Administrador.
		Ex4Administrador administrador = new Ex4Administrador("Pessoal1", "Rua1", "9999-6666", "Paçocas", 10, 1000);
		//administrador.setAjudaDeCusto(2000);

		administrador.imprimaInfo();

	}

}
