package LDE.LDEAtvFour.Question_02;

public class Tarefa {
    private int prioridade;
    private String descrição;

     public Tarefa(int prioridade, String descrição) {
        //teste para saber se a prioridade esta correta na main
        this.prioridade = prioridade;
        this.descrição = descrição;
    }

    
    public int getPrioridade() {
        return prioridade;
    }


    public void setPrioridade(int prioridade) {
      
        this.prioridade = prioridade;
    }


    public String getDescrição() {
        return descrição;
    }


    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }


   
}
