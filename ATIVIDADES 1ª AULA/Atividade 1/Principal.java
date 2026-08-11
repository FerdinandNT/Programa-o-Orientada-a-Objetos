public class Principal {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.nome = "Notebook";
        produto1.preco = 3500.00;
        produto1.estoque = 10;

        Produto produto2 = new Produto();
        produto2.nome = "Mouse";
        produto2.preco = 80.00;
        produto2.estoque = 20;

        Produto produto3 = new Produto();
        produto3.nome = "Teclado";
        produto3.preco = 150.00;
        produto3.estoque = 5;

        produto1.vender(4);
        produto2.vender(8);
        produto1.vender(1);

        produto1.exibirInfo();
        produto2.exibirInfo();
        produto3.exibirInfo();
    }
}
