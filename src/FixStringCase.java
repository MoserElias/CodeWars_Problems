public class FixStringCase {

    public static String solve(final String str) {
        if (str.isEmpty()) {
            return "";
        }

        int lowerCaseLetters = 0;
        int upperCaseLetters = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                lowerCaseLetters++;
            } else if (Character.isUpperCase(str.charAt(i))) {
                upperCaseLetters++;
            }
        }

        if (lowerCaseLetters > upperCaseLetters) {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                result += Character.toLowerCase(str.charAt(i));
            }
            return result;
        } else if (upperCaseLetters > lowerCaseLetters) {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                result += Character.toUpperCase(str.charAt(i));
            }
            return result;
        } else {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                result += Character.toLowerCase(str.charAt(i));
            }
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(solve("coDE"));
    }
}
