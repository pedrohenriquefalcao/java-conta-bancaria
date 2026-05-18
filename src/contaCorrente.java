public class contaCorrente extends conta {

    public contaCorrente() {
    }

    public contaCorrente(double numeroConta, String nomeDoTitular, double saldoAtual) {
        super(numeroConta, nomeDoTitular, saldoAtual);
    }

    @Override
    void saque(double valor) {
        System.out.println("Para contas correntes o saque tem uma taxa fixa de R$ 2,00!");
        if (valor > saldoAtual) {
            System.out.println("Erro: O valor do saque ultrapassou o saldo atual em conta.");
            return;
        }
        this.saldoAtual -= valor;
    }
}
