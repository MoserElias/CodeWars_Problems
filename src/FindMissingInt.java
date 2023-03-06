public class FindMissingInt {

    public static int findMissing(int[] numbers) {
        int missingNum = 0;
        int diff = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            diff = numbers[i + 1] - numbers[i];
        }

        //find the difference
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] + diff != numbers[i + 1]) {
                missingNum = numbers[i] + diff;
            }
        }
        if (missingNum == 0) {
            return numbers[0]; //if nothing is missing
        }
        return missingNum;
    }

    public static void main(String[] args) {
        System.out.println(findMissing(new int[]{1, 1, 1}));
    }
}
