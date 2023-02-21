public class GCD {

    public static int compute(int x, int y) {
        //search common divisor with mod computations
        int xDivisor = 1;
        int yDivisor = 1;




        if (x < y) {
            //search divisor for x
            for (int i = 1; i <= x; i++) {
                if (x % i == 0) {
                    xDivisor = i;
                }
            }

            if (y % xDivisor == 0) {
                return xDivisor;
            }
        } else {
            //search divisor for y
            for (int i = 1; i <= y; i++) {
                if (y % i == 0) {
                    yDivisor = i;
                }
            }

            if (x % yDivisor == 0) {
                return yDivisor;
            }

        }
        //if no common divisor is found
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(compute(2672, 5678));
    }
}
