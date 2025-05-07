package JogoSudoku;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SudokuGame game = new SudokuGame();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Sudoku Java! Digite 'start' para começar ou 'exit' para sair.");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Falou! Até a próxima.");
                break;
            } else if (input.equals("start")) {
                game.startGame();
                game.displayBoard();
            } else if (input.matches("\\d+ \\d+ \\d+")) {  // Verificando se o comando segue o formato 'linha coluna valor'
                String[] parts = input.split(" ");
                try {
                    int row = Integer.parseInt(parts[0]);
                    int col = Integer.parseInt(parts[1]);
                    int value = Integer.parseInt(parts[2]);

                    game.play(row, col, value);
                    game.displayBoard();

                    if (game.getStatus() == GameStatusEnum.COMPLETE) {
                        System.out.println("Jogo finalizado com sucesso!");
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Erro ao processar a jogada. Certifique-se de usar números válidos.");
                }
            } else {
                System.out.println("Comando inválido. Use: 'start', 'exit' ou jogada no formato 'linha coluna valor' (ex: 0 1 5)");
            }
        }

        scanner.close();
    }
}
