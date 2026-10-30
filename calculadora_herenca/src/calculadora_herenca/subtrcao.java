package calculadora_herenca;

public class subtrcao extends calculadora{
	
	public subtrcao (double valor1, double valor2) {
		super(valor1,valor2);}
	
	public void subtrcao() {
		
		super.subtracao();
		
		double resultado = valor1 - valor2;
		
		System.out.println("RESOLTADO DO SOMA : " + resultado);
		
	}
	

}
