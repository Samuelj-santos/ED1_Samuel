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
            public void inserirNoInicioSemRepeticao (Integer valor) {
                LSENode novo,retorno;
                novo = new LSENode (valor);
                if (this.isEmpty() == true) {

                   this.primeiro = novo;
                  }else {
                    retorno = this.procurar(valor);
                    if (retorno == null) {
                         novo.setProx(this.primeiro);
                         this.primeiro = novo;
                         System.out.println("inserção efetuada");
                    }  else{
                        System.out.println(" valor repetido . Inserção não efetuada");
                    }
                   
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

             public int procurarValor(Integer valor){
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
                 return cont;
               }
               return -1;
             }

             public LSENode procurar (int valor){

                LSENode aux;

                if (isEmpty() == true) {
                    System.out.println("Lista vazia");

                }else{

                    aux = this.primeiro;
                    while (aux != null) {
                        if (aux.getInfo() == valor) {
                            return aux;
                        }
                        aux = aux.getProx();
                    }
                }
                return null;

             }
            }