package LDE.LDEAtvFour.Question_04;

public class LDEInt {
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


    public void inserir(Integer valor){
        LDENode novo = new LDENode(valor);
        if (isEmpty() == true ) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        }else if (this.busca(valor) == true) {
            System.out.println("Valor repetido");
        }
        else{
            if (valor > this.primeiro.getInfo()) {
                this.primeiro.setAnt(novo);
                novo.setProx(this.primeiro);
                this.primeiro = novo;
                this.qtd ++;
            }else if (valor < this.ultimo.getInfo()) {
                this.ultimo.setProx(novo);
                novo.setAnt(this.ultimo);
                this.ultimo = novo;
                this.qtd++;
            }else{
             LDENode aux = new LDENode(valor);
             while (aux != null) {
                if (valor > aux.getInfo()) {
                   aux.getAnt().setProx(novo);
                   novo.setAnt(aux.getAnt());
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


    private  boolean busca (Integer valor){
        if (isEmpty() == true) {
            System.out.println("Lista vazia");
        }else{
          LDENode aux = this.primeiro;
          while (aux != null) {
            if (aux.getInfo() == valor) {
                return true;
            }else{
                aux = aux.getProx();
            }
          }
        }
        return false;
    }


    public void remover (Integer  valor){
        LDENode retorno = buscA(valor);
        if (isEmpty() == true ) {
            System.out.println("Lista vazia");
        }else{

           if (retorno == null) {
            System.out.println("Valor não encontrado");
           }else{
              if (retorno.getAnt() == null) {
                this.primeiro = retorno.getProx();
                this.primeiro.setAnt(null);
                this.qtd--;
              }else if (retorno.getProx() == null) {
                this.ultimo = retorno.getAnt();
                this.ultimo.setProx(null);
                this.qtd--;
              }else{
                retorno.getAnt().setProx(retorno.getProx());
                retorno.getProx().setAnt(retorno.getAnt());
                this.qtd--;
              }
           }
        }
    }

    public LDENode buscA(Integer valor){
        if (isEmpty() == true) {
            System.out.println("Lista vazia");
        }else{
            LDENode aux = this.primeiro;
            while (aux != null) {
                if ( valor > aux.getInfo() ) {
                    break;
                }
               else  if(aux.getInfo() == valor){
                   return aux;
                }else{
                    aux = aux.getProx();
                }
            }
        }
        return null;
    }
}
