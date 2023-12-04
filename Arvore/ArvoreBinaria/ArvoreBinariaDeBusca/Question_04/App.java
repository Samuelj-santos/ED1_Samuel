package Arvore.ArvoreBinaria.ArvoreBinariaDeBusca.Question_04;

import Arvore.ArvoreBinaria.ArvoreBinariaDeBusca.Question_02.Tree;

public class App {
 public static void main(String[] args) {
     Tree arvore = new Tree();
        
         arvore.insertNRecursivo(100);
         arvore.insertNRecursivo(200);
         arvore.insertNRecursivo(300);
         arvore.insertNRecursivo(400);
         arvore.insertNRecursivo(50);
         arvore.insertNRecursivo(60);


         Integer aux = (Integer) arvore.maiorNo().getInfo();
         Integer aux2 = (Integer) arvore.menorNo().getInfo();

 }   
}
