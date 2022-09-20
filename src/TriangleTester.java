public class TriangleTester {

    public static boolean isTriangle(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isTriangle(1, 2, 2));
    }
}
