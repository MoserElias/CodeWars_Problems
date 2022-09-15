import java.util.Arrays;
import java.util.Objects;

public class RemoveDuplicateWords {

    public static String removeDuplicateWords(String s) {
        //remove duplicate words from s
        String[] strArray;
        strArray = s.split(" ");

        String[] tempString = new String[strArray.length];

        int index = 0;
        for (int i = 0; i < strArray.length; i++) {
            String tempWord = strArray[i];
            boolean wordIsAlreadyInString = false;
            for (int j = 0; j < tempString.length; j++) {
                if (Objects.equals(tempWord, tempString[j])) {
                    wordIsAlreadyInString = true;
                    break;
                }
            }
            if (!wordIsAlreadyInString) {
                tempString[index++] = tempWord;
            }
        }

        int countNull = 0;
        for (int i = 0; i < tempString.length; i++) {
            if (tempString[i] == null) {
                countNull++;
            }
        }
        int newLength = tempString.length - countNull;

        String[] resultingArray = new String[newLength];
        System.arraycopy(tempString, 0, resultingArray, 0, resultingArray.length);

        String result = Arrays.toString(resultingArray);
        result = result.replace(",", "");
        result = result.replace("[", "");
        result = result.replace("]", "");

        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicateWords("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
    }
}
