public class YourOrder {
    public static String order(String words) {
        int indexString = 1;

        StringBuilder result = new StringBuilder();
        String[] temp = words.split(" ");

        for (int i = 0; i < temp.length; i++) {
            // Save the current string from the String array
            String temporary = temp[i];
            for (int j = 0; j < temporary.length(); j++) {
                if (temporary.charAt(j) == indexString) {
                    result.append(temp[i]);
                    indexString++;
                } else {
                    result.append(temp[i]);
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
    }
}
