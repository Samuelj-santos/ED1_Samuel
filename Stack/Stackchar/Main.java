package Stack.Stackchar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira uma String (sem letra maiusculas) e recebera se é um palindromo ");
        String a = s.nextLine() ;
        StackChar b = new StackChar(a);
        
        boolean c = b.isPalindrome();
       
         
        if (c == true) {
         System.out.println("Sua String é um palindromo");   
        }else if ( c == false) {
             System.out.println("Não é um palindromo");
        }
           
        // problema estranho :
        // se eu colocar nao e  um palindromo
        // ele aceita mas outras frases que nao estao no print elee funciona normalmente


    }
}
