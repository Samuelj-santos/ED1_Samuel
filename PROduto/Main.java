package PROduto;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    
    System.out.println("digite a quantidade de cadastros que vc vai fazer");
             int x =s.nextInt();
             CadastroProdutos y = new CadastroProdutos(x);
             
    while (s.hasNext()) {
        out();
        int a  = s.nextInt();
        if (a ==0  ) {
            break;
        }
        
        switch (a) {
            case 1:
             System.out.println("Insira o codigo");
             String  codigo = s.nextLine();
             System.out.println("Insira a descriçao do produto");
             String descrfiçao = s.nextLine();
             System.out.println("Insira o fornecedor");
             String fornecedor = s.nextLine();
             System.out.println("Insira o preço");
             double preço = s.nextDouble();
             System.out.println("Insira a quantidade em estoque ");
              int estoque = s.nextInt();
               Produto one = new  Produto(codigo, descrfiçao, fornecedor, preço, estoque);

             break;

              case 2:
              y.exibirDados();
                
            break;
             case 3:
             System.out.println("Insira o codigo");
             String d = s.nextLine();
             Produto two = new Produto(d);
             y.exibirProduto(two);
                
             break;
             case 4:
             System.err.println("insira qual tipo de alteraçao vc quer fazer");
             System.out.println("1-aumento");
             System.out.println("2-desconto");
             int tipoalteraçao = s.nextInt();
             System.out.println("insira o valor a ser para  a alteraçao ");
             int alteraçao = s.nextInt();
             System.out.println("Insira o codigo do produto");
             String h = s.nextLine();
             Produto three = new Produto(h);
             y.alterarPreço(three, alteraçao, tipoalteraçao);
                
             break;

              case 5:
              System.out.println("Insira o codigo do produto");
              String r = s.nextLine();
              Produto four = new Produto(r);
              System.out.println("Insira o acrescimo ao estoque ");
              int e = s.nextInt();
               y.atualizarEstoque(four, e);
             break;
              case 6:
              System.out.println("insira o codigo do produto");
              String f  = s.nextLine();
              Produto five = new Produto(f);
            System.out.println("Insira a venda");
            int venda  = s.nextInt();
            y.venderProduto(five, venda);
                
             break;
             case 7:
                System.out.println("Insira o codigo do produto que deseja remover ");
                String i = s.nextLine();
                Produto six = new Produto(i);
                y.apagarProduto(six);
             break;
        
            default:
                break;
        }

    }
    
   } 

   public static void out(){
     System.out.println("Loja Preço Bom");
     System.out.println("Sistema de Controle de Estoque:");
    System.out.println("\nOpções:");
    System.out.println("1 - Cadastro de um produto");
    System.out.println("2 - Exibição dos dados de um produto");
    System.out.println("3 - Exibição de todos os produtos da loja");
    System.out.println("4 - Alterar o preço de um produto");
    System.out.println("5 - Atualizar o estoque de um produto");
    System.out.println("6 - Realizar a venda de um produto");
    System.out.println("7 - Remover um produto do cadastro");
    System.out.println("0 - Sair do programa");
    System.out.println("Digie uma das opções: ");
   }
}
