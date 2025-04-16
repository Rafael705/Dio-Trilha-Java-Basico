package ControleDeFluxo;
import java.util.Scanner;

// Classe principal
public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        
        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            
            // Exibir a mensagem de erro caso o primeiro parâmetro seja maior que o segundo
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifica se o primeiro parâmetro é maior que o segundo e lança exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        
        int contagem = parametroDois - parametroUm;
        // Realiza o loop para imprimir os números
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

// Classe de exceção personalizada
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}
