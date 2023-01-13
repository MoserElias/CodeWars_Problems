import java.util.Arrays;

public class ShiftingArray {
    public static int[] addingShifted(int[][] arrayOfArrays, int shift) {
        int[] result = new int[arrayOfArrays[0].length + shift * (arrayOfArrays.length - 1)];

        for (int i = 0; i < arrayOfArrays.length; i++) {
            for (int j = 0; j < arrayOfArrays[i].length; j++) {
                result[(i * shift) + j] += arrayOfArrays[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(addingShifted(new int[][]{{1, 2, 3, 4, 5, 6}, {7, 7, 7, 7, 7, 7}}, 3)));
    }
}
