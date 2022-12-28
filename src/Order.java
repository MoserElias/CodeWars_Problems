import java.util.Arrays;

public class Order {
    public static String order(String words) {

        if (words.isEmpty() || words.isBlank() || words.length() == 0) {
            return "";
        }

        String[] wordsArr = words.split(" ");
        System.out.println(Arrays.toString(wordsArr));
        //create integer array with the same size, and extract the numbers for the order
        int[] orderNum = new int[wordsArr.length];
        int index = 0;
        //extract the numbers from the String
        for (String value : wordsArr) {
            for (int i = 0; i < value.length(); i++) {
                if (Character.isDigit(value.charAt(i))) {
                    orderNum[index++] = Integer.parseInt(String.valueOf(value.charAt(i)));
                }
            }
        }

        String[] result = new String[wordsArr.length];
        //now we can order the strings, after our orderNum Array
        for (int i = 0; i < orderNum.length; i++) {
            int position = orderNum[i] - 1;
            String valueToInsert = wordsArr[i];
            result[position] = valueToInsert;
        }

        //create a simple result string as return value
        String res = "";
        for (int i = 0; i < result.length; i++) {
            if (i != result.length - 1) {
                res += result[i] + " ";
            } else {
                res += result[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
    }
}
