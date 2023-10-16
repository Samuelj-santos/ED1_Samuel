package LDE.LDEComDescritor;

public class LDEInteirosSemRepetidos {
    private LDENode primeiro;
    private LDENode ultimo;
    private int qtd;

    public boolean isEmpty() { // teste forte!
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
                aux.getProx().setAnt(aux);
                aux.setProx(novo);
                this.ultimo = novo;
                this.qtd++;
                break;
              }else{
                aux = aux.getProx();
              }

          }
        }
    }

    

}
