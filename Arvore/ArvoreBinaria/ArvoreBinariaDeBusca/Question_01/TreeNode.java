package Arvore.ArvoreBinaria.ArvoreBinariaDeBusca.Question_01;
public class TreeNode {

    private TreeNode left;
    private TreeNode right;
    private Produto info;


    public Produto getInfo() {
        return info;
    }
    public void setInfo(Produto info) {
        this.info = info;
    }
    public TreeNode(Produto info) {
        this.info = info;
    }
    public TreeNode getLeft() {
        return left;
    }
    public void setLeft(TreeNode left) {
        this.left = left;
    }
    public TreeNode getRight() {
        return right;
    }
    public void setRight(TreeNode right) {
        this.right = right;
    }



    public void insertNode(Produto o){
        if (o.getCodigo() == this.getInfo().getCodigo()) {
            System.out.println("Valor repetido");

        }else if (o.getCodigo() < this.getInfo().getCodigo()) {

            if (this.getLeft() == null) {
                this.setLeft(new TreeNode(o));
            } else {
              this.getLeft().insertNode(o);  
            }

        }else{

             if (this.getLeft() == null) {
                this.setRight(new TreeNode(o));
             } else {
                this.getRight().insertNode(o);
             }

        }
    }



    public Produto findNode(int codigo) {
        if (codigo == this.getInfo().getCodigo()) {

            return this.getInfo();

        } else if (codigo < this.getInfo().getCodigo()) {
            
            if (this.getLeft() == null) {
                return null;
            } else {
                return this.findNode(codigo);
            }

        } else{
            
           if (this.getRight() == null) {
            return null;
           } else {
            return this.right.findNode(codigo);
           }

        }
    }


  
    


}