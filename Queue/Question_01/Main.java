package Queue.Question_01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        QueueInt one =  new QueueInt(10);
        for(int i =0;i<10;i++){
            int a = s.nextInt();
            one.enQueue(a);
        }
         System.out.println("head " + one.head());
       int b =  one.deQueue();
       
       System.out.println("uso do deQueue " + b);
       System.out.println(one.deQueue());
      
    }
}
