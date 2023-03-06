public class FindMissingInt {

    public static int findMissing(int[] numbers) {
        int missingNum = 0;
        //find the difference
        int diff = numbers[1] - numbers[0];
        System.out.println(diff);
       /* if (numbers[2] - numbers[1] != diff) { //if the difference is not accurate for the first nums
            diff = numbers[2] - numbers[1];
        }*/

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i + 1] - numbers[i] != diff) {
                missingNum = numbers[i] + 1;
            }
        }

        return missingNum;
    }

    public static void main(String[] args) {
        System.out.println(findMissing(new int[]{1, 3, 4}));
    }
}
