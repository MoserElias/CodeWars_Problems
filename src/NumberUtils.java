public class NumberUtils {

    public static boolean isNarcisstic(int number) {
        //watch out for to many prints outs when submitting the code to codewars!
        String num = String.valueOf(number);
        char[] digits = num.toCharArray();

        int power = digits.length;
        int sum = 0;
        for (char val : digits) {
            int integerValue = Character.getNumericValue(val);
            sum += Math.pow(integerValue, power);
        }
        return sum == number;
    }

    public static boolean isNarcisstic2(int number) {
        String numberStr = String.valueOf(number);
        int sum = 0;
        for (int i = 0; i < numberStr.length(); i++) {
            sum += Math.pow(Character.getNumericValue(numberStr.charAt(i)), numberStr.length());
        }
        return sum == number;
    }

    public static void main(String[] args) {
        System.out.println(isNarcisstic(153));
        System.out.println(isNarcisstic2(153));
    }
}
