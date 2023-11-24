package LDE.LDECircular;

public class Filme implements Comparable <Filme> {
    private String titulo;
    private String genero;
    private String classificação;
    private int ano;
    
    public Filme(String titulo, String genero, String classificação, int ano) {
        this.titulo = titulo;
        this.genero = genero;
        this.classificação = classificação;
        this.ano = ano;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getClassificação() {
        return classificação;
    }
    public void setClassificação(String classificação) {
        this.classificação = classificação;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    @Override
    public int compareTo(Filme o) {
        //se forem iguais retorna 0
        //se a que chamou for maior retorna -1
        //se a que chamou for menor retorna 1
        
         if (this.titulo.compareTo(o.titulo) == -1) {
            return -1;
         }else if (this.titulo.compareTo(o.titulo) == 1) {
            return 1;
         }else{
            return -0;
         }
       
    }

     public String toString(){
       return " O filme :" + this.titulo+ " Do genero  : " + this.genero + " Com a classificação : " + this.classificação + " de ano : " +this.ano;
     }

}
