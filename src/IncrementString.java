public class IncrementString {

    public static String incrementString(String str) {
        //if the string ends with a number, increment the number by one
        String result = "";
        if (Character.isDigit(str.charAt(str.length() - 1))) {
            //search the number
            String number = "";
            String word = "";
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    number += str.charAt(i);
                } else {
                    word += str.charAt(i);
                }
            }
            //save and increment this number
            System.out.println(number);
            int numRes = Integer.parseInt(number);
            numRes++;
            String numberNew = String.valueOf(numRes);
            System.out.println(numberNew);

            word += numberNew;
            result = word;

        } else {
            for (int i = 0; i < str.length(); i++) {
                result += str.charAt(i);
            }
            result += 1;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(incrementString("foobar"));
    }
}
