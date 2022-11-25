public class StayNumber {
    public static int stray(int[] numbers) {
        //Check for stray numbers
        //Input Array numbers is always valid!

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] != numbers[i + 1] && i != 0) {
                return numbers[i + 1];
            } else if (i == 0 && numbers[i] != numbers[i + 1]) {
                return numbers[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(stray(new int[]{4, 17, 17, 17, 17, 17, 17}));
    }
}
