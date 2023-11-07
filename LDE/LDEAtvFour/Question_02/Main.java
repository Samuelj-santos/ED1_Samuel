package LDE.LDEAtvFour.Question_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaDeTarefas lista = new ListaDeTarefas();
        String b;
        int prioridade;

        Scanner s = new Scanner(System.in);

       int  a = 1;
        while (a != 0) {
             menu();
             a = s.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Insira a decrição da tarefa");
                    b = s.next();
                    System.out.println("Insira o nivel de prioridade");
                    prioridade = s.nextInt();
                    if (prioridade <0 || prioridade > 10) {
                        System.out.println("prioridade invalida ");
                    }
                    Tarefa tarefa = new Tarefa(prioridade, b);
                    lista.inserir(tarefa);
                    break;
                    case 2:
                    lista.exibir();
                    break;
                    case 3:
                    System.out.println("Insira a decrição da tarefa que deseja remover "); 
                    b = s.next();
                    lista.removerTarefa(b);
                    break;
                    case 4:
                    lista.executarTarefa();
                    break;
                    case 5:
                    System.out.println("Insira a decrição da tarefa que deseja procurar ");
                    b = s.next();
                   System.out.println("contador  " + lista.intBusca(b)); 
                    break;
                    case 6:
                    System.out.println("Insira a prioridade");
                    prioridade = s.nextInt();
                    if (prioridade <0 || prioridade > 10) {
                        System.out.println("Prioridade invalida ");
                    }
                    lista.exibir(prioridade);
                    break;
                    case 0:
                    System.out.println("ok");
                    break;
            
                default:
                    break;
            }
        }
    }

    public static void menu (){
        System.out.println("Bem vindo a lsita de tarefas ");
        System.out.println(" 1 - inserir uma nova tarefa");
        System.out.println(" 2 - exibir todas as tarefas");
        System.out.println(" 3 - cancelar uma tarefa");
        System.out.println(" 4 - executar uma tarefa");
        System.out.println(" 5 - buscar uma tarefa ");
        System.out.println(" 6 - exibir por prioridade ");
        System.out.println( "0 - encerrar o programa");
    }
}
