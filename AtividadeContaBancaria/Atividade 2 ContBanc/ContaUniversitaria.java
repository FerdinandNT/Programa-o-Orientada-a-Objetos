public class ContaUniversitaria extends ContaBancaria {

    private static final double LIMITE_SAQUE = 300.00;

    public ContaUniversitaria(int numero, String nome, String cpf,
                              String dataNascimento, double saldoInicial) {

        super(numero, nome, cpf, dataNascimento, saldoInicial);
    }

    @Override
    public void sacar(double valor) {

        if (valor > LIMITE_SAQUE) {

            System.out.println(
                "Saque máximo de R$ 300,00."
            );

            return;
        }

        super.sacar(valor);
    }
}
