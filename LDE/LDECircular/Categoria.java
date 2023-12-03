package LDE.LDECircular;

public class Categoria  implements Comparable<Categoria> {

    private String descrição;
    private ListaFilme lista;
 
 





    public Categoria(String descrição, ListaFilme lista) {
        this.descrição = descrição;
        this.lista = lista;
    }







    public String getDescrição() {
        return descrição;
    }







    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }







    public ListaFilme getLista() {
        return lista;
    }







    public void setLista(ListaFilme lista) {
        this.lista = lista;
    }







    @Override
    public int compareTo(Categoria o) {
       //se forem iguais retorna 0
        //se a que chamou for maior retorna -1
        //se a que chamou for menor retorna 1
        
        if (this.descrição.compareTo(o.descrição) == -1) {
            return -1;
         }else if (this.descrição.compareTo(o.descrição) == 1) {
            return 1;
         }else{
            return 0;
         }

         
    }

    @Override
    public String toString() {
        return "Categoria : " + this.descrição; 
    }

    
}