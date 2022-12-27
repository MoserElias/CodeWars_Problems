import java.util.Arrays;

public class StringSplit {
    public static String[] solution(String s) {
        String[] res = s.split("(?<=\\G..)");

        for (int i = 0; i < res.length; i++) {
            if (res[i].length() % 2 != 0) {
                //odd length, add _
                String value = res[i];
                value += "_";
                res[i] = value;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abc")));
    }
}
