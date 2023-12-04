package Arvore.ArvoreBinaria.ArvoreBinariaDeBusca.Question_02;

public class App {
    public static void main(String[] args) {
        Tree arvore  = new Tree();
        arvore.insert(10);
        arvore.insert(20);
        arvore.insert(30);
        arvore.insert(40);
        arvore.insert(50);
        arvore.insert(60);

        Integer a = arvore.buscaNRecursiva(70);
        System.out.println(a);
        Integer b = arvore.buscaNRecursiva(10);
        System.out.println(b);

    }
}
