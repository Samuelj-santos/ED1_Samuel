package LDEPredio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s   = new Scanner(System.in);
        LDEPessoa predio = new LDEPessoa();
        int op = 1;
        do{
            menu();
 
           op = s.nextInt();  

           switch (op) {
            case 0:
                System.out.println("ok");

                break;
            case 1:
            System.out.println("Insira o seu RG");
             String  RG = s.next();
             System.out.println("Insira seu nome");
             String nome = s.next();
            Pessoa novaPessoa= new Pessoa(RG, nome);
            predio.cadastrar(novaPessoa);
            break;
            case 2:
            predio.exibirTodos();
            break;  
            case 3:
            System.out.println("Insira o RG da  pessoa que deseja verificar");
            RG = s.next();
            if (predio.verificar(RG) == true) {
                System.out.println("Ele(a) esta no predio");
            }else{
                System.out.println("Ele(a) não  esta no predio");
            }  
            break;
            case 4:
            System.out.println("Insira o RG da pessoa que deseja remover ");
            RG = s.next();
            predio.remover(RG);
            System.out.println("Removido");
            break;

           }
        }while(op!=0);

    }
    public static void menu(){
        System.out.println("Welcome");
        System.out.println("1 - para se cadastrar");
        System.out.println("2 para exibir todos os que estao no predio");
        System.out.println("3 - para verificar");
        System.out.println("4 - para remover");
        System.out.println("0 - para acabar");
    }
}
