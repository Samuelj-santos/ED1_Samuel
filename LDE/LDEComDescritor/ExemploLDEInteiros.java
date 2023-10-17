package LDE.LDEComDescritor;

import java.util.Scanner;
public class ExemploLDEInteiros {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        LDEInteirosSemRepetidos numeros = new LDEInteirosSemRepetidos();
        int op, num;
        do {
            exibirMenu();
            op = in.nextInt();
            switch (op) {
                case 1: 
                System.out.print("Informe o valor: ");
                num = in.nextInt();
                numeros.inserirNoInicio(num);
                break;
                case 2: 
                System.out.println("Informe o valor ");
                num = in.nextInt();
                numeros.inserirnoFinal(num);
                break;
                   case 4:
                    System.out.println("valor removido no inicio");
                    numeros.removerNoInicio();
                    break;
                     case 5:
                      System.out.println("valor removido no final");
                      numeros.removerNoFinal();
                      break;
                      case 6:
                       System.out.println("Informe o valor que deseja remover");
                       num = in.nextInt();
                       numeros.removerEspecifico(num);
                       break;
                        
                         case 3:
                         numeros.exibirTodos();
                         break;
                         case 0:
                          System.out.println("Fim de programa!");
                          break;
                          default:
                           System.out.println("Opção inválida!");
                        }

}
 while (op != 0);      }
 public static void exibirMenu() {
    System.out.println("Opções");
    System.out.println("1 -Inserir no início");
    System.out.println("2 -Inserir no final");
    System.out.println("3 -Exibir todos");
    System.out.println("4 -Removerprimeiro");
    System.out.println("5 -Remover último");
    System.out.println("6 -Remover um elemento específico");
    System.out.println("0 -Encerrar o programa");
    System.out.print("Informe a opção desejada: ");
}
}