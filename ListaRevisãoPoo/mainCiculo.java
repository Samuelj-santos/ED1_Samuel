package ListaRevisãoPoo;

import java.util.Scanner;

public class mainCiculo {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
      Circulo c1,c2,c3;
      System.out.println("insira x ");
      double x = s.nextDouble();
      System.out.println("insira y");
      double y = s.nextDouble();
      System.out.println("insira z");
      double z  = s.nextDouble();
      c1 = new Circulo(x, y, z);
       System.out.println("insira x ");
       x = s.nextDouble();
      System.out.println("insira y");
       y = s.nextDouble();
      System.out.println("insira z");
       z  = s.nextDouble();
      c2 = new Circulo(x, y, z);
       System.out.println("insira x ");
       x = s.nextDouble();
      System.out.println("insira y");
       y = s.nextDouble();
      System.out.println("insira z");
       z  = s.nextDouble();
      c3 = new Circulo(x, y, z);


      ListaDeFiguras one = new ListaDeFiguras(3);
      one.inserir(c1);
      one.inserir(c2);
      one.inserir(c3);

      one.bubblesort();

      one.exibir();

     


    }
}
