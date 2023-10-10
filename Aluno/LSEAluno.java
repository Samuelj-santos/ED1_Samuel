package Aluno;

public class LSEAluno {
   private LSENodeAluno primeiro;
    

    public boolean isEmpty(){
        if (this.primeiro == null) {
            return true;
        }else{
            return false;
        }
    }
   public void novoAluno(Aluno novo){
   LSENodeAluno nov = new LSENodeAluno(novo);
   LSENodeAluno aux = this.primeiro;

    if(isEmpty() == true){
        this.primeiro = nov;
    }else{
        while (aux != null) {
            if (aux.getInfo() == null) {
                break;
            }
            if (aux.getInfo().compareTo(novo) == 0 ) {
                System.out.println("Aluno repetido");
                break;
            }
            if (aux.getProx() == null) {
                aux.setProx(nov);
                break;
            
            }else{
                aux = aux.getProx();
            }
        }

    }
    
   }

   public void exibir(){
    LSENodeAluno aux = this.primeiro;
    if (isEmpty() == true) {
        System.out.println("Lista vazia");
    }else{
        while (aux != null) {
            
            if (aux.getInfo() == null) {
                break;
            }
            System.out.println(aux.getInfo().toString());
            aux = aux.getProx();
            
        }
    }
   }

   public void aprovadosEReprovados(LSEAluno aprovados , LSEAluno reprovados){
    LSENodeAluno aux = this.primeiro;
    if (aprovados.isEmpty()  == true && reprovados.isEmpty() == true) {
        if (isEmpty() == true) {
            System.out.println("Lista vazia");
        }else{
            while(aux != null){
                if (aux.getInfo().getMedia() >=7) {
                    aprovados.novoAluno(aux.getInfo());
                }else{
                    reprovados.novoAluno(aux.getInfo());
                }
                aux = aux.getProx();
            }
        }
    }else{
        System.out.println("as listas não estao vazias");
    }
   }



}
