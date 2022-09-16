import java.util.ArrayList;

public class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {
        int[] getInto = new int[stops.size()];
        int[] leaving = new int[stops.size()];
        for (int i = 0; i < getInto.length; i++) {
            int[] temp = stops.get(i);
            getInto[i] = temp[0];
            leaving[i] = temp[1];
        }
        int result = getInto[0];
        for (int i = 1; i < stops.size(); i++) {
            result += getInto[i];
        }
        for (int i = 0; i < stops.size(); i++) {
            result -= leaving[i];
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[]{10, 0});
        list.add(new int[]{3, 5});
        list.add(new int[]{2, 5});
        System.out.println(countPassengers(list));
    }
}
