import java.util.Arrays;

public class DetectPangram {
    public static boolean check(String sentence) {
        if (sentence == null) {
            return false;
        }
        Boolean[] alphabetMarker = new Boolean[26];
        Arrays.fill(alphabetMarker, false);
        int alphabetIndex = 0;
        String str = sentence.toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            if('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                alphabetIndex = str.charAt(i) - 'A'; //get the integer value from char
                alphabetMarker[alphabetIndex] = true;
            }
        }
        for(boolean index : alphabetMarker) {
            if(!index) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog"));
    }
}
