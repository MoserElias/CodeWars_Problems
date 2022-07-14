public class HighScoreWord {
    public static String high(String s) {
        String resultWord = "";
        int highestSum = 0;

        for (String word : s.split(" ")) {
            int newSum = 0;
            for (char c : word.toCharArray()) {
                newSum += c - 96; //a = 97, somit a = 1
            }
            if (newSum > highestSum) {
                highestSum = newSum;
                resultWord = word;
            }
        }
        return resultWord;
    }

    public static void main(String[] args) {
        System.out.println(high("taxi"));
    }
}
