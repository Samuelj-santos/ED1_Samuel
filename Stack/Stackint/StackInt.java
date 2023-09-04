package Stack.Stackint;

public class StackInt {

    private int[] dados;
    private int qtd;
    private int topo;

    public StackInt(int tam){
        this.dados = new int[tam];
    }
    public StackInt(){
        this.dados = new int[10];
    }

    public void Push(int valor ){
       this.dados[this.topo] = valor;
       this.topo++;
    }

    public int top(){
        return this.dados[this.topo-1];
    }

    public int pop(){
        int valor = this.dados[this.topo-1];
        this.dados[this.topo-1] = 0;
        this.topo--;
        return valor--;
    }

    public boolean isEmpty(){
        if (this.qtd == 0) {
           return true; 
        }
        else{
            return false;
        }
 }
 
 public boolean isFull() {
    if (this.qtd == this.dados.length) {
        return true;
    }else{
        return false;
    }
 }  
}