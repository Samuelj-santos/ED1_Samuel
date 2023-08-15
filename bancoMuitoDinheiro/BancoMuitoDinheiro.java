package bancoMuitoDinheiro;

public class BancoMuitoDinheiro {

    public static void main(String[] args) {
        ContaBancaria conta1;
        conta1 = new ContaBancaria(123);
        System.out.println(conta1);
        conta1.depositar( 100000); 
        System.out.println(conta1);
    }
}