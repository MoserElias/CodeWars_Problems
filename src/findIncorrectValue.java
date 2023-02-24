import java.util.ArrayList;
import java.util.Arrays;

public class findIncorrectValue {

    public static int[] findIncorrectNumber(int[] tree) {
        for (int i = 0; i < tree.length; i++) {
            int check = tree[i];
            if (i == 0) {
                if (tree[i + 1] + tree[i + 2] != check) {
                    return new int[]{i, tree[i + 1] + tree[i + 2]};
                }
            } else if (i + 3 < tree.length) {
                if (tree[i + 2] + tree[i + 3] != check) {
                    return new int[]{i, tree[i + 2] + tree[i + 3]};
                }
            }
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        int[] input = new int[]{27, 13, 15, 6, 7, 5, 9};
        System.out.println(Arrays.toString(findIncorrectNumber(input)));
    }
}
