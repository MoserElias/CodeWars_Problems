import java.util.Arrays;

public class TwoToOne {
    public static String longest(String s1, String s2) {
        String str = s1 + s2;

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char toInsert = str.charAt(i);
            boolean duplicate = false;
            for (int j = 0; j < result.length(); j++) {
                if (toInsert == result.charAt(j) && i != j) {
                    duplicate = true;
                }
            }
            if (!duplicate) {
                result += toInsert;
            }
        }
        char[] charArray = result.toCharArray();
        Arrays.sort(charArray);
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            res.append(charArray[i]);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = "xxxxyyyyabklmopq";
        System.out.println(longest(a, a));
    }
}
