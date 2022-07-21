public class highAndLow {
    public static String highAndLow2(String numbers) {
        String[] string = numbers.split(" ");
        int[] arr = new int[string.length];
        for (int i = 0; i < string.length; i++) {
            arr[i] = Integer.parseInt(string[i]);
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        result = max + " " + min;
        return result;
    }

    public static void main(String[] args) {
        String numbers = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
        System.out.println(highAndLow2(numbers));
    }
}
