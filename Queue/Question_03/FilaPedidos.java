package Queue.Question_03;

public class FilaPedidos {
    private Pedido[] dados;
    private Pedido head;
    private Pedido qtd;
    private int cont;

    public FilaPedidos(int tam){
        this.dados = new Pedido[tam];
        this.qtd = this.dados[this.dados.length-1];
    }

    public void enQueue(Pedido one){
     if (isEmpty() == false) {
        System.out.println("Fila cheia impossivel,colocar um novo pedido");
     }
     this.dados[this.cont] = one;
      this.cont++;
    }

    public Pedido head(){
        this.head = this.dados[0];
        return this.head; 
    }
    public Pedido   deQueue(){
     if (isEmpty() == true) {
        System.out.println("Ainda a espaço na fila");
     }
     this.dados[0] = null;
     avançar();
     return this.dados[0];

    }

    public boolean isEmpty(){
     if (this.qtd == null) {
        return true;
     }else{
        return false;
     }

    }
    public boolean isFull(){
        if (this.qtd != null) {
            return true;
        }else{
            return false;
        }

    }
    public void avançar(){
        for(int i =0;i<this.dados.length-1;i++){
         this.dados[i] = this.dados[i+1];
        }
      }
}
