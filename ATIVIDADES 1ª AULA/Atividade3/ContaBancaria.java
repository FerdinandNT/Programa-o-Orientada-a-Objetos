package Atividade3;

public class ContaBancaria {
    String titular;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado");
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }

    void transferir(ContaBancaria destino, double valor) {
        if (valor <= saldo) {
            sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência realizada");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
