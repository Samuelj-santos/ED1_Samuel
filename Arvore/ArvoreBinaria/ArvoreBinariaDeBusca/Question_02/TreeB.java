package Arvore.ArvoreBinaria.ArvoreBinariaDeBusca.Question_02;

public class TreeB<T extends Comparable<T>>{
    private TreeB<T> right;
    private TreeB<T> left;
    private T info;

    public TreeB (T outro){
        this.info = outro;
    }

    public TreeB<T> getRight() {
        return right;
    }

    public void setRight(TreeB<T> right) {
        this.right = right;
    }

    public TreeB<T> getLeft() {
        return left;
    }

    public void setLeft(TreeB<T> left) {
        this.left = left;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }


    public void insertNode(T value){
        if(value.compareTo(this.info)==0){
            System.out.println("Valor repetido");
        }else{
            if(this.info.compareTo(value) > 0){
                if(this.left ==null){
                    this.setLeft(new TreeB<T>(value));
                }else{
                    this.getLeft().insertNode(value);
                }
            } else{
                if(this.right ==null){
                    this.setRight(new TreeB<T>(value));
                }else{
                    this.getRight().insertNode(value);
                }
            }
        }

    }


}
