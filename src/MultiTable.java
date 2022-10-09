public class MultiTable {

    public static String multiTable(int num) {
        String number = Integer.toString(num);
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            int calcResult = i * num;
            String calcResString = Integer.toString(calcResult);
            String iString = Integer.toString(i);
            result.append(iString).append(" * ").append(number).append(" = ").append(calcResString);
            if (i != 10) {
                result.append("\n");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiTable(5));
    }
}
