package Arvore.ArvoreBinaria.ArvoreBinariaDeBusca.Question_01;

public class Produto {
    private int codigo;
    private String descrição;
    private String fornecedor;
    private double preço;
    private int qtdEstoque;


    
    public Produto(int codigo, String descrição, String fornecedor, double preço, int qtdEstoque) {
        this.codigo = codigo;
        this.descrição = descrição;
        this.fornecedor = fornecedor;
        this.preço = preço;
        this.qtdEstoque = qtdEstoque;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescrição() {
        return descrição;
    }
    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
    public String getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    public double getPreço() {
        return preço;
    }
    public void setPreço(double preço) {
        this.preço = preço;
    }
    public int getQtdEstoque() {
        return qtdEstoque;
    }
    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }



    @Override
    public String toString(){
        return " Descrição : " + this.getDescrição() + " Codigo : " + this.getCodigo() + " Estoque : " + this.getQtdEstoque() + " Codigo : " + this.getCodigo() + " Preço : " + this.getPreço()+" Fornecedor : "+this.getFornecedor();
    }
}
