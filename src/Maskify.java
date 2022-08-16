public class Maskify {
    public static String maskify(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 4) {
                result.append("#");
            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(maskify("Skippy"));
    }
}
