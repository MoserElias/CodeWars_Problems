public class JadenCasingStrings {
    public static String toJadenCase(String phrase) {

        if(phrase == null) {
            return null;
        } else if(phrase.isBlank() || phrase.isEmpty())  {
            return null;
        }

        StringBuilder result = new StringBuilder();
        String[] phrases = phrase.split(" ");

        // interate over phrases
        for (String value : phrases) {
            for (int index = 0; index < value.length(); index++) {
                if (index == 0) {
                    char beginningChar = value.charAt(index);
                    if (Character.isLowerCase(beginningChar)) {
                        beginningChar = Character.toUpperCase(beginningChar);
                    }
                    result.append(beginningChar);
                } else {
                    result.append(value.charAt(index));
                }
            }

            if (!value.equals(phrases[phrases.length - 1])) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(toJadenCase(null));
    }
}
