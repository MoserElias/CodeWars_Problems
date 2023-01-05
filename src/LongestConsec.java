import java.util.ArrayList;
import java.util.List;

public class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        List<String> result = new ArrayList<>();

        if (strarr.length == 0 || k > strarr.length || k <= 0) {
            return "";
        }

        String toConcat;
        for (int i = 0; i < strarr.length; i++) {
            toConcat = "";
            for (int j = 0; j < k; j++) {
                if (i + j >= strarr.length) {
                    break;
                }
                toConcat += strarr[i + j];
            }
            result.add(toConcat);
        }

        String res = "";
        for (String value : result) {
            if (value.length() > res.length()) {
                res = value;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String[] strarr = {"tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"};
        int k = 2;
        System.out.println(longestConsec(strarr, k));
    }
}
