import java.util.ArrayList;
import java.util.List;

public class DontGiveFive {
    public static int dontGiveMeFive(int start, int end) {
        int length;

        if (start >= end) {
            return 0;
        }

        List<Integer> myList = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            int number = i;
            boolean exists = false;
            while (Math.abs(number) > 0) {
                if (Math.abs(number % 10) == 5) { //check if number contains the digit 5
                    exists = true;
                    break;
                }
                number = number / 10;
            }
            if (!exists) {
                myList.add(i);
            }
        }
        System.out.println(myList);
        length = myList.size();
        return length;
    }

    public static void main(String[] args) {
        System.out.println(dontGiveMeFive(-9, -1));
    }
}
