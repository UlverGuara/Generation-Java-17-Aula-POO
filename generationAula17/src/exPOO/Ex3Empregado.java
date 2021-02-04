package exPOO;

/*3. Considere, como subclasse da classe Pessoa, a classe Empregado.
Considere que cada instância da classe Empregado tem, para além dos atributos que caracterizam a classe Pessoa,
os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem retida dos impostos).
Implemente a classe Empregado com métodos seletores e modificadores e um método calcularSalario.
Escreva um programa de teste adequado para a classe Empregado.*/

public class Ex3Empregado extends Ex1Pessoa {
	// Declaração dos Atributos da classe.
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	private double salario = 0;

	// Método Construtor.
	public Ex3Empregado(String nome, String endereco, String telefone, String comidaFavorita, int numeroSorte, int codigoSetor, double salarioBase, double imposto) {
		super(nome, endereco, telefone, comidaFavorita, numeroSorte);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	public void caculaComissao() {
		double imposto1 = (salarioBase * imposto ) / 100; 
		salarioBase = salarioBase - imposto1;
		System.out.println("-----------------------------------------------");
		System.out.println("Valor total recebido: " + salarioBase + ".");
	}

	// Declaração dos demais Métodos da Classe.
	public void imprimaInfo() {
		System.out.println("Nome: " + getNome() + ".");
		System.out.println("Endereço: " + getEndereco() + ".");
		System.out.println("Telefone: " + getTelefone() + ".");
		System.out.println("Comida favorita: " + getComidaFavorita() + ".");
		System.out.println("Número da Sorte: " + getNumeroSorte() + ".");
		System.out.println("Setor: " + codigoSetor + ".");
		System.out.println("Base Salário: " + salarioBase + ".");
		System.out.println("Imposto: " + imposto + ".");
		System.out.println("-----------------------------------------------");
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}


}
