import java.util.Arrays;
import java.util.List;

public class BallotsCounter {

    private static boolean checkIfInString(char[] toCheck, String element) {
        for (char c : toCheck) {
            String checkThis = String.valueOf(c);
            if (checkThis.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public static String getWinner(final List<String> listOfBallots) {
        //there are 3 Parties = A B C, and they get Votes
        //a partie wins if they get more than (n/2) votes and n = number of all votes
        int n = listOfBallots.size() / 2;
        int[] numberOfVotes = new int[listOfBallots.size()];
        String[] names = new String[listOfBallots.size()];

        StringBuilder checkedParties = new StringBuilder();

        for (int i = 0; i < listOfBallots.size(); i++) {
            //check if partie is already in resultVotes
            if (i != 0) {
                if (checkIfInString(checkedParties.toString().toCharArray(), listOfBallots.get(i))) {
                    continue;
                }
            }

            String partie = listOfBallots.get(i);
            int voteCounter = 1;
            for (int j = 0; j < listOfBallots.size(); j++) {
                if (partie.equals(listOfBallots.get(j)) && i != j) {
                    voteCounter++;
                }
            }
            checkedParties.append(partie);
            names[i] = partie;
            numberOfVotes[i] = voteCounter;
        }

        //now check which partie has most votes and if they won
        int max = numberOfVotes[0];
        int indexOfMax = 0;
        for (int i = 0; i < names.length; i++) {
            if (numberOfVotes[i] > max) {
                max = numberOfVotes[i];
                indexOfMax = i;
            }
        }
/*        System.out.println(max);
        System.out.println(names[indexOfMax]);*/
        if (max > n) {
            return names[indexOfMax];
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(getWinner(Arrays.asList("A", "B", "C", "D")));
    }
}
