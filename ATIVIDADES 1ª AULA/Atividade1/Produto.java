package Atividade1;

public class Produto {
    String nome;
    double preco;
    int estoque;

    void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Estoque: " + estoque);
    }

    void vender(int qtd) {
        if (qtd <= estoque) {
            estoque -= qtd;
            System.out.println("Venda realizada com sucesso");
        } else {
            System.out.println("Estoque insuficiente");
        }
    }
}
