public class ContaBancaria {

    protected int numero;
    protected String nome;
    protected String cpf;
    protected String dataNascimento;
    protected double saldo;
    protected java.util.ArrayList<Double> movimentacoes;

    public ContaBancaria(int numero, String nome, String cpf,
                         String dataNascimento, double saldoInicial) {

        this.numero = numero;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;

        if (saldoInicial < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldoInicial;
        }

        this.movimentacoes = new java.util.ArrayList<Double>();
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public double getSaldo() {
        return saldo;
    }

    public java.util.ArrayList<Double> getMovimentacoes() {
        return movimentacoes;
    }

    public void setNome(String novo) {

        if (novo != null && !novo.trim().isEmpty()) {
            nome = novo;
        } else {
            System.out.println("Nome não pode ser vazio");
        }
    }

    public void depositar(double valor) {

        if (valor <= 0) {
            System.out.println("Valor inválido");
            return;
        }

        saldo = saldo + valor;
        movimentacoes.add(valor);

        System.out.println("Depósito realizado");
    }

    // Saque simples, sem tarifa
    public void sacar(double valor) {

        if (valor <= 0) {
            System.out.println("Valor inválido");
            return;
        }

        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
            return;
        }

        saldo = saldo - valor;
        movimentacoes.add(-valor);

        System.out.println("Saque realizado");
    }

    public void exibirExtrato() {

        System.out.println("EXTRATO");

        for (double movimento : movimentacoes) {

            if (movimento > 0) {
                System.out.println(
                    "Depósito: R$ " + movimento
                );
            } else {
                System.out.println(
                    "Saque: R$ " + (-movimento)
                );
            }
        }

        System.out.println("Saldo: R$ " + saldo);
    }

    public double totalDepositado() {

        double total = 0;

        for (double movimento : movimentacoes) {

            if (movimento > 0) {
                total = total + movimento;
            }
        }

        return total;
    }

    public double maiorSaque() {

        double maior = 0;

        for (double movimento : movimentacoes) {

            if (movimento < 0) {

                double saque = -movimento;

                if (saque > maior) {
                    maior = saque;
                }
            }
        }

        return maior;
    }
}
