package LSEComRepetidos;
public class LSEInt {
    private LSENode primeiro;

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
        public boolean isEmpty () {
            if (this.primeiro == null) {
                return true;
            }else {
                return false;
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

             public void procurarValor(Integer valor){
                LSENode aux;
               if (isEmpty() == true) {
                System.out.println("A lista esta vazia");
               }else{
                int cont = 0;
                aux = this.primeiro;
                 while (aux != null) {
                    if (aux.getInfo() == valor) {
                        cont++;
                    }
                    aux = aux.getProx();
                 }
                 System.out.println("O valor " + valor+" apareceu " + cont+" vezes");
               }
             }
            }