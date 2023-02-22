public class GCD {

    public static int compute(int x, int y) {
        //search common divisor with ggt algorithm
        while (y != 0) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(compute(30, 12));
    }
}
