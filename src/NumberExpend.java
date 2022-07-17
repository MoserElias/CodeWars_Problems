public class NumberExpend {
    public static String expandedForm(int num) {
        StringBuffer res = new StringBuffer();

        int d = 1;

        while(num > 0) {
            int nextNumber = num % 10;
            num /= 10;
            if(nextNumber > 0) {
                res.insert(0, d * nextNumber);
                res.insert(0, " + ");
            }
            d *= 10;
        }

        return res.substring(3).toString();
    }

    public static void main(String[] args) {
        int num = 12;
        System.out.println(expandedForm(num));
    }

}
