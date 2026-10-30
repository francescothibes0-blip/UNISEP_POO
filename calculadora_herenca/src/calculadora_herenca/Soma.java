package calculadora_herenca;

public class Soma extends calculadora {

	public Soma(double valor1, double valor2) {
		super(valor1,valor2);
	}
	
	public void soma () {
		super.soma();
		
		double resultado = valor1 + valor2;
		
		System.out.println("RESOLTADO DO SOMA : " + resultado);
		
	}
	
}
