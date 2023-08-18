package ListaRevisãoPoo;

import java.util.Scanner;

public class mainCiculo {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        double x,y,r;
        System.out.println("Insira a coordenada x ");
        x = s.nextDouble();
        System.out.println("Insira a coordenada y ");
        y = s.nextDouble();
        System.out.println("Insira o raio ");
        r = s.nextDouble();

        Circulo c1 = new Circulo(x, y, r);
        Circulo c2 = new Circulo(4.0, 2.0, 5.0);

        double c = Circulo.Circuferencia(r );
        double v = Circulo.volume(r);
        double a  = Circulo.area(r);

     //fazer teste com vetor de objetos circulo e montar um program dinamico
     


    }
}
