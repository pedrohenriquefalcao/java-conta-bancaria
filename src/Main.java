import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int escolha = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<conta> listaDeContas = new ArrayList<>(); // Inicializando array para
        // guardar as contas criadas


        do {
            System.out.println("===== Sistema Interno TechBank (v1.0) =====");
            System.out.println("== Digite [1] para cadastrar Conta Corrente");
            System.out.println("== Digite [2] para cadastrar Conta Poupança");
            System.out.println("== Digite [3] para efetuar Depósito");
            System.out.println("== Digite [4] para efetuar Saque");
            System.out.println("== Digite [5] para cadastrar Consultar saldo");
            System.out.println("== Digite [6] para encerrar o programa.");

            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {

                case 1: {
                    System.out.println("= Cadastrando Conta Corrente =");
                    System.out.println("= Insira o número da conta: =");
                    int numeroParaConta = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("= Insira o nome do Titular: =");
                    String nomeParaTitular = scanner.nextLine();

                    System.out.println("= Insira o Saldo inicial: =");
                    double saldoInicial = scanner.nextDouble();
                    scanner.nextLine();

                    contaCorrente cc = new contaCorrente(numeroParaConta, nomeParaTitular, saldoInicial);

                    listaDeContas.add(cc);

                    System.out.println("Conta Corrente cadastrada com sucesso!");
                    System.out.println(cc);
                    break;
                }
                case 2: {
                    System.out.println("= Cadastrando Conta Poupança =");
                    System.out.println("= Insira o número da conta: =");
                    int numeroParaConta = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("= Insira o nome do Titular: =");
                    String nomeParaTitular = scanner.nextLine();

                    System.out.println("= Insira o Saldo inicial: =");
                    double saldoInicial = scanner.nextDouble();
                    scanner.nextLine();

                    contaPoupanca cp = new contaPoupanca(numeroParaConta, nomeParaTitular, saldoInicial);

                    listaDeContas.add(cp);
                    break;
                }
                case 3:
                    System.out.println("= Efetuando depósito =");
                    System.out.println("= Por favor, insira o número da conta =");
                    int contaEscolhida = scanner.nextInt();
                    scanner.nextLine();

                    conta contaEncontrada = null;

                    for (conta c : listaDeContas) {
                        if (c.numeroConta == contaEscolhida) {
                            contaEncontrada = c;
                            break;
                        }
                    }

                    if (contaEncontrada != null) {
                        System.out.println("= Conta selecionada: " + contaEncontrada.nomeDoTitular);
                        System.out.println("= Insira o valor a ser depositado: =");
                        double valorDeposito = scanner.nextDouble();
                        scanner.nextLine();

                        contaEncontrada.deposito(valorDeposito);
                        System.out.println("Depósito de R$" + valorDeposito + " efetuado!");

                    } else {
                        System.out.println("Erro: Conta de número " + contaEscolhida + " não foi encontrada!");
                    }
                    break;
            }

        } while (escolha != 6);

    }
}