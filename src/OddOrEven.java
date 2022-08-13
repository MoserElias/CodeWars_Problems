public class OddOrEven {
    public static String oddOrEven(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        if (sum % 2 == 0) {
            return "even";
        }
        return "odd";
    }

    public static void main(String[] args) {
        System.out.println(oddOrEven(new int[]{2, 5, 34, 6}));
    }
}
