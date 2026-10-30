package ex_6;

public class Pais {

	private String nome;
	private String codigo;
	private int populacao;
	private double dimensao;

	// construtores
	Pais(String codigo, String nome, double dimensao) {
		this.codigo = codigo;
		this.nome = nome;
		this.dimensao = 8515767.049;
	}

	// Metodos
	public void listarPais() {
		System.out.println("Nome" + this.nome);

		System.out.println("Codigo:" + this.codigo);

		System.out.println("População" + this.populacao);

		System.out.println("Dimensao:" + this.dimensao);

		System.out.println();
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getPopulacao() {
		return this.populacao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}
	
	public duble setDimensao() {
		return this.dimensao;
		
	}
	public void setDimensao() {
		this.dimensao = dimensao;
	}

}
