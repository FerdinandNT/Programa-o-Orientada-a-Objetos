public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(int numero, String nome, String cpf,
                         String dataNascimento, double saldoInicial) {

        super(numero, nome, cpf, dataNascimento, saldoInicial);
    }

    public void aplicarRendimento(double percentual) {

        double rendimento = getSaldo() * percentual / 100;

        if (percentual > 0) {

            depositar(rendimento);

            System.out.println("Rendimento aplicado.");
            System.out.println("Rendimento: R$ " + rendimento);

        } else {
            System.out.println("Percentual inválido.");
        }
    }
}
