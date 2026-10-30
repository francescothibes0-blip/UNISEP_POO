package calculadora_herenca;

public class multiplicacao extends calculadora {
	
	public multiplicacao (double valor1, double valor2) {
		super(valor1,valor2);
		}
	
	public void multiplicacao() {
		
		super.multiplicacao();
		
		double resultado = valor1 * valor2;
		
		System.out.println("RESOLTADO DO SOMA : " + resultado);
		
	}
	

}
