public class NameTheNumber {
    public static String nameThatNumber(int x) {
        String[] unit = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if (x < 20) {
            return unit[x];
        } else if (x < 100) {
            if (x % 10 == 0) {
                return tens[x / 10 - 2];
            } else {
                return tens[x / 10 - 2] + " " + unit[x % 10];
            }
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        System.out.println(nameThatNumber(93));
    }
}
