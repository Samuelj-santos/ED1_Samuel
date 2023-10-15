package LDE.LDEComDescritor;

public class LDEInt {
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
    public void inserirInicio(Integer valor) {
        LDENode novo = new LDENode(valor);
        LDENode retorno = this.buscar(valor);
        if (retorno != null) {
            System.out.println("Valor já existe na lista.");
        } else {
            if (this.isEmpty() == true) {
                this.primeiro = novo;
                this.ultimo = novo;
                this.qtd++;
            } else {
                novo.setProx(this.primeiro);
                this.primeiro.setAnt(novo);
                this.primeiro = novo;
                this.qtd++;
            }
            System.out.println("Inserção efetuada!");}}
}

