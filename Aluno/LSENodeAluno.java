package Aluno;

public class LSENodeAluno {
    private Aluno info;
    private LSENodeAluno prox;

    public LSENodeAluno(Aluno o){
        this.info = o;
    }

    public Aluno getInfo() {
        return this.info;
    }
    public void setInfo(Aluno info) {
        this.info = info;
    }
    public LSENodeAluno getProx() {
        return this.prox;
    }
    public void setProx(LSENodeAluno prox) {
        this.prox = prox;
    }
}
