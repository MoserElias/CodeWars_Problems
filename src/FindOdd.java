public class FindOdd {
    public static int findIt(int[] a) {
        int count = 0, result = 0;
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            //count occurrence
            for (int j = 0; j < a.length; j++) {
                if (temp == a[j]) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return a[i];
            }
        }
        return a[0];
    }

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5}));
    }

}
