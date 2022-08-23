public class MaxProduct {
    public static int adjacentElementsProduct(int[] array) {
        int result = Integer.MIN_VALUE;
        for (int i = 1; i < array.length; i++) {
            int tempSum;
            tempSum = array[i - 1] * array[i];
            if (tempSum > result) {
                result = tempSum;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] temp = {-23, 4, -5, 99, -27, 329, -2, 7, -921};
        System.out.println(adjacentElementsProduct(temp));
    }
}
