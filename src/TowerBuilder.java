import java.util.Arrays;

public class TowerBuilder {
    public static String[] towerBuilder(int nFloors) {
        String[] result = new String[nFloors];
        String e;
        for (int i = 0; i < nFloors; i++) {
            result[i] = (e = " ".repeat(nFloors - i - 1)) + "*".repeat(i + i + 1) + e;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(towerBuilder(3)));
    }
}
