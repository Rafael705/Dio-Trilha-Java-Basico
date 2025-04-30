package BancoDigital;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String titular) {
        super(titular);
    }

    @Override
    public String getTipoConta() {
        return "Poupança";
    }
}

