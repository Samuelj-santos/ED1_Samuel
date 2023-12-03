 package Arvore.ArvoreBinaria.ArvoreBinariaDeBusca.Question_01;


public class Tree {
     private TreeNode raiz;
     

     public boolean isEmpty(){
          if (this.raiz == null) {
               return true;
          }else{
               return  false;
          }
     }


     public void insert (Produto o){
      if (this.isEmpty() == true) {
          this.raiz = new TreeNode(o);
      }else{
          raiz.insertNode(o);
      }
     }

     public Produto find(int codigo){
          if (this.isEmpty() == true) {
               return null;
          } else {
               return raiz.findNode(codigo);
          }
     }


     public void Alterarpreço( int codigo,double novoPreço){
       if (this.isEmpty() == true) {
          System.out.println("Árvore vazia");
       } else {
          this.find(codigo).setPreço(novoPreço);
       }
     }

      public void AlterarQtdEstoque( int codigo,int novoestoque){
       if (this.isEmpty() == true) {
          System.out.println("Árvore vazia");
       } else {
          this.find(codigo).setQtdEstoque(novoestoque);
       }
     }


      public void informações( int codigo){
       if (this.isEmpty() == true) {
          System.out.println("Árvore vazia");
       } else {
         System.out.println(this.find(codigo)); 
       }
     }

     public void emOrdem(){
          if (this.isEmpty() == true) {
               System.out.println("Árvore vazia");
          } else {
               this.percorrerEmOrdem(raiz);
          }
     }

     private void percorrerEmOrdem(TreeNode r){
          if (r != null) {
              percorrerEmOrdem(r.getLeft());
              System.out.println(r.getInfo());
              percorrerEmOrdem(r.getRight());
          }
      }




}
