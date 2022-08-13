import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        String numbers = "";

        for (int i = 0; i < binary.size(); i++) {
            int element = binary.get(i);
            numbers += element; //store element in array
        }

        //convert binary Array to int
        int result = Integer.parseInt(numbers, 2);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 1, 1, 0))));
    }
}
