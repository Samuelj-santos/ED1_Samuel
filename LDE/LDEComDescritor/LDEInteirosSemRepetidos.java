package LDE.LDEComDescritor;

public class LDEInteirosSemRepetidos {
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


    public void inserirNoInicio(Integer valor ){
       
        LDENode novo = new LDENode(valor);
        if (isEmpty() == true ) {
            this.primeiro  = novo;
            this.ultimo = novo;
            this.qtd++;

        }else{
            if (buscar( valor) == true) {
                System.out.println( "Valor repetido");
            }
          novo.setProx(this.primeiro);
          this.primeiro.setAnt(novo);
          this.primeiro = novo;
          this.qtd++;
        }
    

}

    public void removerNoInicio(){
        LDENode aux = this.primeiro;
        if (isEmpty() == true) {
            System.out.println("Lista vazia ");
        }else{
         this.primeiro = this.primeiro.getProx();
         this.primeiro.setAnt(null);
         this.qtd--;

        }
    
    
    }

    public void removerNoFinal(){
        LDENode aux = this.ultimo;
        if (isEmpty() == true) {
            System.out.println("Lista vazia ");
        }
        if (aux.getProx() == null) {
            aux.getAnt().setProx(null);
             
            this.qtd--;
        }
        
    }

    public void exibirTodos (){
        LDENode aux = this.primeiro;

        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getProx();
        }
    }

    public void removerEspecifico(Integer valor){//problema
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
                    break;
                 }
                else if (aux.getProx() == null) {
                     aux.getAnt().setProx(null);
                     this.qtd--;
                     break;
                 }else{
                     aux.getProx().setAnt(aux.getAnt());
                aux.getAnt().setProx(aux.getProx());

                this.qtd--;
                break;
                 }
               
                
              
             
          }else{
            aux = aux.getProx();
          }
       }
     }
       if (aux == null) {
        System.out.println("Valor não encontrado");
       }
      
    }


    public LDENode procurar(Integer valor){
        LDENode aux = this.primeiro;
        if (isEmpty() == true) {
            System.out.println("Lista vazia");
        }else{
           while (aux != null) {
               if (aux.getInfo() == valor) {
                return aux;
               }else{
                aux = aux.getProx();
               }
           }
        }
        return null;
    }

    private boolean buscar(Integer valor){
        LDENode aux =  this.primeiro;
        while (aux != null) {
            if (aux.getInfo()  == valor) {
                return true;
            }else{
              aux = aux.getProx();
            }
        }
        return false;
    }
}