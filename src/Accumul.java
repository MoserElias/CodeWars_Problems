public class Accumul {

    public static String accum(String s) {
        StringBuilder result = new StringBuilder();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                char myChar = s.charAt(i);
                if (j == 0 && i < 1) {
                    result.append(Character.toUpperCase(myChar)).append("-");
                } else if (j == 0) {
                    result.append(Character.toUpperCase(myChar));
                } else if (j == i && j != s.length() - 1) {
                    result.append(myChar).append("-");
                } else {
                    result.append(myChar);
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(accum("ZpglnRxqenU"));

        System.out.println("Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu");
    }
}
