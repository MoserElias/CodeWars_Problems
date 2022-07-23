import java.util.Arrays;

public class SudokuValidator {
    public static boolean check(int[][] sudoku) {
        //board has to be 9x9
        if (sudoku.length < 9) {
            return false;
        }

        //check if the numbers are in range
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                if (sudoku[i][j] <= 0 || sudoku[i][j] > 9) {
                    return false;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            int[] row = new int[9];
            int[] square = new int[9];
            int[] column = sudoku[i].clone();

            for (int j = 0; j < 9; j++) {
                row[j] = sudoku[i][j];
                square[j] = sudoku[(i / 3) * 3 + j / 3][i * 3 % 9 + j % 3];
            }

            if (!(validate(column) && validate(row) && validate(square))) {
                return false;
            }
        }
        return true;
    }

    private static boolean validate(int[] check) {
        int i = 0;
        Arrays.sort(check);
        for (int j = 0; j < check.length; j++) {
            if (check[j] != ++i) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        System.out.println(check(sudoku));
    }
}
