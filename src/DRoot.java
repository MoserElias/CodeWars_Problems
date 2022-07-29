public class DRoot {
    public static int digital_root(int n) {
        int result = calc(n);
        String tempString = Integer.toString(result);
        while (tempString.length() != 1) {
            result = calc(result);
            tempString = Integer.toString(result);
        }
        return result;
    }

    private static int calc(int n) {
        String integerArray = Integer.toString(n);
        int sum = 0;
        for (int i = 0; i < integerArray.length(); i++) {
            char temp = integerArray.charAt(i);
            int tempNum = Character.getNumericValue(temp);
            //calc sum
            sum += tempNum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(digital_root(493193));
    }
}