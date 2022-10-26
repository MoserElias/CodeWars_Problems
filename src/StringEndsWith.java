public class StringEndsWith {
    public static boolean solution(String str, String ending) {
        if(str.length() <= 0 || ending.length() <= 0) {
            return false;
        }

        int lengthEnding = ending.length();
        StringBuilder toCheck = new StringBuilder();

        for (int i = str.length() - lengthEnding; i < str.length(); i++) {
            toCheck.append(str.charAt(i));
        }
        System.out.println("toCheck = " + toCheck);

        if (toCheck.toString().equals(ending)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(solution(":-)", ""));
    }
}
