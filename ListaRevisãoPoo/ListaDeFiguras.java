package ListaRevisãoPoo;
public class ListaDeFiguras {
private int qtd;
private Circulo [ ] dados;
private int[] cont_dados;


public ListaDeFiguras (int tam) { 
dados = new Circulo[tam];
cont_dados = new int[tam];
}

public   void inserir(Circulo a){
    for(int i =0;i<dados.length;i++){
        if (cont_dados[i] == 0) {
            cont_dados[i] = 1;
            dados[i] = a;
            qtd = qtd++;
        }
    }
}

 public void  exibir(){
    for(int i =0;i<dados.length;i++){
         System.out.println(dados[i].toString());
    }
 
 }

 public void bubblesort(){
    Circulo a;
    for (int i = 0; i < qtd - 1; i++) {

        for (int j = 0; j < qtd - i - 1; j++) {

            if (dados[j].compareTo(dados[j+1])> 0) {

                 a = dados[j];
                dados[j] = dados[j + 1];
                dados[j + 1] = a;
            }
        }
    }
}
}