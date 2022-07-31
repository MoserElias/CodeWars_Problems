public class WhatCenturyIsIt {
    public static String whatCentury(int year) {
        String result = "";

        int myCentury = (year + 99) / 100;

        if (year <= 0) {
            return ""; //no century
        }
        if (myCentury / 10 == 1) {
            result += myCentury + "th";
        } else if (myCentury % 10 == 1) {
            result += myCentury + "st";
        } else if (myCentury % 10 == 2) {
            result += myCentury + "nd";
        } else if (myCentury % 10 == 3) {
            result += myCentury + "rd";
        } else { //default
            result += myCentury + "th";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(whatCentury(1820));
    }
}

