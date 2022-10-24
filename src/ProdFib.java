import java.util.Arrays;

public class ProdFib {
    public static long[] productFib(long prod) {
        long[] myArray = fibArray(prod);
        long[] result = new long[3];

        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] * myArray[i + 1] == prod) {
                result[0] = myArray[i];
                result[1] = myArray[i + 1];
                result[2] = 1;
                return result;
            }
        }
        System.out.println("not found");
        return searchIntegers(prod, myArray);
    }

    private static long[] searchIntegers(long max, long[] array) {
        long[] result2 = new long[3];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] * array[i + 1] >= max) {
                result2[0] = array[i];
                result2[1] = array[i + 1];
                return result2;
            }
        }
        return null;
    }

    private static long[] fibArray(long n) {
        long[] fibNumbers = new long[(int) (n + 1)];
        fibNumbers[0] = 0;
        fibNumbers[1] = 1;
        for (int i = 2; i <= fibNumbers.length - 1; i++) {
            fibNumbers[i] = fibNumbers[i - 2] + fibNumbers[i - 1];
        }

/*
        System.out.println("fibNumbers = " + Arrays.toString(fibNumbers));
*/
        return fibNumbers;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(productFib(800)));
    }
}
