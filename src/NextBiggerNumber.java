public class NextBiggerNumber {

    public static long nextBigNumber(long n) {
        int indexLast = 1;
        int indexSecondLast = 2;

        int lenght = myArrayLenght(n);
        int counter = 0;

        long result = calcNumber(n, indexLast, indexSecondLast);

        while (result <= n && counter < lenght) {
            result = calcNumber(result, indexLast++, indexSecondLast++);
            counter++;
        }
        if (result == n || result < n) {
            return -1;
        }
        return result;
    }

    private static long calcNumber(long n, int indexLast, int indexSecondLast) {
        int[] arr = longToArrayAndRevert(n);

        if (arr.length <= 1 || indexLast > arr.length || indexSecondLast > arr.length) {
            return -1;
        }
        //check if when swapped digits array is bigger
        int lastNum = arr[arr.length - 1];
        int bevoreLastNum = arr[arr.length - 2];

        arr[arr.length - indexLast] = bevoreLastNum;
        arr[arr.length - indexSecondLast] = lastNum;

        //build array to string and then to integer
        long result;

        StringBuilder s = new StringBuilder();
        for (int i : arr) {
            s.append(i);
        }
        result = Integer.parseInt(s.toString());

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

    private static int myArrayLenght(long n) {
        int[] myArray = longToArrayAndRevert(n);
        return myArray.length;
    }

    public static void main(String[] args) {
        System.out.println(nextBigNumber(144));
    }
}
