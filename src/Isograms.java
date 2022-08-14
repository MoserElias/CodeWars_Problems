public class Isograms {
    public static boolean isIsogram(String str) {
        char toCompare = ' ';
        String toCheck = str.toLowerCase();
        for (int i = 0; i < toCheck.length(); i++) {
            toCompare = toCheck.charAt(i);
            for (int j = 0; j < toCheck.length(); j++) {
                if (toCheck.charAt(j) == toCompare && i != j) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("moOse"));
    }
}
