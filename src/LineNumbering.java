import java.util.ArrayList;
import java.util.List;

public class LineNumbering {

    public static List<String> number(List<String> lines) {
        List<String> result = new ArrayList<>(lines.size());
        String toInsert = "";

        for (int i = 0; i < lines.size(); i++) {
            toInsert = (i + 1) + ": " + lines.get(i);
            result.add(toInsert);
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("a");
        input.add("b");
        input.add("c");
        System.out.println(input);

        System.out.println(number(input));
    }
}
