import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickPeaks {

    public static Map<String, List<Integer>> getPeaks(int[] arr) {

        //create a HashMap
        Map<String, List<Integer>> map = new HashMap<>();

        //create two lists for position and the peak
        List<Integer> pos = new ArrayList<>();
        List<Integer> peaks = new ArrayList<>();


        //loop through array
        for (int i = 1; i < arr.length - 1; i++) {

            //check if peak
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                pos.add(i);
                peaks.add(arr[i]);
            }

            //check if plateau
            if (arr[i] > arr[i - 1] && arr[i] == arr[i + 1]) {
                int j = i + 1;
                while (j < arr.length && arr[j] == arr[i]) {
                    j++; //iterate over the plateau
                }

                //check if peak when we are in a plateau
                if (j < arr.length && arr[j] < arr[i]) {
                    pos.add(i);
                    peaks.add(arr[i]);
                }
            }
        }

        map.put("pos", pos);
        map.put("peaks", peaks);
        return map;
    }


    public static void main(String[] args) {
        System.out.println(PickPeaks.getPeaks(new int[]{3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3}));
    }
}
