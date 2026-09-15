public class Principal {

    public static void main(String[] args) {

        Banco banco = new Banco();

        // Criando uma conta corrente
        ContaCorrente corrente =
            banco.criarContaCorrente(
                "Ana",
                "111",
                "01/01/2000",
                500
            );

        // Criando uma conta poupança
        ContaPoupanca poupanca =
            banco.criarContaPoupanca(
                "Bruno",
                "222",
                "02/02/2001",
                500
            );

        // Criando uma conta universitária
        ContaUniversitaria universitaria =
            banco.criarContaUniversitaria(
                "Carlos",
                "333",
                "03/03/2002",
                500
            );


        // TESTE DA CONTA CORRENTE

        System.out.println("=== CORRENTE ===");

        corrente.sacar(50);

        // A corrente paga R$ 0,50 de tarifa.


        // TESTE DA POUPANÇA

        System.out.println("\n=== POUPANÇA ===");

        poupanca.sacar(50);

        // A poupança NÃO paga tarifa.

        poupanca.aplicarRendimento(10);

        // Somente a poupança possui rendimento.


        // TESTE DA UNIVERSITÁRIA

        System.out.println("\n=== UNIVERSITÁRIA ===");

        universitaria.sacar(350);

        // Deve recusar porque o limite é R$ 300.


        // DESAFIO

        System.out.println(
            "\n=== DESAFIO: SACAR R$ 50 DE TODAS ==="
        );

        java.util.ArrayList<ContaBancaria> contas =
            new java.util.ArrayList<ContaBancaria>();

        contas.add(corrente);
        contas.add(poupanca);
        contas.add(universitaria);


        // Todas são tratadas como ContaBancaria,
        // mas cada uma executa seu próprio sacar().

        for (ContaBancaria conta : contas) {

            System.out.println(
                "Conta "
                + conta.getNumero()
                + " - "
                + conta.getClass().getSimpleName()
            );

            conta.sacar(50);
        }


        // SALDOS FINAIS

        System.out.println("\n=== SALDOS FINAIS ===");

        for (ContaBancaria conta : contas) {

            System.out.println(
                conta.getClass().getSimpleName()
                + " | Saldo: R$ "
                + conta.getSaldo()
            );
        }
    }
}
