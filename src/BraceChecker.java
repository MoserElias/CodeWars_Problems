public class BraceChecker {

    public static boolean isValid(String braces) {
        char[] chars = new char[braces.length()];

        //insert all chars into chars array
        for (int i = 0; i < braces.length(); i++) {
            chars[i] = braces.charAt(i);
        }
        System.out.println(chars);

        //now check if we find the counter part for every braces
        int result;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                result = findCounter(')', chars, i);
                if (result == -1) {
                    return false;
                }
            }
            if (chars[i] == '{') {
                result = findCounter('}', chars, i);
                if (result == -1) {
                    return false;
                }
            }
            if (chars[i] == '[') {
                result = findCounter(']', chars, i);
                if (result == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int findCounter(char toFind, char[] input, int index) {
        for (int i = index; i < input.length; i++) {
            if (input[i] == toFind) {
                return i;
            }
        }
        return -1; //return -1 if not found
    }

    public static void main(String[] args) {
        System.out.println(isValid("[(])"));
    }
}
