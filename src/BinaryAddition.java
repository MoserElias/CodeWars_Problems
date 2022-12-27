public class BinaryAddition {
    public static String binaryAddition(int a, int b) {
        int sum = a + b;
        String result = Integer.toBinaryString(sum);
        return result;
    } 
    public static void main(String[] args) {
        System.out.println(binaryAddition(1, 1));
    }
} 


