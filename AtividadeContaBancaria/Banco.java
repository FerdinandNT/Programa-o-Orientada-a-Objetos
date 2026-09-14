public class Banco {

    private java.util.ArrayList<ContaBancaria> contas;
    private int proximoNumero;

    public Banco() {

        contas = new java.util.ArrayList<ContaBancaria>();
        proximoNumero = 1;
    }

    public ContaBancaria criarContaCorrente(String nome, String cpf,
                                             String dataNascimento) {

        ContaCorrente conta = new ContaCorrente(
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

    public ContaBancaria criarContaPoupanca(String nome, String cpf,
                                             String dataNascimento) {

        ContaPoupanca conta = new ContaPoupanca(
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

    public ContaBancaria localizarConta(int numero) {

        for (ContaBancaria conta : contas) {

            if (conta.getNumero() == numero) {
                return conta;
            }
        }

        return null;
    }

    public void transferir(int origemNumero, int destinoNumero,
                           double valor) {

        ContaBancaria origem = localizarConta(origemNumero);
        ContaBancaria destino = localizarConta(destinoNumero);

        if (origem == null || destino == null) {
            System.out.println("Conta não encontrada.");
        } else if (origem == destino) {
            System.out.println("Não pode transferir para a mesma conta.");
        } else if (valor <= 0) {
            System.out.println("Valor inválido.");
        } else if (valor > origem.getSaldo()) {
            System.out.println("Saldo insuficiente.");
        } else {

            origem.sacar(valor);
            destino.depositar(valor);

            System.out.println("Transferência realizada.");
        }
    }

    public void listarContas() {

        System.out.println("\n--- CONTAS ---");

        for (ContaBancaria conta : contas) {

            System.out.println(
                "Número: " + conta.getNumero()
                + " | Nome: " + conta.getNome()
                + " | Saldo: R$ " + conta.getSaldo()
            );
        }
    }
}        }

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
            System.out.println("Não pode transferir para a mesma conta");
            return;
        }

        if (valor <= 0) {
            System.out.println("Valor inválido");
            return;
        }

        if (valor > origem.getSaldo()) {
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
