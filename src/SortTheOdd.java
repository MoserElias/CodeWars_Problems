import java.util.Arrays;

public class SortTheOdd {

    public static int[] sortArray(int[] array) {
        int[] result = new int[array.length];
        int oddCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result[i] = array[i];
            } else {
                result[i] = -1;
                oddCounter++;
            }
        }

        int[] odd = new int[oddCounter];
        int oddIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd[oddIndex] = array[i];
                oddIndex++;
            }
        }
        Arrays.sort(odd);
        System.out.println(Arrays.toString(odd));

        int oddIndex2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (result[i] == -1) {
                result[i] = odd[oddIndex2];
                oddIndex2++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0})));
    }
}
