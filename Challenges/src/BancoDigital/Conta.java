package BancoDigital;

public abstract class Conta {
    protected static int sequencial = 1;  // Sequencial para controle único
    protected int numero;
    protected String titular;
    protected double saldo;

    // Construtor com o titular
    public Conta(String titular) {
        this.numero = sequencial++;
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, Conta destino) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract String getTipoConta();

    @Override
    public String toString() {
        return String.format("[%s] #%d - %s: R$ %.2f", getTipoConta(), numero, titular, saldo);
    }
}
