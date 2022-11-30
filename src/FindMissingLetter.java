import java.util.Arrays;

public class FindMissingLetter {

    public static char findMissingLetter(char[] array) {
        int[] alphabetInIntegers = new int[array.length];

        //check for lower or upper case
        boolean lowerCase = false;
        if (Character.isLowerCase(array[0])) {
            lowerCase = true;
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = Character.toLowerCase(array[i]);
            int toInsert = array[i] - 'a' + 1;
            alphabetInIntegers[i] = toInsert;
        }

        int missingLetter = 0;
        //check if something is missing
        for (int i = 0; i < alphabetInIntegers.length - 1; i++) {
            if (alphabetInIntegers[i] + 1 != alphabetInIntegers[i + 1]) {
                missingLetter = alphabetInIntegers[i] + 1;
            }
        }
        System.out.println(missingLetter);

        System.out.println(Arrays.toString(alphabetInIntegers));

        return lowerCase ? Character.toLowerCase(getCharFromNumber(missingLetter)) : Character.toUpperCase(getCharFromNumber(missingLetter));
    }

    private static char getCharFromNumber(int i) {
        String result = "";
        if (i > 0 && i < 27) {
            result = String.valueOf((char) (i + 64));
        }
        return result.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(findMissingLetter(new char[]{'O', 'Q', 'R', 'S'}));
    }
}
