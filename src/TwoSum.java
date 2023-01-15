import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {
        int[] resultIndex = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            int valueToTest = numbers[i];
            for (int j = 0; j < numbers.length; j++) {
                if (i != j && valueToTest + numbers[j] == target) {
                    resultIndex[1] = i;
                    resultIndex[0] = j;
                    break;
                }
            }
        }
        return resultIndex;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3}, 4)));
    }
}
