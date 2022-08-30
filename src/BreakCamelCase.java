public class BreakCamelCase {
    public static String camelCase(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char temp = input.charAt(i);
            if (i > 0) {
                if (Character.isUpperCase(temp) && Character.isLowerCase(input.charAt(i - 1))) {
                    result.append(" ").append(input.charAt(i));
                } else {
                    result.append(input.charAt(i));
                }
            } else {
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(camelCase("camelcasingtest"));
    }
}
