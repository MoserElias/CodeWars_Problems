public class RemoveVowels {

    public static String disemvowel(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'O'
                    && str.charAt(i) != 'u' && str.charAt(i) != 'o' && str.charAt(i) != 'A' && str.charAt(i) != 'I'
                    && str.charAt(i) != 'E' && str.charAt(i) != 'U') {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(disemvowel("No offense but, Your writing is among the worst I've ever read"));
    }
}
