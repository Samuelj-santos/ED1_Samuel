package LDE.LDECircular;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opção;
        String titulo,genero,classificação;
        int ano ;
        do {
            exibirMenu();
            System.out.println("insira a opçao");
            opção = s.nextInt();

            switch (opção) {
                case 0 :
                    System.out.println("ok");
                    break;
                     case 1:
                     System.out.print("Digite o titulo do filme: ");
                     titulo = s.nextLine();
                     System.out.print("Digite o gênero: ");
                     genero = s.nextLine();
                     System.out.print("Digite a classificação: ");
                     classificação = s.nextLine();
                     System.out.print("Digite o ano de lançamento do filme: ");
                     ano = s.nextInt();
                     inserir(titulo, genero, classificação, ano);

                    break;
                     case 2:
                    
                    break;
                     case 3:
                    
                    break;
                     case 4:
                    
                    break;
                     case 5:
                    
                    break;
                     case 6:
                    
                    break;

            
                
            }
        } while (opção != 0);
        
    }
    private static void exibirMenu() {
        System.out.println("");
        System.out.println("### Menu ###");
        System.out.println("1) Cadastrar Filme");
        System.out.println("2) Remover Filme");
        System.out.println("3) Consultar Filme");
        System.out.println("4) Editar Filme");
        System.out.println("5) Exibir Todos os Filmes");
        System.out.println("6) Exibir Filmes por Categoria");
        System.out.println("0) Sair");
    }

}
