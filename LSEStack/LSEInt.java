package LSEStack;

public class LSEInt {
    private LSENode primeiro;
    private int contador;

    public void push(int one){
        LSENode novo = new LSENode(one);
        if (isFull() == true) {
            System.out.println("Pilha cheia");
        }
        
        if (isEmpty() == true) {
            this.contador++;
            this.primeiro = novo;
        }else{
            this.contador++;
         novo.setProx(this.primeiro);
          this.primeiro = novo;
        }
    }

    public void pop(){
        if (isEmpty() == true) {
            System.out.println("A lista esta vazia");
          }else{
            this.primeiro = this.primeiro.getProx();
          }
    }

    public int top(){
        return this.primeiro.getInfo();
    }

    
    public void exibirTodos() {
        LSENode aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        
        }else {
            aux = this.primeiro;
            while(aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }            
        }   
        }



    public boolean isEmpty(){
        if (this.primeiro == null) {
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if (this.contador == 10) {
            return true;
        }else{
            return false;
        }
    }

}
