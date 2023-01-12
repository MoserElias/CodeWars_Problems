public class ReverseLetter {
    public static String reverseLetter(final String str) {
        String str2 = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                str2 += str.charAt(i);
            }
        }
        //now reverse the string
        String result = "";
        for (int i = str2.length() - 1; i >= 0; i--) {
            result += str2.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseLetter("krishan"));
    }
}
