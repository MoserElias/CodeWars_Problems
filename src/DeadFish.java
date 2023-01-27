import java.util.Arrays;

public class DeadFish {

    public static int[] parse(String data) {

        data = data.replaceAll(" ", "");

        StringBuilder result = new StringBuilder();
        int value = 0;

        if (data.isEmpty() || data.isBlank() || data.equals(" ")) {
            return new int[]{};
        }

        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == 'i') {
                value++;
            } else if (data.charAt(i) == 'd') {
                value--;
            } else if (data.charAt(i) == 's') {
                value = (int) Math.pow(value, 2);
            } else if (data.charAt(i) == 'o') {
                result.append(value).append(" ");
            }
        }

        String[] res = result.toString().split(" ");

        int[] finalRes = new int[res.length];
        if (!result.isEmpty()) {
            for (int i = 0; i < res.length; i++) {
                if (!res[i].isBlank() || !res[i].isEmpty()) {
                    finalRes[i] = Integer.parseInt(res[i]);
                }
            }
        } else {
            return new int[]{};
        }
        return finalRes;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(parse(" i")));
    }
}
