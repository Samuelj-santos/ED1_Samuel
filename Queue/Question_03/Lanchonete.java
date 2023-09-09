package Queue.Question_03;

public class Lanchonete {
    public static void main(String[] args) {
        Pedido one = new Pedido("Hamburguer", 01);
        Pedido two = new Pedido("Pizza", 010);
        Pedido four = new Pedido("Lasanha", 07);
        FilaPedidos three = new FilaPedidos(2);

        three.enQueue(one);
        three.enQueue(two);
        System.out.println(three.head());
        three.deQueue();
        System.out.println(three.head());
      


    }
}
