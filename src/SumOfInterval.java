import java.util.HashSet;
import java.util.Set;

public class SumOfInterval {

    public static int sumIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        Set<Integer> numSet = new HashSet<>();
        for (int[] row : intervals) {
            for (int k = row[0]; k < row[1]; k++) {
                if (!numSet.contains(k)) {
                    numSet.add(k);
                }
            }
        }
        return numSet.size();
    }

    public static void main(String[] args) {
        System.out.println(sumIntervals(new int[][]{{2, 5}, {-1, 2}, {-40, -35}, {6, 8}}));
    }
}
