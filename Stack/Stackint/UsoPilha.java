package Stack.Stackint;

import java.util.Scanner;

public class UsoPilha {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StackInt pilha = new StackInt(32);
        int num, quoc,resto;
        System.out.println("Informe o numero par ser convertido");
        num = s.nextInt();
        do{
            quoc = num/2;
            resto = num%2;
            if (pilha.isFull() == false) {
                pilha.Push(resto);
            }
          num = quoc;
        }while(num != 0);{
             num = pilha.pop();
            System.out.println(num);
        }
        System.out.println("");
        
    }
}
