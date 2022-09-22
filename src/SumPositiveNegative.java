import java.util.Arrays;

public class SumPositiveNegative {

    public static int[] countPositivesSumNegatives(int[] input) {
        int[] result = new int[0];

        if(input == null) {
            return result;
        }

        if (input.length == 0) {
            return result;
        } else {
            result = new int[2];
        }

        int countPositives = 0;
        int sumNegative = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                countPositives++;
            } else if (input[i] < 0) {
                sumNegative += input[i];
            }
        }

        result[0] = countPositives;
        result[1] = sumNegative;
        return result; //return an array with count of positives and sum of negatives
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(countPositivesSumNegatives(null)));
    }
}
