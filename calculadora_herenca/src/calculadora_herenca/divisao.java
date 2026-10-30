package calculadora_herenca;

public class divisao extends calculadora {

		public divisao (double valor1, double valor2) {
			super(valor1,valor2);}
		
		public void divisao() {
			
			super.divisao();
			
			double resultado = valor1 / valor2;
			
			System.out.println("RESOLTADO DO SOMA : " + resultado);
			
}
}
