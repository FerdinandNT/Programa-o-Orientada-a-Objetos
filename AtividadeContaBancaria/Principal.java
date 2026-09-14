public class Principal {

    public static void main(String[] args) {

        java.util.Scanner teclado = new java.util.Scanner(System.in);

        Banco banco = new Banco();

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n===== BANCO =====");
            System.out.println("1 - Criar conta corrente");
            System.out.println("2 - Criar conta poupança");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Transferir");
            System.out.println("6 - Consultar saldo");
            System.out.println("7 - Ver extrato");
            System.out.println("8 - Aplicar rendimento");
            System.out.println("9 - Listar contas");
            System.out.println("0 - Sair");

            System.out.print("Escolha: ");
            opcao = teclado.nextInt();

            if (opcao == 1 || opcao == 2) {

                teclado.nextLine();

                System.out.print("Nome: ");
                String nome = teclado.nextLine();

                System.out.print("CPF: ");
                String cpf = teclado.nextLine();

                System.out.print("Data de nascimento: ");
                String data = teclado.nextLine();

                if (nome.equals("")) {

                    System.out.println("Nome inválido.");

                } else {

                    ContaBancaria conta;

                    if (opcao == 1) {
                        conta = banco.criarContaCorrente(
                            nome, cpf, data
                        );
                    } else {
                        conta = banco.criarContaPoupanca(
                            nome, cpf, data
                        );
                    }

                    System.out.println("Conta criada.");
                    System.out.println(
                        "Número: " + conta.getNumero()
                    );
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

            else if (opcao == 5) {

                System.out.print("Conta de origem: ");
                int origem = teclado.nextInt();

                System.out.print("Conta de destino: ");
                int destino = teclado.nextInt();

                System.out.print("Valor: ");
                double valor = teclado.nextDouble();

                banco.transferir(origem, destino, valor);
            }

            else if (opcao == 6) {

                System.out.print("Número da conta: ");
                int numero = teclado.nextInt();

                ContaBancaria conta =
                    banco.localizarConta(numero);

                if (conta == null) {
                    System.out.println("Conta não encontrada.");
                } else {

                    System.out.println(
                        "Nome: " + conta.getNome()
                    );

                    System.out.println(
                        "Saldo: R$ " + conta.getSaldo()
                    );
                }
            }

            else if (opcao == 7) {

                System.out.print("Número da conta: ");
                int numero = teclado.nextInt();

                ContaBancaria conta =
                    banco.localizarConta(numero);

                if (conta == null) {
                    System.out.println("Conta não encontrada.");
                } else {
                    conta.exibirExtrato();
                }
            }

            else if (opcao == 8) {

                System.out.print("Número da conta: ");
                int numero = teclado.nextInt();

                System.out.print("Percentual: ");
                double percentual = teclado.nextDouble();

                ContaBancaria conta =
                    banco.localizarConta(numero);

                if (conta instanceof ContaPoupanca) {

                    ContaPoupanca poupanca =
                        (ContaPoupanca) conta;

                    poupanca.aplicarRendimento(percentual);

                } else if (conta == null) {

                    System.out.println("Conta não encontrada.");

                } else {

                    System.out.println(
                        "Conta corrente não possui rendimento."
                    );
                }
            }

            else if (opcao == 9) {

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
}                System.out.print("Data de nascimento: ");
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
