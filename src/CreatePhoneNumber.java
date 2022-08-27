public class CreatePhoneNumber {

    public static String createPhoneNumber(int[] numbers) {
        //turn an array of numbers to a String and turn these to a valid phone number

        StringBuilder p1 = new StringBuilder();
        StringBuilder p2 = new StringBuilder();
        StringBuilder p3 = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            if (i <= 2) {
                p1.append(numbers[i]);
            } else if (i <= 5) {
                p2.append(numbers[i]);
            } else {
                p3.append(numbers[i]);
            }
        }


        String result = "";
        result = "(" + p1.toString() + ")" + " " + p2.toString() + "-" + p3.toString();
        return result;
    }

    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}
