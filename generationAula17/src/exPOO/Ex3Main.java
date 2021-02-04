package exPOO;

/*3. Considere, como subclasse da classe Pessoa, a classe Empregado.
Considere que cada instância da classe Empregado tem, para além dos atributos que caracterizam a classe Pessoa,
os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem retida dos impostos).
Implemente a classe Empregado com métodos seletores e modificadores e um método calcularSalario.
Escreva um programa de teste adequado para a classe Empregado.*/

public class Ex3Main {
	public static void main(String[] args) {
		// Instanciando um Objeto da Classe Ex3Empregado.
		Ex3Empregado empregado = new Ex3Empregado("Pessoal1", "Rua1", "9999-6666", "Paçocas", 10, 900, 1000, 10);
		empregado.setCodigoSetor(101);
		//empregado.setSalarioBase(600);
		//empregado.setImposto(100);
		//empregado.caculaComissao();
		System.out.println(empregado.getImposto());
		System.out.println(empregado.getSalarioBase());
		empregado.caculaComissao();

		empregado.imprimaInfo();

	}

}
