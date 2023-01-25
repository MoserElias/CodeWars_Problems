public class MaxDiffLength {

    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return -1;
        }

        //find length max length a1
        int result = 0;
        for (int i = 0; i < a1.length; i++) {
            int a1Length = a1[i].length();
            for (int j = 0; j < a2.length; j++) {
                if (Math.abs(a1Length - a2[j].length()) > result) {
                    result = Math.abs(a1Length - a2[j].length());
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] a1 = {"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] a2 = {"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};

        System.out.println(mxdiflg(a1, a2));
    }
}
