public class AscendDescend {

    public static String ascendDescend(int length, int minimum, int maximum) {
        String result = "";
        for (int i = minimum; i < maximum; i++) {
            result = result + i;
        }
        for (int i = maximum; i > minimum; i--) {
            result = result + i;
        }

        if (result.length() == 0) {
            return result;
        }
        result = result.repeat(length / result.length() + 1);
        return result.substring(0, length);
    }


    public static void main(String[] args) {
        System.out.println(ascendDescend(14, 0, 2));
    }
}
