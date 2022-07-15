import java.util.ArrayList;
import java.util.List;

public class ListFiltering {
    public static List<Object> filterList(final List<Object> list) {
        List<Object> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof Number) {
                resultList.add(list.get(i));
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        System.out.println(filterList(List.of(1,2,"a","b")));
    }
}
