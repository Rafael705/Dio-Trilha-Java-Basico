import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando e lendo os dados do usuário
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();
        
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        
        System.out.print("Por favor, digite seu Nome: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();
        
        // Exibindo a mensagem formatada
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é: " + agencia + ", conta: " + numero + " e seu saldo R$: " + saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}
