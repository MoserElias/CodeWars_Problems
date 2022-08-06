import java.lang.StringBuilder;

public class StringToCamelCase {
    private static String toCamelCase(String s) {
        StringBuilder myString = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '_' || s.charAt(i) == '-') {
                char myChar = s.charAt(i + 1);
                myChar = Character.toUpperCase(myChar);
                myString.append(myChar);
                i++;
            } else {
                myString.append(s.charAt(i));
            }
        }
        return myString.toString();
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("The_Stealth_Warrior"));
    }
}
