public class Principal {

    public static void main(String[] args) {

        java.util.Scanner teclado = new java.util.Scanner(System.in);

        Banco banco = new Banco();

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\nBANCO");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Consultar saldo");
            System.out.println("6 - Ver extrato");
            System.out.println("7 - Aplicar rendimento");
            System.out.println("8 - Listar contas");
            System.out.println("0 - Sair");

            System.out.print("Escolha: ");
            opcao = teclado.nextInt();

            if (opcao == 1) {

                teclado.nextLine();

                System.out.print("Nome: ");
                String nome = teclado.nextLine();

                System.out.print("CPF: ");
                String cpf = teclado.nextLine();

                System.out.print("Data de nascimento: ");
                String data = teclado.nextLine();

                if (nome.trim().isEmpty()) {
                    System.out.println("Nome inválido.");
                } else {

                    ContaBancaria conta =
                        banco.criarConta(nome, cpf, data);

                    System.out.println(
                        "Conta criada! Número: "
                        + conta.getNumero()
                    );
                }
            }

            else if (opcao == 2) {

                System.out.print("Número da conta: ");
                int numero = teclado.nextInt();

                System.out.print("Valor: ");
                double valor = teclado.nextDouble();

                ContaBancaria conta =
                    banco.localizarConta(numero);

                if (conta == null) {
                    System.out.println("Conta não encontrada.");
                } else {
                    conta.sacar(valor);
                }
            }

            else if (opcao == 3) {

                System.out.print("Número da conta: ");
                int numero = teclado.nextInt();

                System.out.print("Valor: ");
                double valor = teclado.nextDouble();

                ContaBancaria conta =
                    banco.localizarConta(numero);

                if (conta == null) {
                    System.out.println("Conta não encontrada.");
                } else {
                    conta.depositar(valor);
                }
            }

            else if (opcao == 4) {

                System.out.print("Conta de origem: ");
                int origem = teclado.nextInt();

                System.out.print("Conta de destino: ");
                int destino = teclado.nextInt();

                System.out.print("Valor: ");
                double valor = teclado.nextDouble();

                banco.transferir(origem, destino, valor);
            }

            else if (opcao == 5) {

                System.out.print("Número da conta: ");
                int numero = teclado.nextInt();

                ContaBancaria conta =
                    banco.localizarConta(numero);

                if (conta == null) {
                    System.out.println("Conta não encontrada");
                } else {

                    System.out.println("Titular: "
                        + conta.getNome());

                    System.out.println("Saldo: R$ "
                        + conta.getSaldo());
                }
            }

            else if (opcao == 6) {

                System.out.print("Número da conta: ");
                int numero = teclado.nextInt();

                ContaBancaria conta =
                    banco.localizarConta(numero);

                if (conta == null) {
                    System.out.println("Conta não encontrada");
                } else {

                    conta.exibirExtrato();

                    System.out.println(
                        "Total depositado: R$ "
                        + conta.totalDepositado()
                    );

                    System.out.println(
                        "Maior saque: R$ "
                        + conta.maiorSaque()
                    );
                }
            }

            else if (opcao == 7) {

                System.out.print("Número da conta: ");
                int numero = teclado.nextInt();

                System.out.print("Percentual: ");
                double percentual = teclado.nextDouble();

                ContaBancaria conta =
                    banco.localizarConta(numero);

                if (conta == null) {
                    System.out.println("Conta não encontrada");
                } else {
                    conta.aplicarRendimento(percentual);
                }
            }

            else if (opcao == 8) {

                banco.listarContas();
            }

            else if (opcao == 0) {

                System.out.println("Programa encerrado.");
            }

            else {

                System.out.println("Opção inválida.");
            }
        }

        teclado.close();
    }
}
