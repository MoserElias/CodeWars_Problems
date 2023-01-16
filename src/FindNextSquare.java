public class FindNextSquare {

    public static long findNextSquare(long sq) {
        long add = (int) Math.sqrt(sq);
        if (Math.sqrt(sq) == (int) Math.sqrt(sq)) {
            return sq + (add * 2) + 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(findNextSquare(625));
    }
}
