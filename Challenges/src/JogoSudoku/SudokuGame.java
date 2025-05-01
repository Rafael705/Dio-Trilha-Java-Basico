package JogoSudoku;

import JogoSudoku.BoardTemplate;
import JogoSudoku.GameStatusEnum;


import java.util.Arrays;

public class SudokuGame {

    private final Integer[][] board = new Integer[9][9];
    private GameStatusEnum statusEnum = GameStatusEnum.NON_STARTED;

    public void startGame() {
        for (Integer[] row : board) {
            Arrays.fill(row, null);
        }
        statusEnum = GameStatusEnum.INCOMPLETE;
        System.out.println("Jogo iniciado!");
    }

    public void play(int row, int col, int value) {
        if (statusEnum == GameStatusEnum.NON_STARTED) {
            System.out.println("O jogo ainda não foi iniciado. Use startGame().");
            return;
        }

        if (value < 1 || value > 9 || row < 0 || row > 8 || col < 0 || col > 8) {
            System.out.println("Entrada inválida.");
            return;
        }

        if (board[row][col] != null) {
            System.out.println("Esta célula já está preenchida.");
            return;
        }

        board[row][col] = value;
        if (isBoardComplete()) {
            statusEnum = GameStatusEnum.COMPLETE;
            System.out.println("Parabéns! Você completou o Sudoku.");
        }
    }

    public void displayBoard() {
        String[] values = Arrays.stream(board)
                .flatMap(Arrays::stream)
                .map(v -> v == null ? " " : String.valueOf(v))
                .toArray(String[]::new);

        System.out.println(BoardTemplate.BOARD_TEMPLATE.formatted((Object[]) values));
    }

    public GameStatusEnum getStatus() {
        return statusEnum;
    }

    private boolean isBoardComplete() {
        for (Integer[] row : board) {
            for (Integer cell : row) {
                if (cell == null) {
                    return false;
                }
            }
        }
        return true;
    }
}
