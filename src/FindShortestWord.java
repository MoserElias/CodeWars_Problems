public class FindShortestWord {

    public static int findShort(String s) {
        int count = Integer.MAX_VALUE;
        //Write every word from s to a String Array
        String[] strArray = s.split(" ");

        for (int i = 0; i < strArray.length; i++) {
            if (count > strArray[i].length()) {
                count = strArray[i].length();
            }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
    }
}
