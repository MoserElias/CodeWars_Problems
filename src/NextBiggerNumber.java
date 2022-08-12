public class NextBiggerNumber {
    public static long nextBiggerNumber(long n) {
        int arr[] = longToArrayAndRevert(n);

        if (arr.length <= 1) {
            return -1;
        }
        //check if when swapped digits array is bigger
        int lastNum = arr[arr.length - 1];
        int bevoreLastNum = arr[arr.length - 2];

        arr[arr.length - 1] = bevoreLastNum;
        arr[arr.length - 2] = lastNum;

        //build array to string and then to integer
        long result = 0;
        StringBuilder s = new StringBuilder();
        for (int i : arr) {
            s.append(i);
        }
        result = Integer.parseInt(s.toString());

        if (n > result || result == n) {
            return -1;
        }
        return result;
    }

    private static int[] longToArrayAndRevert(long n) {
        //long n to int array
        int[] arr = new int[String.valueOf(n).length()];
        if (arr.length <= 1) {
            return new int[]{-1};
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (n % 10);
            n /= 10;
        }

        //revert array
        int[] revertedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            revertedArr[i] = arr[arr.length - 1 - i];
        }
        arr = revertedArr;
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(nextBiggerNumber(10990));
    }
}
