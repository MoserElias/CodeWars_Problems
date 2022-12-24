public class ReverseWords {
    public static String reverseWords(final String original) {
        String[] result;
        if (original.isBlank() || original.isEmpty()) {
            return original;
        } else {
            result = original.split(" ");
        }

        int i = 0;
        for (String word : result) {
            result[i] = new StringBuilder(word).reverse().toString();
            i++;
        }
        return String.join(" ", result);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords(" "));
    }
}
