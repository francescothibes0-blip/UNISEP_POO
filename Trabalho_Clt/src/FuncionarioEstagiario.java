
public class FuncionarioEstagiario extends Funncioario {
	double salarioFinal;
	
	public FuncionarioEstagiario (String nome, double salarioBase) {
		super (nome, salarioBase);
		
	}
	public void calcularSalario() {
		salarioFinal = salarioBase - (salarioBase * 0.08);
		
	}
	public void exibirSalario() {
		super.exibirSalario();
		System.out.println("salalrio final: R$" + salarioFinal);
	}
	
}
