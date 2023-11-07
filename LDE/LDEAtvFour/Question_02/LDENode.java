package LDE.LDEAtvFour.Question_02;

public class LDENode {
    private  LDENode prox;
    private LDENode ant;
    private Tarefa info;
    
    public LDENode(Tarefa info) {
        this.info = info;
    }
    public LDENode getProx() {
        return prox;
    }
    public void setProx(LDENode prox) {
        this.prox = prox;
    }
    public LDENode getAnt() {
        return ant;
    }
    public void setAnt(LDENode ant) {
        this.ant = ant;
    }
    public Tarefa getInfo() {
        return info;
    }
    public void setInfo(Tarefa info) {
        this.info = info;
    }

}
