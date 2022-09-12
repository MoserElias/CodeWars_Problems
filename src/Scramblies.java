import java.util.HashMap;
import java.util.Map;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        if (str2.length() == 0 || str2 == null) {
            return true;
        }

        HashMap<Character, Integer> s1 = new HashMap<>();
        HashMap<Character, Integer> s2 = new HashMap<>();

        for (char ch : str1.toCharArray()) {
            char current = Character.toLowerCase(ch);
            s1.put(current, s1.getOrDefault(current, 0) + 1);
        }
        for (char ch : str2.toCharArray()) {
            char current = Character.toLowerCase(ch);
            s2.put(current, s2.getOrDefault(current, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : s2.entrySet()) {
            try {
                if (entry.getValue() > s1.get(entry.getKey())) {
                    return false;
                }
            } catch (NullPointerException e) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(scramble("scriptjavx", "javascript"));
    }
}
