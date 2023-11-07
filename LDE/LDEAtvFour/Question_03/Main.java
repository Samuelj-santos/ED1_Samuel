package LDE.LDEAtvFour.Question_03;

public class Main {
    public static void main(String[] args) {
        LDEIntComRepetidos lista = new LDEIntComRepetidos();
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.inserir(10);
        lista.remover(10);
        lista.exibir();
    }
}
