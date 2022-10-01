public class ReverseWords {
    public static String reverseWords(final String original) {
        String[] result = original.split(" ");

        if (original.length() == 0) {
            return original;
        }

        int i = 0;
        for (String word : result) {
            result[i] = new StringBuilder(word).reverse().toString();
            i++;
        }
        return String.join(" ", result);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("     "));
    }
}
