package Aluno;

public class Aluno {
    private String matricula;
    private String nome;
    private double media;
    private int faltas;

    public Aluno(String matricula, String nome, double media, int faltas) {
        this.matricula = matricula;
        this.nome = nome;
        this.media = media;
        this.faltas = faltas;
    }

    public String getMatricula() {
        return this.matricula;
    }
   
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getMedia() {
        return this.media;
    }
    public void setMedia(double media) {
        this.media = media;
    }
    public int getFaltas() {
        return this.faltas;
    }
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }


     @Override
     public String toString(){
        return "O aluno " + this.nome + " de matricula " + this.matricula + " de media " + this.media + " com o numero de faltas de : " + this.faltas;
     }

   

   

   

   
    

}
