import java.util.Arrays;

public class SumPostiveNegative {

    public static int[] countPositivesSumNegatives(int[] input) {

        if (input.length <= 0) {
            return null;
        }

        int countPositives = 0;
        int sumNegative = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                countPositives++;
            } else if (input[i] < 0) {
                sumNegative += input[i];
            } else {
                return null;
            }
        }
        int[] result = new int[2];

        result[0] = countPositives;
        result[1] = sumNegative;
        return result; //return an array with count of positives and sum of negatives
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(countPositivesSumNegatives(new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14})));
    }
}
