package LSEStack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LSEInt one = new LSEInt();
        int a =1;

        System.out.println("OBS: a pilha tem tamanho 10");
        while (a !=0) {
            exibirOpções();
        System.out.println("Insira o opção desejada");
         a= s.nextInt();

        switch (a) {
            case 1:
            System.out.println("Insira o valor que deseja inserir");
            int b = s.nextInt();
                one.push(b);
                break;

                case 2:
                one.pop();
                System.out.println("retirado");
                break;
                
                case 3:
                System.out.println("O elemento é " + one.top());
                break;

                case 4:
                one.exibirTodos();
                break;
                
                case 0:
                System.out.println("ok");
        
            default:
                break;
        }
        }
        
    }

    public  static void exibirOpções(){
        System.out.println("Olá ,  aqui estão suas opções");
        System.out.println("1 - push,colocar um elemento na pilha ");
        System.out.println("2 -pop,retirar o primeiro da pilha");
        System.out.println("3 -top,retorna o primeiro da pilha , mas não o retira");
        System.out.println("4 -exibir, mostra os itens da pilha");
        System.out.println("0 -encerrar o programa");
    }
}
