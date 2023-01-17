public class LargestFiveDigitNumberTest {

    public static int solve(final String digits) {
        int result = Integer.MIN_VALUE;

        if (digits.length() == 0) {
            return 0;
        }

        //build a number of the length 5 from the digits String
        String currentNumber = "";
        for (int i = 0; i <= digits.length() - 5; i++) {
            currentNumber = digits.substring(i, i + 5);
            //check if the new number is bigger then the last and replace it
            if (Integer.parseInt(currentNumber) > result) {
                result = Integer.parseInt(currentNumber);
            }
        }

        return result; //return the result!
    }

    public static void main(String[] args) {
        System.out.println(solve("283910"));
    }
}
