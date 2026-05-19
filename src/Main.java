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

                case 1:
                    System.out.println("= Cadastrando Conta Corrente =");
                    System.out.println("= Insira o número da conta: =");
                    int numeroParaConta = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("= Insira o nome do Titular: =");
                    String nomeParaTitular = scanner.nextLine();

                    System.out.println("= Insira o Saldo inicial: =");
                    double saldoInicial = scanner.nextInt();
                    scanner.nextLine();

                    contaCorrente cc = new contaCorrente(numeroParaConta,nomeParaTitular,saldoInicial);

                    listaDeContas.add(cc);

                    System.out.println("Conta Corrente cadastrada com sucesso!");
                    System.out.println(cc);
                    break;
            }

        } while (escolha != 6);

    }
}