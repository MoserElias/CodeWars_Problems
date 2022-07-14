public class RegexPinValidate {
    public static boolean validatePin(String pin) {
        if (pin.length() == 4 || pin.length() == 6) {
            for(char c : pin.toCharArray()) {
                if(!Character.isDigit(c)) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(validatePin("1s2n34"));
    }
}
