public class StringIncrement {

    public static String incrementString(String str) {
        StringBuilder result = new StringBuilder();
        //check case if no number is in string
        if (!Character.isDigit(str.charAt(str.length() - 1))) {
            for (int i = 0; i < str.length(); i++) {
                result.append(str.charAt(i));
            }
            result.append(1);
        } else {
            StringBuilder myNumber = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    myNumber.append(str.charAt(i));
                }
            }
            int num = Integer.parseInt(myNumber.toString());
            num++;
            String numberToInsert = Integer.toString(num);

            //build the new string
            int index = 0;
            for (int i = 0; i < str.length(); i++) {
                if (!Character.isDigit(str.charAt(i))) {
                    result.append(str.charAt(i));
                } else {
                    if (index < numberToInsert.length()) {
                        result.append(numberToInsert.charAt(index++));
                    } else {
                        break;
                    }
                }
            }
        }
        return result.toString();
    }


    public static void main(String[] args) {
        System.out.println(incrementString("foobar000"));
    }
}
