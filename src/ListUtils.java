import java.util.LinkedList;
import java.util.List;
public class ListUtils {
    public static int countOccurrences(LinkedList<String> list, String searchValue) {
        int occurrences = 0;
        for (String value : list) {
            if (value.equals(searchValue)) {
                ++occurrences;
            }
        }
        return occurrences;
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("hello");
        list.add("world");
        list.add("hello");
        list.add("goodbye");
        list.add("hello");

        System.out.println("Count of 'hello': " + countOccurrences(list, "hello"));
        System.out.println("Count of 'test': " + countOccurrences(list, "test"));
    }
}