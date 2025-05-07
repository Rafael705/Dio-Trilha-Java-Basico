package BancoDigital;
public class main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Conta c1 = new ContaCorrente("Bridges");
        Conta c2 = new ContaPoupanca("Joana");
        Conta c3 = new ContaCorrente("Lucas");

        banco.adicionarConta(c1);
        banco.adicionarConta(c2);
        banco.adicionarConta(c3);

        c1.depositar(1000);
        c2.depositar(2000);
        c1.transferir(200, c3);

        banco.exibirContasOrdenadas();

        System.out.println("\nSaldo total no banco: R$ " + banco.saldoTotalBanco());

        banco.buscarPorTitular("Bridges")
                .forEach(c -> System.out.println("Conta do Bridges: " + c));
    }
}

