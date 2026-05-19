public abstract class conta {

    double numeroConta;
    String nomeDoTitular;
    protected double saldoAtual;

    public conta() {
    }

    public conta(double numeroConta, String nomeDoTitular, double saldoAtual) {
        this.numeroConta = numeroConta;
        this.nomeDoTitular = nomeDoTitular;
        this.saldoAtual = saldoAtual;
    }

    void deposito(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: Para depositar é necessário inserir um valor maior que zero.");
            return;
        }
        this.saldoAtual += valor;
        System.out.println("Depósito com o valor de " + valor + " foi feito com sucesso!");
    }

    abstract void saque(double valor);

}
