public class contaPoupanca extends conta {

    public contaPoupanca() {
    }

    public contaPoupanca(int numeroConta, String nomeDoTitular, double saldoAtual) {
        super(numeroConta, nomeDoTitular, saldoAtual);
    }

    @Override
    void saque(double valor) {
        if (valor > saldoAtual) {
            System.out.println("Erro: Valor superior ao saldo atual. Tente novamente!");
            return;
        }
        if (valor <= 0) {
            System.out.println("Erro: O valor do saque deve ser maior que zero.");
            return;
        }
        this.saldoAtual -= valor;
        System.out.println(nomeDoTitular+": Saque no valor de R$"+valor+" realizado! Saldo atual: R$"+saldoAtual);
    }
}
