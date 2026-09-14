public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(int numero, String nome, String cpf,
                         String dataNascimento, double saldoInicial) {

        super(numero, nome, cpf, dataNascimento, saldoInicial);
    }

    @Override
    public void sacar(double valor) {

        double tarifa = 0.50;

        if (valor <= 0) {
            System.out.println("Valor inválido.");
        } else if (valor + tarifa > getSaldo()) {
            System.out.println("Saldo insuficiente.");
        } else {

            super.sacar(valor);

            super.sacar(tarifa);

            System.out.println("Tarifa: R$ 0,50");
        }
    }
}
