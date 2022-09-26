import java.text.DecimalFormat;

public class NthSeries {

    public static String seriesSum(int n) {
        double result = 1.0;
        double nenner = 4.0;

        for (int i = 2; i <= n; i++) {
            result += (1 / nenner);
            nenner += 3;
        }
        return String.format("%.2f", result);
    }


    public static void main(String[] args) {
        System.out.println(seriesSum(5));
    }
}
