public class YesOrNo {
    public static String boolToWord(boolean b) {
        String result = "";
        if (b) {
            result = "Yes";
        } else {
            result = "No";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(boolToWord(true));
    }
}
