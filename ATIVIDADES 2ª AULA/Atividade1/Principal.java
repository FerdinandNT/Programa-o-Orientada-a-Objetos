package Atividade1;

public class Principal {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente("João", "joao123@gmail.com");
        Cliente cliente2 = new Cliente("Carla", "carla9999@gmail.com");

        Produto produto1 = new Produto("Celular", 2500);
        Produto produto2 = new Produto("Teclado", 200);
        
        Pedido pedido1 = new Pedido(cliente1, produto1, 2);
        Pedido pedido2 = new Pedido(cliente2, produto2, 2);

        pedido1.resumo();
        pedido2.resumo();
    }
}
