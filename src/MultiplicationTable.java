import java.util.Arrays;

public class MultiplicationTable {
    public static int[][] multiplicationTable(int n) {
        int[][] result = new int[n][n];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = Math.abs((j + 1) * (i + 1));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(multiplicationTable(1)));
    }
}
