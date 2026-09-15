public class Banco {

    private java.util.ArrayList<ContaBancaria> contas;
    private int proximoNumero;

    public Banco() {

        contas = new java.util.ArrayList<ContaBancaria>();
        proximoNumero = 1;
    }

    public ContaBancaria criarConta(String nome, String cpf,
                                    String dataNascimento) {

        ContaBancaria conta = new ContaBancaria(
            proximoNumero,
            nome,
            cpf,
            dataNascimento,
            0
        );

        contas.add(conta);
        proximoNumero++;

        return conta;
    }

    public ContaCorrente criarContaCorrente(String nome, String cpf,
                                            String dataNascimento,
                                            double saldoInicial) {

        ContaCorrente conta = new ContaCorrente(
            proximoNumero,
            nome,
            cpf,
            dataNascimento,
            saldoInicial
        );

        contas.add(conta);
        proximoNumero++;

        return conta;
    }

    public ContaPoupanca criarContaPoupanca(String nome, String cpf,
                                            String dataNascimento,
                                            double saldoInicial) {

        ContaPoupanca conta = new ContaPoupanca(
            proximoNumero,
            nome,
            cpf,
            dataNascimento,
            saldoInicial
        );

        contas.add(conta);
        proximoNumero++;

        return conta;
    }

    public ContaUniversitaria criarContaUniversitaria(
            String nome,
            String cpf,
            String dataNascimento,
            double saldoInicial) {

        ContaUniversitaria conta = new ContaUniversitaria(
            proximoNumero,
            nome,
            cpf,
            dataNascimento,
            saldoInicial
        );

        contas.add(conta);
        proximoNumero++;

        return conta;
    }

    public ContaBancaria localizarConta(int numero) {

        for (ContaBancaria conta : contas) {

            if (conta.getNumero() == numero) {
                return conta;
            }
        }

        return null;
    }

    public void transferir(int origemNumero,
                           int destinoNumero,
                           double valor) {

        ContaBancaria origem = localizarConta(origemNumero);
        ContaBancaria destino = localizarConta(destinoNumero);

        if (origem == null || destino == null) {

            System.out.println("Conta não encontrada");
            return;
        }

        if (origem == destino) {

            System.out.println(
                "Não pode transferir para a mesma conta"
            );

            return;
        }

        if (valor <= 0) {

            System.out.println("Valor inválido");
            return;
        }

        double custo = valor;

        // Conta corrente precisa ter saldo para o valor + tarifa
        if (origem instanceof ContaCorrente) {
            custo = valor + 0.50;
        }

        if (custo > origem.getSaldo()) {

            System.out.println("Saldo insuficiente");
            return;
        }

        origem.sacar(valor);
        destino.depositar(valor);

        System.out.println("Transferência realizada");
    }

    public void listarContas() {

        System.out.println("CONTAS");

        for (ContaBancaria conta : contas) {

            System.out.println(
                "Conta: " + conta.getNumero()
                + " | Nome: " + conta.getNome()
                + " | Saldo: R$ " + conta.getSaldo()
            );
        }
    }
}
