public class Principal {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "João";
        conta1.saldo = 1000.00;

        ContaBancaria conta2 = new ContaBancaria();
        conta2.titular = "Maria";
        conta2.saldo = 500.00;

        conta1.depositar(200.00);
        conta1.sacar(100.00);

        conta2.depositar(300.00);
        conta2.sacar(50.00);

        conta1.transferir(conta2, 200.00);

        conta1.exibirSaldo();
        conta2.exibirSaldo();
    }
}
