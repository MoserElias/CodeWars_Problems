import java.util.HashSet;
import java.util.Set;

public class SumOfInterval {

    public static int sumIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        Set<Double> numSet = new HashSet<>();
        for (int[] row : intervals) {
            for (double num = row[0] + 0.5; num < row[1]; num++) {
                numSet.add(num);
            }
        }
        return numSet.size();
    }

    public static void main(String[] args) {
        System.out.println(sumIntervals(new int[][]{{-1_000_000_000, 1_000_000_000}}));
    }
}
