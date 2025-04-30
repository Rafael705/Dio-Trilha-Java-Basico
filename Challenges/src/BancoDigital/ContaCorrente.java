package BancoDigital;


public class ContaCorrente extends Conta {
    public ContaCorrente(String titular) {
        super(titular);
    }

;    @Override
    public String getTipoConta() {
        return "Corrente";
    }
}

