package exPOO;

/*4. Implemente a classe Administrador como subclasse da classe pessoa.
Um determinado administrador tem como atributos da classe Pessoa e também os atributos próprios como ajudaDeCusto
(ajudas referentes a viagens, estadias).*/


public class Ex4Administrador extends Ex1Pessoa {
	// Declaração dos Atributos da classe.
		private float ajudaDeCusto;
		
		// Método Construtor.
		public Ex4Administrador(String nome, String endereco, String telefone, String comidaFavorita, int numeroSorte, float ajudaDeCusto) {
			super(nome, endereco, telefone, comidaFavorita, numeroSorte);
			this.ajudaDeCusto = ajudaDeCusto;
		}
		
		// Declaração dos demais Métodos da Classe.
		public void imprimaInfo() {
			System.out.println("-----------------------------------------------");
			System.out.println("Nome: " + getNome() + ".");
			System.out.println("Endereço: " + getEndereco() + ".");
			System.out.println("Telefone: " + getTelefone() + ".");
			System.out.println("Comida favorita: " + getComidaFavorita() + ".");
			System.out.println("Número da Sorte: " + getNumeroSorte() + ".");
			System.out.println("Ajuda: " + ajudaDeCusto + ".");
			System.out.println("-----------------------------------------------");
		}

		public float getAjudaDeCusto() {
			return ajudaDeCusto;
		}

		public void setAjudaDeCusto(float ajudaDeCusto) {
			this.ajudaDeCusto = ajudaDeCusto;
		}

}
