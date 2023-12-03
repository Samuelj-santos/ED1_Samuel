package LDE.LDECircular;

public class ListaFilme {
    private NodeSecundaria primeiro;
    private int qtd;
    private NodeSecundaria ultimo;

    public boolean isEmpty(){
        if (this.primeiro == null && this.ultimo == null && this.qtd == 0) {
            return true ;
        }else{
            return false ;
        }
    }

    
      public void inserirOrdenado(Filme novo){
      NodeSecundaria novoNode = new NodeSecundaria(novo);
        if (isEmpty() == true ) {
            this.primeiro = novoNode;
            this.ultimo = novoNode;
            this.ultimo.setProx(this.primeiro);
            this.qtd ++;
        }else {
         if (novo.compareTo(this.primeiro.getInfo()) == 1) {
            this.primeiro.setAnte(novoNode);
            novoNode.setProx(this.primeiro);
            this.primeiro = novoNode;
            this.qtd++;
         }else if (novo.compareTo(this.ultimo.getInfo()) == -1) {
            this.ultimo.setProx(novoNode);
            novoNode.setProx(this.primeiro);
            this.primeiro = novoNode;
            this.qtd++;

         }else{
            NodeSecundaria aux = this.primeiro;

            while (aux != null) {
                if (aux.getInfo().compareTo(novo) == 0 ) {
                    System.out.println("Error nao pode haver filmes reptido ");
                    break;
                }else if (novo.compareTo(aux.getInfo()) == 1) {
                       novoNode.setAnte(aux.getAnte());
                       novoNode.setProx(aux);
                      aux.setAnte(novoNode);
                      this.qtd++;
                      break;
                       
                }  else {
                    aux = aux.getProx();
                }
            }
         }
        }

      }


    public void remover (Filme o){
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia ");
        }else {
            if (o.compareTo(this.primeiro.getInfo()) == 0) {
                    if (this.primeiro.getProx() == null) {
                        this.primeiro = null;
                        this.ultimo = null;
                        this.qtd -- ;
                    }else{
                       this.primeiro = this.primeiro.getProx();
                       this.primeiro.setAnte(null);
                       this.qtd --;
                    }
            }else if (o.compareTo(this.ultimo.getInfo() ) == 0) {
                   this.ultimo = this.ultimo.getAnte();
                   this.ultimo.setProx(this.primeiro);
                   this.qtd -- ;
            }else {
           NodeSecundaria aux  = this.primeiro;
           while (aux != null) {
            if (o.compareTo(aux.getInfo()) == 0) {
                aux.setProx(aux.getAnte());
                aux.setAnte(aux.getProx());
                this.qtd--;
               break;
            }else{
                aux = aux.getProx();
            }
           }
        }
    }
    }

     public Filme buscar (Filme o){
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia");
        }else{
            NodeSecundaria aux = this.primeiro;
            while (aux != null) {
                if (o.compareTo(aux.getInfo()) == 0) {
                    return aux.getInfo();
                }else{
                    aux = aux.getProx();
                }
            }
        }
        return null;
     }

      

      public void exibir(){
        NodeSecundaria aux  = this.primeiro;
        while (aux != null) {
            System.out.println(aux.getInfo());
        }
      }

}
