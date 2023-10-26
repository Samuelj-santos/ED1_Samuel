package LDE.LDEAtvThree.Question_01;

public class LDEInt {
    private LDENode primeiro;
    private LDENode ultimo;
    private int qtd;

    public boolean isEmpty() { 
        if (this.primeiro == null && this.ultimo == null && this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void inserirnoFinal(Integer valor){
        LDENode aux = this.primeiro;
        LDENode novo = new LDENode(valor);

        if (isEmpty() == true) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        }else{
          while (aux != null) {
            
            
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

    public void exibirTodos (){
        LDENode aux = this.primeiro;

        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getProx();
        }
    }

    public void remover (Integer valor ){
        LDENode aux = this.primeiro;
        if (isEmpty() == true ) {
            System.out.println("Lista vazia ");
        }else{
            while (aux != null) {
               
                if (aux.getInfo() == valor) {
                   
                    
                    if (aux.getAnt() == null) {
                        this.primeiro = this.primeiro.getProx();
                        this.primeiro.setAnt(null);
                        this.qtd--;
                        aux = aux.getProx();
                        
                     }
                    else if (aux.getProx() == null) {
                         aux.getAnt().setProx(null);
                         this.qtd--;
                            aux = aux.getProx() ;                 
                     }else{
                         aux.getProx().setAnt(aux.getAnt());
                    aux.getAnt().setProx(aux.getProx());
                          
                    this.qtd--;
                    aux = aux.getProx();
                     }
                   
                }else{
                    aux = aux.getProx();
                }
            }
        }
    }



}
