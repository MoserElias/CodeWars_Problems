public class FindOutlier {

    public static int find(int[] integers) {
        //return the outlier
        int even = 0;
        int odd = 0;
        for (int j : integers) {
            if (j % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        if (even == 1) {
            for (int integer : integers) {
                if (integer % 2 == 0) {
                    return integer;
                }
            }
        } else {
            for (int integer : integers) {
                if (integer % 2 != 0) {
                    return integer;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] exampleTest1 = {2, 4, 0, 100, 4, 11, 2602, 36};

        System.out.println(find(exampleTest1));
    }
}
