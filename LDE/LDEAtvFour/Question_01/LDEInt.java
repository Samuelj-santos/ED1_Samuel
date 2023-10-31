package LDE.LDEAtvFour.Question_01;

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

    public void inserir(Integer valor){
        LDENode aux , proximo;
        LDENode novo = new LDENode(valor);

        if (isEmpty() == true ) {

            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;

        }else if (valor < this.primeiro.getInfo()) {

            this.primeiro.setAnt(novo);
            this.primeiro = novo;
            this.qtd++;

        }else if (valor == this.primeiro.getInfo()) {

            aux = this.primeiro;
            while (aux != null) {
                if (aux.getProx().getInfo() == valor) {
                    aux = aux.getProx();
                }else{
                    proximo = aux.getProx();
                    proximo.setAnt(novo);
                    aux.setProx(novo);
                    novo.setAnt(aux);
                    novo.setProx(proximo);
                    this.qtd++;
                    break;
                }
            }

        } else if (valor > this.ultimo.getInfo()) {
            
             aux = this.ultimo;
             aux.setProx(novo);
             novo.setAnt(aux);
             this.qtd++;
             this.ultimo = novo;
           

        }else if (valor == this.ultimo.getInfo()) {

             aux = this.ultimo;
             aux.setProx(novo);
             novo.setAnt(aux);
             this.qtd++;
             this.ultimo = novo;

        }else{
         //ajeitar a inserção  no "meio" debuggar
          aux = this.primeiro;
          while (aux != null) {
            if (aux.getProx().getInfo() == valor ) {
                aux = aux.getProx();
            }else{
                proximo = aux.getProx();
                proximo.setAnt(novo);
                aux.setProx(novo);
                novo.setAnt(aux);
                novo.setProx(proximo);
                this.qtd++;
                break;
            }
          }

        }
        
    }


    public void exibir(){
        LDENode aux = this.primeiro;
        while (aux!= null) {
            System.out.println(aux.getInfo());
            aux = aux.getProx();
        }
    }
}
