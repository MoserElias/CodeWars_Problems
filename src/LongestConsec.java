public class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        if (k <= 0) {
            return "";
        }
        String longest = "";
        for (int i = strarr.length - 1; i >= 0; i--) {
            String toTest = strarr[i];
            for (int j = strarr.length - 1; j >= 0; j--) {
                if (i != j && !strarr[i].equals(strarr[j])) {
                    for (int l = j; l < j + (k - 1); l++) {
                        toTest += strarr[j];
                    }
                    if (longest.length() <= toTest.length()) { //if toTest is longer then longest, then replace longest
                        longest = toTest;
                        toTest = strarr[i];
                    } else {
                        toTest = strarr[i]; //else we have to reset our test String for the next possible version
                    }
                }
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        String[] strarr = {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
        int k = 2;
        System.out.println(longestConsec(strarr, k));
    }
}
