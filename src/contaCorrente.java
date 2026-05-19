public class contaCorrente extends conta {

    public contaCorrente() {
    }

    public contaCorrente(double numeroConta, String nomeDoTitular, double saldoAtual) {
        super(numeroConta, nomeDoTitular, saldoAtual);
    }

    @Override
    void saque(double valor) {
        double valorComTaxa = valor + 2.0;
        System.out.println("Para contas correntes o saque tem uma taxa fixa de R$ 2,00!");
        if (valorComTaxa > saldoAtual) {
            System.out.println("Erro: O valor do saque ultrapassou o saldo atual em conta.");
            return;
        }
        this.saldoAtual -= valorComTaxa;
        System.out.println("Saque no valor de R$"+valorComTaxa+" realizado! Saldo atual: R$"+saldoAtual);
    }
}
