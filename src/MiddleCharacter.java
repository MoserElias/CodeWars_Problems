public class MiddleCharacter {
    public static String getMiddle(String word) {
        String resultString = "";
        if(word.length() % 2 == 0) {
            resultString += word.charAt((word.length() - 1 )/ 2);
            resultString += word.charAt(word.length() / 2);
        } else {
            resultString += word.charAt((word.length() - 1 )/ 2);
        }
        return resultString;
    }

    public static void main(String[] args) {
        System.out.println(getMiddle("testing"));
    }
}
