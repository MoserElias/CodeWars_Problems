import java.util.ArrayList;
import java.util.List;

public class CountSmileyFaces {

    public static int countSmileys(List<String> arr) {
        int counter = 0;
        for (String value : arr) {
            if (value.length() == 3 || value.length() == 2) { //case for :-D or ;-D ...
                if (value.charAt(0) == ';' || value.charAt(0) == ':') {
                    if (value.charAt(1) == '-' || value.charAt(1) == '~') {
                        if (value.charAt(2) == ')' || value.charAt(2) == 'D') {
                            System.out.println(value);
                            counter++;
                        }
                    } else if (value.charAt(1) == ')' || value.charAt(1) == 'D') { //case for ;) or :D ...
                        if (value.length() == 2) { //make sure our string length is equal to 2
                            System.out.println(value);
                            counter++;
                        }
                    }
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        String[] strings = {":)", ";(", ";}", ":-D"};

        String[] strings2 = {";X", "dp2x", "o)", "oD", "'~D", "'D", ":2)", "p~x", ";~pd", "5~D)", "p;~~pD", ":D)", "po))", "'x", ";~d", "52D", "5)", ":x", ";o)", "(D", ":X", "5X", ":)", ";~p", "'X", "()", "'xD", "(~p", "8p", ";P", "pX", ";d", ";D", ":)"};
        for (String val : strings2) {
            arr.add(val);
        }
        System.out.println(countSmileys(arr));
    }
}
