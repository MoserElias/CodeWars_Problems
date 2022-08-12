public class MaximumSubarraySum {
    public static int sequence(int[] arr) {
        //search the maximum sum from an integer sequence in arr
        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int tempSum = 0;
            for (int j = i; j < arr.length; j++) {
                tempSum += arr[j];
                if (tempSum > maxSum) {
                    maxSum = tempSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(sequence(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
