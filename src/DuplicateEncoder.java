public class DuplicateEncoder {

    public static String encode(String word) {
        StringBuilder result = new StringBuilder();
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            int times = 0;
            char charToCheck = word.charAt(i);
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == charToCheck && i != j) {
                    times++;
                }
            }
            if (times == 0) {
                result.append("(");
            } else {
                result.append(")");
            }
        }
        return result.toString();
    }


    public static void main(String[] args) {
        System.out.println(encode("Prespecialized"));
    }
}
