package Atividade_Apresentar;

public class Main {
	
    public static void main(String[] args) {
        
        Adega minhaAdega = new Adega(
            "jack de maça verde", 
            "Agusto jangunço", 
            "Adega e Distribuidora Central", 
            "12.345.678/0001-99", 
            "Pepezel"
        );

        minhaAdega.exibirInformacoesEmpresa();
        
        minhaAdega.cadastrarFornecedor("Francesco do Corte");
        
        minhaAdega.aplicarCupomDesconto(15.50);
        
        minhaAdega.vender("jack de maça verde", 3, 15.50, true, 5.00);
    }
}