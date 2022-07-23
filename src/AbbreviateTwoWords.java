public class AbbreviateTwoWords {
    public static String abbrevName(String name) {

        StringBuilder result = new StringBuilder();
        result.append(name.charAt(0)).append(".");
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                result.append(name.charAt(i + 1));
            }
        }
        result = new StringBuilder(result.substring(0, result.length()).toUpperCase());
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(abbrevName("Evan Cole"));
    }

}
