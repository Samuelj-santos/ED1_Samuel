package LDEQueue;

public class LDEQueue {
    private LDENode primeiro;
    private LDENode ultimo;
    private int qtd;
    



    public void enQueue(Integer valor ){
        LDENode aux = this.primeiro;
        LDENode novo = new LDENode(valor);

        if (isEmpty() == true) {// isEmpty usado para identificar que é o primeiro item a ser colocado na lista não para verificação em si
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        }else{
          while (aux != null) {
             if (aux.getInfo() ==  valor) {
                System.out.println("valor repetido");
                break;
             }
            
              if (aux.getProx() == null) {
                aux.setProx(novo);
                aux.getProx().setAnt(aux);
                this.ultimo = novo;
                this.ultimo.setProx(null);
                this.qtd--;
                break;
              }else{
                aux = aux.getProx();
              }

          }
        }
    }


    public Integer deQueue(){
        
        Integer retorno = 0;
        retorno = this.primeiro.getInfo();
         this.primeiro = this.primeiro.getProx();
         this.primeiro.setAnt(null);
         this.qtd--;
       
         return retorno;
        
    }

    public Integer  head(){
        return this.primeiro.getInfo();
    }

    public boolean isFull(){
        return false;
    }
    public boolean isEmpty() { 
        if (this.primeiro == null && this.ultimo == null && this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }
}
