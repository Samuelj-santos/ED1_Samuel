package Queue.Question_01;



public class QueueInt {
    private int[] dados;
    private int qtd,head;
   

    public QueueInt(int tam){
    this.dados = new int [tam ];
     this.qtd = this.dados[this.dados.length-1];
    
    }

    public QueueInt(){
    this.dados = new int[20];
    this.qtd = this.dados[this.dados.length-1];
    }


    public void enQueue(int n ){
      
     if (isFull() == false)  {
       this.dados[this.head] = n;
       
       this.head++;
     }else{
        System.out.println("Fila cheia , não é possivel adicionar");
     }
    }
    public int head(){
     if (isEmpty() == false) {
         
        return this.dados[0];
     }
        return -1;
     
    }

    public int deQueue(){
        this.qtd = this.dados.length;
     if (isEmpty() == false) {
        this.dados[0] = 0;
        avançar();
        
     }
     return this.dados[0];
    }
    
    public boolean isEmpty(){
      
        if (this.qtd == 0) {
            return true; 
         }
         else{
             return false;
             
         }
    }
    public boolean isFull(){

        if (this.qtd != 0) {
            return true;
        }else{
            return false;
        }
    }
  public void avançar(){
    for(int i =0;i<this.dados.length-1;i++){
     this.dados[i] = this.dados[i+1];
    }
  }
}
