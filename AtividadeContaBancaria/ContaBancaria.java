public class ContaBancaria {

    private int numero;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private double saldo;
    private java.util.ArrayList<Double> movimentacoes;

    public ContaBancaria(int numero, String nome, String cpf,
                         String dataNascimento, double saldoInicial) {

        this.numero = numero;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.saldo = saldoInicial;

        if (saldoInicial < 0) {
            this.saldo = 0;
        }

        movimentacoes = new java.util.ArrayList<Double>();
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

    public void setNome(String novo) {

        if (!novo.equals("")) {
            nome = novo;
        } else {
            System.out.println("Nome não pode ser vazio.");
        }
    }

    public void depositar(double valor) {

        if (valor > 0) {
            saldo = saldo + valor;
            movimentacoes.add(valor);
            System.out.println("Depósito realizado.");
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void sacar(double valor) {

        if (valor <= 0) {
            System.out.println("Valor inválido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo = saldo - valor;
            movimentacoes.add(-valor);
            System.out.println("Saque realizado.");
        }
    }

    public void exibirExtrato() {

        System.out.println("\n--- EXTRATO ---");

        for (double movimento : movimentacoes) {

            if (movimento > 0) {
                System.out.println("Depósito: R$ " + movimento);
            } else {
                System.out.println("Saque: R$ " + (-movimento));
            }
        }

        System.out.println("Saldo: R$ " + saldo);
    }
}
