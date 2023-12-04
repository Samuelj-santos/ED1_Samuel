package Arvore.ArvoreBinaria.ArvoreBinariaDeBusca.Question_01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Scanner s = new Scanner(System.in);
        int opções;
        do {
            
            exibirMenu();
            opções = s.nextInt();
            switch (opções) {
                    case 0:
                    System.out.println( " ok ");
                    break;
                    case 1:
                    System.out.println("Insira o codigo");
                    int codigo = s.nextInt();
                    System.out.println("Insira a descrição ");
                    String descrição = s.next();
                    System.out.println(" Insira o fornecedor ");
                    String fornecedor = s.next();
                    System.out.println(" Insira o preço ");
                    double preço = s.nextDouble();
                    System.out.println(" Insira a quantidade em estoque");
                    int qtdEstoque = s.nextInt(); 

                    Produto product = new Produto(codigo, descrição, fornecedor, preço, qtdEstoque);
                    tree.insert(product);
                    System.out.println("Inserção feita ");
                    break;
                    case 2:
                    tree.emOrdem();
                    break;
                    case 3:
                    System.out.println(" Insira o codigo do produto que deseja procurar");
                    int codigo2 = s.nextInt();
                    System.out.println(tree.find(codigo2));
                    System.out.println(" Este retorna um objeto ");
                    break;
                    case 4:
                     System.out.println(" Insira o codigo do produto que deseja procurar");
                    int codigo3 = s.nextInt();
                    System.out.println(tree.find(codigo3));
                    System.out.println(" Esse imprime o produto que deseja procurar");
                    break;
                    case 5:
                    System.out.println(" Insira o codigo do produto que deseja procurar");
                    int codigo4 = s.nextInt();
                    System.out.println(" Insira o novo preço");
                    double  preço2 = s.nextInt();
                    if (preço2 <= 0) {
                        System.out.println(" Preço invalido");
                    }
                    tree.Alterarpreço(codigo4, preço2);
                    break;
                    case 6:
                    System.out.println(" Insira o codigo do produto que deseja alterar a quantidade em estoque ");
                    int codigo5 = s.nextInt();
                    System.out.println(" Insira  a nova quantidade em estoque");
                    int newQtd = s.nextInt();
                    if (newQtd <= 0) {
                        System.out.println(" Numero invalido");
                    }
                    tree.AlterarQtdEstoque(codigo5, newQtd);
                    break;
                    
            
                          
                }

        } while (opções != 0);
    }

    public static void exibirMenu(){
    System.out.println("Produtos :) ");
    System.out.println("1- Cadastrar novo  produto ");
    System.out.println("2- Exibir todos os produtos ");
    System.out.println("3- Procurar produto ");
    System.out.println("4- Procurar especifico ");
    System.out.println("5- Alterar preço do produto ");
    System.out.println("6- Alterar quantidade do produto ");
    System.out.println("0- Sair");
    }
}
