package LSEInteiros;

public class Main {
    public static void main(String[] args) {
        LSEinteiros soma = new LSEinteiros();
        LSEinteiros one = new LSEinteiros();
        LSEinteiros two = new LSEinteiros();
        LSEinteiros copia = new LSEinteiros();

        one.inserirNoInicio(10);
        one.inserirNoInicio(20);
        one.inserirNoInicio(30);
        one.inserirNoInicio(40);
         one.exibirTodos();
         System.out.println("separação");
        two.inserirNoInicio(10);
        two.inserirNoInicio(10);
        two.inserirNoInicio(10);
        two.exibirTodos();

        // copia = one.copiar();
        // copia.exibirTodos();


        soma.soma(one, two);
        soma.exibirTodos();


 




                
        

    }
}
