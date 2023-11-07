package LDE.LDEAtvFour.Question_03;

public class LDEIntComRepetidos {
    private LDENode primeiro;
    private int qtd ;
    private LDENode ultimo;

    
    public boolean isEmpty() { 
        if (this.primeiro == null && this.ultimo == null && this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void exibir(){
        LDENode aux = this.primeiro;
        while (aux!= null) {
            System.out.println(aux.getInfo());
            aux = aux.getProx();
        }
    }

    public void inserir(Integer valor ){
        LDENode aux , proximo,anterior;
        LDENode novo = new LDENode(valor);

        if (isEmpty() == true ) {

            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;

        }else if (valor < this.primeiro.getInfo()) {

            this.primeiro.setAnt(novo);
            this.primeiro = novo;
            this.qtd++;

        }else if (valor == this.primeiro.getInfo()) {

            aux = this.primeiro;
            while (aux != null) {
                if (aux.getProx().getInfo() == valor) {
                    aux = aux.getProx();
                }else{
                    proximo = aux.getProx();
                    proximo.setAnt(novo);
                    aux.setProx(novo);
                    novo.setAnt(aux);
                    novo.setProx(proximo);
                    this.qtd++;
                    break;
                }
            }

        } else if (valor > this.ultimo.getInfo()) {
            
             aux = this.ultimo;
             aux.setProx(novo);
             novo.setAnt(aux);
             this.qtd++;
             this.ultimo = novo;
           

        }else if (valor == this.ultimo.getInfo()) {

             aux = this.ultimo;
             aux.setProx(novo);
             novo.setAnt(aux);
             this.qtd++;
             this.ultimo = novo;

        }else{
         
          aux = this.primeiro;
          while (aux != null) {
           if(aux.getInfo() == valor  ){
              anterior = aux.getAnt();
              anterior.setProx(novo);
              novo.setAnt(anterior);
              novo.setProx(aux);
              aux.setAnt(novo);
              break;
           }else {
            aux = aux.getProx();
           }
          }

        }
        
        
    }


    public void remover(Integer valor ){
        
        if (this.isEmpty() == true ) {
            System.out.println("Lista vazia");
        }else{
            LDENode aux = this.primeiro;
            LDENode anterior ;
            
              
                       while (aux != null) {

                    if (valor == this.primeiro.getInfo()) {
                       this.primeiro = this.primeiro.getProx();
                       this.primeiro.setAnt(null);
                        this.qtd--;
                        aux = aux.getProx();
                        
                    }else if (valor == this.ultimo.getInfo()){
                       this.ultimo = this.ultimo.getAnt();
                       this.ultimo.setProx(null);
                        this.qtd--;
                        aux = aux.getProx();
                    }
                        
                      else  if (aux.getInfo() == valor) {
                            anterior = aux.getAnt();
                            anterior.setProx(aux.getProx());
                            aux.getProx().setAnt(anterior);
                            this.qtd--;
                            aux = aux.getProx();
                            
                        }else{
                         aux = aux.getProx();
                        }
                       }
                    }
               
            
        
    }
}
