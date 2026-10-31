
public class FuncionarioPJ extends Funncioario{
	 
	
	double salarioFinal;
	public FuncionarioPJ (String nome, double salarioBase) {
		super (nome, salarioBase);
	}
	public void calcularSalario() {
		salarioFinal = salarioBase - (salarioBase * 0.08);
	}
	public void exibirSalario() {
		super.exibirSalario();
		System.out.println("salario final: "+salarioFinal);
	}
	
}

