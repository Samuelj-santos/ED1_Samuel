package LDEPredio;

import java.util.Scanner;

public class LDEPessoa {
    private LDENode primeiro;
    private LDENode ultimo; 
    private int qtd;

    public boolean isEmpty(){
    if (this.primeiro == null && this.ultimo == null && this.qtd == 0) {
        return true;
    }else{
        return false;
    }
    }
    
    public void cadastrar(Pessoa    pessoa) {
        LDENode aux = this.primeiro;
        LDENode novo = new LDENode(pessoa);
        int a ;
        if (isEmpty() == true) {
            a = cancelar();
            if (a == 0) {
                System.out.println("ok nao inserido");
            }else if (a == 1) {
                this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
            }else{
                System.out.println("errorS");
            }
            
            
            
        }else{
            a= cancelar();
            if (a == 0 ) {
                System.out.println("ok  nao inserido");
            }else if (a == 1) {
                 while (aux != null) {
             if (aux.getInfo() ==  pessoa) {
                System.out.println("valor repetido");
                break;
             }
            
              if (aux.getProx() == null) {
                aux.setProx(novo);
                aux.getProx().setAnt(aux);
                this.ultimo = novo;
                this.ultimo.setProx(null);
                this.qtd--;
                break;
              }else{
                aux = aux.getProx();
              }

          }
            }else{
                System.out.println("Error");
            }
         
        }
    }  


        public void exibirTodos (){
        LDENode aux = this.primeiro;
        while (aux!= null) {
            System.out.println(aux.getInfo());
            aux = aux.getProx();
        }
    }

    public boolean verificar(String RG){
        if(isEmpty() == true){
            System.out.println("Lista vazia");
        }else{
            LDENode aux = this.primeiro;
            while (aux!= null) {
                if (aux.getInfo().getRG().equals(RG) ) {
                    return true;
                }else{
                    aux = aux.getProx();
                }
            }
           
        }
        return false;
     
    }

    public int getQtd(){
        return this.qtd;
    }

    public void remover(String RG){
        LDENode aux = this.primeiro;
        if (isEmpty() == true) {
            System.out.println("Lista vazia");
        }else{

            while (aux != null) {
                 if (aux.getInfo().getRG().equals(RG)) {
                 if (aux.getAnt() == null) {
                    this.primeiro = this.primeiro.getProx();
                    this.primeiro.setAnt(null);
                    this.qtd--;
                    break;
                 }
                else if (aux.getProx() == null) {
                     aux.getAnt().setProx(null);
                     this.qtd--;
                     break;
                 }else{
                     aux.getProx().setAnt(aux.getAnt());
                aux.getAnt().setProx(aux.getProx());

                this.qtd--;
                break;
                 }
               
                
              
             
          }else{
            aux = aux.getProx();
          }
            }
        }
    }

    public int  cancelar() {
        int a;
        System.out.println("deseja entrar no predio ?");
        System.out.println("Insira 1 para entrar no predio");
        System.out.println("Insira 0  para nao entrar no predio");

        Scanner sc = new Scanner(System.in);
         a = sc.nextInt();

         if (a == 1) {
            return a;
         }else{
            return a;
         }
         
    }
}
