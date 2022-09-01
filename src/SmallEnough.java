public class SmallEnough {

    public static boolean smallEnough(int[] a, int limit) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > limit) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(smallEnough(new int[]{66, 101}, 200));
    }
}
