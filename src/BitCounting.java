public class BitCounting {
    public static int countBits(int n) {
        String myBinary = Integer.toBinaryString(n); 
        
        int counter = 0;
        for (int i = 0; i < myBinary.length(); i++) {
            if(myBinary.charAt(i) == '1') {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(countBits(10));
    }
}
