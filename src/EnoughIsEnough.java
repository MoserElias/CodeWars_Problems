import java.util.Arrays;

public class EnoughIsEnough {
    public static int[] deleteNth(int[] elements, int maxOccurences) {
        int size = elements.length;
        for (int i = 0; i < elements.length; i++) {
            int count = 0;//to check presence of elements
            for (int j = 0; j < elements.length; j++) if (elements[i] == elements[j]) count++;
            if (count > maxOccurences && elements[i] != -1) {
                int check = count;//so that elements only remove till their presence is = n
                for (int k = elements.length - 1; k >= 0; k--) {
                    if (check > maxOccurences) {
                        if (elements[k] == elements[i]) {
                            elements[k] = -1;
                            size--;//for the new array that has to be returned
                            check--;
                        }
                    }
                }
            }
        }
        int newA[] = new int[size];
        size = 0;
        for (int i = 0; i < elements.length; i++) if (elements[i] != -1) newA[size++] = elements[i];
        return newA;
    }

    public static void main(String[] args) {
        int[] testArray = new int[]{20, 37, 20, 21};
        System.out.println(Arrays.toString(deleteNth(testArray, 1)));

    }

}
