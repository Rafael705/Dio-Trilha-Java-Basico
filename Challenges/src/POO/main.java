package POO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        iphone meuIphone = new iphone();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- MENU INTERATIVO DO iPhone ---");
            System.out.println("1 - Selecionar música");
            System.out.println("2 - Tocar música");
            System.out.println("3 - Pausar música");
            System.out.println("4 - Fazer ligação");
            System.out.println("5 - Atender ligação");
            System.out.println("6 - Iniciar correio de voz");
            System.out.println("7 - Desligar ligação");
            System.out.println("8 - Exibir página da web");
            System.out.println("9 - Adicionar nova aba");
            System.out.println("10 - Atualizar página");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // limpar o buffer

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o nome da música: ");
                        String musica = scanner.nextLine();
                        meuIphone.SelecionarMusica(musica);
                        break;
                    case 2:
                        meuIphone.tocar();
                        break;
                    case 3:
                        meuIphone.pausar();
                        break;
                    case 4:
                        System.out.print("Digite o número para ligar: ");
                        String numero = scanner.nextLine();
                        meuIphone.ligar(numero);
                        break;
                    case 5:
                        meuIphone.atender();
                        break;
                    case 6:
                        meuIphone.iniciarCorreioVoz();
                        break;
                    case 7:
                        meuIphone.desligar();
                        break;
                    case 8:
                        System.out.print("Digite a URL: ");
                        String url = scanner.nextLine();
                        meuIphone.exibirPagina(url);
                        break;
                    case 9:
                        meuIphone.adicionarNovaAba();
                        break;
                    case 10:
                        meuIphone.atualizarPagina();
                        break;
                    case 0:
                        System.out.println("Saindo... Até logo!");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite apenas números.");
                scanner.nextLine(); // limpar o buffer que causou o erro
            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
