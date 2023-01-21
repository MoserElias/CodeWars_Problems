public class RoundToTheNextMultipleOf5 {
    public static int roundToNext5(int number) {
        if (number % 5 == 0) {
            return number;
        } else {
            while (true) {
                number++;
                if (number % 5 == 0) {
                    return number;
                }

            }
        }
    }

    public static void main(String[] args) {
        System.out.println(roundToNext5(-15));
    }
}
