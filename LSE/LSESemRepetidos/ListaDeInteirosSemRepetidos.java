package  LSESemRepetidos;

import java.util.Scanner;

public class ListaDeInteirosSemRepetidos {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        LSEInteirosSemRepetidos numeros;
        numeros = new LSEInteirosSemRepetidos();
        
      int op, num, qtd;

      do {
        exibirOpcoes();
        op = in.nextInt();

        switch (op) {
            case 1:
             System.out.print("Informe o valor a ser inserido: ");
            num = in.nextInt();
            numeros.inserirNoInicioSemRepeticao(num);
            break;

            case 2: 
            numeros.exibirTodos();
            break;

            case 3:
             numeros.removerInicio();
             break;
             case 4:
             System.out.println("Insira o valor que deseja inserir");
             int a = in.nextInt();
             numeros.inserirFinal(a);
             break;

             case 5:
             numeros.removerFinal();
             System.out.println("Remoção efetuada");
             break;
             case 0:
              System.out.println("Bye bye");
              break;

              default: System.out.println("Opção inválida!");
            }      
            } while (op != 0);}

            public static void exibirOpcoes(){ 
            System.out.println("Opções");
            System.out.println("1 -Inserir novo valor no início da lista");
            System.out.println("2 -Exibir valores na lista");
            System.out.println("3 -Remover o nó que se encontra no início da lista");
            System.out.println("4 -Inserir um valor no final da lista");
            System.out.println("5 -Remover um valor no final da lista");
            System.out.println("0 -Encerrar programa");
            System.out.print("Digite a opção desejada: ");
        }
    }