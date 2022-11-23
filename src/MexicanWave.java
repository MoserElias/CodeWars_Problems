import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MexicanWave {

    public static String[] wave(String str) {
        if (str == null) {
            return null;
        }

        int indexWhiteSpace = -10;
        boolean hasWhiteSpcae = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                indexWhiteSpace = i;
                hasWhiteSpcae = true;
            }
        }

        str = str.toLowerCase();
        String stringWithoutWhiteSpace = str.replaceAll("\\s", "");

        System.out.println(stringWithoutWhiteSpace);
        String[] result = new String[stringWithoutWhiteSpace.length()];

        for (int i = 0; i < result.length; i++) {
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < stringWithoutWhiteSpace.length(); j++) {
                if (j == i) {
                    char character = Character.toUpperCase(stringWithoutWhiteSpace.charAt(j));
                    builder.append(character);
                } else {
                    builder.append(stringWithoutWhiteSpace.charAt(j));
                }

                if (hasWhiteSpcae) {
                    if (indexWhiteSpace - 1 == j) {
                        builder.append(" ");
                    }
                }
            }
            result[i] = builder.toString();
        }
        return result;
    }

    public static String[] mexicanWave2(String str) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
            }
            list.add(str.substring(0, i) + Character.toUpperCase(ch) + str.substring(i + 1));
        }
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mexicanWave2(" gap ")));
    }
}
