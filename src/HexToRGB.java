import java.awt.*;
import java.util.Arrays;

public class HexToRGB {
    public static int[] hexStringToRGB(String hex) {

        Color newColor = new Color(
                Integer.valueOf(hex.substring(1,3), 16),
                Integer.valueOf(hex.substring(3,5), 16),
                Integer.valueOf(hex.substring(5, 7), 16)
        );

        int[] result = new int[3];
        result[0] = newColor.getRed();
        result[1] = newColor.getGreen();
        result[2] = newColor.getBlue();

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(HexToRGB.hexStringToRGB("#111111")));
    }

}
