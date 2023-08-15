package bancoMuitoDinheiro;

public class ContaBancaria {
    private int numero;
    private int  senha;
    private double saldo;

    public ContaBancaria(int num){
        this.numero = num;
    }
    
    public void depositar(double valor){
        if(valor<=0){
            System.out.println("Valor Invalido");
        }else{
            this.saldo = this.saldo + valor;
        }
    }
    
     public String toString(){
        return this.numero + " " + this.saldo;
     }
}
