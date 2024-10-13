import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
public class DequeTasks {
    public static void rotateDeque(Deque<Integer> queue, int rotations) {
        if (queue.isEmpty()) {
            return;
        }

        int size = queue.size();
        rotations = rotations % size;

        if (rotations < 0) {
            rotations += size;
        }

        while (rotations-- > 0) {
            Integer last = queue.removeFirst();
            queue.addLast(last);
        }
    }

    public static void main(String[] args) {
        Deque<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("Original queue: " + queue);

        rotateDeque(queue, 3);

        System.out.println("Rotated queue: " + queue);
    }
}
