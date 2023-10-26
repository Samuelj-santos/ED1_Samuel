package LDE.LDEQueue;

public class Main {
    public static void main(String[] args) {
        LDEQueue one = new LDEQueue();
        one.enQueue(10);
        one.enQueue(20);
        one.enQueue(30);
        one.enQueue(40);
        one.deQueue();
        one.deQueue();
       
        System.out.println(one.head());
        System.out.println(one.isEmpty());
        System.out.println(one.isFull());
    }
}
