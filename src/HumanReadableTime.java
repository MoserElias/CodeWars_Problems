public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        String SS = "";
        String MM = "";
        String HH = "";

        int hours = (seconds / 60) / 60;
        int min = (seconds / 60) % 60;
        int sec = seconds % 60;

        SS = (sec < 10) ? "0" + Integer.toString(sec) : Integer.toString(sec);
        HH = (hours < 10) ? "0" + Integer.toString(hours) : Integer.toString(hours);
        MM = (min < 10) ? "0" + Integer.toString(min) : Integer.toString(min);
        return HH + ":" + MM + ":" + SS;
    }

    public static void main(String[] args) {
        System.out.println(makeReadable(86399));
    }
}
