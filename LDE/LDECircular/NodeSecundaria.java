package LDE.LDECircular;

public class NodeSecundaria {
    private NodeSecundaria ante;
    private NodeSecundaria prox;
    private Filme info;
    

    public NodeSecundaria(Filme info) {
        this.info = info;
    }
    public NodeSecundaria getAnte() {
        return ante;
    }
    public void setAnte(NodeSecundaria ante) {
        this.ante = ante;
    }
    public Filme getInfo() {
        return info;
    }
    public void setInfo(Filme info) {
        this.info = info;
    }
    public NodeSecundaria getProx() {
        return prox;
    }
    public void setProx(NodeSecundaria prox) {
        this.prox = prox;
    }
}
