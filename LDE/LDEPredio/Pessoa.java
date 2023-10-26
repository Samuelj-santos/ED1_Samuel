package LDEPredio;
public class Pessoa implements Comparable<Pessoa> {
    private String RG;
    private String nome;

    public Pessoa(String RG, String nome) {
        this.RG = RG;
        this.nome = nome;
    }
    @Override
    public int compareTo(Pessoa o) {
       if (this.RG.equals(o.RG) == true) {
        return 0;
       }else{
        return -1;
       }
    }
    public String getRG() {
        return this.RG;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "RG= " + RG + ", nome= " + nome + '}';
    }
}
