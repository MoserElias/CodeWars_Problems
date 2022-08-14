public class AscendDescend {

    public static String ascendDescend(int length, int minimum, int maximum) {
        //write string with integers with length from minimum to maximum
        StringBuilder result = new StringBuilder();

        final int orgMinimum = minimum;
        final int orgMaxmimum = maximum;

        for (int i = 0; i < length; i++) {
            if (minimum == maximum) {
                maximum = orgMaxmimum;
                minimum = orgMinimum;
                result.append(minimum);
                minimum++;
            } else if (minimum < maximum) {
                result.append(minimum);
                minimum++;
            } else {
                result.append(maximum);
                maximum--;
            }
        }

        return result.toString();
    }


    public static void main(String[] args) {
        System.out.println(ascendDescend(14, 0, 2));
    }
}
