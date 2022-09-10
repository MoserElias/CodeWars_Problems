public class Square {
    public static boolean isSquare(int n) {
        //Check if n is a perfect square (square number)
        if (n == 0) {
            return true;
        }
        int x = (int) Math.sqrt(n);
        if (Math.pow(x, 2) == n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSquare(159309328));
    }
}
