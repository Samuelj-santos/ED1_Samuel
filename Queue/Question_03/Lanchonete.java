package Queue.Question_03;

import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
         System.out.println("Bem vindo a lanchonete  :) ");
        Scanner s = new Scanner (System.in);
        System.out.println("insira o pedido ");
        String descriçao = s.nextLine();
        System.out.println("insira o codigo");
        int codigo = s.nextInt();
        
        Pedido one = new Pedido("Hamburguer", 01);
        Pedido two = new Pedido("Pizza", 010);
        Pedido four = new Pedido("Lasanha", 07);
        Pedido five = new Pedido(descriçao, codigo);
        FilaPedidos three = new FilaPedidos(4);
         three.enQueue(one);
         three.enQueue(two);
         three.enQueue(four);
         three.enQueue(five);
      

       for(int i =0;i<3;i++){
        three.deQueue();
        System.out.println("Entrega do pedido , " + three.head());
      

       }
       System.out.println("Obrigado pela preferencia , volte sempre :)");


    }

   
}
