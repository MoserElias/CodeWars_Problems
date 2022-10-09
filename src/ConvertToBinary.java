public class ConvertToBinary {

    private static int toBinary(int num) {
        return Integer.parseInt(Integer.toBinaryString(num));
    }

    public static void main(String[] args) {
        System.out.println(toBinary(5));
    }
}
