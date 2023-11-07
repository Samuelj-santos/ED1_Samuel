package LDE.LDEAtvFour.Question_04;

public class Main {
    public static void main(String[] args) {
        LDEInt lista = new LDEInt();
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.inserir(40);
        lista.inserir(50);
       lista.remover(20);
        lista.exibir();
    }
}
