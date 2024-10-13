import java.util.LinkedList;
import java.util.List;
public class LLTasks {
    public static void removeOddLengthStrings(LinkedList<String> list) {
        // Создаем временный список для хранения строк с нечетной длиной
        LinkedList<String> toRemove = new LinkedList<>();

        // Перебираем все элементы исходного списка
        for (String string : list) {
            // Проверяем длину строки
            if (string.length() % 2 != 0) {
                // Добавляем строку в список для удаления
                toRemove.add(string);
            }
        }

        // Удаляем все строки с нечетной длиной из исходного списка
        list.removeAll(toRemove);
    }

    public static void main(String[] args) {
        LinkedList<String> originalList = new LinkedList<>();
        originalList.add("one");
        originalList.add("two");
        originalList.add("three");
        originalList.add("four");
        originalList.add("five");
        originalList.add("six");
        originalList.add("seven");
        originalList.add("eight");
        originalList.add("nine");

        System.out.println("Original list: " + originalList);

        removeOddLengthStrings(originalList);

        System.out.println("Final list: " + originalList);
    }
}
