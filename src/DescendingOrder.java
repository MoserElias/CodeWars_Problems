import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        if (num < 0) {
            return num;
        }

        int resultingNumber = 0;

        for (int i = 9; i >= 0; i--) {
            int tmpNumber = num;
            while (tmpNumber > 0) {
                int digit = tmpNumber % 10; //get the last digit from num
                if (digit == i) {
                    resultingNumber *= 10;
                    resultingNumber += digit;
                }
                tmpNumber /= 10;
            }
        }
        return resultingNumber;
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(42145));
    }
}
