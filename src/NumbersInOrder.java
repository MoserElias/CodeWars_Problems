public class NumbersInOrder {

    public static boolean isAscOrder(int[] arr) {
        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAscOrder(new int[]{1, 6, 10, 18, 2, 4, 20}));
    }
}
