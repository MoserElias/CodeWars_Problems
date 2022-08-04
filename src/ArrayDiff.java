import java.util.Arrays;
public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {
        if (a.length == 0) return new int[]{};
        else if (b.length == 0) return a;
        int r = 0;
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            boolean flag = true;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result[r] = a[i];
                r++;
            }
        }
        return Arrays.copyOf(result, r);
    }

}