import java.util.Arrays;

public class CamelCase {

    public static String camelCase(String str) {

        str = str.toLowerCase();

        StringBuilder result = new StringBuilder();

        String[] stringArray = str.split(" ");
        System.out.println(Arrays.toString(stringArray));

        for (int i = 0; i < stringArray.length; i++) {
            String word = stringArray[i];
            for (int j = 0; j < word.length(); j++) {
                if (j == 0) {
                    char toReplace = Character.toUpperCase(word.charAt(j));
                    result.append(toReplace);
                } else {
                    result.append(word.charAt(j));
                }

            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(camelCase("camel case word"));
    }
}
