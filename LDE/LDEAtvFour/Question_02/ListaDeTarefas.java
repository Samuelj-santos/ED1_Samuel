package LDE.LDEAtvFour.Question_02;

public class ListaDeTarefas {
    private int qtd;
    private LDENode primeiro;
    private LDENode ultimo;

    public boolean isEmpty() { 
        if (this.primeiro == null && this.ultimo == null && this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void inserir(Tarefa nova){
        LDENode novo = new LDENode(nova);
        if (this.isEmpty() == true ) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd ++;
        }
       else if (booleanBusca(nova.getDescrição()) == true ) {
            System.out.println("Tarefa repetida ");
        }else{
           
            if (nova.getPrioridade() > this.primeiro.getInfo().getPrioridade()) {
                this.primeiro.setAnt(novo);
                novo.setProx(this.primeiro);
                this.primeiro = novo;
                this.qtd++;
            }else if (nova.getPrioridade() == this.primeiro.getInfo().getPrioridade()) {
                 LDENode aux = this.primeiro;
                 while (aux != null) {
                    if (nova.getPrioridade() > aux.getInfo().getPrioridade()) {
                        LDENode anterior = aux.getAnt();
                        anterior.setProx(novo);
                        novo.setAnt(anterior);
                        novo.setProx(aux);
                        aux.setAnt(novo);
                        this.qtd++;
                        break;
                    }else{
                        aux = aux.getProx();
                    }
                 }
                
            }else if (nova.getPrioridade() < this.ultimo.getInfo().getPrioridade() || nova.getPrioridade() == this.ultimo.getInfo().getPrioridade() ) {
                this.ultimo.setProx(novo);
                novo.setAnt(this.ultimo);
                this.ultimo = novo;
                this.qtd++;
            }else {
             LDENode aux = this.primeiro;
             while (aux != null) {
                  if (nova.getPrioridade() > aux.getInfo().getPrioridade()) {
                        LDENode anterior = aux.getAnt();
                        anterior.setProx(novo);
                        novo.setAnt(anterior);
                        novo.setProx(aux);
                        aux.setAnt(novo);
                        this.qtd++;
                        break;
                    }else{
                        aux = aux.getProx();
                    }
             }
            }
        }
      
    }

    public boolean  booleanBusca (String descrição ){
        if (this.isEmpty() == true ) {
            System.out.println("Lista vazia ");
        }else{
            LDENode aux = this.primeiro;
            while (aux != null) {
                if (aux.getInfo().getDescrição().equals(descrição ) == true ) {
                    return true;
                }else{
                    aux = aux.getProx();
                }
            }
            return false;
        }
        return false;
    }

    public int intBusca(String descrição){
        if (this.isEmpty() == true ) {
            System.out.println(" Lista vazia ");
        }else{
          int cont =0 ;
          LDENode aux = this.primeiro;
          while (aux != null) {
               if (descrição.equals(aux.getInfo().getDescrição() ) == true ) {
                return cont;
               }else{
                aux = aux.getProx();
                cont++;
               }
          }
          System.out.println("Não achado");
        }
        return 0;
    }


    public void executarTarefa(){
        if (this.isEmpty() == true ) {
            System.out.println(" Lista vazia ");
        }else{
            this.primeiro = this.primeiro.getProx();
            this.primeiro.setAnt(null);
            this.qtd--;
        }
    }



   public void removerTarefa(String descrição){
    if (this.isEmpty() == true ) {
        System.out.println("Lista vazia ");
    }else{
      LDENode aux = this.primeiro;
      while (aux != null) {
        if (descrição.equals(aux.getInfo().getDescrição() ) == true)   {
            aux.getAnt().setProx(aux.getProx());
            aux.getProx().setAnt(aux.getAnt());
            this.qtd--;
            break;
        }else{
            aux  = aux.getProx();
        
      }
    }
   }

}


public void exibir(){
    if (this.isEmpty() == true) {
        System.out.println(" Lista vazia ");
    }else{
     LDENode aux = this.primeiro;
     while (aux != null) {
        System.out.println("A tarefa : " + aux.getInfo().getDescrição() + " de prioridade " +  aux.getInfo().getPrioridade() );
        aux = aux.getProx();
     }
    }
}

public void exibir(int prioridade){
if (this.isEmpty() == true ) {
    System.out.println(" Lista vazia ");
}else{
    LDENode aux = this.primeiro;
    while (aux != null) {
        if (prioridade == aux.getInfo().getPrioridade()) {
            System.out.println(" A tarefa " + aux.getInfo().getDescrição() + " e de prioridade " + aux.getInfo().getPrioridade());
            aux = aux.getProx();
        }else if (prioridade > aux.getInfo().getPrioridade()){
          break;
        }else{
            aux = aux.getProx();
        }
    }
}
}


public void alterarPrioridade(String descrição , int novaPrioridade){
    Tarefa tarefa = new Tarefa(novaPrioridade, descrição);
   
    if (this.isEmpty() == true ) {
        System.out.println(" Lista vazia ");
    }else{
     LDENode aux = this.primeiro;
      this.removerTarefa(descrição);
      this.inserir(tarefa);
     }
    }
}

