import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AreSame {

    public static boolean comp(int[] a, int[] b) {

        if (a.length == 0 || b.length == 0) {
            return false;
        } else if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * a[i];
        }
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));

        //crate lists of the elements to delete them after we found one
        List<Integer> aL = new ArrayList<>();
        List<Integer> bL = new ArrayList<>();
        for (int value : a) {
            aL.add(value);
        }
        for (int value : b) {
            bL.add(value);
        }

        //now check if we have the same arrays
        for (int i = 0; i < aL.size(); i++) {
            for (int j = 0; j < bL.size(); j++) {
                if (aL.get(i).equals(bL.get(j))) {
                    bL.remove(j);
                    break;
                }
            }
        }

        if (bL.size() == 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(comp(a, b));
    }
}
