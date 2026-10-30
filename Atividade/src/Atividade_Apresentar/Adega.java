package Atividade_Apresentar;


public class Adega {
    String nomeMercadoria;
    double qtd; 
    String nomeFornecedor; 
    String nomeCliente; 
    String nomeFuncionario;
    Boolean comissao;
    double desconto;
    int numeroNota;
    String nomeEmpresa;
    String cnpjEmpresa;

    public Adega(String nomeMercadoria, String nomeFuncionario, String nomeEmpresa, String cnpjEmpresa, String nomeCliente) {
        this.nomeMercadoria = nomeMercadoria;
        this.nomeFuncionario = nomeFuncionario;
        this.nomeEmpresa = nomeEmpresa;
        this.cnpjEmpresa = cnpjEmpresa;
        this.nomeCliente = nomeCliente;
        this.numeroNota = 1;
        this.comissao = false;
        this.desconto = 0.0;
        this.qtd = 0.0;
    }

    public String getNomeMercadoria() {
        return nomeMercadoria;
    }

    public void setNomeMercadoria(String nomeMercadoria) {
        this.nomeMercadoria = nomeMercadoria;
    }

    public double getQtd() {
        return qtd;
    }

    public void setQtd(double qtd) {
        this.qtd = qtd;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public Boolean getComissao() {
        return comissao;
    }

    public void setComissao(Boolean comissao) {
        this.comissao = comissao;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public int getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(int numeroNota) {
        this.numeroNota = numeroNota;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpjEmpresa() {
        return cnpjEmpresa;
    }

    public void setCnpjEmpresa(String cnpjEmpresa) {
        this.cnpjEmpresa = cnpjEmpresa;
    }

    public void vender(String mercadoria, double quantidade, double valorDesconto, Boolean tefComissao, double valComissao) {
        this.nomeMercadoria = mercadoria;
        this.qtd = quantidade;
        this.desconto = valorDesconto;
        this.comissao = tefComissao;

        System.out.println("VENDA REALIZADA");
        System.out.println("Empresa: " + this.nomeEmpresa + " (CNPJ: " + this.cnpjEmpresa + ")");
        System.out.println("Nota Fiscal Nº: " + this.numeroNota);
        System.out.println("Cliente: " + this.nomeCliente);
        System.out.println("Atendente: " + this.nomeFuncionario);
        System.out.println("Produto: " + this.nomeMercadoria + " | Qtd: " + this.qtd);
        System.out.println("Desconto Aplicado: R$ " + this.desconto);

        if (this.comissao) {
            System.out.println("Comissão do funcionário registrada: R$ " + valComissao);
        }
        this.numeroNota++;

    }

    public void cadastrarFornecedor(String fornecedor) {
        this.nomeFornecedor = fornecedor;
        System.out.println("Fornecedor '" + this.nomeFornecedor + "' cadastrado para a mercadoria " + this.nomeMercadoria + ".\n");
    }

    public void exibirInformacoesEmpresa() {
        System.out.println("==DADOS DA ADEGA==");
        System.out.println("Razão Social: " + this.nomeEmpresa);
        System.out.println("CNPJ: " + this.cnpjEmpresa);
        System.out.println("----------------------\n");
      
    }

    public void aplicarCupomDesconto(double valor) {
        this.desconto = valor;
        System.out.println("Cupom de desconto de R$ " + valor + " ativado com sucesso!\n");
    }
}