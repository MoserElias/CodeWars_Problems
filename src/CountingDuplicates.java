public class CountingDuplicates {
    public static int duplicateCount(String text) {
        text = text.toLowerCase();

        int count = 0;
        int indexFoundChars = 0;

        char[] foundChars = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            char toCompare = text.charAt(i);
            for (int j = 0; j < text.length(); j++) {
                if (toCompare == text.charAt(j) && j != i) {
                    if (!checkIfFound(text.charAt(j), foundChars)) {
                        foundChars[indexFoundChars] += text.charAt(j);
                        indexFoundChars++;
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private static boolean checkIfFound(char c, char[] myCharArray) {
        for (int i = 0; i < myCharArray.length; i++) {
            if (c == myCharArray[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(duplicateCount("ABBA"));
    }
}

