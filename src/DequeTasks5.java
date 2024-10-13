import java.util.Deque;
import java.util.LinkedList;
public class DequeTasks5 {
    public static void removeAllOccurrences(Deque<String> queue, String value) {
        queue.removeIf(item -> item.equals(value));
    }

    public static void main(String[] args) {
        Deque<String> queue = new LinkedList<>();
        queue.add("hello");
        queue.add("world");
        queue.add("hello");
        queue.add("goodbye");
        queue.add("hello");

        System.out.println("Original queue: " + queue);

        removeAllOccurrences(queue, "hello");

        System.out.println("Queue after removing all occurrences of 'hello': " + queue);
    }
}
