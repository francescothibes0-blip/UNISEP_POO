package ex_01;

public class contador {

	private int contador = 0;

	public void Zerar() {
		this.contador = 0;

	}

	public void Incrementar() {
//		this.contador = this.contador + 1;
		this.contador++;
	}

	public int RotornarValorContador() {
		
		return this.contador;
	}
	
}
