public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(int numero, String nome, String cpf,
                         String dataNascimento, double saldoInicial) {

        super(numero, nome, cpf, dataNascimento, saldoInicial);
    }

    public void aplicarRendimento(double percentual) {

        if (percentual <= 0) {

            System.out.println("Percentual inválido.");
            return;
        }

        double rendimento = saldo * percentual / 100;

        saldo = saldo + rendimento;

        System.out.println("Rendimento aplicado.");
        System.out.println(
            "Rendimento: R$ " + rendimento
        );
    }
}
