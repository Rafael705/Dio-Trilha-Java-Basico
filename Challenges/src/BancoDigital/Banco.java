package BancoDigital;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Banco {
    private List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }
    public List<Conta>buscarPorTitular (String nome){
        return contas.stream().filter(c -> c.getTitular().equalsIgnoreCase(nome))
                .collect(Collectors.toList());

    }

    public void exibirContasOrdenadas() {
        contas.stream()
                .sorted((c1, c2) -> c1.getTitular().compareToIgnoreCase(c2.getTitular()))
                .forEach(System.out::println);
    }

    public double saldoTotalBanco() {
        return contas.stream()
                .mapToDouble(Conta::getSaldo)
                .sum();
    }
}
