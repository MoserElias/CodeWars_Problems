import java.util.Arrays;

public class GenerateShape {

    public static String generateShape(int n) {
        String[][] resMatrix = new String[n][n];

        for (int i = 0; i < resMatrix.length; i++) {
            for (int j = 0; j < resMatrix[i].length; j++) {
                resMatrix[i][j] = "+";
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < resMatrix.length; i++) {
            for (int j = 0; j < resMatrix[i].length; j++) {
                result.append(resMatrix[i][j]);
            }
            if (i != resMatrix.length - 1) {
                result.append("\n");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(generateShape(5));
        System.out.println("--------");
        System.out.println("+++\n+++\n+++");
    }

}
