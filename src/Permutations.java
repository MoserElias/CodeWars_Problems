import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Permutations {

    public static List<String> singlePermutations(String s) {
        //base cases
        if (s.length() == 0) {
            List<String> empty = new ArrayList<>();
            empty.add("");
            return empty;
        }

        List<String> prevResult = singlePermutations(s.substring(1));
        List<String> result = new ArrayList<>();

        for (String value : prevResult) {
            for (int i = 0; i <= value.length(); i++) {
                result.add(value.substring(0, i) + s.charAt(0) + value.substring(i));
            }
        }
        return result(result);
    }

    private static List<String> result(List<String> input) {

        System.out.println(listWithoutDuplicates);
    }

    public static void main(String[] args) {
        System.out.println(singlePermutations("aabb"));
    }
}
