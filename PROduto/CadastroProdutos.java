package PROduto;

public class CadastroProdutos {
    private int contador;
    private Produto[] dados;

    public CadastroProdutos(int lenght) {
        dados = new Produto[lenght];
    }

    public int buscacadastro(Produto one) {
        for (int i = 0; i < contador; i++) {
            if (this.dados[i].compareTo(one) == 0) {
                return i;
            }
        }

        return -1;
    }

    public void cadastroProduto(Produto one) {
        if (buscacadastro(one) == (-1)) {
            for (int i = 0; i < contador; i++) {
                if (this.dados[i] == null) {
                    this.dados[i] = one;
                    this.contador++;
                    break;
                }
            }
        } else {
            System.out.println("nao pode ser cadstrado ja existe o codigo deste produto");

        }
    }

    public void exibirDados() {
        for (int i = 0; i < contador; i++) {
            System.out.println(this.dados[i].toString());
        }
    }

    public void exibirProduto(Produto codigo) {
        this.dados[buscacadastro(codigo)].toString();

    }

    public void alterarPreço(Produto one, int alteraçao, int tipoAlteraçao) {
        if (tipoAlteraçao == 1) {
            this.dados[buscacadastro(one)].aplicarAumneto(alteraçao);
        } else {
            this.dados[buscacadastro(one)].aplicarDesconto(alteraçao);
        }

    }

    public void atualizarEstoque(Produto one, int acrescimo) {
        this.dados[buscacadastro(one)].setEstoque(acrescimo);
    }

    public void venderProduto(Produto one, int venda) {
        if (this.dados[buscacadastro(one)].getEstoque() >= venda) {
            this.dados[buscacadastro(one)].atualizarEstoque(-(venda));
        } else {
            System.out.println("estoque insuficiente para venda ");
        }
    }

    public void apagarProduto(Produto one) {
        int a = buscacadastro(one);
        if (a != (-1)) {
            this.dados[a] = null;
        } else {
            System.out.println("nao encontrado");

        }
    }

    public void bubblesort() {
        Produto a;
        for (int i = 0; i < contador - 1; i++) {

            for (int j = 0; j < contador - i - 1; j++) {

                if (dados[j].compareTo(dados[j + 1]) > 0) {

                    a = dados[j];
                    dados[j] = dados[j + 1];
                    dados[j + 1] = a;
                }
            }
        }
    }

} 