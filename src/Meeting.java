import java.util.Arrays;

public class Meeting {
    // my old idea
/*    public static String meeting(String s) {
        String upperCase = s.toUpperCase();
        upperCase = upperCase.replaceAll(":", ", ");

        StringBuilder namesString = new StringBuilder();
        for (int i = 0; i < upperCase.length(); i++) {
            if (upperCase.charAt(i) == ';') {
                namesString.append(")(");
            }

            if (i == 0) {
                namesString.append("(");
            }
            namesString.append(upperCase.charAt(i));
            if (i == upperCase.length() - 1) {
                namesString.append(")");
            }
        }

        String thisResult = namesString.toString();
        thisResult = thisResult.replaceAll(";", "");

        return thisResult;
    }


    private static String sortNames(String names) {
        //sort names alphabetically
        StringBuilder result = new StringBuilder();
        if (names.length() <= 1) {
            return "";
        }

        String temp = "";
        for (int i = 0; i < names.length(); i++) {
            char charToCompare = names.charAt(i);
            for (int j = 0; j < names.length(); j++) {
                if (names.charAt(j) < charToCompare) {
                    //if the char at the current point is alphabetically bigger, then swap them out
                }
            }
        }
        return "";
    }*/
    public static String meeting(String s) {
        String[] people = s.split(";");
        System.out.println(Arrays.toString(people));
        for (int i = 0; i < people.length; i++) {
            //get the index from the semicolon from the current String index
            int semicolonIndex = people[i].indexOf(":");
            //then write in my String Array the last name and then the first name
            people[i] = "(" + people[i].substring(semicolonIndex + 1).toUpperCase() + ", " +
                    people[i].substring(0, semicolonIndex).toUpperCase() + ")";
        }

        //sort the Array
        Arrays.sort(people);

        //join the Array into a String
        String result = String.join("", people);
        return result;
    }

    public static void main(String[] args) {
        String s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
        System.out.println(meeting(s));
    }
}
