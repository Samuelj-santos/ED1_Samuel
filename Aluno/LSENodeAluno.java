package Aluno;

public class LSENodeAluno {
    private LSEAluno info;
    private LSENodeAluno prox;

    public LSEAluno getInfo() {
        return this.info;
    }
    public void setInfo(LSEAluno info) {
        this.info = info;
    }
    public LSENodeAluno getProx() {
        return this.prox;
    }
    public void setProx(LSENodeAluno prox) {
        this.prox = prox;
    }
}
