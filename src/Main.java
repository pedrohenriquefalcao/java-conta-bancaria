public class Main {
    public static void main(String[] args) {

        contaCorrente Joaozinho = new contaCorrente(1, "João Gomes", 1000);
        Joaozinho.saque(30);
        Joaozinho.saque(70);

        contaPoupanca Maria = new contaPoupanca(2,"Maria Silva",1000);
        Maria.saque(30);
        Maria.saque(70);

    }
}