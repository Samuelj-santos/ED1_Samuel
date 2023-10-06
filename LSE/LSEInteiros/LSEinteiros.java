package LSEInteiros;

public class LSEinteiros {
    private LSENode primeiro;


    public LSEinteiros copiar(){
        LSEinteiros copia = new LSEinteiros();
        copia.primeiro = this.primeiro;

        return copia;
    }

    public boolean isEmpty() {
        if (this.primeiro == null) {

            return true;

        } else {

            return false;

        }
    }

    public void exibirTodos() {
        LSENode aux;

        if (this.isEmpty() == true) {

            System.out.println("Lista vazia!");

        } else {
            aux = this.primeiro;

            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();

}
}
}

public void inserirNoInicio (Integer valor) {
    LSENode novo;
    novo = new LSENode (valor);
    if (this.isEmpty() == true) {

       this.primeiro = novo;
      }else {
        novo.setProx(this.primeiro);
          this.primeiro = novo;
     }
     System.out.println("Inserção efetuada.");
    
     
    
    
    }
 public void removerComeço(){
  if (isEmpty() == true) {
    System.out.println("A lista esta vazia");
  }else{
    this.primeiro = this.primeiro.getProx();
  }
 }

 private LSENode procurar(int valor) {

    LSENode auxNode = this.primeiro;

    while (auxNode != null) {
        if (auxNode.getInfo() == valor) {
            return auxNode;
        }
        auxNode = auxNode.getProx();
    }
    return null;
}


public void remover (int valor) { 
    LSENode atual, anterior;
    boolean achou;
    if (this.isEmpty() == true) { 
        System.out.println("Lista vazia!");
    }else if (this.primeiro.getProx() == null) { 
        if (this.primeiro.getInfo() == valor) { 
            this.primeiro = null;System.out.println("Remoção efetuada!");
        }else { 
            System.out.println("Valor não encontrado na lista!");}}
else { 
    if (this.primeiro.getInfo() == valor) { 
        this.primeiro = this.primeiro.getProx();
        System.out.println("Remoção efetuada!");
    }else {
        anterior = this.primeiro;
        atual = anterior.getProx();
        achou = false;
        while (atual != null) {
            if (atual.getInfo() == valor) {
                anterior.setProx(atual.getProx());
                achou = true;
                break;
            }else {
                anterior = atual;
                atual = atual.getProx();
            }
        }if (achou == false) {
            System.out.println("Valor não encontrado");
        }else {
            System.out.println("Remoção efetuada!");
        }
    }
}


}
   
        public LSEinteiros soma (LSEinteiros um,LSEinteiros dois){
           return null;
        }
}
