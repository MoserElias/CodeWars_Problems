public class PigLatin {

    public static String pigIt(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int j = i;

            while (i < str.length() && str.charAt(i) != ' ') {
                i++;
            }
            if (result.isEmpty()) {
                result = result.concat(
                        str.substring(j + 1, i) + str.charAt(j) + "ay"
                );
            } else {
                result = result.concat(
                        " " + str.substring(j + 1, i) + str.charAt(j) + "ay"
                );
            }
        }
        result = result.replaceAll("!ay", "!");
        result = result.replaceAll("\\?ay", "?");
        return result;
    }

    public static void main(String[] args) {
        System.out.println(pigIt("This is my string ?"));


    }

}
