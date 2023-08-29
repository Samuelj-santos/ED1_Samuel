package PROduto;

public class Produto  implements Comparable <Produto> {
    private  String codigo;
    private String descriçao;
     private String fornecedor;
     private double preço;
     private int estoque;

    public Produto(String codigo,String descriçao , String fornecedor,double preço, int qnt){
     this.codigo =codigo;
     this.descriçao = descriçao;
     this.fornecedor = fornecedor;
     this.preço = preço;
     this.estoque = qnt;

    }

    public Produto(String codigo){
        this.codigo = codigo;
    }

    public   void aplicarDesconto(int desconto){
       double newvalue = desconto/100;
       newvalue = this.preço * newvalue;
       newvalue = this.preço - newvalue;
       this.preço = newvalue;
    }

    public  void aplicarAumneto(int aumento){
      double newvalue = aumento/100;
       newvalue = this.preço * newvalue;
       newvalue = this.preço + newvalue;
       this.preço = newvalue;
    }

    public void  atualizarEstoque(int newqnt){
        this.estoque =  this.estoque + newqnt;
    }

    public void  venderProduto(int newqnt ){
        this.estoque = this.estoque-newqnt;
    }


    public String getCodigo(){
        return this.codigo;
    }
     public String getDescriçao(){
        return this.descriçao;
    }
     public String getFornecedor(){
        return this.fornecedor;
    }
    public double getPreço(){
        return this.preço;
    }
    public int getEstoque(){
        return this.estoque;
    }


    public void setDescriçao(String descriçao){
     this.descriçao = descriçao;
    }
    public void setFornecedor(String fornecedor){
        this.fornecedor = fornecedor;
    }
    public void setPreço(double preço){
        this.preço = preço;
    }
    public void setEstoque(int estoque){
        this.estoque = estoque;
    }




    @Override
    public String toString(){
        return "o codigo do produto é " + this.codigo + "a descriçao do produto é "  + this.descriçao + "o fornecedor desse produto é " + this.fornecedor + "o preço desse produto é " + this.preço + " a  quantidade em esqtoque é " + this.estoque;
    }

    @Override
    public int compareTo(Produto outro){
   if (this.codigo.compareTo(outro.codigo) == 0) {
    return 0;
   }else if (this.codigo.compareTo(outro.codigo)>0) {
    return 1;
   }else{
     return -1;
   }
   
   
}}
