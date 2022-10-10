import java.util.Arrays;
import java.util.HashSet;

public class Subsets {

    public static <Val> long count(Val[] elems) {
        String[] myElements = new String[elems.length];

        for (int i = 0; i < elems.length; i++) {
            myElements[i] = elems[i].toString();
        }

        //remove double elems
        Object[] array = new HashSet<>(Arrays.asList(myElements)).toArray();

        return (long) Math.pow(2, array.length) - 1;
    }

    public static void main(String[] args) {
        System.out.println(count(new Character[]{'a', 'z', 'z', 'z', 'b', 'j', 'f', 'k', 'b', 'd', 'j', 'j', 'n', 'm', 'm'}));
    }
}
