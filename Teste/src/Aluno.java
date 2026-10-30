
public class Aluno {

	//atributos
	String nome;
	String ra;
	float valor_mensalidade;
	
	//construtores
	public Aluno(){
	this.nome = "Nome podre";
	this.ra = "não tem esse caco";
	this.valor_mensalidade = 0;
	}
	
	public Aluno(String nome, String ra, float valor_mensalidade) {
		this.nome = nome;
		this.ra = ra;
		this.valor_mensalidade = valor_mensalidade;
	}
	
	
	
	//metodos
	public void imprimi_aluno() {
		System.out.println("-------------------------");
		System.out.println("nome do aluno: " + this.nome );  
		System.out.println("Ra aluno: " + this.ra );
		System.out.println("mensalidade do aluno: " + this.valor_mensalidade);
		
	}
	}

