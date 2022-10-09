public class Dinglemouse {
    public static long int123(final int a) {

        if (a > 123) {
            for (int i = 0; i <= a; i++) {
                if ((int) a - i == 123) {
                    return -i;
                }
            }
        }

        final int result = 123;
        for (int i = 0; i <= 123; i++) {
            if ((int) a + i == result) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(int123(500));
    }
}
