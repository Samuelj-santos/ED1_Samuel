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
                }else if () {
                    
                }  
            }
         }
        }

      }

}
