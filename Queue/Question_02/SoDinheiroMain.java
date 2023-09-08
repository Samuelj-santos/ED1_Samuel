package Queue.Question_02;
import java.util.Scanner;

import Queue.Question_01.QueueInt;


public class SoDinheiroMain {
static Scanner  s  = new Scanner(System.in);
 static QueueInt one = new QueueInt();
    public static void main(String[] args) {
        
        
        System.out.println("Bem vindo ao  banco so dinheiro, pegue uma senha :)");
        Queue();
       
        System.out.println("Acabaram as senhas ,espere do lado  de fora por favor");
         for(int i =0;i<20;i++){
            System.out.println("Deseja retirar chamar o proximo da fila? digite 1 para sim e 2 para não");
            int a = s.nextInt();
            if (a == 1) {
               System.out.println("Esta liberado para atendimento senha numero " +one.head() );
               deQueue();

            }else if (a ==2) {
                System.out.println("ok");
            }else{
                System.out.println("Numero invalido");
            }
            if (one.head() == 0) {
                System.out.println("Senhas livres");
                break;
            }
         }

         System.out.println("Novas senhas");


    }

    public static void  Queue(){
         for(int i =0;i<20;i++){
         System.out.println("Deseja uma senha , digite 1 para sim e 2 para não");
         int a = s.nextInt();
         if (a == 1) {
            one.enQueue(i+1);
            System.out.println("sua senha é de numero " + (i+1));
         }else if (a == 2 ) {
            System.out.println("ok ");
         }else{
            System.out.println("numero invalido");
         }
         
        }
    }

    public static void deQueue(){
        one.deQueue();
    }
}
