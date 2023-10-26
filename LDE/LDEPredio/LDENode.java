package LDEPredio;

public class LDENode {
    private LDENode ant;
    private Pessoa info;
    private LDENode prox;
    public LDENode (Pessoa valor) {
        this.info = valor;
    }
    public void setInfo (Pessoa valor) {
        this.info = valor;
    }
    public void setProx (LDENode novoProx) {
        this.prox = novoProx;
    }
    public void setAnt (LDENode novoAnt) {
        this.ant = novoAnt;
    }
    public Pessoa getInfo() {
        return this.info;
    }
    public LDENode getProx () {
        return this.prox;
    }
    public LDENode getAnt () {
        return this.ant;
    }
}
