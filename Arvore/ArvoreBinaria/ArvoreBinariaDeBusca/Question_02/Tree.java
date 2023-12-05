package Arvore.ArvoreBinaria.ArvoreBinariaDeBusca.Question_02;

public class Tree {

    private TreeB<Integer> raiz;
     private int contador ;
    public boolean  isEmpty(){
        if (this.raiz == null) {
            return true ;
        } else {
            return false ;
        }
    }


    public Integer buscaNRecursiva(Integer value){
        if (this.isEmpty() == true) {
            System.out.println("Arvore vazia ");
        }else{
            TreeB<Integer> aux = this.raiz;
            while (aux != null) {
                if (value.compareTo(aux.getInfo()) == 0) {
                    return aux.getInfo();
                }else if (value.compareTo(aux.getInfo()) == -1) {
                    aux = aux.getLeft();
                }else{
                     aux = aux.getRight();
                }
            }
        }
        
        return null;
    }

    public void insert(Integer value ){
       if (this.isEmpty() == true) {
          this.raiz = new TreeB<Integer>(value);
      }else{
          raiz.insertNode(value);
      }
    }


     public  void insertNRecursivo(Integer value) {
        TreeB<Integer> novo = new TreeB<Integer>(value);
        //sem repetidos
        if (this.isEmpty() == true) {
            this.raiz = new TreeB<Integer>(value);
        }else{
            TreeB<Integer> aux  = this.raiz;

            while (aux != null) {
                if (value.compareTo(aux.getInfo()) == 0) {
                    System.out.println("Valor repetido: ");
                }else if (value.compareTo(aux.getInfo()) == -1) {
                    if (aux.getLeft() == null) {
                        aux.setLeft(novo);
                        break;
                    } else {
                        aux= aux.getLeft();
                    }
                } else {
                    if (value.compareTo(aux.getInfo()) == 1) {
                        if (aux.getRight() == null) {
                            aux.setRight(novo);
                            break;
                        }else{
                            aux = aux.getRight();
                        }
                    }
                }
            }
        }
     }



      public TreeB menorNo(){
        TreeB<Integer> aux = this.raiz;

        while (aux != null) {
            if (aux.getLeft() == null) {
                return aux;
            } else {
                aux = aux.getLeft();
            }
        }

        return null;
      }


      
      public TreeB maiorNo(){
        TreeB<Integer> aux = this.raiz;

        while (aux != null) {
            if (aux.getRight() == null) {
                return aux;
            } else {
                aux = aux.getRight();
            }
        }

        return null;
      }

      public int contadordeNos(){
        this.contador = 0;
        if (this.isEmpty() == true) {
            System.out.println("Arvore vazia ");
        }else{
          contador =   this.percorreremOrdem(raiz);
        }
        return contador;

      }

      private int  percorreremOrdem(TreeB r){
        
         if (r != null) {
            percorreremOrdem(r.getLeft());
            this.contador++;
            percorreremOrdem(r.getRight());
         }
         return this.contador;
      }


      public int contadorNoNaoTerminais(){
          this.contador = 0;
          if (this.isEmpty() == true ) {
            System.out.println(" Arvore vazia ");
          }else{
            this.contador = this.percorrer(raiz);
          }
          return this.contador;
      }

      private int percorrer(TreeB r){
        if (r!=null) {
            percorrer(r.getLeft());
            if (r.getLeft() != null || r.getRight() != null) {
                this.contador++;
            }
            percorrer(r.getRight());
        }
        return this.contador;

      }

        public int contadorFolhas(){
          this.contador = 0;
          if (this.isEmpty() == true ) {
            System.out.println(" Arvore vazia ");
          }else{
            this.contador = this.percorrerFolhas(raiz);
          }
          return this.contador;
      }

      private int percorrerFolhas(TreeB r){
        if (r!=null) {
            percorrerFolhas(r.getLeft());
            if (r.getLeft() == null && r.getRight() == null) {
                this.contador++;
            }
            percorrerFolhas(r.getRight());
        }
        return this.contador;

      }


      
}
