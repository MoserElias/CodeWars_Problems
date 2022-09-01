import java.awt.*;

public class RgbToHex {

    public static String rgb(int r, int g, int b) {

        if (r < 0) {
            r = 0;
        } else if (r > 255) {
            r = 255;
        }

        if (g < 0) {
            g = 0;
        } else if (g > 255) {
            g = 255;
        }

        if (b < 0) {
            b = 0;
        } else if (b > 255) {
            b = 255;
        }
        Color myColor = new Color(r, g, b);
        String hex = Integer.toHexString(myColor.getRGB()).substring(2);
        hex = hex.toUpperCase();
        return hex;
    }

    public static void main(String[] args) {
        System.out.println(rgb(-20, 275, 125));
    }
}
